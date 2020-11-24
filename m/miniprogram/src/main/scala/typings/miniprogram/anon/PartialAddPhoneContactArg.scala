package typings.miniprogram.anon

import typings.miniprogram.AsyncCallbackFailObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<miniprogram.AddPhoneContactArgs> */
@js.native
trait PartialAddPhoneContactArg extends js.Object {
  
  var addressCity: js.UndefOr[String] = js.native
  
  var addressCountry: js.UndefOr[String] = js.native
  
  var addressPostalCode: js.UndefOr[String] = js.native
  
  var addressState: js.UndefOr[String] = js.native
  
  var addressStreet: js.UndefOr[String] = js.native
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.native
  
  var firstName: js.UndefOr[String] = js.native
  
  var homeAddressCity: js.UndefOr[String] = js.native
  
  var homeAddressCountry: js.UndefOr[String] = js.native
  
  var homeAddressPostalCode: js.UndefOr[String] = js.native
  
  var homeAddressState: js.UndefOr[String] = js.native
  
  var homeAddressStreet: js.UndefOr[String] = js.native
  
  var homeFaxNumber: js.UndefOr[String] = js.native
  
  var homePhoneNumber: js.UndefOr[String] = js.native
  
  var hostNumber: js.UndefOr[String] = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  var middleName: js.UndefOr[String] = js.native
  
  var mobilePhoneNumber: js.UndefOr[String] = js.native
  
  var nickName: js.UndefOr[String] = js.native
  
  var organization: js.UndefOr[String] = js.native
  
  var photoFilePath: js.UndefOr[String] = js.native
  
  var remark: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ Success, Unit]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var workAddressCity: js.UndefOr[String] = js.native
  
  var workAddressCountry: js.UndefOr[String] = js.native
  
  var workAddressPostalCode: js.UndefOr[String] = js.native
  
  var workAddressState: js.UndefOr[String] = js.native
  
  var workAddressStreet: js.UndefOr[String] = js.native
  
  var workFaxNumber: js.UndefOr[String] = js.native
  
  var workPhoneNumber: js.UndefOr[String] = js.native
}
object PartialAddPhoneContactArg {
  
  @scala.inline
  def apply(): PartialAddPhoneContactArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAddPhoneContactArg]
  }
  
  @scala.inline
  implicit class PartialAddPhoneContactArgOps[Self <: PartialAddPhoneContactArg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressCity(value: String): Self = this.set("addressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressCity: Self = this.set("addressCity", js.undefined)
    
    @scala.inline
    def setAddressCountry(value: String): Self = this.set("addressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressCountry: Self = this.set("addressCountry", js.undefined)
    
    @scala.inline
    def setAddressPostalCode(value: String): Self = this.set("addressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressPostalCode: Self = this.set("addressPostalCode", js.undefined)
    
    @scala.inline
    def setAddressState(value: String): Self = this.set("addressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressState: Self = this.set("addressState", js.undefined)
    
    @scala.inline
    def setAddressStreet(value: String): Self = this.set("addressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressStreet: Self = this.set("addressStreet", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFail(value: /* err */ AsyncCallbackFailObject => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setHomeAddressCity(value: String): Self = this.set("homeAddressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddressCity: Self = this.set("homeAddressCity", js.undefined)
    
    @scala.inline
    def setHomeAddressCountry(value: String): Self = this.set("homeAddressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddressCountry: Self = this.set("homeAddressCountry", js.undefined)
    
    @scala.inline
    def setHomeAddressPostalCode(value: String): Self = this.set("homeAddressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddressPostalCode: Self = this.set("homeAddressPostalCode", js.undefined)
    
    @scala.inline
    def setHomeAddressState(value: String): Self = this.set("homeAddressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddressState: Self = this.set("homeAddressState", js.undefined)
    
    @scala.inline
    def setHomeAddressStreet(value: String): Self = this.set("homeAddressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddressStreet: Self = this.set("homeAddressStreet", js.undefined)
    
    @scala.inline
    def setHomeFaxNumber(value: String): Self = this.set("homeFaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeFaxNumber: Self = this.set("homeFaxNumber", js.undefined)
    
    @scala.inline
    def setHomePhoneNumber(value: String): Self = this.set("homePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomePhoneNumber: Self = this.set("homePhoneNumber", js.undefined)
    
    @scala.inline
    def setHostNumber(value: String): Self = this.set("hostNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostNumber: Self = this.set("hostNumber", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    
    @scala.inline
    def setMobilePhoneNumber(value: String): Self = this.set("mobilePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobilePhoneNumber: Self = this.set("mobilePhoneNumber", js.undefined)
    
    @scala.inline
    def setNickName(value: String): Self = this.set("nickName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNickName: Self = this.set("nickName", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setPhotoFilePath(value: String): Self = this.set("photoFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoFilePath: Self = this.set("photoFilePath", js.undefined)
    
    @scala.inline
    def setRemark(value: String): Self = this.set("remark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemark: Self = this.set("remark", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ Success => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setWorkAddressCity(value: String): Self = this.set("workAddressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddressCity: Self = this.set("workAddressCity", js.undefined)
    
    @scala.inline
    def setWorkAddressCountry(value: String): Self = this.set("workAddressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddressCountry: Self = this.set("workAddressCountry", js.undefined)
    
    @scala.inline
    def setWorkAddressPostalCode(value: String): Self = this.set("workAddressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddressPostalCode: Self = this.set("workAddressPostalCode", js.undefined)
    
    @scala.inline
    def setWorkAddressState(value: String): Self = this.set("workAddressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddressState: Self = this.set("workAddressState", js.undefined)
    
    @scala.inline
    def setWorkAddressStreet(value: String): Self = this.set("workAddressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkAddressStreet: Self = this.set("workAddressStreet", js.undefined)
    
    @scala.inline
    def setWorkFaxNumber(value: String): Self = this.set("workFaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkFaxNumber: Self = this.set("workFaxNumber", js.undefined)
    
    @scala.inline
    def setWorkPhoneNumber(value: String): Self = this.set("workPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkPhoneNumber: Self = this.set("workPhoneNumber", js.undefined)
  }
}
