package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAssigneeAssignees extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonAssigneeAssignees
  
  var responses: `403404410`
}
object RequestBodyContentApplicationjsonAssigneeAssignees {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjsonAssigneeAssignees, responses: `403404410`): RequestBodyContentApplicationjsonAssigneeAssignees = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAssigneeAssignees]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAssigneeAssignees](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAssigneeAssignees): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
