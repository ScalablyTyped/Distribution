package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson141 extends StObject {
  
  var parameters: PathInvitationidOwner
  
  var requestBody: ContentApplicationjson141
  
  var responses: `200ContentApplicationjsonInvitee`
}
object RequestBodyContentApplicationjson141 {
  
  inline def apply(
    parameters: PathInvitationidOwner,
    requestBody: ContentApplicationjson141,
    responses: `200ContentApplicationjsonInvitee`
  ): RequestBodyContentApplicationjson141 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson141]
  }
  
  extension [Self <: RequestBodyContentApplicationjson141](x: Self) {
    
    inline def setParameters(value: PathInvitationidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson141): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonInvitee`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
