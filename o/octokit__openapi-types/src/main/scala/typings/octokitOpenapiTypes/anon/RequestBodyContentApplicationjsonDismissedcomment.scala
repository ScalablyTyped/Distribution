package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDismissedcomment extends StObject {
  
  var parameters: PathAlertnumber
  
  var requestBody: ContentApplicationjsonDismissedcomment
  
  var responses: `200403404503`
}
object RequestBodyContentApplicationjsonDismissedcomment {
  
  inline def apply(
    parameters: PathAlertnumber,
    requestBody: ContentApplicationjsonDismissedcomment,
    responses: `200403404503`
  ): RequestBodyContentApplicationjsonDismissedcomment = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDismissedcomment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonDismissedcomment] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDismissedcomment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
