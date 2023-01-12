package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTotalcount extends StObject {
  
  var content: ApplicationjsonTotalcount
}
object ContentApplicationjsonTotalcount {
  
  inline def apply(content: ApplicationjsonTotalcount): ContentApplicationjsonTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
