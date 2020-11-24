package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceGroupAssignedTargetingOptionDetails extends js.Object {
  
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
  implicit class InventorySourceGroupAssignedTargetingOptionDetailsOps[Self <: InventorySourceGroupAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInventorySourceGroupId(value: String): Self = this.set("inventorySourceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceGroupId: Self = this.set("inventorySourceGroupId", js.undefined)
  }
}
