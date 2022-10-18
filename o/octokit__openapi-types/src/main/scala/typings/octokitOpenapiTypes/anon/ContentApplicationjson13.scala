package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson13 extends StObject {
  
  var content: Applicationjson13
}
object ContentApplicationjson13 {
  
  inline def apply(content: Applicationjson13): ContentApplicationjson13 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson13]
  }
  
  extension [Self <: ContentApplicationjson13](x: Self) {
    
    inline def setContent(value: Applicationjson13): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
