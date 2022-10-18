package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonInvitee extends StObject {
  
  var parameters: PathRepoUsername
  
  var requestBody: ContentApplicationjson69
  
  var responses: `201ContentApplicationjsonInvitee`
}
object Responses201ContentApplicationjsonInvitee {
  
  inline def apply(
    parameters: PathRepoUsername,
    requestBody: ContentApplicationjson69,
    responses: `201ContentApplicationjsonInvitee`
  ): Responses201ContentApplicationjsonInvitee = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonInvitee]
  }
  
  extension [Self <: Responses201ContentApplicationjsonInvitee](x: Self) {
    
    inline def setParameters(value: PathRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson69): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonInvitee`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
