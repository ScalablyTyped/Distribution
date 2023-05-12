package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson119 extends StObject {
  
  var parameters: PathDiscussionnumberNumber
  
  var requestBody: ContentApplicationjson119
  
  var responses: `647`
}
object ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson119 {
  
  inline def apply(parameters: PathDiscussionnumberNumber, requestBody: ContentApplicationjson119, responses: `647`): ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson119 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson119]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberNumberRequestBodyContentApplicationjson119] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson119): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `647`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
