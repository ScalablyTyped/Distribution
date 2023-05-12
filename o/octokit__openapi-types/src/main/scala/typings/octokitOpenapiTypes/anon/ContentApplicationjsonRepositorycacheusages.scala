package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositorycacheusages extends StObject {
  
  var content: ApplicationjsonRepositorycacheusages
  
  var headers: Link
}
object ContentApplicationjsonRepositorycacheusages {
  
  inline def apply(content: ApplicationjsonRepositorycacheusages, headers: Link): ContentApplicationjsonRepositorycacheusages = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositorycacheusages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRepositorycacheusages] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRepositorycacheusages): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
