package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAuthorCommitter extends StObject {
  
  var content: ApplicationjsonAuthorCommitter
  
  var headers: Location
}
object ContentApplicationjsonAuthorCommitter {
  
  inline def apply(content: ApplicationjsonAuthorCommitter, headers: Location): ContentApplicationjsonAuthorCommitter = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAuthorCommitter]
  }
  
  extension [Self <: ContentApplicationjsonAuthorCommitter](x: Self) {
    
    inline def setContent(value: ApplicationjsonAuthorCommitter): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
