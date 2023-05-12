package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonIncludeclaimkeys extends StObject {
  
  var parameters: `141`
  
  var requestBody: ContentApplicationjsonIncludeclaimkeys
  
  var responses: `201400`
}
object RequestBodyContentApplicationjsonIncludeclaimkeys {
  
  inline def apply(parameters: `141`, requestBody: ContentApplicationjsonIncludeclaimkeys, responses: `201400`): RequestBodyContentApplicationjsonIncludeclaimkeys = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonIncludeclaimkeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonIncludeclaimkeys] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIncludeclaimkeys): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
