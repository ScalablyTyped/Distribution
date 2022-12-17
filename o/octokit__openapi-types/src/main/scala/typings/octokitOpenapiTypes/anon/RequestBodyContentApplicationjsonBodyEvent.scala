package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBodyEvent extends StObject {
  
  var parameters: PathReviewid
  
  var requestBody: ContentApplicationjsonBodyEvent
  
  var responses: `200Content310403`
}
object RequestBodyContentApplicationjsonBodyEvent {
  
  inline def apply(
    parameters: PathReviewid,
    requestBody: ContentApplicationjsonBodyEvent,
    responses: `200Content310403`
  ): RequestBodyContentApplicationjsonBodyEvent = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBodyEvent]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBodyEvent](x: Self) {
    
    inline def setParameters(value: PathReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyEvent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content310403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
