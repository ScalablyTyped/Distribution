package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneAuthenticationMethod
  extends StObject
     with Entity {
  
  /**
    * The phone number to text or call for authentication. Phone numbers use the format +{country code} {number}x{extension},
    * with extension optional. For example, +1 5555551234 or +1 5555551234x123 are valid. Numbers are rejected when creating
    * or updating if they do not match the required format.
    */
  var phoneNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of this phone. Possible values are: mobile, alternateMobile, or office.
  var phoneType: js.UndefOr[NullableOption[AuthenticationPhoneType]] = js.undefined
  
  /**
    * Whether a phone is ready to be used for SMS sign-in or not. Possible values are: notSupported, notAllowedByPolicy,
    * notEnabled, phoneNumberNotUnique, ready, or notConfigured, unknownFutureValue.
    */
  var smsSignInState: js.UndefOr[NullableOption[AuthenticationMethodSignInState]] = js.undefined
}
object PhoneAuthenticationMethod {
  
  inline def apply(): PhoneAuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneAuthenticationMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneAuthenticationMethod] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumber(value: NullableOption[String]): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhoneType(value: NullableOption[AuthenticationPhoneType]): Self = StObject.set(x, "phoneType", value.asInstanceOf[js.Any])
    
    inline def setPhoneTypeNull: Self = StObject.set(x, "phoneType", null)
    
    inline def setPhoneTypeUndefined: Self = StObject.set(x, "phoneType", js.undefined)
    
    inline def setSmsSignInState(value: NullableOption[AuthenticationMethodSignInState]): Self = StObject.set(x, "smsSignInState", value.asInstanceOf[js.Any])
    
    inline def setSmsSignInStateNull: Self = StObject.set(x, "smsSignInState", null)
    
    inline def setSmsSignInStateUndefined: Self = StObject.set(x, "smsSignInState", js.undefined)
  }
}
