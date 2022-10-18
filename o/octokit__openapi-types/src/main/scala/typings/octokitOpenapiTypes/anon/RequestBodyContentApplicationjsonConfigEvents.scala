package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonConfigEvents extends StObject {
  
  var parameters: PathHookid
  
  var requestBody: ContentApplicationjsonConfigEvents
  
  var responses: `20045404Content6`
}
object RequestBodyContentApplicationjsonConfigEvents {
  
  inline def apply(
    parameters: PathHookid,
    requestBody: ContentApplicationjsonConfigEvents,
    responses: `20045404Content6`
  ): RequestBodyContentApplicationjsonConfigEvents = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonConfigEvents]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonConfigEvents](x: Self) {
    
    inline def setParameters(value: PathHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConfigEvents): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20045404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
