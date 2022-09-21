package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonUsedefault extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonUsedefault
  
  var responses: `201400404`
}
object RequestBodyContentApplicationjsonUsedefault {
  
  inline def apply(parameters: `491`, requestBody: ContentApplicationjsonUsedefault, responses: `201400404`): RequestBodyContentApplicationjsonUsedefault = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonUsedefault]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonUsedefault](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUsedefault): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201400404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
