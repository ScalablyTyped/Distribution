package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepoResponses404Content48 extends StObject {
  
  var parameters: PathHookidOwnerRepo
  
  var responses: `404Content48`
}
object ParametersPathHookidOwnerRepoResponses404Content48 {
  
  inline def apply(parameters: PathHookidOwnerRepo, responses: `404Content48`): ParametersPathHookidOwnerRepoResponses404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepoResponses404Content48]
  }
  
  extension [Self <: ParametersPathHookidOwnerRepoResponses404Content48](x: Self) {
    
    inline def setParameters(value: PathHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
