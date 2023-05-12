package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson646 extends StObject {
  
  var content: Applicationjson646
}
object ContentApplicationjson646 {
  
  inline def apply(content: Applicationjson646): ContentApplicationjson646 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson646]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson646] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson646): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
