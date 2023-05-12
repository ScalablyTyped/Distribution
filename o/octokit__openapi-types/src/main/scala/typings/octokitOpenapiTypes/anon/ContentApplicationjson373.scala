package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson373 extends StObject {
  
  var content: Applicationjson373
  
  var headers: Link
}
object ContentApplicationjson373 {
  
  inline def apply(content: Applicationjson373, headers: Link): ContentApplicationjson373 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson373]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson373] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson373): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
