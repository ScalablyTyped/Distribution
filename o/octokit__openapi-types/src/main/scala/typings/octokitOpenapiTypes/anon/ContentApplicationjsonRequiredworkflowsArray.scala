package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRequiredworkflowsArray extends StObject {
  
  var content: ApplicationjsonRequiredworkflowsArray
}
object ContentApplicationjsonRequiredworkflowsArray {
  
  inline def apply(content: ApplicationjsonRequiredworkflowsArray): ContentApplicationjsonRequiredworkflowsArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRequiredworkflowsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRequiredworkflowsArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRequiredworkflowsArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
