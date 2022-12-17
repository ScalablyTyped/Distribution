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
  
  extension [Self <: ContentApplicationjsonAllowedactions](x: Self) {
    
    inline def setContent(value: ApplicationjsonAllowedactions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
