package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content464 extends StObject {
  
  var parameters: PathInvitationidOwnerRepo
  
  var requestBody: ContentApplicationjson141
  
  var responses: `200Content464`
}
object Responses200Content464 {
  
  inline def apply(
    parameters: PathInvitationidOwnerRepo,
    requestBody: ContentApplicationjson141,
    responses: `200Content464`
  ): Responses200Content464 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content464]
  }
  
  extension [Self <: Responses200Content464](x: Self) {
    
    inline def setParameters(value: PathInvitationidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson141): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content464`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
