package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentidQueryPage extends StObject {
  
  var parameters: PathDeploymentidQueryPage
  
  var responses: `200Content221`
}
object ParametersPathDeploymentidQueryPage {
  
  inline def apply(parameters: PathDeploymentidQueryPage, responses: `200Content221`): ParametersPathDeploymentidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeploymentidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content221`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
