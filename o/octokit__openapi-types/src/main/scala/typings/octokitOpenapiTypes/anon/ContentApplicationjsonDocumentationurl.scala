package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDocumentationurl extends StObject {
  
  var content: ApplicationjsonDocumentationurl
}
object ContentApplicationjsonDocumentationurl {
  
  inline def apply(content: ApplicationjsonDocumentationurl): ContentApplicationjsonDocumentationurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDocumentationurl]
  }
  
  extension [Self <: ContentApplicationjsonDocumentationurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonDocumentationurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
