package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInreplytoidHeadersLocation extends StObject {
  
  var content: ApplicationjsonInreplytoid
  
  var headers: Location
}
object ContentApplicationjsonInreplytoidHeadersLocation {
  
  inline def apply(content: ApplicationjsonInreplytoid, headers: Location): ContentApplicationjsonInreplytoidHeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInreplytoidHeadersLocation]
  }
  
  extension [Self <: ContentApplicationjsonInreplytoidHeadersLocation](x: Self) {
    
    inline def setContent(value: ApplicationjsonInreplytoid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
