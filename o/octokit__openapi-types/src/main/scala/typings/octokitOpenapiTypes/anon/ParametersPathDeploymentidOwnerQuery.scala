package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentidOwnerQuery extends StObject {
  
  var parameters: PathDeploymentidOwnerQuery
  
  var responses: `200Content693`
}
object ParametersPathDeploymentidOwnerQuery {
  
  inline def apply(parameters: PathDeploymentidOwnerQuery, responses: `200Content693`): ParametersPathDeploymentidOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeploymentidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentidOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content693`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
