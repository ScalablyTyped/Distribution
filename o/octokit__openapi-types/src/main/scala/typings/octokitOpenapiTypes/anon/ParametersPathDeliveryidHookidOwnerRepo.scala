package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidHookidOwnerRepo extends StObject {
  
  var parameters: PathDeliveryidHookidOwnerRepo
  
  var responses: `200400422`
}
object ParametersPathDeliveryidHookidOwnerRepo {
  
  inline def apply(parameters: PathDeliveryidHookidOwnerRepo, responses: `200400422`): ParametersPathDeliveryidHookidOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidHookidOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDeliveryidHookidOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeliveryidHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
