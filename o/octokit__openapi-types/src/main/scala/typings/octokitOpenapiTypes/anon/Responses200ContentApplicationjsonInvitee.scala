package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonInvitee extends StObject {
  
  var parameters: PathInvitationidOwnerRepo
  
  var requestBody: ContentApplicationjson261
  
  var responses: `200ContentApplicationjsonInvitee`
}
object Responses200ContentApplicationjsonInvitee {
  
  inline def apply(
    parameters: PathInvitationidOwnerRepo,
    requestBody: ContentApplicationjson261,
    responses: `200ContentApplicationjsonInvitee`
  ): Responses200ContentApplicationjsonInvitee = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonInvitee]
  }
  
  extension [Self <: Responses200ContentApplicationjsonInvitee](x: Self) {
    
    inline def setParameters(value: PathInvitationidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson261): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonInvitee`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
