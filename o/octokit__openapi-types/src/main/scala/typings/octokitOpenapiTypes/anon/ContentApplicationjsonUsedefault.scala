package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonUsedefault extends StObject {
  
  var content: ApplicationjsonUsedefault
}
object ContentApplicationjsonUsedefault {
  
  inline def apply(content: ApplicationjsonUsedefault): ContentApplicationjsonUsedefault = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonUsedefault]
  }
  
  extension [Self <: ContentApplicationjsonUsedefault](x: Self) {
    
    inline def setContent(value: ApplicationjsonUsedefault): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
