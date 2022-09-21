package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicy extends StObject {
  
  /**
    * This flag determines the OS policy compliance status when none of the resource groups within the policy are applicable for a VM. Set this value to `true` if the policy needs to be
    * reported as compliant even if the policy has nothing to validate or enforce.
    */
  var allowNoResourceGroupMatch: js.UndefOr[Boolean] = js.undefined
  
  /** Policy description. Length of the description is limited to 1024 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The id of the OS policy with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63
    * characters. * Must end with a number or a letter. * Must be unique within the assignment.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /** Required. Policy mode */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. List of resource groups for the policy. For a particular VM, resource groups are evaluated in the order specified and the first resource group that is applicable is
    * selected and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is considered to be non-compliant w.r.t this policy. This behavior can be toggled
    * by the flag `allow_no_resource_group_match`
    */
  var resourceGroups: js.UndefOr[js.Array[OSPolicyResourceGroup]] = js.undefined
}
object OSPolicy {
  
  inline def apply(): OSPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicy]
  }
  
  extension [Self <: OSPolicy](x: Self) {
    
    inline def setAllowNoResourceGroupMatch(value: Boolean): Self = StObject.set(x, "allowNoResourceGroupMatch", value.asInstanceOf[js.Any])
    
    inline def setAllowNoResourceGroupMatchUndefined: Self = StObject.set(x, "allowNoResourceGroupMatch", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setResourceGroups(value: js.Array[OSPolicyResourceGroup]): Self = StObject.set(x, "resourceGroups", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupsUndefined: Self = StObject.set(x, "resourceGroups", js.undefined)
    
    inline def setResourceGroupsVarargs(value: OSPolicyResourceGroup*): Self = StObject.set(x, "resourceGroups", js.Array(value*))
  }
}
