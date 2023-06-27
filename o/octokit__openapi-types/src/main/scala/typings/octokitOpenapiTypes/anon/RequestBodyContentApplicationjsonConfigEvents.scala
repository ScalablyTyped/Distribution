package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonConfigEvents extends StObject {
  
  var parameters: `582`
  
  var requestBody: ContentApplicationjsonConfigEvents
  
  var responses: `201ContentApplicationjsonDeliveriesurl`
}
object RequestBodyContentApplicationjsonConfigEvents {
  
  inline def apply(
    parameters: `582`,
    requestBody: ContentApplicationjsonConfigEvents,
    responses: `201ContentApplicationjsonDeliveriesurl`
  ): RequestBodyContentApplicationjsonConfigEvents = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonConfigEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonConfigEvents] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConfigEvents): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDeliveriesurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
