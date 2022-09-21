package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonGroupidNumber extends StObject {
  
  var parameters: PathTeamslug
  
  var requestBody: ContentApplicationjsonGroupidNumber
  
  var responses: `200Content79`
}
object RequestBodyContentApplicationjsonGroupidNumber {
  
  inline def apply(
    parameters: PathTeamslug,
    requestBody: ContentApplicationjsonGroupidNumber,
    responses: `200Content79`
  ): RequestBodyContentApplicationjsonGroupidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonGroupidNumber]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonGroupidNumber](x: Self) {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonGroupidNumber): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content79`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
