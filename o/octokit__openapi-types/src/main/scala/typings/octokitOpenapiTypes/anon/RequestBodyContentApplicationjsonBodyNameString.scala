package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBodyNameString extends StObject {
  
  var parameters: `37`
  
  var requestBody: ContentApplicationjsonBodyNameString
  
  var responses: `410`
}
object RequestBodyContentApplicationjsonBodyNameString {
  
  inline def apply(parameters: `37`, requestBody: ContentApplicationjsonBodyNameString, responses: `410`): RequestBodyContentApplicationjsonBodyNameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBodyNameString]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBodyNameString](x: Self) {
    
    inline def setParameters(value: `37`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
