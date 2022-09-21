package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyResourceGroup extends StObject {
  
  /**
    * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters.
    * For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values:
    * inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If the list is empty, this resource group will be applied to the target VM unconditionally.
    */
  var inventoryFilters: js.UndefOr[js.Array[OSPolicyInventoryFilter]] = js.undefined
  
  /** Required. List of resources configured for this resource group. The resources are executed in the exact order specified here. */
  var resources: js.UndefOr[js.Array[OSPolicyResource]] = js.undefined
}
object OSPolicyResourceGroup {
  
  inline def apply(): OSPolicyResourceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyResourceGroup]
  }
  
  extension [Self <: OSPolicyResourceGroup](x: Self) {
    
    inline def setInventoryFilters(value: js.Array[OSPolicyInventoryFilter]): Self = StObject.set(x, "inventoryFilters", value.asInstanceOf[js.Any])
    
    inline def setInventoryFiltersUndefined: Self = StObject.set(x, "inventoryFilters", js.undefined)
    
    inline def setInventoryFiltersVarargs(value: OSPolicyInventoryFilter*): Self = StObject.set(x, "inventoryFilters", js.Array(value*))
    
    inline def setResources(value: js.Array[OSPolicyResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: OSPolicyResource*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
