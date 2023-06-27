package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson139 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: ContentApplicationjson139
  
  var responses: `201ContentApplicationjsonNodeidUser`
}
object ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson139 {
  
  inline def apply(
    parameters: PathIssuenumberOwnerRepo,
    requestBody: ContentApplicationjson139,
    responses: `201ContentApplicationjsonNodeidUser`
  ): ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson139 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson139]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson139] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson139): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonNodeidUser`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
