package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringQueryPagePerpageState extends StObject {
  
  var parameters: PathUsernameStringQueryPagePerpageState
  
  var responses: `200Content56422Content8`
}
object ParametersPathUsernameStringQueryPagePerpageState {
  
  inline def apply(parameters: PathUsernameStringQueryPagePerpageState, responses: `200Content56422Content8`): ParametersPathUsernameStringQueryPagePerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringQueryPagePerpageState]
  }
  
  extension [Self <: ParametersPathUsernameStringQueryPagePerpageState](x: Self) {
    
    inline def setParameters(value: PathUsernameStringQueryPagePerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content56422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
