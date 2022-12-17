package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses575 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamid
  
  var requestBody: ContentApplicationjson114
  
  var responses: `575`
}
object Responses575 {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumberTeamid,
    requestBody: ContentApplicationjson114,
    responses: `575`
  ): Responses575 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses575]
  }
  
  extension [Self <: Responses575](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson114): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `575`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
