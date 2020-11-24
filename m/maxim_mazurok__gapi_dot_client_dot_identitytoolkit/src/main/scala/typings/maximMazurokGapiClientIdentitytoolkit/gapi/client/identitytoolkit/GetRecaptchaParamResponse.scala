package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRecaptchaParamResponse extends js.Object {
  
  /** The fixed string "identitytoolkit#GetRecaptchaParamResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Site key registered at recaptcha. */
  var recaptchaSiteKey: js.UndefOr[String] = js.native
  
  /** The stoken field for the recaptcha widget, used to request captcha challenge. */
  var recaptchaStoken: js.UndefOr[String] = js.native
}
object GetRecaptchaParamResponse {
  
  @scala.inline
  def apply(): GetRecaptchaParamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecaptchaParamResponse]
  }
  
  @scala.inline
  implicit class GetRecaptchaParamResponseOps[Self <: GetRecaptchaParamResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRecaptchaSiteKey(value: String): Self = this.set("recaptchaSiteKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecaptchaSiteKey: Self = this.set("recaptchaSiteKey", js.undefined)
    
    @scala.inline
    def setRecaptchaStoken(value: String): Self = this.set("recaptchaStoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecaptchaStoken: Self = this.set("recaptchaStoken", js.undefined)
  }
}
