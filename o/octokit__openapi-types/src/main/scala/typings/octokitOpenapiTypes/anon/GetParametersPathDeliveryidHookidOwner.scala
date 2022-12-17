package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDeliveryidHookidOwner extends StObject {
  
  /** Returns a delivery for a webhook configured in a repository. */
  var get: ParametersPathDeliveryidHookidOwner
}
object GetParametersPathDeliveryidHookidOwner {
  
  inline def apply(get: ParametersPathDeliveryidHookidOwner): GetParametersPathDeliveryidHookidOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDeliveryidHookidOwner]
  }
  
  extension [Self <: GetParametersPathDeliveryidHookidOwner](x: Self) {
    
    inline def setGet(value: ParametersPathDeliveryidHookidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
