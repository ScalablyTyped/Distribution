package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPhoneContactOption extends StObject {
  
  /** 联系地址城市 */
  var addressCity: js.UndefOr[String] = js.undefined
  
  /** 联系地址国家 */
  var addressCountry: js.UndefOr[String] = js.undefined
  
  /** 联系地址邮政编码 */
  var addressPostalCode: js.UndefOr[String] = js.undefined
  
  /** 联系地址省份 */
  var addressState: js.UndefOr[String] = js.undefined
  
  /** 联系地址街道 */
  var addressStreet: js.UndefOr[String] = js.undefined
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AddPhoneContactCompleteCallback] = js.undefined
  
  /** 电子邮件 */
  var email: js.UndefOr[String] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[AddPhoneContactFailCallback] = js.undefined
  
  /** 名字 */
  var firstName: String
  
  /** 住宅地址城市 */
  var homeAddressCity: js.UndefOr[String] = js.undefined
  
  /** 住宅地址国家 */
  var homeAddressCountry: js.UndefOr[String] = js.undefined
  
  /** 住宅地址邮政编码 */
  var homeAddressPostalCode: js.UndefOr[String] = js.undefined
  
  /** 住宅地址省份 */
  var homeAddressState: js.UndefOr[String] = js.undefined
  
  /** 住宅地址街道 */
  var homeAddressStreet: js.UndefOr[String] = js.undefined
  
  /** 住宅传真 */
  var homeFaxNumber: js.UndefOr[String] = js.undefined
  
  /** 住宅电话 */
  var homePhoneNumber: js.UndefOr[String] = js.undefined
  
  /** 公司电话 */
  var hostNumber: js.UndefOr[String] = js.undefined
  
  /** 姓氏 */
  var lastName: js.UndefOr[String] = js.undefined
  
  /** 中间名 */
  var middleName: js.UndefOr[String] = js.undefined
  
  /** 手机号 */
  var mobilePhoneNumber: js.UndefOr[String] = js.undefined
  
  /** 昵称 */
  var nickName: js.UndefOr[String] = js.undefined
  
  /** 公司 */
  var organization: js.UndefOr[String] = js.undefined
  
  /** 头像本地文件路径 */
  var photoFilePath: js.UndefOr[String] = js.undefined
  
  /** 备注 */
  var remark: js.UndefOr[String] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AddPhoneContactSuccessCallback] = js.undefined
  
  /** 职位 */
  var title: js.UndefOr[String] = js.undefined
  
  /** 网站 */
  var url: js.UndefOr[String] = js.undefined
  
  /** 微信号 */
  var weChatNumber: js.UndefOr[String] = js.undefined
  
  /** 工作地址城市 */
  var workAddressCity: js.UndefOr[String] = js.undefined
  
  /** 工作地址国家 */
  var workAddressCountry: js.UndefOr[String] = js.undefined
  
  /** 工作地址邮政编码 */
  var workAddressPostalCode: js.UndefOr[String] = js.undefined
  
  /** 工作地址省份 */
  var workAddressState: js.UndefOr[String] = js.undefined
  
  /** 工作地址街道 */
  var workAddressStreet: js.UndefOr[String] = js.undefined
  
  /** 工作传真 */
  var workFaxNumber: js.UndefOr[String] = js.undefined
  
  /** 工作电话 */
  var workPhoneNumber: js.UndefOr[String] = js.undefined
}
object AddPhoneContactOption {
  
