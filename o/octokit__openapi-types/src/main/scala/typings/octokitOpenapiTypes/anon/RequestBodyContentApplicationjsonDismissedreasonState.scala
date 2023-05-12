package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDismissedreasonState extends StObject {
  
  var parameters: PathAlertnumberOwnerRepo
  
  var requestBody: ContentApplicationjsonDismissedreasonState
  
  var responses: `503ContentApplicationjsonCodeDocumentationurlMessage`
}
object RequestBodyContentApplicationjsonDismissedreasonState {
  
  inline def apply(
    parameters: PathAlertnumberOwnerRepo,
    requestBody: ContentApplicationjsonDismissedreasonState,
    responses: `503ContentApplicationjsonCodeDocumentationurlMessage`
  ): RequestBodyContentApplicationjsonDismissedreasonState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDismissedreasonState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonDismissedreasonState] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDismissedreasonState): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `503ContentApplicationjsonCodeDocumentationurlMessage`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
