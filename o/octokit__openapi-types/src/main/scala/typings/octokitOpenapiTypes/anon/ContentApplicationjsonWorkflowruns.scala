package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonWorkflowruns extends StObject {
  
  var content: ApplicationjsonWorkflowruns
  
  var headers: Link
}
object ContentApplicationjsonWorkflowruns {
  
  inline def apply(content: ApplicationjsonWorkflowruns, headers: Link): ContentApplicationjsonWorkflowruns = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonWorkflowruns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonWorkflowruns] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonWorkflowruns): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
