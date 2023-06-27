package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson139 extends StObject {
  
  var content: Applicationjson139
}
object ContentApplicationjson139 {
  
  inline def apply(content: Applicationjson139): ContentApplicationjson139 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson139]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson139] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson139): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
