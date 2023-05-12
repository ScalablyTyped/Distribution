package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonWorkflowfilepath extends StObject {
  
  var content: ApplicationjsonWorkflowfilepath
}
object ContentApplicationjsonWorkflowfilepath {
  
  inline def apply(content: ApplicationjsonWorkflowfilepath): ContentApplicationjsonWorkflowfilepath = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonWorkflowfilepath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonWorkflowfilepath] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonWorkflowfilepath): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
