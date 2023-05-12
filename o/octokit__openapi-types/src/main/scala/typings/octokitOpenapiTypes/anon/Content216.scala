package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content216 extends StObject {
  
  var content: `216`
  
  var headers: Link
}
object Content216 {
  
  inline def apply(content: `216`, headers: Link): Content216 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content216]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content216] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `216`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
