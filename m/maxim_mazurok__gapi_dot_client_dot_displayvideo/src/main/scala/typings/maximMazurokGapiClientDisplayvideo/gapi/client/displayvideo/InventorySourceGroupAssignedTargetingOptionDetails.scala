package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceGroupAssignedTargetingOptionDetails extends StObject {
  
  /** Required. ID of the inventory source group. Should refer to the inventory_source_group_id field of an InventorySourceGroup resource. */
  var inventorySourceGroupId: js.UndefOr[String] = js.native
}
object InventorySourceGroupAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): InventorySourceGroupAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceGroupAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class InventorySourceGroupAssignedTargetingOptionDetailsMutableBuilder[Self <: InventorySourceGroupAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInventorySourceGroupId(value: String): Self = StObject.set(x, "inventorySourceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourceGroupIdUndefined: Self = StObject.set(x, "inventorySourceGroupId", js.undefined)
  }
}
