package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentidOwnerQuery473 extends StObject {
  
  var parameters: PathDeploymentidOwnerQuery473
  
  var responses: `200Content577`
}
object ParametersPathDeploymentidOwnerQuery473 {
  
  inline def apply(parameters: PathDeploymentidOwnerQuery473, responses: `200Content577`): ParametersPathDeploymentidOwnerQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentidOwnerQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeploymentidOwnerQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentidOwnerQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content577`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