  @scala.inline
  def apply(firstName: String): AddPhoneContactOption = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPhoneContactOption]
  }
  
  @scala.inline
  implicit class AddPhoneContactOptionMutableBuilder[Self <: AddPhoneContactOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressCity(value: String): Self = StObject.set(x, "addressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressCityUndefined: Self = StObject.set(x, "addressCity", js.undefined)
    
    @scala.inline
    def setAddressCountry(value: String): Self = StObject.set(x, "addressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressCountryUndefined: Self = StObject.set(x, "addressCountry", js.undefined)
    
    @scala.inline
    def setAddressPostalCode(value: String): Self = StObject.set(x, "addressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressPostalCodeUndefined: Self = StObject.set(x, "addressPostalCode", js.undefined)
    
    @scala.inline
    def setAddressState(value: String): Self = StObject.set(x, "addressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressStateUndefined: Self = StObject.set(x, "addressState", js.undefined)
    
    @scala.inline
    def setAddressStreet(value: String): Self = StObject.set(x, "addressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressStreetUndefined: Self = StObject.set(x, "addressStreet", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressCity(value: String): Self = StObject.set(x, "homeAddressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressCityUndefined: Self = StObject.set(x, "homeAddressCity", js.undefined)
    
    @scala.inline
    def setHomeAddressCountry(value: String): Self = StObject.set(x, "homeAddressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressCountryUndefined: Self = StObject.set(x, "homeAddressCountry", js.undefined)
    
    @scala.inline
    def setHomeAddressPostalCode(value: String): Self = StObject.set(x, "homeAddressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressPostalCodeUndefined: Self = StObject.set(x, "homeAddressPostalCode", js.undefined)
    
    @scala.inline
    def setHomeAddressState(value: String): Self = StObject.set(x, "homeAddressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressStateUndefined: Self = StObject.set(x, "homeAddressState", js.undefined)
    
    @scala.inline
    def setHomeAddressStreet(value: String): Self = StObject.set(x, "homeAddressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressStreetUndefined: Self = StObject.set(x, "homeAddressStreet", js.undefined)
    
    @scala.inline
    def setHomeFaxNumber(value: String): Self = StObject.set(x, "homeFaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeFaxNumberUndefined: Self = StObject.set(x, "homeFaxNumber", js.undefined)
    
    @scala.inline
    def setHomePhoneNumber(value: String): Self = StObject.set(x, "homePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePhoneNumberUndefined: Self = StObject.set(x, "homePhoneNumber", js.undefined)
    
    @scala.inline
    def setHostNumber(value: String): Self = StObject.set(x, "hostNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNumberUndefined: Self = StObject.set(x, "hostNumber", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    
    @scala.inline
    def setMobilePhoneNumber(value: String): Self = StObject.set(x, "mobilePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobilePhoneNumberUndefined: Self = StObject.set(x, "mobilePhoneNumber", js.undefined)
    
    @scala.inline
    def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickNameUndefined: Self = StObject.set(x, "nickName", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setPhotoFilePath(value: String): Self = StObject.set(x, "photoFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoFilePathUndefined: Self = StObject.set(x, "photoFilePath", js.undefined)
    
    @scala.inline
    def setRemark(value: String): Self = StObject.set(x, "remark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarkUndefined: Self = StObject.set(x, "remark", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWeChatNumber(value: String): Self = StObject.set(x, "weChatNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeChatNumberUndefined: Self = StObject.set(x, "weChatNumber", js.undefined)
    
    @scala.inline
    def setWorkAddressCity(value: String): Self = StObject.set(x, "workAddressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressCityUndefined: Self = StObject.set(x, "workAddressCity", js.undefined)
    
    @scala.inline
    def setWorkAddressCountry(value: String): Self = StObject.set(x, "workAddressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressCountryUndefined: Self = StObject.set(x, "workAddressCountry", js.undefined)
    
    @scala.inline
    def setWorkAddressPostalCode(value: String): Self = StObject.set(x, "workAddressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressPostalCodeUndefined: Self = StObject.set(x, "workAddressPostalCode", js.undefined)
    
    @scala.inline
    def setWorkAddressState(value: String): Self = StObject.set(x, "workAddressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressStateUndefined: Self = StObject.set(x, "workAddressState", js.undefined)
    
    @scala.inline
    def setWorkAddressStreet(value: String): Self = StObject.set(x, "workAddressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressStreetUndefined: Self = StObject.set(x, "workAddressStreet", js.undefined)
    
    @scala.inline
    def setWorkFaxNumber(value: String): Self = StObject.set(x, "workFaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkFaxNumberUndefined: Self = StObject.set(x, "workFaxNumber", js.undefined)
    
    @scala.inline
    def setWorkPhoneNumber(value: String): Self = StObject.set(x, "workPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkPhoneNumberUndefined: Self = StObject.set(x, "workPhoneNumber", js.undefined)
  }
}
