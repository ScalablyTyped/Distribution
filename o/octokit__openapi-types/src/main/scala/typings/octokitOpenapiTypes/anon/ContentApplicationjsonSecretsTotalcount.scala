package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSecretsTotalcount extends StObject {
  
  var content: ApplicationjsonSecretsTotalcount
}
object ContentApplicationjsonSecretsTotalcount {
  
  inline def apply(content: ApplicationjsonSecretsTotalcount): ContentApplicationjsonSecretsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSecretsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonSecretsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonSecretsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
