package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwner extends StObject {
  
  var parameters: PathHookidOwner
  
  var responses: `200305`
}
object ParametersPathHookidOwner {
  
  inline def apply(parameters: PathHookidOwner, responses: `200305`): ParametersPathHookidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHookidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200305`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
