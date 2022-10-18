package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonForkof extends StObject {
  
  var content: ApplicationjsonForkof
  
  var headers: Location
}
object ContentApplicationjsonForkof {
  
  inline def apply(content: ApplicationjsonForkof, headers: Location): ContentApplicationjsonForkof = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonForkof]
  }
  
  extension [Self <: ContentApplicationjsonForkof](x: Self) {
    
    inline def setContent(value: ApplicationjsonForkof): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
