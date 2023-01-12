package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson393 extends StObject {
  
  var content: Applicationjson393
}
object ContentApplicationjson393 {
  
  inline def apply(content: Applicationjson393): ContentApplicationjson393 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson393]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson393] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson393): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
