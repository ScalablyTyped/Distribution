package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonWorkflowruns extends StObject {
  
  var content: ApplicationjsonWorkflowruns
}
object ContentApplicationjsonWorkflowruns {
  
  inline def apply(content: ApplicationjsonWorkflowruns): ContentApplicationjsonWorkflowruns = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonWorkflowruns]
  }
  
  extension [Self <: ContentApplicationjsonWorkflowruns](x: Self) {
    
    inline def setContent(value: ApplicationjsonWorkflowruns): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
