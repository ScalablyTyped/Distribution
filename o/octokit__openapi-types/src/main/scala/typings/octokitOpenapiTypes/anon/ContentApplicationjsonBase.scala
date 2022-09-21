package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBase extends StObject {
  
  var content: ApplicationjsonBase
}
object ContentApplicationjsonBase {
  
  inline def apply(content: ApplicationjsonBase): ContentApplicationjsonBase = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBase]
  }
  
  extension [Self <: ContentApplicationjsonBase](x: Self) {
    
    inline def setContent(value: ApplicationjsonBase): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
