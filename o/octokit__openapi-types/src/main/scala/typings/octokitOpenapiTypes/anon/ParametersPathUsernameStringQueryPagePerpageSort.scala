package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringQueryPagePerpageSort extends StObject {
  
  var parameters: PathUsernameStringQueryPagePerpageSort
  
  var responses: `200Content225`
}
object ParametersPathUsernameStringQueryPagePerpageSort {
  
  inline def apply(parameters: PathUsernameStringQueryPagePerpageSort, responses: `200Content225`): ParametersPathUsernameStringQueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringQueryPagePerpageSort]
  }
  
  extension [Self <: ParametersPathUsernameStringQueryPagePerpageSort](x: Self) {
    
    inline def setParameters(value: PathUsernameStringQueryPagePerpageSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content225`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
