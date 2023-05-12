package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTotalcountWorkflowruns extends StObject {
  
  var content: ApplicationjsonTotalcountWorkflowruns
  
  var headers: LinkString
}
object ContentApplicationjsonTotalcountWorkflowruns {
  
  inline def apply(content: ApplicationjsonTotalcountWorkflowruns, headers: LinkString): ContentApplicationjsonTotalcountWorkflowruns = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTotalcountWorkflowruns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTotalcountWorkflowruns] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTotalcountWorkflowruns): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
