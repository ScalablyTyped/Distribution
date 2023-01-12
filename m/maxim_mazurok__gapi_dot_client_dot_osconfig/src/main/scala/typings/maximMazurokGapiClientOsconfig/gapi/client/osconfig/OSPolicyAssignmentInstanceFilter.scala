package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyAssignmentInstanceFilter extends StObject {
  
  /** Target all VMs in the project. If true, no other criteria is permitted. */
  var all: js.UndefOr[Boolean] = js.undefined
  
  /** List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM. */
  var exclusionLabels: js.UndefOr[js.Array[OSPolicyAssignmentLabelSet]] = js.undefined
  
  /** List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM. */
  var inclusionLabels: js.UndefOr[js.Array[OSPolicyAssignmentLabelSet]] = js.undefined
  
  /** List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories. */
  var inventories: js.UndefOr[js.Array[OSPolicyAssignmentInstanceFilterInventory]] = js.undefined
}
object OSPolicyAssignmentInstanceFilter {
  
  inline def apply(): OSPolicyAssignmentInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyAssignmentInstanceFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSPolicyAssignmentInstanceFilter] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setExclusionLabels(value: js.Array[OSPolicyAssignmentLabelSet]): Self = StObject.set(x, "exclusionLabels", value.asInstanceOf[js.Any])
    
    inline def setExclusionLabelsUndefined: Self = StObject.set(x, "exclusionLabels", js.undefined)
    
    inline def setExclusionLabelsVarargs(value: OSPolicyAssignmentLabelSet*): Self = StObject.set(x, "exclusionLabels", js.Array(value*))
    
    inline def setInclusionLabels(value: js.Array[OSPolicyAssignmentLabelSet]): Self = StObject.set(x, "inclusionLabels", value.asInstanceOf[js.Any])
    
    inline def setInclusionLabelsUndefined: Self = StObject.set(x, "inclusionLabels", js.undefined)
    
    inline def setInclusionLabelsVarargs(value: OSPolicyAssignmentLabelSet*): Self = StObject.set(x, "inclusionLabels", js.Array(value*))
    
    inline def setInventories(value: js.Array[OSPolicyAssignmentInstanceFilterInventory]): Self = StObject.set(x, "inventories", value.asInstanceOf[js.Any])
    
    inline def setInventoriesUndefined: Self = StObject.set(x, "inventories", js.undefined)
    
    inline def setInventoriesVarargs(value: OSPolicyAssignmentInstanceFilterInventory*): Self = StObject.set(x, "inventories", js.Array(value*))
  }
}
