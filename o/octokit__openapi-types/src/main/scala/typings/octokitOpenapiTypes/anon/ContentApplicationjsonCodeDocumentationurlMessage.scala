package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCodeDocumentationurlMessage extends StObject {
  
  var content: ApplicationjsonCodeDocumentationurlMessage
}
object ContentApplicationjsonCodeDocumentationurlMessage {
  
  inline def apply(content: ApplicationjsonCodeDocumentationurlMessage): ContentApplicationjsonCodeDocumentationurlMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCodeDocumentationurlMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCodeDocumentationurlMessage] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
