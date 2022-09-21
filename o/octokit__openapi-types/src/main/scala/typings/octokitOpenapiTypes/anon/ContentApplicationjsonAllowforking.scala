package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAllowforking extends StObject {
  
  var content: ApplicationjsonAllowforking
}
object ContentApplicationjsonAllowforking {
  
  inline def apply(content: ApplicationjsonAllowforking): ContentApplicationjsonAllowforking = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAllowforking]
  }
  
  extension [Self <: ContentApplicationjsonAllowforking](x: Self) {
    
    inline def setContent(value: ApplicationjsonAllowforking): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
