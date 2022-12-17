package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDismissedreasonState extends StObject {
  
  var parameters: PathAlertnumberOwnerRepo
  
  var requestBody: ContentApplicationjsonDismissedreasonState
  
  var responses: `200304400`
}
object RequestBodyContentApplicationjsonDismissedreasonState {
  
  inline def apply(
    parameters: PathAlertnumberOwnerRepo,
    requestBody: ContentApplicationjsonDismissedreasonState,
    responses: `200304400`
  ): RequestBodyContentApplicationjsonDismissedreasonState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDismissedreasonState]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonDismissedreasonState](x: Self) {
    
    inline def setParameters(value: PathAlertnumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDismissedreasonState): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
