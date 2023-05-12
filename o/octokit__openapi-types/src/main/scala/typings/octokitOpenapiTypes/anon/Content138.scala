package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content138 extends StObject {
  
  var content: `138`
  
  var headers: XRateLimitLimit
}
object Content138 {
  
  inline def apply(content: `138`, headers: XRateLimitLimit): Content138 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content138]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content138] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `138`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: XRateLimitLimit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
