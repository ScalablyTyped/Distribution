package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content373 extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslug
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `201Content373`
}
object Responses201Content373 {
  
  inline def apply(
    parameters: PathDiscussionnumberOrgTeamslug,
    requestBody: ContentApplicationjsonBodyString,
    responses: `201Content373`
  ): Responses201Content373 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content373]
  }
  
  extension [Self <: Responses201Content373](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content373`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
