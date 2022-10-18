package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentidOwnerQuery250 extends StObject {
  
  var parameters: PathDeploymentidOwnerQuery250
  
  var responses: `200Content489`
}
object ParametersPathDeploymentidOwnerQuery250 {
  
  inline def apply(parameters: PathDeploymentidOwnerQuery250, responses: `200Content489`): ParametersPathDeploymentidOwnerQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentidOwnerQuery250]
  }
  
  extension [Self <: ParametersPathDeploymentidOwnerQuery250](x: Self) {
    
    inline def setParameters(value: PathDeploymentidOwnerQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content489`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
