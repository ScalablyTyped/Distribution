package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSecretnameStringRequestBodyContentApplicationjsonKeyidSelectedrepositoryids extends StObject {
  
  var parameters: PathSecretnameString
  
  var requestBody: ContentApplicationjsonKeyidSelectedrepositoryids
  
  var responses: `201Content40404Content48`
}
object ParametersPathSecretnameStringRequestBodyContentApplicationjsonKeyidSelectedrepositoryids {
  
  inline def apply(
    parameters: PathSecretnameString,
    requestBody: ContentApplicationjsonKeyidSelectedrepositoryids,
    responses: `201Content40404Content48`
  ): ParametersPathSecretnameStringRequestBodyContentApplicationjsonKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSecretnameStringRequestBodyContentApplicationjsonKeyidSelectedrepositoryids]
  }
  
  extension [Self <: ParametersPathSecretnameStringRequestBodyContentApplicationjsonKeyidSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: PathSecretnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyidSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content40404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
