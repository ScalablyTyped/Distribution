package typings.miniprogram.anon

import typings.miniprogram.AsyncCallbackFailObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<miniprogram.AddPhoneContactArgs> */
trait PartialAddPhoneContactArg extends StObject {
  
  var addressCity: js.UndefOr[String] = js.undefined
  
  var addressCountry: js.UndefOr[String] = js.undefined
  
  var addressPostalCode: js.UndefOr[String] = js.undefined
  
  var addressState: js.UndefOr[String] = js.undefined
  
  var addressStreet: js.UndefOr[String] = js.undefined
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.undefined
  
  var firstName: js.UndefOr[String] = js.undefined
  
  var homeAddressCity: js.UndefOr[String] = js.undefined
  
  var homeAddressCountry: js.UndefOr[String] = js.undefined
  
  var homeAddressPostalCode: js.UndefOr[String] = js.undefined
  
  var homeAddressState: js.UndefOr[String] = js.undefined
  
  var homeAddressStreet: js.UndefOr[String] = js.undefined
  
  var homeFaxNumber: js.UndefOr[String] = js.undefined
  
  var homePhoneNumber: js.UndefOr[String] = js.undefined
  
  var hostNumber: js.UndefOr[String] = js.undefined
  
  var lastName: js.UndefOr[String] = js.undefined
  
  var middleName: js.UndefOr[String] = js.undefined
  
  var mobilePhoneNumber: js.UndefOr[String] = js.undefined
  
  var nickName: js.UndefOr[String] = js.undefined
  
  var organization: js.UndefOr[String] = js.undefined
  
  var photoFilePath: js.UndefOr[String] = js.undefined
  
  var remark: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ Success, Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var workAddressCity: js.UndefOr[String] = js.undefined
  
  var workAddressCountry: js.UndefOr[String] = js.undefined
  
  var workAddressPostalCode: js.UndefOr[String] = js.undefined
  
  var workAddressState: js.UndefOr[String] = js.undefined
  
  var workAddressStreet: js.UndefOr[String] = js.undefined
  
  var workFaxNumber: js.UndefOr[String] = js.undefined
  
  var workPhoneNumber: js.UndefOr[String] = js.undefined
}
object PartialAddPhoneContactArg {
  
  inline def apply(): PartialAddPhoneContactArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAddPhoneContactArg]
  }
  
  extension [Self <: PartialAddPhoneContactArg](x: Self) {
    
    inline def setAddressCity(value: String): Self = StObject.set(x, "addressCity", value.asInstanceOf[js.Any])
    
    inline def setAddressCityUndefined: Self = StObject.set(x, "addressCity", js.undefined)
    
    inline def setAddressCountry(value: String): Self = StObject.set(x, "addressCountry", value.asInstanceOf[js.Any])
    
    inline def setAddressCountryUndefined: Self = StObject.set(x, "addressCountry", js.undefined)
    
    inline def setAddressPostalCode(value: String): Self = StObject.set(x, "addressPostalCode", value.asInstanceOf[js.Any])
    
    inline def setAddressPostalCodeUndefined: Self = StObject.set(x, "addressPostalCode", js.undefined)
    
    inline def setAddressState(value: String): Self = StObject.set(x, "addressState", value.asInstanceOf[js.Any])
    
    inline def setAddressStateUndefined: Self = StObject.set(x, "addressState", js.undefined)
    
    inline def setAddressStreet(value: String): Self = StObject.set(x, "addressStreet", value.asInstanceOf[js.Any])
    
    inline def setAddressStreetUndefined: Self = StObject.set(x, "addressStreet", js.undefined)
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFail(value: /* err */ AsyncCallbackFailObject => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setHomeAddressCity(value: String): Self = StObject.set(x, "homeAddressCity", value.asInstanceOf[js.Any])
    
    inline def setHomeAddressCityUndefined: Self = StObject.set(x, "homeAddressCity", js.undefined)
    
    inline def setHomeAddressCountry(value: String): Self = StObject.set(x, "homeAddressCountry", value.asInstanceOf[js.Any])
    
    inline def setHomeAddressCountryUndefined: Self = StObject.set(x, "homeAddressCountry", js.undefined)
    
    inline def setHomeAddressPostalCode(value: String): Self = StObject.set(x, "homeAddressPostalCode", value.asInstanceOf[js.Any])
    
    inline def setHomeAddressPostalCodeUndefined: Self = StObject.set(x, "homeAddressPostalCode", js.undefined)
    
    inline def setHomeAddressState(value: String): Self = StObject.set(x, "homeAddressState", value.asInstanceOf[js.Any])
    
    inline def setHomeAddressStateUndefined: Self = StObject.set(x, "homeAddressState", js.undefined)
    
    inline def setHomeAddressStreet(value: String): Self = StObject.set(x, "homeAddressStreet", value.asInstanceOf[js.Any])
    
    inline def setHomeAddressStreetUndefined: Self = StObject.set(x, "homeAddressStreet", js.undefined)
    
    inline def setHomeFaxNumber(value: String): Self = StObject.set(x, "homeFaxNumber", value.asInstanceOf[js.Any])
    
    inline def setHomeFaxNumberUndefined: Self = StObject.set(x, "homeFaxNumber", js.undefined)
    
    inline def setHomePhoneNumber(value: String): Self = StObject.set(x, "homePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setHomePhoneNumberUndefined: Self = StObject.set(x, "homePhoneNumber", js.undefined)
    
    inline def setHostNumber(value: String): Self = StObject.set(x, "hostNumber", value.asInstanceOf[js.Any])
    
    inline def setHostNumberUndefined: Self = StObject.set(x, "hostNumber", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    inline def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    
    inline def setMobilePhoneNumber(value: String): Self = StObject.set(x, "mobilePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMobilePhoneNumberUndefined: Self = StObject.set(x, "mobilePhoneNumber", js.undefined)
    
    inline def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
    
    inline def setNickNameUndefined: Self = StObject.set(x, "nickName", js.undefined)
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPhotoFilePath(value: String): Self = StObject.set(x, "photoFilePath", value.asInstanceOf[js.Any])
    
    inline def setPhotoFilePathUndefined: Self = StObject.set(x, "photoFilePath", js.undefined)
    
    inline def setRemark(value: String): Self = StObject.set(x, "remark", value.asInstanceOf[js.Any])
    
    inline def setRemarkUndefined: Self = StObject.set(x, "remark", js.undefined)
    
    inline def setSuccess(value: /* res */ Success => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWorkAddressCity(value: String): Self = StObject.set(x, "workAddressCity", value.asInstanceOf[js.Any])
    
    inline def setWorkAddressCityUndefined: Self = StObject.set(x, "workAddressCity", js.undefined)
    
    inline def setWorkAddressCountry(value: String): Self = StObject.set(x, "workAddressCountry", value.asInstanceOf[js.Any])
    
    inline def setWorkAddressCountryUndefined: Self = StObject.set(x, "workAddressCountry", js.undefined)
    
    inline def setWorkAddressPostalCode(value: String): Self = StObject.set(x, "workAddressPostalCode", value.asInstanceOf[js.Any])
    
    inline def setWorkAddressPostalCodeUndefined: Self = StObject.set(x, "workAddressPostalCode", js.undefined)
    
    inline def setWorkAddressState(value: String): Self = StObject.set(x, "workAddressState", value.asInstanceOf[js.Any])
    
    inline def setWorkAddressStateUndefined: Self = StObject.set(x, "workAddressState", js.undefined)
    
    inline def setWorkAddressStreet(value: String): Self = StObject.set(x, "workAddressStreet", value.asInstanceOf[js.Any])
    
    inline def setWorkAddressStreetUndefined: Self = StObject.set(x, "workAddressStreet", js.undefined)
    
    inline def setWorkFaxNumber(value: String): Self = StObject.set(x, "workFaxNumber", value.asInstanceOf[js.Any])
    
    inline def setWorkFaxNumberUndefined: Self = StObject.set(x, "workFaxNumber", js.undefined)
    
    inline def setWorkPhoneNumber(value: String): Self = StObject.set(x, "workPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setWorkPhoneNumberUndefined: Self = StObject.set(x, "workPhoneNumber", js.undefined)
  }
}
