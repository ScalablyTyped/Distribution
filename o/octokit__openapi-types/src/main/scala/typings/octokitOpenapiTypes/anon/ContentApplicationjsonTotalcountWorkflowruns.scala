package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTotalcountWorkflowruns extends StObject {
  
  var content: ApplicationjsonTotalcountWorkflowruns
}
object ContentApplicationjsonTotalcountWorkflowruns {
  
  inline def apply(content: ApplicationjsonTotalcountWorkflowruns): ContentApplicationjsonTotalcountWorkflowruns = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTotalcountWorkflowruns]
  }
  
  extension [Self <: ContentApplicationjsonTotalcountWorkflowruns](x: Self) {
    
    inline def setContent(value: ApplicationjsonTotalcountWorkflowruns): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
