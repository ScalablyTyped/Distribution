package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepoResponses200Content229 extends StObject {
  
  var parameters: PathHookidOwnerRepo
  
  var responses: `200Content229`
}
object ParametersPathHookidOwnerRepoResponses200Content229 {
  
  inline def apply(parameters: PathHookidOwnerRepo, responses: `200Content229`): ParametersPathHookidOwnerRepoResponses200Content229 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepoResponses200Content229]
  }
  
  extension [Self <: ParametersPathHookidOwnerRepoResponses200Content229](x: Self) {
    
    inline def setParameters(value: PathHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content229`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
