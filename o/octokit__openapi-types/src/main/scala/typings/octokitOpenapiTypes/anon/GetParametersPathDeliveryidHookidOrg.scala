package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDeliveryidHookidOrg extends StObject {
  
  /** Returns a delivery for a webhook configured in an organization. */
  var get: ParametersPathDeliveryidHookidOrg
}
object GetParametersPathDeliveryidHookidOrg {
  
  inline def apply(get: ParametersPathDeliveryidHookidOrg): GetParametersPathDeliveryidHookidOrg = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDeliveryidHookidOrg]
  }
  
  extension [Self <: GetParametersPathDeliveryidHookidOrg](x: Self) {
    
    inline def setGet(value: ParametersPathDeliveryidHookidOrg): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
