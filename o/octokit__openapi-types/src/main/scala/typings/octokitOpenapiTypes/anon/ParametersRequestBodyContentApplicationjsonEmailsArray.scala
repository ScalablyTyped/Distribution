package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersRequestBodyContentApplicationjsonEmailsArray extends StObject {
  
  var requestBody: ContentApplicationjsonEmailsArray
  
  var responses: `140`
}
object ParametersRequestBodyContentApplicationjsonEmailsArray {
  
  inline def apply(requestBody: ContentApplicationjsonEmailsArray, responses: `140`): ParametersRequestBodyContentApplicationjsonEmailsArray = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequestBodyContentApplicationjsonEmailsArray]
  }
  
  extension [Self <: ParametersRequestBodyContentApplicationjsonEmailsArray](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonEmailsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `140`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
