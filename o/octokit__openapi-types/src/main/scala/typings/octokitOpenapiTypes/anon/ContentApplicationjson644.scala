package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson644 extends StObject {
  
  var content: Applicationjson644
}
object ContentApplicationjson644 {
  
  inline def apply(content: Applicationjson644): ContentApplicationjson644 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson644]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson644] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson644): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
