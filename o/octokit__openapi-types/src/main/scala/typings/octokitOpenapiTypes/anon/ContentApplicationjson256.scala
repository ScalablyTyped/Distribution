package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson256 extends StObject {
  
  var content: Applicationjson256
}
object ContentApplicationjson256 {
  
  inline def apply(content: Applicationjson256): ContentApplicationjson256 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson256]
  }
  
  extension [Self <: ContentApplicationjson256](x: Self) {
    
    inline def setContent(value: Applicationjson256): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
