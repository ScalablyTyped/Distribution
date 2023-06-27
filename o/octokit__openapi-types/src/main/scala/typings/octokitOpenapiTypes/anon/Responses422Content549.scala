package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422Content549 extends StObject {
  
  var parameters: PathOrgRequiredworkflowid
  
  var requestBody: ContentApplicationjsonWorkflowfilepath
  
  var responses: `422Content549`
}
object Responses422Content549 {
  
  inline def apply(
    parameters: PathOrgRequiredworkflowid,
    requestBody: ContentApplicationjsonWorkflowfilepath,
    responses: `422Content549`
  ): Responses422Content549 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422Content549]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses422Content549] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRequiredworkflowid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonWorkflowfilepath): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content549`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
