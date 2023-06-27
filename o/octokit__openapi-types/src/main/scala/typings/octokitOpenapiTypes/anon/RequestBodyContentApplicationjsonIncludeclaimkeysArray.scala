package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonIncludeclaimkeysArray extends StObject {
  
  var parameters: `582`
  
  var requestBody: ContentApplicationjsonIncludeclaimkeysArray
  
  var responses: `201ContentApplicationjsonRecord`
}
object RequestBodyContentApplicationjsonIncludeclaimkeysArray {
  
  inline def apply(
    parameters: `582`,
    requestBody: ContentApplicationjsonIncludeclaimkeysArray,
    responses: `201ContentApplicationjsonRecord`
  ): RequestBodyContentApplicationjsonIncludeclaimkeysArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonIncludeclaimkeysArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonIncludeclaimkeysArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIncludeclaimkeysArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonRecord`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
