package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDeliveryidHookid extends StObject {
  
  /** Returns a delivery for a webhook configured in an organization. */
  var get: ParametersPathDeliveryidHookid
}
object GetParametersPathDeliveryidHookid {
  
  inline def apply(get: ParametersPathDeliveryidHookid): GetParametersPathDeliveryidHookid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDeliveryidHookid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathDeliveryidHookid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathDeliveryidHookid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
