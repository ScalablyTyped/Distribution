package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRequiredworkflowsTotalcount extends StObject {
  
  var content: ApplicationjsonRequiredworkflowsTotalcount
}
object ContentApplicationjsonRequiredworkflowsTotalcount {
  
  inline def apply(content: ApplicationjsonRequiredworkflowsTotalcount): ContentApplicationjsonRequiredworkflowsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRequiredworkflowsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRequiredworkflowsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRequiredworkflowsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
