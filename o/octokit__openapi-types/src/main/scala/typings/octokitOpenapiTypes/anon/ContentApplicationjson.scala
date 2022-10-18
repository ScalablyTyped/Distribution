package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson extends StObject {
  
  var content: Applicationjson
}
object ContentApplicationjson {
  
  inline def apply(content: Applicationjson): ContentApplicationjson = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson]
  }
  
  extension [Self <: ContentApplicationjson](x: Self) {
    
    inline def setContent(value: Applicationjson): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
