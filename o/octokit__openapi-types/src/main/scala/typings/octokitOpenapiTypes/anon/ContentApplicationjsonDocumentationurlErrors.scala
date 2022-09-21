package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDocumentationurlErrors extends StObject {
  
  var content: ApplicationjsonDocumentationurlErrors
}
object ContentApplicationjsonDocumentationurlErrors {
  
  inline def apply(content: ApplicationjsonDocumentationurlErrors): ContentApplicationjsonDocumentationurlErrors = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDocumentationurlErrors]
  }
  
  extension [Self <: ContentApplicationjsonDocumentationurlErrors](x: Self) {
    
    inline def setContent(value: ApplicationjsonDocumentationurlErrors): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
