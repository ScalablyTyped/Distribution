package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackUrl extends StObject {
  
  var callbackUrl: js.UndefOr[String] = js.undefined
}
object CallbackUrl {
  
  inline def apply(): CallbackUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackUrl]
  }
  
  extension [Self <: CallbackUrl](x: Self) {
    
    inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
  }
}
