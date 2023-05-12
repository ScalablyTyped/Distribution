package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson91 extends StObject {
  
  var content: Applicationjson91
}
object ContentApplicationjson91 {
  
  inline def apply(content: Applicationjson91): ContentApplicationjson91 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson91]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson91] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson91): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
