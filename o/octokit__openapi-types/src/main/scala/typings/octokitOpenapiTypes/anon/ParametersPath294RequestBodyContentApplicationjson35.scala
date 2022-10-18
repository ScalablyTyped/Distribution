package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath294RequestBodyContentApplicationjson35 extends StObject {
  
  var parameters: Path294
  
  var requestBody: ContentApplicationjson35
  
  var responses: `200Content296`
}
object ParametersPath294RequestBodyContentApplicationjson35 {
  
  inline def apply(parameters: Path294, requestBody: ContentApplicationjson35, responses: `200Content296`): ParametersPath294RequestBodyContentApplicationjson35 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath294RequestBodyContentApplicationjson35]
  }
  
  extension [Self <: ParametersPath294RequestBodyContentApplicationjson35](x: Self) {
    
    inline def setParameters(value: Path294): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson35): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content296`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
