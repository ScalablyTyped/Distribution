package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerRepoQueryRedelivery extends StObject {
  
  var parameters: PathHookidOwnerRepoQueryRedelivery
  
  var responses: `400422`
}
object ParametersPathHookidOwnerRepoQueryRedelivery {
  
  inline def apply(parameters: PathHookidOwnerRepoQueryRedelivery, responses: `400422`): ParametersPathHookidOwnerRepoQueryRedelivery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerRepoQueryRedelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOwnerRepoQueryRedelivery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwnerRepoQueryRedelivery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
