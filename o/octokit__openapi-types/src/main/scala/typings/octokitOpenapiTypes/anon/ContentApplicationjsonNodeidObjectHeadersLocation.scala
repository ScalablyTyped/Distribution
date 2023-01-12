package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNodeidObjectHeadersLocation extends StObject {
  
  var content: ApplicationjsonNodeidObject
  
  var headers: Location
}
object ContentApplicationjsonNodeidObjectHeadersLocation {
  
  inline def apply(content: ApplicationjsonNodeidObject, headers: Location): ContentApplicationjsonNodeidObjectHeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNodeidObjectHeadersLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonNodeidObjectHeadersLocation] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonNodeidObject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
