package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookiesRedirect extends StObject {
  
  var cookies: js.Array[typings.nextAuth.coreLibCookieMod.Cookie]
  
  var redirect: String
}
object CookiesRedirect {
  
  inline def apply(cookies: js.Array[typings.nextAuth.coreLibCookieMod.Cookie], redirect: String): CookiesRedirect = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesRedirect]
  }
  
  extension [Self <: CookiesRedirect](x: Self) {
    
    inline def setCookies(value: js.Array[typings.nextAuth.coreLibCookieMod.Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesVarargs(value: typings.nextAuth.coreLibCookieMod.Cookie*): Self = StObject.set(x, "cookies", js.Array(value*))
    
    inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
  }
}
