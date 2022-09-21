package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonJobsTotalcount extends StObject {
  
  var content: ApplicationjsonJobsTotalcount
}
object ContentApplicationjsonJobsTotalcount {
  
  inline def apply(content: ApplicationjsonJobsTotalcount): ContentApplicationjsonJobsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonJobsTotalcount]
  }
  
  extension [Self <: ContentApplicationjsonJobsTotalcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonJobsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
