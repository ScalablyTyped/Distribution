package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCodeDocumentationurl extends StObject {
  
  var content: ApplicationjsonCodeDocumentationurl
}
object ContentApplicationjsonCodeDocumentationurl {
  
  inline def apply(content: ApplicationjsonCodeDocumentationurl): ContentApplicationjsonCodeDocumentationurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCodeDocumentationurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCodeDocumentationurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
