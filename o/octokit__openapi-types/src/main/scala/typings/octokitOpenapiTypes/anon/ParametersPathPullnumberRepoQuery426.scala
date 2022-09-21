package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberRepoQuery426 extends StObject {
  
  var parameters: PathPullnumberRepoQuery426
  
  var responses: `200Content521`
}
object ParametersPathPullnumberRepoQuery426 {
  
  inline def apply(parameters: PathPullnumberRepoQuery426, responses: `200Content521`): ParametersPathPullnumberRepoQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberRepoQuery426]
  }
  
  extension [Self <: ParametersPathPullnumberRepoQuery426](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepoQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content521`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
