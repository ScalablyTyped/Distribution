package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersRequestBodyContentApplicationjsonEmails extends StObject {
  
  var requestBody: ContentApplicationjsonEmails
  
  var responses: `304Unknown401Content6`
}
object ParametersRequestBodyContentApplicationjsonEmails {
  
  inline def apply(requestBody: ContentApplicationjsonEmails, responses: `304Unknown401Content6`): ParametersRequestBodyContentApplicationjsonEmails = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequestBodyContentApplicationjsonEmails]
  }
  
  extension [Self <: ParametersRequestBodyContentApplicationjsonEmails](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
