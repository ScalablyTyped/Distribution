package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDocumentationurlErrorsMessage extends StObject {
  
  var content: ApplicationjsonDocumentationurlErrorsMessage
}
object ContentApplicationjsonDocumentationurlErrorsMessage {
  
  inline def apply(content: ApplicationjsonDocumentationurlErrorsMessage): ContentApplicationjsonDocumentationurlErrorsMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDocumentationurlErrorsMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDocumentationurlErrorsMessage] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDocumentationurlErrorsMessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
