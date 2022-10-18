package typings.nextAuth.coreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookiesOptions extends StObject {
  
  var callbackUrl: CookieOption
  
  var csrfToken: CookieOption
  
  var nonce: CookieOption
  
  var pkceCodeVerifier: CookieOption
  
  var sessionToken: CookieOption
  
  var state: CookieOption
}
object CookiesOptions {
  
  inline def apply(
    callbackUrl: CookieOption,
    csrfToken: CookieOption,
    nonce: CookieOption,
    pkceCodeVerifier: CookieOption,
    sessionToken: CookieOption,
    state: CookieOption
  ): CookiesOptions = {
    val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], csrfToken = csrfToken.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], pkceCodeVerifier = pkceCodeVerifier.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesOptions]
  }
  
  extension [Self <: CookiesOptions](x: Self) {
    
    inline def setCallbackUrl(value: CookieOption): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    inline def setCsrfToken(value: CookieOption): Self = StObject.set(x, "csrfToken", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: CookieOption): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setPkceCodeVerifier(value: CookieOption): Self = StObject.set(x, "pkceCodeVerifier", value.asInstanceOf[js.Any])
    
    inline def setSessionToken(value: CookieOption): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setState(value: CookieOption): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
