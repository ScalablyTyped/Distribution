package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson87 extends StObject {
  
  var content: Applicationjson87
}
object ContentApplicationjson87 {
  
  inline def apply(content: Applicationjson87): ContentApplicationjson87 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson87]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson87] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson87): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
