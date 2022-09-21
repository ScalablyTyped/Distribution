package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson399 extends StObject {
  
  var content: Applicationjson399
  
  var headers: Link
}
object ContentApplicationjson399 {
  
  inline def apply(content: Applicationjson399, headers: Link): ContentApplicationjson399 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson399]
  }
  
  extension [Self <: ContentApplicationjson399](x: Self) {
    
    inline def setContent(value: Applicationjson399): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
