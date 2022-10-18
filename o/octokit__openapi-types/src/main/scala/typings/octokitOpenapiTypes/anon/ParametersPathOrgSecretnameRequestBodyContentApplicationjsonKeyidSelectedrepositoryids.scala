package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameRequestBodyContentApplicationjsonKeyidSelectedrepositoryids extends StObject {
  
  var parameters: PathOrgSecretname
  
  var requestBody: ContentApplicationjsonKeyidSelectedrepositoryids
  
  var responses: `323`
}
object ParametersPathOrgSecretnameRequestBodyContentApplicationjsonKeyidSelectedrepositoryids {
  
  inline def apply(
    parameters: PathOrgSecretname,
    requestBody: ContentApplicationjsonKeyidSelectedrepositoryids,
    responses: `323`
  ): ParametersPathOrgSecretnameRequestBodyContentApplicationjsonKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameRequestBodyContentApplicationjsonKeyidSelectedrepositoryids]
  }
  
  extension [Self <: ParametersPathOrgSecretnameRequestBodyContentApplicationjsonKeyidSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyidSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `323`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
