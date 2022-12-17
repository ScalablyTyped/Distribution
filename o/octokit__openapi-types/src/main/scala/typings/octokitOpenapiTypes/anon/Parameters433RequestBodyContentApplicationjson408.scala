package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters433RequestBodyContentApplicationjson408 extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjson408
  
  var responses: `409Unknown`
}
object Parameters433RequestBodyContentApplicationjson408 {
  
  inline def apply(parameters: `433`, requestBody: ContentApplicationjson408, responses: `409Unknown`): Parameters433RequestBodyContentApplicationjson408 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters433RequestBodyContentApplicationjson408]
  }
  
  extension [Self <: Parameters433RequestBodyContentApplicationjson408](x: Self) {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson408): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
