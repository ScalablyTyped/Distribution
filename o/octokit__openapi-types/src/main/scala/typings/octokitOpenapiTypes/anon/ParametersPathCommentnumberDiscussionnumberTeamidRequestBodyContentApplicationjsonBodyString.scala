package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberTeamidRequestBodyContentApplicationjsonBodyString extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `200Content373`
}
object ParametersPathCommentnumberDiscussionnumberTeamidRequestBodyContentApplicationjsonBodyString {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumberTeamid,
    requestBody: ContentApplicationjsonBodyString,
    responses: `200Content373`
  ): ParametersPathCommentnumberDiscussionnumberTeamidRequestBodyContentApplicationjsonBodyString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberTeamidRequestBodyContentApplicationjsonBodyString]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberTeamidRequestBodyContentApplicationjsonBodyString](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content373`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
