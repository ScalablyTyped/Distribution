package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentidOwnerQuery407 extends StObject {
  
  var parameters: PathDeploymentidOwnerQuery407
  
  var responses: `200Content510`
}
object ParametersPathDeploymentidOwnerQuery407 {
  
  inline def apply(parameters: PathDeploymentidOwnerQuery407, responses: `200Content510`): ParametersPathDeploymentidOwnerQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentidOwnerQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeploymentidOwnerQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentidOwnerQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content510`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
