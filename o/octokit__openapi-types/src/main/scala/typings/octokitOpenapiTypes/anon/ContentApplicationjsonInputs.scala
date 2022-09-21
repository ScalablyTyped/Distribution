package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInputs extends StObject {
  
  var content: ApplicationjsonInputs
}
object ContentApplicationjsonInputs {
  
  inline def apply(content: ApplicationjsonInputs): ContentApplicationjsonInputs = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInputs]
  }
  
  extension [Self <: ContentApplicationjsonInputs](x: Self) {
    
    inline def setContent(value: ApplicationjsonInputs): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
