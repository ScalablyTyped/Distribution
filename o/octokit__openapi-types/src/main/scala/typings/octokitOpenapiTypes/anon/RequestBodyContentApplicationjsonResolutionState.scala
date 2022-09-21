package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonResolutionState extends StObject {
  
  var parameters: PathAlertnumber
  
  var requestBody: ContentApplicationjsonResolutionState
  
  var responses: `404422503`
}
object RequestBodyContentApplicationjsonResolutionState {
  
  inline def apply(
    parameters: PathAlertnumber,
    requestBody: ContentApplicationjsonResolutionState,
    responses: `404422503`
  ): RequestBodyContentApplicationjsonResolutionState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonResolutionState]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonResolutionState](x: Self) {
    
    inline def setParameters(value: PathAlertnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonResolutionState): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
