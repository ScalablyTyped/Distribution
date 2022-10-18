package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsrfToken extends StObject {
  
  var cookie: String
  
  var csrfToken: String
  
  var csrfTokenVerified: Unit
}
object CsrfToken {
  
  inline def apply(cookie: String, csrfToken: String, csrfTokenVerified: Unit): CsrfToken = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], csrfToken = csrfToken.asInstanceOf[js.Any], csrfTokenVerified = csrfTokenVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsrfToken]
  }
  
  extension [Self <: CsrfToken](x: Self) {
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCsrfToken(value: String): Self = StObject.set(x, "csrfToken", value.asInstanceOf[js.Any])
    
    inline def setCsrfTokenVerified(value: Unit): Self = StObject.set(x, "csrfTokenVerified", value.asInstanceOf[js.Any])
  }
}
