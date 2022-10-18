package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberQuerySinceSort extends StObject {
  
  var parameters: PathPullnumberQuerySinceSort
  
  var responses: `200Content167`
}
object ParametersPathPullnumberQuerySinceSort {
  
  inline def apply(parameters: PathPullnumberQuerySinceSort, responses: `200Content167`): ParametersPathPullnumberQuerySinceSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberQuerySinceSort]
  }
  
  extension [Self <: ParametersPathPullnumberQuerySinceSort](x: Self) {
    
    inline def setParameters(value: PathPullnumberQuerySinceSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content167`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
