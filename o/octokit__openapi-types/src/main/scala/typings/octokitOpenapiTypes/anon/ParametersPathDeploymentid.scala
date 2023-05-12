package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentid extends StObject {
  
  var parameters: PathDeploymentid
  
  var responses: `200Content233`
}
object ParametersPathDeploymentid {
  
  inline def apply(parameters: PathDeploymentid, responses: `200Content233`): ParametersPathDeploymentid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeploymentid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content233`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
