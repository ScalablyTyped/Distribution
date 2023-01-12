package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson114 extends StObject {
  
  var content: Applicationjson114
}
object ContentApplicationjson114 {
  
  inline def apply(content: Applicationjson114): ContentApplicationjson114 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson114]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson114] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson114): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
