package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson121 extends StObject {
  
  var parameters: PathDiscussionnumberNumber
  
  var requestBody: ContentApplicationjson121
  
  var responses: `597`
}
object ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson121 {
  
  inline def apply(parameters: PathDiscussionnumberNumber, requestBody: ContentApplicationjson121, responses: `597`): ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson121 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson121]
  }
  
  extension [Self <: ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson121](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson121): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `597`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
