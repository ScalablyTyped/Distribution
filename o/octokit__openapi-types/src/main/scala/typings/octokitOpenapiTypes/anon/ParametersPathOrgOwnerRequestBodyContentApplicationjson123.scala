package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgOwnerRequestBodyContentApplicationjson123 extends StObject {
  
  var parameters: PathOrgOwner
  
  var requestBody: ContentApplicationjson123
}
object ParametersPathOrgOwnerRequestBodyContentApplicationjson123 {
  
  inline def apply(parameters: PathOrgOwner, requestBody: ContentApplicationjson123): ParametersPathOrgOwnerRequestBodyContentApplicationjson123 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgOwnerRequestBodyContentApplicationjson123]
  }
  
  extension [Self <: ParametersPathOrgOwnerRequestBodyContentApplicationjson123](x: Self) {
    
    inline def setParameters(value: PathOrgOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson123): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
