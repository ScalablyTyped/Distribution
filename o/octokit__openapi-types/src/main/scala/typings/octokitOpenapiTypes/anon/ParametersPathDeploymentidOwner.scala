package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentidOwner extends StObject {
  
  var parameters: PathDeploymentidOwner
  
  var responses: `200Content487`
}
object ParametersPathDeploymentidOwner {
  
  inline def apply(parameters: PathDeploymentidOwner, responses: `200Content487`): ParametersPathDeploymentidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentidOwner]
  }
  
  extension [Self <: ParametersPathDeploymentidOwner](x: Self) {
    
    inline def setParameters(value: PathDeploymentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content487`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
