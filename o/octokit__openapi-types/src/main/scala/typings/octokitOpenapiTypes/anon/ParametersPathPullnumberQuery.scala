package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberQuery extends StObject {
  
  var parameters: PathPullnumberQuery
  
  var responses: `200Content368`
}
object ParametersPathPullnumberQuery {
  
  inline def apply(parameters: PathPullnumberQuery, responses: `200Content368`): ParametersPathPullnumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPullnumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content368`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
