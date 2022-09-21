package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonOperations extends StObject {
  
  var parameters: `351`
  
  var requestBody: ContentApplicationjsonOperations
  
  var responses: `200Content350`
}
object RequestBodyContentApplicationjsonOperations {
  
  inline def apply(parameters: `351`, requestBody: ContentApplicationjsonOperations, responses: `200Content350`): RequestBodyContentApplicationjsonOperations = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonOperations]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonOperations](x: Self) {
    
    inline def setParameters(value: `351`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonOperations): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content350`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
