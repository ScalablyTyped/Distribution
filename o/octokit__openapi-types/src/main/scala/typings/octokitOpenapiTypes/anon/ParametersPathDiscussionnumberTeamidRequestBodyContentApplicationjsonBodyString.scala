package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBodyString extends StObject {
  
  var parameters: PathDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `201ContentApplicationjsonDiscussionurl`
}
object ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBodyString {
  
  inline def apply(
    parameters: PathDiscussionnumberTeamid,
    requestBody: ContentApplicationjsonBodyString,
    responses: `201ContentApplicationjsonDiscussionurl`
  ): ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBodyString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBodyString]
  }
  
  extension [Self <: ParametersPathDiscussionnumberTeamidRequestBodyContentApplicationjsonBodyString](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDiscussionurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
