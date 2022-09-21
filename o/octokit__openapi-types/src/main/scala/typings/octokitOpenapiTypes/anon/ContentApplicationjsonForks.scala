package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonForks extends StObject {
  
  var content: ApplicationjsonForks
  
  var headers: Location
}
object ContentApplicationjsonForks {
  
  inline def apply(content: ApplicationjsonForks, headers: Location): ContentApplicationjsonForks = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonForks]
  }
  
  extension [Self <: ContentApplicationjsonForks](x: Self) {
    
    inline def setContent(value: ApplicationjsonForks): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
