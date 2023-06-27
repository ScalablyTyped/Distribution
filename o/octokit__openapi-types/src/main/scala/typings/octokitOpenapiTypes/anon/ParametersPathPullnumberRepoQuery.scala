package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberRepoQuery extends StObject {
  
  var parameters: PathPullnumberRepoQuery
  
  var responses: `200Content740`
}
object ParametersPathPullnumberRepoQuery {
  
  inline def apply(parameters: PathPullnumberRepoQuery, responses: `200Content740`): ParametersPathPullnumberRepoQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPullnumberRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepoQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content740`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
