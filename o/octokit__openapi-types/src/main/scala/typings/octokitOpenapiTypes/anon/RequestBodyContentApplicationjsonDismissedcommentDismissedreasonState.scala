package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDismissedcommentDismissedreasonState extends StObject {
  
  var parameters: PathAlertnumberOwner
  
  var requestBody: ContentApplicationjsonDismissedcommentDismissedreasonState
  
  var responses: `200Content452403`
}
object RequestBodyContentApplicationjsonDismissedcommentDismissedreasonState {
  
  inline def apply(
    parameters: PathAlertnumberOwner,
    requestBody: ContentApplicationjsonDismissedcommentDismissedreasonState,
    responses: `200Content452403`
  ): RequestBodyContentApplicationjsonDismissedcommentDismissedreasonState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDismissedcommentDismissedreasonState]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonDismissedcommentDismissedreasonState](x: Self) {
    
    inline def setParameters(value: PathAlertnumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDismissedcommentDismissedreasonState): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content452403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
