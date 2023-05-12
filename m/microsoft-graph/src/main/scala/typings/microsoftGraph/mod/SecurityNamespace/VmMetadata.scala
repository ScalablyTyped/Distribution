package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VmMetadata extends StObject {
  
  // The cloud provider hosting the virtual machine. The possible values are: unknown, azure, unknownFutureValue.
  var cloudProvider: js.UndefOr[VmCloudProvider] = js.undefined
  
  // Unique identifier of the Azure resource.
  var resourceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the Azure subscription the customer tenant belongs to.
  var subscriptionId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the virtual machine instance.
  var vmId: js.UndefOr[NullableOption[String]] = js.undefined
}
object VmMetadata {
  
  inline def apply(): VmMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VmMetadata] (val x: Self) extends AnyVal {
    
    inline def setCloudProvider(value: VmCloudProvider): Self = StObject.set(x, "cloudProvider", value.asInstanceOf[js.Any])
    
    inline def setCloudProviderUndefined: Self = StObject.set(x, "cloudProvider", js.undefined)
    
    inline def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setSubscriptionId(value: NullableOption[String]): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdNull: Self = StObject.set(x, "subscriptionId", null)
    
    inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    
    inline def setVmId(value: NullableOption[String]): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdNull: Self = StObject.set(x, "vmId", null)
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}
