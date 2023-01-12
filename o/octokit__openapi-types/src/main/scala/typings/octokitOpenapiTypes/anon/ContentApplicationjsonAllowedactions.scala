package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAllowedactions extends StObject {
  
  var content: ApplicationjsonAllowedactions
}
object ContentApplicationjsonAllowedactions {
  
  inline def apply(content: ApplicationjsonAllowedactions): ContentApplicationjsonAllowedactions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAllowedactions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAllowedactions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAllowedactions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
