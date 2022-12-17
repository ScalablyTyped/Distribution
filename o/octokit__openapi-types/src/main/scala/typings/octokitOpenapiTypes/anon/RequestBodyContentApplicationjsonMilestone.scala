package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonMilestone extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: ContentApplicationjsonMilestone
  
  var responses: `301403`
}
object RequestBodyContentApplicationjsonMilestone {
  
  inline def apply(parameters: PathIssuenumber, requestBody: ContentApplicationjsonMilestone, responses: `301403`): RequestBodyContentApplicationjsonMilestone = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonMilestone]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonMilestone](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMilestone): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
