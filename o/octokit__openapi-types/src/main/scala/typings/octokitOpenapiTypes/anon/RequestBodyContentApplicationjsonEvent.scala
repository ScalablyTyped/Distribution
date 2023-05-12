package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEvent extends StObject {
  
  var parameters: PathReviewid
  
  var requestBody: ContentApplicationjsonEvent
  
  var responses: `200Content325404422`
}
object RequestBodyContentApplicationjsonEvent {
  
  inline def apply(
    parameters: PathReviewid,
    requestBody: ContentApplicationjsonEvent,
    responses: `200Content325404422`
  ): RequestBodyContentApplicationjsonEvent = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonEvent] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEvent): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content325404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
