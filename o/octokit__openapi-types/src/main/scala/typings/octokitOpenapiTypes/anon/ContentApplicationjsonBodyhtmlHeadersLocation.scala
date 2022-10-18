package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyhtmlHeadersLocation extends StObject {
  
  var content: ApplicationjsonBodyhtml
  
  var headers: Location
}
object ContentApplicationjsonBodyhtmlHeadersLocation {
  
  inline def apply(content: ApplicationjsonBodyhtml, headers: Location): ContentApplicationjsonBodyhtmlHeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyhtmlHeadersLocation]
  }
  
  extension [Self <: ContentApplicationjsonBodyhtmlHeadersLocation](x: Self) {
    
    inline def setContent(value: ApplicationjsonBodyhtml): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
