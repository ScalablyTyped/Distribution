package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBody extends StObject {
  
  var parameters: PathDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `201Content111`
}
object ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBody {
  
  inline def apply(
    parameters: PathDiscussionnumberTeamid,
    requestBody: ContentApplicationjsonBody,
    responses: `201Content111`
  ): ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBody]
  }
  
  extension [Self <: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBody](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content111`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
