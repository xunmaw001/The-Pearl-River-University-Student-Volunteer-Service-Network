package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 活动报名
 *
 * @author 
 * @email
 */
@TableName("huodongxinxi_order")
public class HuodongxinxiOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuodongxinxiOrderEntity() {

	}

	public HuodongxinxiOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 报名编号
     */
    @TableField(value = "huodongxinxi_order_uuid_number")

    private String huodongxinxiOrderUuidNumber;


    /**
     * 活动
     */
    @TableField(value = "huodongxinxi_id")

    private Integer huodongxinxiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：报名编号
	 */
    public String getHuodongxinxiOrderUuidNumber() {
        return huodongxinxiOrderUuidNumber;
    }
    /**
	 * 获取：报名编号
	 */

    public void setHuodongxinxiOrderUuidNumber(String huodongxinxiOrderUuidNumber) {
        this.huodongxinxiOrderUuidNumber = huodongxinxiOrderUuidNumber;
    }
    /**
	 * 设置：活动
	 */
    public Integer getHuodongxinxiId() {
        return huodongxinxiId;
    }
    /**
	 * 获取：活动
	 */

    public void setHuodongxinxiId(Integer huodongxinxiId) {
        this.huodongxinxiId = huodongxinxiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：报名时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "HuodongxinxiOrder{" +
            "id=" + id +
            ", huodongxinxiOrderUuidNumber=" + huodongxinxiOrderUuidNumber +
            ", huodongxinxiId=" + huodongxinxiId +
            ", yonghuId=" + yonghuId +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
