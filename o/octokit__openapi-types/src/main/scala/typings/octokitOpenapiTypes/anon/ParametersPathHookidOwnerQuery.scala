package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerQuery extends StObject {
  
  var parameters: PathHookidOwnerQuery
  
  var responses: `400`
}
object ParametersPathHookidOwnerQuery {
  
  inline def apply(parameters: PathHookidOwnerQuery, responses: `400`): ParametersPathHookidOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
