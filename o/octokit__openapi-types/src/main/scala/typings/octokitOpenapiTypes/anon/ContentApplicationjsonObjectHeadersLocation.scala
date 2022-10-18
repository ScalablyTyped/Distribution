package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonObjectHeadersLocation extends StObject {
  
  var content: ApplicationjsonObject
  
  var headers: Location
}
object ContentApplicationjsonObjectHeadersLocation {
  
  inline def apply(content: ApplicationjsonObject, headers: Location): ContentApplicationjsonObjectHeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonObjectHeadersLocation]
  }
  
  extension [Self <: ContentApplicationjsonObjectHeadersLocation](x: Self) {
    
    inline def setContent(value: ApplicationjsonObject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
