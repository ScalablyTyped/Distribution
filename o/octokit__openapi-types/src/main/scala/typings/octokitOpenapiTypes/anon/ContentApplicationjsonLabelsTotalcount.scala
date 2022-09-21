package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLabelsTotalcount extends StObject {
  
  var content: ApplicationjsonLabelsTotalcount
}
object ContentApplicationjsonLabelsTotalcount {
  
  inline def apply(content: ApplicationjsonLabelsTotalcount): ContentApplicationjsonLabelsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLabelsTotalcount]
  }
  
  extension [Self <: ContentApplicationjsonLabelsTotalcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonLabelsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
