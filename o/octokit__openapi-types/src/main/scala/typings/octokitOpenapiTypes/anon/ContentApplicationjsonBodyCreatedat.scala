package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBodyCreatedat extends StObject {
  
  var content: ApplicationjsonBodyCreatedat
  
  var headers: Location
}
object ContentApplicationjsonBodyCreatedat {
  
  inline def apply(content: ApplicationjsonBodyCreatedat, headers: Location): ContentApplicationjsonBodyCreatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBodyCreatedat]
  }
  
  extension [Self <: ContentApplicationjsonBodyCreatedat](x: Self) {
    
    inline def setContent(value: ApplicationjsonBodyCreatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
