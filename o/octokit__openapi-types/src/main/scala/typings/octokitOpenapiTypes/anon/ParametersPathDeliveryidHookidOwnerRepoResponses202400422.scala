package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDeliveryidHookidOwnerRepoResponses202400422 extends StObject {
  
  var parameters: PathDeliveryidHookidOwnerRepo
  
  var responses: `202400422`
}
object ParametersPathDeliveryidHookidOwnerRepoResponses202400422 {
  
  inline def apply(parameters: PathDeliveryidHookidOwnerRepo, responses: `202400422`): ParametersPathDeliveryidHookidOwnerRepoResponses202400422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDeliveryidHookidOwnerRepoResponses202400422]
  }
  
  extension [Self <: ParametersPathDeliveryidHookidOwnerRepoResponses202400422](x: Self) {
    
    inline def setParameters(value: PathDeliveryidHookidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
