package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson780 extends StObject {
  
  var content: Applicationjson780
}
object ContentApplicationjson780 {
  
  inline def apply(content: Applicationjson780): ContentApplicationjson780 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson780]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson780] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson780): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
