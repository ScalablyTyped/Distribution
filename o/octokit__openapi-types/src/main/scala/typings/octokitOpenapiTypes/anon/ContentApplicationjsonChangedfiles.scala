package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonChangedfiles extends StObject {
  
  var content: ApplicationjsonChangedfiles
  
  var headers: Location
}
object ContentApplicationjsonChangedfiles {
  
  inline def apply(content: ApplicationjsonChangedfiles, headers: Location): ContentApplicationjsonChangedfiles = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonChangedfiles]
  }
  
  extension [Self <: ContentApplicationjsonChangedfiles](x: Self) {
    
    inline def setContent(value: ApplicationjsonChangedfiles): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
