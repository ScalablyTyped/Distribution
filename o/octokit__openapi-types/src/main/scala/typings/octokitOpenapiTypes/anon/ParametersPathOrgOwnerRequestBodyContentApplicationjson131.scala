package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgOwnerRequestBodyContentApplicationjson131 extends StObject {
  
  var parameters: PathOrgOwner
  
  var requestBody: ContentApplicationjson131
}
object ParametersPathOrgOwnerRequestBodyContentApplicationjson131 {
  
  inline def apply(parameters: PathOrgOwner, requestBody: ContentApplicationjson131): ParametersPathOrgOwnerRequestBodyContentApplicationjson131 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgOwnerRequestBodyContentApplicationjson131]
  }
  
  extension [Self <: ParametersPathOrgOwnerRequestBodyContentApplicationjson131](x: Self) {
    
    inline def setParameters(value: PathOrgOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson131): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
