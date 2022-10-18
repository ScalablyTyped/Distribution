package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonKeyReadonly extends StObject {
  
  var content: ApplicationjsonKeyReadonly
}
object ContentApplicationjsonKeyReadonly {
  
  inline def apply(content: ApplicationjsonKeyReadonly): ContentApplicationjsonKeyReadonly = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonKeyReadonly]
  }
  
  extension [Self <: ContentApplicationjsonKeyReadonly](x: Self) {
    
    inline def setContent(value: ApplicationjsonKeyReadonly): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
