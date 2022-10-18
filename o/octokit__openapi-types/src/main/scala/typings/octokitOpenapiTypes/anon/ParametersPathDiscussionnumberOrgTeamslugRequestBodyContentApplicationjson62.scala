package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson62 extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslug
  
  var requestBody: ContentApplicationjson62
  
  var responses: `200Content376`
}
object ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson62 {
  
  inline def apply(
    parameters: PathDiscussionnumberOrgTeamslug,
    requestBody: ContentApplicationjson62,
    responses: `200Content376`
  ): ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson62 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson62]
  }
  
  extension [Self <: ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson62](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content376`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
