package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath608RequestBodyContentApplicationjsonBodyString extends StObject {
  
  var parameters: Path608
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `201Content373`
}
object ParametersPath608RequestBodyContentApplicationjsonBodyString {
  
  inline def apply(parameters: Path608, requestBody: ContentApplicationjsonBodyString, responses: `201Content373`): ParametersPath608RequestBodyContentApplicationjsonBodyString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath608RequestBodyContentApplicationjsonBodyString]
  }
  
  extension [Self <: ParametersPath608RequestBodyContentApplicationjsonBodyString](x: Self) {
    
    inline def setParameters(value: Path608): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content373`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
