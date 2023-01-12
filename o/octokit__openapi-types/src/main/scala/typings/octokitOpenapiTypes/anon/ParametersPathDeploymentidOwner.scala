package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentidOwner extends StObject {
  
  var parameters: PathDeploymentidOwner
  
  var responses: `200ContentApplicationjsonStatusesurl`
}
object ParametersPathDeploymentidOwner {
  
  inline def apply(parameters: PathDeploymentidOwner, responses: `200ContentApplicationjsonStatusesurl`): ParametersPathDeploymentidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeploymentidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonStatusesurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
