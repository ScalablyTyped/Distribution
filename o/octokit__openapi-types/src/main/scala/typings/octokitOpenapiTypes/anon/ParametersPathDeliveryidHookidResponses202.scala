package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidHookidResponses202 extends StObject {
  
  var parameters: PathDeliveryidHookid
  
  var responses: `202`
}
object ParametersPathDeliveryidHookidResponses202 {
  
  inline def apply(parameters: PathDeliveryidHookid, responses: `202`): ParametersPathDeliveryidHookidResponses202 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidHookidResponses202]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeliveryidHookidResponses202] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeliveryidHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
