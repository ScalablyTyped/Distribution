package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidRequestBodyContentApplicationjson180 extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var requestBody: ContentApplicationjson180
  
  var responses: `201Content376`
}
object ParametersPathOwnerReleaseidRequestBodyContentApplicationjson180 {
  
  inline def apply(parameters: PathOwnerReleaseid, requestBody: ContentApplicationjson180, responses: `201Content376`): ParametersPathOwnerReleaseidRequestBodyContentApplicationjson180 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidRequestBodyContentApplicationjson180]
  }
  
  extension [Self <: ParametersPathOwnerReleaseidRequestBodyContentApplicationjson180](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson180): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content376`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
