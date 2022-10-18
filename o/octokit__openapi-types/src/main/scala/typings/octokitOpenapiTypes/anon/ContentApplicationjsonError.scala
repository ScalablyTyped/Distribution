package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonError extends StObject {
  
  var content: ApplicationjsonError
}
object ContentApplicationjsonError {
  
  inline def apply(content: ApplicationjsonError): ContentApplicationjsonError = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonError]
  }
  
  extension [Self <: ContentApplicationjsonError](x: Self) {
    
    inline def setContent(value: ApplicationjsonError): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
