package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson643 extends StObject {
  
  var content: Applicationjson643
}
object ContentApplicationjson643 {
  
  inline def apply(content: Applicationjson643): ContentApplicationjson643 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson643]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson643] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson643): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
