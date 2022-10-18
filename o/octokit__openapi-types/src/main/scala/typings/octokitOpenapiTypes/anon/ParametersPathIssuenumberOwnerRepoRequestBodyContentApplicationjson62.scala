package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson62 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: ContentApplicationjson62
  
  var responses: `201Content376`
}
object ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson62 {
  
  inline def apply(
    parameters: PathIssuenumberOwnerRepo,
    requestBody: ContentApplicationjson62,
    responses: `201Content376`
  ): ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson62 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson62]
  }
  
  extension [Self <: ParametersPathIssuenumberOwnerRepoRequestBodyContentApplicationjson62](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content376`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
