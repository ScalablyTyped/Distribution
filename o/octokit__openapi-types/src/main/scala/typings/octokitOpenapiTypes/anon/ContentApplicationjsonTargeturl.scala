package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTargeturl extends StObject {
  
  var content: ApplicationjsonTargeturl
  
  var headers: Location
}
object ContentApplicationjsonTargeturl {
  
  inline def apply(content: ApplicationjsonTargeturl, headers: Location): ContentApplicationjsonTargeturl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTargeturl]
  }
  
  extension [Self <: ContentApplicationjsonTargeturl](x: Self) {
    
    inline def setContent(value: ApplicationjsonTargeturl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
