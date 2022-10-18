package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonActiveConfigEvents extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjsonActiveConfigEvents
  
  var responses: `201Content333`
}
object RequestBodyContentApplicationjsonActiveConfigEvents {
  
  inline def apply(
    parameters: `303`,
    requestBody: ContentApplicationjsonActiveConfigEvents,
    responses: `201Content333`
  ): RequestBodyContentApplicationjsonActiveConfigEvents = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonActiveConfigEvents]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonActiveConfigEvents](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonActiveConfigEvents): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content333`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
