package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepoQuery extends StObject {
  
  var parameters: PathHookidOwnerRepoQuery
  
  var responses: `400422`
}
object ParametersPathHookidOwnerRepoQuery {
  
  inline def apply(parameters: PathHookidOwnerRepoQuery, responses: `400422`): ParametersPathHookidOwnerRepoQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOwnerRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwnerRepoQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
