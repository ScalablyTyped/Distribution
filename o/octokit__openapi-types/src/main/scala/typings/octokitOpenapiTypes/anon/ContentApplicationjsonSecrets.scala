package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSecrets extends StObject {
  
  var content: ApplicationjsonSecrets
  
  var headers: Link
}
object ContentApplicationjsonSecrets {
  
  inline def apply(content: ApplicationjsonSecrets, headers: Link): ContentApplicationjsonSecrets = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSecrets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonSecrets] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonSecrets): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
