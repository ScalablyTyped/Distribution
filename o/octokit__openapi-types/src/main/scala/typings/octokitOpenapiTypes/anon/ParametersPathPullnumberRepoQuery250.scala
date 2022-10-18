package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberRepoQuery250 extends StObject {
  
  var parameters: PathPullnumberRepoQuery250
  
  var responses: `200Content468`
}
object ParametersPathPullnumberRepoQuery250 {
  
  inline def apply(parameters: PathPullnumberRepoQuery250, responses: `200Content468`): ParametersPathPullnumberRepoQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberRepoQuery250]
  }
  
  extension [Self <: ParametersPathPullnumberRepoQuery250](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepoQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content468`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
