package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberQueryPerpageSince extends StObject {
  
  var parameters: PathPullnumberQueryPerpageSince
  
  var responses: `200Content314`
}
object ParametersPathPullnumberQueryPerpageSince {
  
  inline def apply(parameters: PathPullnumberQueryPerpageSince, responses: `200Content314`): ParametersPathPullnumberQueryPerpageSince = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberQueryPerpageSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPullnumberQueryPerpageSince] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberQueryPerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content314`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
