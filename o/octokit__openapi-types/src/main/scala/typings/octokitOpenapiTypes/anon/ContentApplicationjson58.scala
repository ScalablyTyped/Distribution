package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson58 extends StObject {
  
  var content: Applicationjson58
}
object ContentApplicationjson58 {
  
  inline def apply(content: Applicationjson58): ContentApplicationjson58 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson58]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson58] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson58): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
