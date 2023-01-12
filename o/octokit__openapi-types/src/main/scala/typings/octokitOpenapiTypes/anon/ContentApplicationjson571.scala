package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson571 extends StObject {
  
  var content: Applicationjson571
}
object ContentApplicationjson571 {
  
  inline def apply(content: Applicationjson571): ContentApplicationjson571 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson571]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson571] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson571): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
