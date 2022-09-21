package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAuthorscountHeadersLocation extends StObject {
  
  var content: ApplicationjsonAuthorscount
  
  var headers: Location
}
object ContentApplicationjsonAuthorscountHeadersLocation {
  
  inline def apply(content: ApplicationjsonAuthorscount, headers: Location): ContentApplicationjsonAuthorscountHeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAuthorscountHeadersLocation]
  }
  
  extension [Self <: ContentApplicationjsonAuthorscountHeadersLocation](x: Self) {
    
    inline def setContent(value: ApplicationjsonAuthorscount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
