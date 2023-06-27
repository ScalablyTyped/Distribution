package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson356 extends StObject {
  
  var content: Applicationjson356
}
object ContentApplicationjson356 {
  
  inline def apply(content: Applicationjson356): ContentApplicationjson356 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson356]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson356] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson356): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
