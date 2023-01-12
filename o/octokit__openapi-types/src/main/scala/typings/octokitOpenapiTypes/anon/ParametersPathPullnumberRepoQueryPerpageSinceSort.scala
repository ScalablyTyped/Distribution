package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberRepoQueryPerpageSinceSort extends StObject {
  
  var parameters: PathPullnumberRepoQueryPerpageSinceSort
  
  var responses: `200Content546`
}
object ParametersPathPullnumberRepoQueryPerpageSinceSort {
  
  inline def apply(parameters: PathPullnumberRepoQueryPerpageSinceSort, responses: `200Content546`): ParametersPathPullnumberRepoQueryPerpageSinceSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberRepoQueryPerpageSinceSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPullnumberRepoQueryPerpageSinceSort] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepoQueryPerpageSinceSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content546`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
