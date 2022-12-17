package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHookidOwner extends StObject {
  
  var parameters: PathHookidOwner
  
  var responses: `200244`
}
object ParametersPathHookidOwner {
  
  inline def apply(parameters: PathHookidOwner, responses: `200244`): ParametersPathHookidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHookidOwner]
  }
  
  extension [Self <: ParametersPathHookidOwner](x: Self) {
    
    inline def setParameters(value: PathHookidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200244`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
