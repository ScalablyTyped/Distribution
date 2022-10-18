package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDismissedcommentDismissedreason extends StObject {
  
  var parameters: PathAlertnumber
  
  var requestBody: ContentApplicationjsonDismissedcommentDismissedreason
  
  var responses: `200403404503`
}
object RequestBodyContentApplicationjsonDismissedcommentDismissedreason {
  
  inline def apply(
    parameters: PathAlertnumber,
    requestBody: ContentApplicationjsonDismissedcommentDismissedreason,
    responses: `200403404503`
  ): RequestBodyContentApplicationjsonDismissedcommentDismissedreason = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDismissedcommentDismissedreason]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonDismissedcommentDismissedreason](x: Self) {
    
    inline def setParameters(value: PathAlertnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDismissedcommentDismissedreason): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
