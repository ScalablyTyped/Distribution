package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson261 extends StObject {
  
  var parameters: PathInvitationidOwner
  
  var requestBody: ContentApplicationjson261
  
  var responses: `200Content207`
}
object RequestBodyContentApplicationjson261 {
  
  inline def apply(
    parameters: PathInvitationidOwner,
    requestBody: ContentApplicationjson261,
    responses: `200Content207`
  ): RequestBodyContentApplicationjson261 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson261]
  }
  
  extension [Self <: RequestBodyContentApplicationjson261](x: Self) {
    
    inline def setParameters(value: PathInvitationidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson261): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content207`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
