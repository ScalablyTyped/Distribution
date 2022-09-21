package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOs extends StObject {
  
  var content: ApplicationjsonOs
}
object ContentApplicationjsonOs {
  
  inline def apply(content: ApplicationjsonOs): ContentApplicationjsonOs = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOs]
  }
  
  extension [Self <: ContentApplicationjsonOs](x: Self) {
    
    inline def setContent(value: ApplicationjsonOs): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
