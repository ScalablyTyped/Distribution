package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberRequestBodyContentApplicationjson121 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: ContentApplicationjson121
  
  var responses: `200201422`
}
object ParametersPathIssuenumberRequestBodyContentApplicationjson121 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: ContentApplicationjson121, responses: `200201422`): ParametersPathIssuenumberRequestBodyContentApplicationjson121 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberRequestBodyContentApplicationjson121]
  }
  
  extension [Self <: ParametersPathIssuenumberRequestBodyContentApplicationjson121](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson121): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
