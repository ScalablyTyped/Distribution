package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIsalphanumeric extends StObject {
  
  var content: ApplicationjsonIsalphanumeric
  
  var headers: Location
}
object ContentApplicationjsonIsalphanumeric {
  
  inline def apply(content: ApplicationjsonIsalphanumeric, headers: Location): ContentApplicationjsonIsalphanumeric = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIsalphanumeric]
  }
  
  extension [Self <: ContentApplicationjsonIsalphanumeric](x: Self) {
    
    inline def setContent(value: ApplicationjsonIsalphanumeric): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
