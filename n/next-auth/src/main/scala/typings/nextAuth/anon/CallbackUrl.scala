package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackUrl extends StObject {
  
  var callbackUrl: String
  
  var callbackUrlCookie: js.UndefOr[String] = js.undefined
}
object CallbackUrl {
  
  inline def apply(callbackUrl: String): CallbackUrl = {
    val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackUrl]
  }
  
  extension [Self <: CallbackUrl](x: Self) {
    
    inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    inline def setCallbackUrlCookie(value: String): Self = StObject.set(x, "callbackUrlCookie", value.asInstanceOf[js.Any])
    
    inline def setCallbackUrlCookieUndefined: Self = StObject.set(x, "callbackUrlCookie", js.undefined)
  }
}
