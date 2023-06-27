package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson139 extends StObject {
  
  var parameters: PathDiscussionnumberNumber
  
  var requestBody: ContentApplicationjson139
  
  var responses: `781`
}
object ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson139 {
  
  inline def apply(parameters: PathDiscussionnumberNumber, requestBody: ContentApplicationjson139, responses: `781`): ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson139 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson139]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson139] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson139): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `781`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
