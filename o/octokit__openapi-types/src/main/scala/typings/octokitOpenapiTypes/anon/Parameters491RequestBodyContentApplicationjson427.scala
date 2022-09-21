package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters491RequestBodyContentApplicationjson427 extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjson427
  
  var responses: `409Unknown`
}
object Parameters491RequestBodyContentApplicationjson427 {
  
  inline def apply(parameters: `491`, requestBody: ContentApplicationjson427, responses: `409Unknown`): Parameters491RequestBodyContentApplicationjson427 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters491RequestBodyContentApplicationjson427]
  }
  
  extension [Self <: Parameters491RequestBodyContentApplicationjson427](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson427): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
