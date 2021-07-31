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
  
  @scala.inline
  def apply(): ProvisionedPlan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedPlan]
  }
  
  @scala.inline
  implicit class ProvisionedPlanMutableBuilder[Self <: ProvisionedPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilityStatus(value: NullableOption[String]): Self = StObject.set(x, "capabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilityStatusNull: Self = StObject.set(x, "capabilityStatus", null)
    
    @scala.inline
    def setCapabilityStatusUndefined: Self = StObject.set(x, "capabilityStatus", js.undefined)
    
    @scala.inline
    def setProvisioningStatus(value: NullableOption[String]): Self = StObject.set(x, "provisioningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningStatusNull: Self = StObject.set(x, "provisioningStatus", null)
    
    @scala.inline
    def setProvisioningStatusUndefined: Self = StObject.set(x, "provisioningStatus", js.undefined)
    
    @scala.inline
    def setService(value: NullableOption[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNull: Self = StObject.set(x, "service", null)
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
