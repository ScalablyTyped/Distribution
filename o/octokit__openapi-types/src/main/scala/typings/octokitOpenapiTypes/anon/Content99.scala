package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content99 extends StObject {
  
  var content: `99`
  
  var headers: Link
}
object Content99 {
  
  inline def apply(content: `99`, headers: Link): Content99 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content99]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content99] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `99`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
