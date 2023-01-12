package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartySendVerificationCodeRequest extends StObject {
  
  /** Receipt of successful app token validation with APNS. */
  var iosReceipt: js.UndefOr[String] = js.undefined
  
  /** Secret delivered to iOS app via APNS. */
  var iosSecret: js.UndefOr[String] = js.undefined
  
  /** The phone number to send the verification code to in E.164 format. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /** Recaptcha solution. */
  var recaptchaToken: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartySendVerificationCodeRequest {
  
  inline def apply(): IdentitytoolkitRelyingpartySendVerificationCodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySendVerificationCodeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentitytoolkitRelyingpartySendVerificationCodeRequest] (val x: Self) extends AnyVal {
    
    inline def setIosReceipt(value: String): Self = StObject.set(x, "iosReceipt", value.asInstanceOf[js.Any])
    
    inline def setIosReceiptUndefined: Self = StObject.set(x, "iosReceipt", js.undefined)
    
    inline def setIosSecret(value: String): Self = StObject.set(x, "iosSecret", value.asInstanceOf[js.Any])
    
    inline def setIosSecretUndefined: Self = StObject.set(x, "iosSecret", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setRecaptchaToken(value: String): Self = StObject.set(x, "recaptchaToken", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaTokenUndefined: Self = StObject.set(x, "recaptchaToken", js.undefined)
  }
}
