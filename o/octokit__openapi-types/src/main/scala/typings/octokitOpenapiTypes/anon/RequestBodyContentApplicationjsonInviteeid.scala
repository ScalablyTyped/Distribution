package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonInviteeid extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonInviteeid
  
  var responses: `201ContentApplicationjsonFailedreason`
}
object RequestBodyContentApplicationjsonInviteeid {
  
  inline def apply(
    parameters: `37`,
    requestBody: ContentApplicationjsonInviteeid,
    responses: `201ContentApplicationjsonFailedreason`
  ): RequestBodyContentApplicationjsonInviteeid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonInviteeid]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonInviteeid](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonInviteeid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonFailedreason`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
