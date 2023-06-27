package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentidQuery extends StObject {
  
  var parameters: PathDeploymentidQuery
  
  var responses: `200Content278`
}
object ParametersPathDeploymentidQuery {
  
  inline def apply(parameters: PathDeploymentidQuery, responses: `200Content278`): ParametersPathDeploymentidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeploymentidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content278`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
