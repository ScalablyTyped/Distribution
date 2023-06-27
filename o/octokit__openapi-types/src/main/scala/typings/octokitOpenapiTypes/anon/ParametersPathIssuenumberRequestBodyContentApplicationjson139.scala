package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberRequestBodyContentApplicationjson139 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: ContentApplicationjson139
  
  var responses: `200201422`
}
object ParametersPathIssuenumberRequestBodyContentApplicationjson139 {
  
  inline def apply(parameters: PathIssuenumber, requestBody: ContentApplicationjson139, responses: `200201422`): ParametersPathIssuenumberRequestBodyContentApplicationjson139 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberRequestBodyContentApplicationjson139]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberRequestBodyContentApplicationjson139] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson139): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
