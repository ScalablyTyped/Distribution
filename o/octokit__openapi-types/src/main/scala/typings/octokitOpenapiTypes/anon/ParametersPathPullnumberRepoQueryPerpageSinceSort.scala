package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberRepoQueryPerpageSinceSort extends StObject {
  
  var parameters: PathPullnumberRepoQueryPerpageSinceSort
  
  var responses: `200Content565`
}
object ParametersPathPullnumberRepoQueryPerpageSinceSort {
  
  inline def apply(parameters: PathPullnumberRepoQueryPerpageSinceSort, responses: `200Content565`): ParametersPathPullnumberRepoQueryPerpageSinceSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberRepoQueryPerpageSinceSort]
  }
  
  extension [Self <: ParametersPathPullnumberRepoQueryPerpageSinceSort](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepoQueryPerpageSinceSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content565`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
