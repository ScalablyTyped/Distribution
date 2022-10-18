package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEventMessage extends StObject {
  
  var parameters: PathReviewid
  
  var requestBody: ContentApplicationjsonEventMessage
  
  var responses: `404Content6422Content7`
}
object RequestBodyContentApplicationjsonEventMessage {
  
  inline def apply(
    parameters: PathReviewid,
    requestBody: ContentApplicationjsonEventMessage,
    responses: `404Content6422Content7`
  ): RequestBodyContentApplicationjsonEventMessage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEventMessage]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonEventMessage](x: Self) {
    
    inline def setParameters(value: PathReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEventMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content6422Content7`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
