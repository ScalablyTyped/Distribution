package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartySendVerificationCodeResponse extends StObject {
  
  /** Encrypted session information */
  var sessionInfo: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartySendVerificationCodeResponse {
  
  inline def apply(): IdentitytoolkitRelyingpartySendVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySendVerificationCodeResponse]
  }
  
  extension [Self <: IdentitytoolkitRelyingpartySendVerificationCodeResponse](x: Self) {
    
    inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
  }
}
