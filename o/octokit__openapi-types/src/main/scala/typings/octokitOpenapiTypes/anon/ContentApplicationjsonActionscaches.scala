package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonActionscaches extends StObject {
  
  var content: ApplicationjsonActionscaches
  
  var headers: LinkString
}
object ContentApplicationjsonActionscaches {
  
  inline def apply(content: ApplicationjsonActionscaches, headers: LinkString): ContentApplicationjsonActionscaches = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonActionscaches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonActionscaches] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonActionscaches): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
