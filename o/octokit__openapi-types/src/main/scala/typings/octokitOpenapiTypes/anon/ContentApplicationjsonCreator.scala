package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCreator extends StObject {
  
  var content: ApplicationjsonCreator
  
  var headers: Location
}
object ContentApplicationjsonCreator {
  
  inline def apply(content: ApplicationjsonCreator, headers: Location): ContentApplicationjsonCreator = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCreator]
  }
  
  extension [Self <: ContentApplicationjsonCreator](x: Self) {
    
    inline def setContent(value: ApplicationjsonCreator): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
