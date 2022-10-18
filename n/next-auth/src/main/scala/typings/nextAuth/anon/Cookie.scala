package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookie extends StObject {
  
  var cookie: Unit
  
  var csrfToken: String
  
  var csrfTokenVerified: Boolean
}
object Cookie {
  
  inline def apply(cookie: Unit, csrfToken: String, csrfTokenVerified: Boolean): Cookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], csrfToken = csrfToken.asInstanceOf[js.Any], csrfTokenVerified = csrfTokenVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  extension [Self <: Cookie](x: Self) {
    
    inline def setCookie(value: Unit): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCsrfToken(value: String): Self = StObject.set(x, "csrfToken", value.asInstanceOf[js.Any])
    
    inline def setCsrfTokenVerified(value: Boolean): Self = StObject.set(x, "csrfTokenVerified", value.asInstanceOf[js.Any])
  }
}
