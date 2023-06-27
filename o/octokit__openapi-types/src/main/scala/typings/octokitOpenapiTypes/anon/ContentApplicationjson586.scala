package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson586 extends StObject {
  
  var content: Applicationjson586
}
object ContentApplicationjson586 {
  
  inline def apply(content: Applicationjson586): ContentApplicationjson586 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson586]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson586] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson586): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
