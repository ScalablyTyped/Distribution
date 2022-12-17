package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberRepoQuery407 extends StObject {
  
  var parameters: PathPullnumberRepoQuery407
  
  var responses: `200Content499`
}
object ParametersPathPullnumberRepoQuery407 {
  
  inline def apply(parameters: PathPullnumberRepoQuery407, responses: `200Content499`): ParametersPathPullnumberRepoQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberRepoQuery407]
  }
  
  extension [Self <: ParametersPathPullnumberRepoQuery407](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepoQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content499`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
