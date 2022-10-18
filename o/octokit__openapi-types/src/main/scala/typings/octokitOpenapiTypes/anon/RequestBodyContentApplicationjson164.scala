package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson164 extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjson164
  
  var responses: `202205`
}
object RequestBodyContentApplicationjson164 {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjson164, responses: `202205`): RequestBodyContentApplicationjson164 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson164]
  }
  
  extension [Self <: RequestBodyContentApplicationjson164](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson164): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202205`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
