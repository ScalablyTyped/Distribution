package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPingurl extends StObject {
  
  var content: ApplicationjsonPingurl
  
  var headers: Location
}
object ContentApplicationjsonPingurl {
  
  inline def apply(content: ApplicationjsonPingurl, headers: Location): ContentApplicationjsonPingurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPingurl]
  }
  
  extension [Self <: ContentApplicationjsonPingurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonPingurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
