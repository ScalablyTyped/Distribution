package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson121 extends StObject {
  
  var parameters: PathDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjson121
  
  var responses: `201Content120`
}
object ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson121 {
  
  inline def apply(
    parameters: PathDiscussionnumberTeamid,
    requestBody: ContentApplicationjson121,
    responses: `201Content120`
  ): ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson121 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson121]
  }
  
  extension [Self <: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson121](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson121): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content120`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
