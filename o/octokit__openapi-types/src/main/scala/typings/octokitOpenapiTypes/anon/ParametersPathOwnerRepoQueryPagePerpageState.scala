package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoQueryPagePerpageState extends StObject {
  
  var parameters: PathOwnerRepoQueryPagePerpageState
  
  var responses: `401403404410`
}
object ParametersPathOwnerRepoQueryPagePerpageState {
  
  inline def apply(parameters: PathOwnerRepoQueryPagePerpageState, responses: `401403404410`): ParametersPathOwnerRepoQueryPagePerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoQueryPagePerpageState]
  }
  
  extension [Self <: ParametersPathOwnerRepoQueryPagePerpageState](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoQueryPagePerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
