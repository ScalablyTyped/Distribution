package typings.nextAuth.anon

import typings.nextAuth.coreTypesMod.CookieOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next-auth.next-auth/core/types.CookiesOptions> */
trait PartialCookiesOptions extends StObject {
  
  var callbackUrl: js.UndefOr[CookieOption] = js.undefined
  
  var csrfToken: js.UndefOr[CookieOption] = js.undefined
  
  var nonce: js.UndefOr[CookieOption] = js.undefined
  
  var pkceCodeVerifier: js.UndefOr[CookieOption] = js.undefined
  
  var sessionToken: js.UndefOr[CookieOption] = js.undefined
  
  var state: js.UndefOr[CookieOption] = js.undefined
}
object PartialCookiesOptions {
  
  inline def apply(): PartialCookiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCookiesOptions]
  }
  
  extension [Self <: PartialCookiesOptions](x: Self) {
    
    inline def setCallbackUrl(value: CookieOption): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
    
    inline def setCsrfToken(value: CookieOption): Self = StObject.set(x, "csrfToken", value.asInstanceOf[js.Any])
    
    inline def setCsrfTokenUndefined: Self = StObject.set(x, "csrfToken", js.undefined)
    
    inline def setNonce(value: CookieOption): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setPkceCodeVerifier(value: CookieOption): Self = StObject.set(x, "pkceCodeVerifier", value.asInstanceOf[js.Any])
    
    inline def setPkceCodeVerifierUndefined: Self = StObject.set(x, "pkceCodeVerifier", js.undefined)
    
    inline def setSessionToken(value: CookieOption): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    inline def setState(value: CookieOption): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
