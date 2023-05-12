package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSecretsTotalcount extends StObject {
  
  var content: ApplicationjsonSecretsTotalcount
  
  var headers: Link
}
object ContentApplicationjsonSecretsTotalcount {
  
  inline def apply(content: ApplicationjsonSecretsTotalcount, headers: Link): ContentApplicationjsonSecretsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSecretsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonSecretsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonSecretsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
