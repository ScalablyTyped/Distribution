package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonVersioncount extends StObject {
  
  var content: ApplicationjsonVersioncount
}
object ContentApplicationjsonVersioncount {
  
  inline def apply(content: ApplicationjsonVersioncount): ContentApplicationjsonVersioncount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonVersioncount]
  }
  
  extension [Self <: ContentApplicationjsonVersioncount](x: Self) {
    
    inline def setContent(value: ApplicationjsonVersioncount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
