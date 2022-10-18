package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson64 extends StObject {
  
  var content: Applicationjson64
}
object ContentApplicationjson64 {
  
  inline def apply(content: Applicationjson64): ContentApplicationjson64 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson64]
  }
  
  extension [Self <: ContentApplicationjson64](x: Self) {
    
    inline def setContent(value: Applicationjson64): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
