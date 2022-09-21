package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringRequestBodyContentApplicationjson427 extends StObject {
  
  var parameters: PathOrgString
  
  var requestBody: ContentApplicationjson427
  
  var responses: `409Unknown`
}
object ParametersPathOrgStringRequestBodyContentApplicationjson427 {
  
  inline def apply(parameters: PathOrgString, requestBody: ContentApplicationjson427, responses: `409Unknown`): ParametersPathOrgStringRequestBodyContentApplicationjson427 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringRequestBodyContentApplicationjson427]
  }
  
  extension [Self <: ParametersPathOrgStringRequestBodyContentApplicationjson427](x: Self) {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson427): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
