package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitytoolkitRelyingpartySendVerificationCodeRequest extends js.Object {
  
  /** Receipt of successful app token validation with APNS. */
  var iosReceipt: js.UndefOr[String] = js.native
  
  /** Secret delivered to iOS app via APNS. */
  var iosSecret: js.UndefOr[String] = js.native
  
  /** The phone number to send the verification code to in E.164 format. */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /** Recaptcha solution. */
  var recaptchaToken: js.UndefOr[String] = js.native
}
object IdentitytoolkitRelyingpartySendVerificationCodeRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartySendVerificationCodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySendVerificationCodeRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartySendVerificationCodeRequestOps[Self <: IdentitytoolkitRelyingpartySendVerificationCodeRequest] (val x: Self) extends AnyVal {
    
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
    def setIosReceipt(value: String): Self = this.set("iosReceipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosReceipt: Self = this.set("iosReceipt", js.undefined)
    
    @scala.inline
    def setIosSecret(value: String): Self = this.set("iosSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosSecret: Self = this.set("iosSecret", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setRecaptchaToken(value: String): Self = this.set("recaptchaToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecaptchaToken: Self = this.set("recaptchaToken", js.undefined)
  }
}
