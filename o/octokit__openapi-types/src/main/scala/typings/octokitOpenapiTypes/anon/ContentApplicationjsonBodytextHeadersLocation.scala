package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodytextHeadersLocation extends StObject {
  
  var content: ApplicationjsonBodytext
  
  var headers: Location
}
object ContentApplicationjsonBodytextHeadersLocation {
  
  inline def apply(content: ApplicationjsonBodytext, headers: Location): ContentApplicationjsonBodytextHeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodytextHeadersLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBodytextHeadersLocation] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBodytext): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
