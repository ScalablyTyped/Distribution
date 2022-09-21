package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjson406 extends StObject {
  
  var content: Applicationjson406
  
  var headers: Link
}
object ContentApplicationjson406 {
  
  inline def apply(content: Applicationjson406, headers: Link): ContentApplicationjson406 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjson406]
  }
  
  extension [Self <: ContentApplicationjson406](x: Self) {
    
    inline def setContent(value: Applicationjson406): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
