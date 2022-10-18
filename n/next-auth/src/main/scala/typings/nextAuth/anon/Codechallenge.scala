package typings.nextAuth.anon

import typings.nextAuth.nextAuthStrings.S256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codechallenge extends StObject {
  
  var code_challenge: String
  
  var code_challenge_method: S256
  
  var cookie: typings.nextAuth.coreLibCookieMod.Cookie
}
object Codechallenge {
  
  inline def apply(code_challenge: String, cookie: typings.nextAuth.coreLibCookieMod.Cookie): Codechallenge = {
    val __obj = js.Dynamic.literal(code_challenge = code_challenge.asInstanceOf[js.Any], code_challenge_method = "S256", cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codechallenge]
  }
  
  extension [Self <: Codechallenge](x: Self) {
    
    inline def setCode_challenge(value: String): Self = StObject.set(x, "code_challenge", value.asInstanceOf[js.Any])
    
    inline def setCode_challenge_method(value: S256): Self = StObject.set(x, "code_challenge_method", value.asInstanceOf[js.Any])
    
    inline def setCookie(value: typings.nextAuth.coreLibCookieMod.Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
