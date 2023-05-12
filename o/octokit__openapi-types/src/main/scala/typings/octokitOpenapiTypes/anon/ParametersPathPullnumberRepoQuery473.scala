package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberRepoQuery473 extends StObject {
  
  var parameters: PathPullnumberRepoQuery473
  
  var responses: `200Content568`
}
object ParametersPathPullnumberRepoQuery473 {
  
  inline def apply(parameters: PathPullnumberRepoQuery473, responses: `200Content568`): ParametersPathPullnumberRepoQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberRepoQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPullnumberRepoQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepoQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content568`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
