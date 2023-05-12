package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson119 extends StObject {
  
  var content: Applicationjson119
}
object ContentApplicationjson119 {
  
  inline def apply(content: Applicationjson119): ContentApplicationjson119 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson119]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjson119] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Applicationjson119): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
