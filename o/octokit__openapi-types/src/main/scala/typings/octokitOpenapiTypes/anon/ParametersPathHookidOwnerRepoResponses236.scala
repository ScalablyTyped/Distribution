package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepoResponses236 extends StObject {
  
  var parameters: PathHookidOwnerRepo
  
  var responses: `236`
}
object ParametersPathHookidOwnerRepoResponses236 {
  
  inline def apply(parameters: PathHookidOwnerRepo, responses: `236`): ParametersPathHookidOwnerRepoResponses236 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepoResponses236]
  }
  
  extension [Self <: ParametersPathHookidOwnerRepoResponses236](x: Self) {
    
    inline def setParameters(value: PathHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `236`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
