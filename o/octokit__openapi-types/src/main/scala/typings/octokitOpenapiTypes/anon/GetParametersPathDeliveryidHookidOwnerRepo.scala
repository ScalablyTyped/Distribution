package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDeliveryidHookidOwnerRepo extends StObject {
  
  /** Returns a delivery for a webhook configured in a repository. */
  var get: ParametersPathDeliveryidHookidOwnerRepo
}
object GetParametersPathDeliveryidHookidOwnerRepo {
  
  inline def apply(get: ParametersPathDeliveryidHookidOwnerRepo): GetParametersPathDeliveryidHookidOwnerRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDeliveryidHookidOwnerRepo]
  }
  
  extension [Self <: GetParametersPathDeliveryidHookidOwnerRepo](x: Self) {
    
    inline def setGet(value: ParametersPathDeliveryidHookidOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
