package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson62 extends StObject {
  
  var parameters: PathDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjson62
  
  var responses: `201ContentApplicationjsonNodeidUser`
}
object ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson62 {
  
  inline def apply(
    parameters: PathDiscussionnumberTeamid,
    requestBody: ContentApplicationjson62,
    responses: `201ContentApplicationjsonNodeidUser`
  ): ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson62 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson62]
  }
  
  extension [Self <: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson62](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
