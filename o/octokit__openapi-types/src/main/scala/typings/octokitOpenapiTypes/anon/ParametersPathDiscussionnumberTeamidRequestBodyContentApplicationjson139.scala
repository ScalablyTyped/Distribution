package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson139 extends StObject {
  
  var parameters: PathDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjson139
  
  var responses: `201Content140`
}
object ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson139 {
  
  inline def apply(
    parameters: PathDiscussionnumberTeamid,
    requestBody: ContentApplicationjson139,
    responses: `201Content140`
  ): ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson139 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson139]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjson139] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson139): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content140`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
