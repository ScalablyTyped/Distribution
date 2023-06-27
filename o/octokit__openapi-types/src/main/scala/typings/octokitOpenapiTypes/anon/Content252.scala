package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content252 extends StObject {
  
  var content: `252`
  
  var headers: Link
}
object Content252 {
  
  inline def apply(content: `252`, headers: Link): Content252 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content252]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content252] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `252`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
