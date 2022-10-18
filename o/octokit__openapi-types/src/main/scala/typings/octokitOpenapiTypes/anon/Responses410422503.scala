package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses410422503 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonAssigneeAssignees
  
  var responses: `410422503`
}
object Responses410422503 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonAssigneeAssignees, responses: `410422503`): Responses410422503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses410422503]
  }
  
  extension [Self <: Responses410422503](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAssigneeAssignees): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
