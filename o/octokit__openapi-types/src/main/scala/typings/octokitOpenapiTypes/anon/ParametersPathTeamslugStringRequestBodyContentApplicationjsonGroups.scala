package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugStringRequestBodyContentApplicationjsonGroups extends StObject {
  
  var parameters: PathTeamslugString
  
  var requestBody: ContentApplicationjsonGroups
  
  var responses: `200487`
}
object ParametersPathTeamslugStringRequestBodyContentApplicationjsonGroups {
  
  inline def apply(parameters: PathTeamslugString, requestBody: ContentApplicationjsonGroups, responses: `200487`): ParametersPathTeamslugStringRequestBodyContentApplicationjsonGroups = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugStringRequestBodyContentApplicationjsonGroups]
  }
  
  extension [Self <: ParametersPathTeamslugStringRequestBodyContentApplicationjsonGroups](x: Self) {
    
    inline def setParameters(value: PathTeamslugString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGroups): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200487`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
