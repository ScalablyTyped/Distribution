package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDocumentationurlMessage extends StObject {
  
  var content: ApplicationjsonDocumentationurlMessage
}
object ContentApplicationjsonDocumentationurlMessage {
  
  inline def apply(content: ApplicationjsonDocumentationurlMessage): ContentApplicationjsonDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDocumentationurlMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonDocumentationurlMessage] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
