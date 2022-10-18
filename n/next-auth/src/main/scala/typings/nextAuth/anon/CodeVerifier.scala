package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeVerifier extends StObject {
  
  var codeVerifier: String
  
  var cookie: typings.nextAuth.coreLibCookieMod.Cookie
}
object CodeVerifier {
  
  inline def apply(codeVerifier: String, cookie: typings.nextAuth.coreLibCookieMod.Cookie): CodeVerifier = {
    val __obj = js.Dynamic.literal(codeVerifier = codeVerifier.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeVerifier]
  }
  
  extension [Self <: CodeVerifier](x: Self) {
    
    inline def setCodeVerifier(value: String): Self = StObject.set(x, "codeVerifier", value.asInstanceOf[js.Any])
    
    inline def setCookie(value: typings.nextAuth.coreLibCookieMod.Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
