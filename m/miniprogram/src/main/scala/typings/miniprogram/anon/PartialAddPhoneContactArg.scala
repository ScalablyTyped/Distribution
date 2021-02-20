package typings.miniprogram.anon

import typings.miniprogram.AsyncCallbackFailObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<miniprogram.AddPhoneContactArgs> */
@js.native
trait PartialAddPhoneContactArg extends StObject {
  
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
  implicit class PartialAddPhoneContactArgMutableBuilder[Self <: PartialAddPhoneContactArg] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFail(value: /* err */ AsyncCallbackFailObject => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
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
    def setSuccess(value: /* res */ Success => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
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
