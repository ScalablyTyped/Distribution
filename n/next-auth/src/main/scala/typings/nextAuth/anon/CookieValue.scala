package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieValue extends StObject {
  
  var cookie: typings.nextAuth.coreLibCookieMod.Cookie
  
  var value: String
}
object CookieValue {
  
  inline def apply(cookie: typings.nextAuth.coreLibCookieMod.Cookie, value: String): CookieValue = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieValue]
  }
  
  extension [Self <: CookieValue](x: Self) {
    
    inline def setCookie(value: typings.nextAuth.coreLibCookieMod.Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
