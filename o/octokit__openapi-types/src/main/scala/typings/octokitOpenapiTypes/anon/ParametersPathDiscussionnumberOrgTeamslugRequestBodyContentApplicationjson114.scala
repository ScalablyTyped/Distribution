package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson114 extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslug
  
  var requestBody: ContentApplicationjson114
  
  var responses: `200ContentApplicationjsonNodeidUser`
}
object ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson114 {
  
  inline def apply(
    parameters: PathDiscussionnumberOrgTeamslug,
    requestBody: ContentApplicationjson114,
    responses: `200ContentApplicationjsonNodeidUser`
  ): ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson114 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson114]
  }
  
  extension [Self <: ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson114](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson114): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
