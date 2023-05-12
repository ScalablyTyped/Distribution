package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson502 extends StObject {
  
  var content: Applicationjson502
}
object ContentApplicationjson502 {
  
  inline def apply(content: Applicationjson502): ContentApplicationjson502 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson502]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson502] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson502): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
