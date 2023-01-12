package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedPlan extends StObject {
  
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For example, 'Success'.
  var provisioningStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the service; for example, 'AccessControlS2S'
  var service: js.UndefOr[NullableOption[String]] = js.undefined
}
object ProvisionedPlan {
  
  inline def apply(): ProvisionedPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedPlan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionedPlan] (val x: Self) extends AnyVal {
    
    inline def setCapabilityStatus(value: NullableOption[String]): Self = StObject.set(x, "capabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setCapabilityStatusNull: Self = StObject.set(x, "capabilityStatus", null)
    
    inline def setCapabilityStatusUndefined: Self = StObject.set(x, "capabilityStatus", js.undefined)
    
    inline def setProvisioningStatus(value: NullableOption[String]): Self = StObject.set(x, "provisioningStatus", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStatusNull: Self = StObject.set(x, "provisioningStatus", null)
    
    inline def setProvisioningStatusUndefined: Self = StObject.set(x, "provisioningStatus", js.undefined)
    
    inline def setService(value: NullableOption[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
