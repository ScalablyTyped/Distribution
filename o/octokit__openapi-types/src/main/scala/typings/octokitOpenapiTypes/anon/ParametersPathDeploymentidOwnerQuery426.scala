package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentidOwnerQuery426 extends StObject {
  
  var parameters: PathDeploymentidOwnerQuery426
  
  var responses: `200Content529`
}
object ParametersPathDeploymentidOwnerQuery426 {
  
  inline def apply(parameters: PathDeploymentidOwnerQuery426, responses: `200Content529`): ParametersPathDeploymentidOwnerQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentidOwnerQuery426]
  }
  
  extension [Self <: ParametersPathDeploymentidOwnerQuery426](x: Self) {
    
    inline def setParameters(value: PathDeploymentidOwnerQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content529`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
