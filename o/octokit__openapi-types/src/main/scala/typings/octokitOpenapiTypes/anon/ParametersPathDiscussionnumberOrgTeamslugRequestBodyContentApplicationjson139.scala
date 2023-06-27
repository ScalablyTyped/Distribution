package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson139 extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslug
  
  var requestBody: ContentApplicationjson139
  
  var responses: `200ContentApplicationjsonNodeidUser`
}
object ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson139 {
  
  inline def apply(
    parameters: PathDiscussionnumberOrgTeamslug,
    requestBody: ContentApplicationjson139,
    responses: `200ContentApplicationjsonNodeidUser`
  ): ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson139 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson139]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberOrgTeamslugRequestBodyContentApplicationjson139] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson139): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
