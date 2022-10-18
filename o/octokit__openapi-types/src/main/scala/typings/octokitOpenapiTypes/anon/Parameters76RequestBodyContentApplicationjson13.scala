package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters76RequestBodyContentApplicationjson13 extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjson13
  
  var responses: `409Unknown`
}
object Parameters76RequestBodyContentApplicationjson13 {
  
  inline def apply(parameters: `76`, requestBody: ContentApplicationjson13, responses: `409Unknown`): Parameters76RequestBodyContentApplicationjson13 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters76RequestBodyContentApplicationjson13]
  }
  
  extension [Self <: Parameters76RequestBodyContentApplicationjson13](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson13): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
