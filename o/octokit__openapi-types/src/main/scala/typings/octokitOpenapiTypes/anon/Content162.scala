package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content162 extends StObject {
  
  var content: `162`
  
  var headers: XRateLimitLimit
}
object Content162 {
  
  inline def apply(content: `162`, headers: XRateLimitLimit): Content162 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content162]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content162] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `162`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: XRateLimitLimit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
