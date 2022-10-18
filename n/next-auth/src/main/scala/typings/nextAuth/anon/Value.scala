package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var cookie: typings.nextAuth.coreLibCookieMod.Cookie
  
  var value: String
}
object Value {
  
  inline def apply(cookie: typings.nextAuth.coreLibCookieMod.Cookie, value: String): Value = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setCookie(value: typings.nextAuth.coreLibCookieMod.Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
