package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberTeamidRequestBodyContentApplicationjsonBody extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `200ContentApplicationjsonLasteditedat`
}
object ParametersPathCommentnumberDiscussionnumberTeamidRequestBodyContentApplicationjsonBody {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumberTeamid,
    requestBody: ContentApplicationjsonBody,
    responses: `200ContentApplicationjsonLasteditedat`
  ): ParametersPathCommentnumberDiscussionnumberTeamidRequestBodyContentApplicationjsonBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberTeamidRequestBodyContentApplicationjsonBody]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberTeamidRequestBodyContentApplicationjsonBody](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLasteditedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
