package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecaptchaParamResponse extends StObject {
  
  /** The fixed string "identitytoolkit#GetRecaptchaParamResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Site key registered at recaptcha. */
  var recaptchaSiteKey: js.UndefOr[String] = js.undefined
  
  /** The stoken field for the recaptcha widget, used to request captcha challenge. */
  var recaptchaStoken: js.UndefOr[String] = js.undefined
}
object GetRecaptchaParamResponse {
  
  inline def apply(): GetRecaptchaParamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecaptchaParamResponse]
  }
  
  extension [Self <: GetRecaptchaParamResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRecaptchaSiteKey(value: String): Self = StObject.set(x, "recaptchaSiteKey", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaSiteKeyUndefined: Self = StObject.set(x, "recaptchaSiteKey", js.undefined)
    
    inline def setRecaptchaStoken(value: String): Self = StObject.set(x, "recaptchaStoken", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaStokenUndefined: Self = StObject.set(x, "recaptchaStoken", js.undefined)
  }
}
