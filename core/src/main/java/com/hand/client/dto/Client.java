package com.hand.client.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Table;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "yfs_client")
public class Client extends BaseDTO {

     public static final String FIELD_CLIENT_ID = "clientId";
     public static final String FIELD_CLIENT_NAME = "clientName";
     public static final String FIELD_CLIENT_APPELLATION = "clientAppellation";
     public static final String FIELD_CERTIFICATE_TYPE = "certificateType";
     public static final String FIELD_LICENSE_NUMBER = "licenseNumber";
     public static final String FIELD_GENDER = "gender";
     public static final String FIELD_PHONE = "phone";


     @Id
     @GeneratedValue
     private Long clientId; //客户id

     @Length(max = 255)
     private String clientName; //姓名

     @Length(max = 255)
     private String clientAppellation; //名称

     @Length(max = 255)
     private String certificateType; //证件类型

     @Length(max = 255)
     private String licenseNumber; //证件号

     @Length(max = 20)
     private String gender; //性别

     @Length(max = 255)
     private String phone; //电话


     public void setClientId(Long clientId){
         this.clientId = clientId;
     }

     public Long getClientId(){
         return clientId;
     }

     public void setClientName(String clientName){
         this.clientName = clientName;
     }

     public String getClientName(){
         return clientName;
     }

     public void setClientAppellation(String clientAppellation){
         this.clientAppellation = clientAppellation;
     }

     public String getClientAppellation(){
         return clientAppellation;
     }

     public void setCertificateType(String certificateType){
         this.certificateType = certificateType;
     }

     public String getCertificateType(){
         return certificateType;
     }

     public void setLicenseNumber(String licenseNumber){
         this.licenseNumber = licenseNumber;
     }

     public String getLicenseNumber(){
         return licenseNumber;
     }

     public void setGender(String gender){
         this.gender = gender;
     }

     public String getGender(){
         return gender;
     }

     public void setPhone(String phone){
         this.phone = phone;
     }

     public String getPhone(){
         return phone;
     }

     }
