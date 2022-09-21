package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonItemsTotalcount extends StObject {
  
  var content: ApplicationjsonItemsTotalcount
}
object ContentApplicationjsonItemsTotalcount {
  
  inline def apply(content: ApplicationjsonItemsTotalcount): ContentApplicationjsonItemsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonItemsTotalcount]
  }
  
  extension [Self <: ContentApplicationjsonItemsTotalcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonItemsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
