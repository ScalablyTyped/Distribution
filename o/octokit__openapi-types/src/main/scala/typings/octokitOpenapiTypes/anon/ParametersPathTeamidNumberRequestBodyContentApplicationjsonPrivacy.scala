package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberRequestBodyContentApplicationjsonPrivacy extends StObject {
  
  var parameters: PathTeamidNumber
  
  var requestBody: ContentApplicationjsonPrivacy
  
  var responses: `200201403`
}
object ParametersPathTeamidNumberRequestBodyContentApplicationjsonPrivacy {
  
  inline def apply(parameters: PathTeamidNumber, requestBody: ContentApplicationjsonPrivacy, responses: `200201403`): ParametersPathTeamidNumberRequestBodyContentApplicationjsonPrivacy = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberRequestBodyContentApplicationjsonPrivacy]
  }
  
  extension [Self <: ParametersPathTeamidNumberRequestBodyContentApplicationjsonPrivacy](x: Self) {
    
    inline def setParameters(value: PathTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrivacy): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
