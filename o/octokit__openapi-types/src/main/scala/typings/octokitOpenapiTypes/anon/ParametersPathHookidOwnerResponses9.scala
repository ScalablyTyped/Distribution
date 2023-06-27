package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwnerResponses9 extends StObject {
  
  var parameters: PathHookidOwner
  
  var responses: `9`
}
object ParametersPathHookidOwnerResponses9 {
  
  inline def apply(parameters: PathHookidOwner, responses: `9`): ParametersPathHookidOwnerResponses9 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwnerResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOwnerResponses9] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `9`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
