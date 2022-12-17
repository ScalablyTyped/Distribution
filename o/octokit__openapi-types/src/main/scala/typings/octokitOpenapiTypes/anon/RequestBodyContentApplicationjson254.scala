package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson254 extends StObject {
  
  var parameters: PathInvitationidOwner
  
  var requestBody: ContentApplicationjson254
  
  var responses: `200Content193`
}
object RequestBodyContentApplicationjson254 {
  
  inline def apply(
    parameters: PathInvitationidOwner,
    requestBody: ContentApplicationjson254,
    responses: `200Content193`
  ): RequestBodyContentApplicationjson254 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson254]
  }
  
  extension [Self <: RequestBodyContentApplicationjson254](x: Self) {
    
    inline def setParameters(value: PathInvitationidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson254): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content193`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
