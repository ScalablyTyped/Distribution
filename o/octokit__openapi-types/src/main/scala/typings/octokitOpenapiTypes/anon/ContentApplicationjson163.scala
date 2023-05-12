package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson163 extends StObject {
  
  var content: Applicationjson163
}
object ContentApplicationjson163 {
  
  inline def apply(content: Applicationjson163): ContentApplicationjson163 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson163]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson163] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson163): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
