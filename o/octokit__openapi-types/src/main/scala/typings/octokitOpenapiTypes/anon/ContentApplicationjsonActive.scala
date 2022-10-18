package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonActive extends StObject {
  
  var content: ApplicationjsonActive
  
  var headers: Location
}
object ContentApplicationjsonActive {
  
  inline def apply(content: ApplicationjsonActive, headers: Location): ContentApplicationjsonActive = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonActive]
  }
  
  extension [Self <: ContentApplicationjsonActive](x: Self) {
    
    inline def setContent(value: ApplicationjsonActive): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
