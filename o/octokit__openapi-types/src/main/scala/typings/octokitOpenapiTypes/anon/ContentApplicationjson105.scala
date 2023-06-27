package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson105 extends StObject {
  
  var content: Applicationjson105
}
object ContentApplicationjson105 {
  
  inline def apply(content: Applicationjson105): ContentApplicationjson105 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson105]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson105] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson105): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
