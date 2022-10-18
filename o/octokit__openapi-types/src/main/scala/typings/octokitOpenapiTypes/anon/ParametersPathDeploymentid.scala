package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeploymentid extends StObject {
  
  var parameters: PathDeploymentid
  
  var responses: `200ContentApplicationjsonProductionenvironment`
}
object ParametersPathDeploymentid {
  
  inline def apply(parameters: PathDeploymentid, responses: `200ContentApplicationjsonProductionenvironment`): ParametersPathDeploymentid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeploymentid]
  }
  
  extension [Self <: ParametersPathDeploymentid](x: Self) {
    
    inline def setParameters(value: PathDeploymentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonProductionenvironment`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
