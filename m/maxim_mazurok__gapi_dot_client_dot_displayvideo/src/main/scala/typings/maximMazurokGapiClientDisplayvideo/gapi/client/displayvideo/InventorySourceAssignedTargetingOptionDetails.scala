package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceAssignedTargetingOptionDetails extends js.Object {
  
  /** Required. ID of the inventory source. Should refer to the inventory_source_id field of an InventorySource resource. */
  var inventorySourceId: js.UndefOr[String] = js.native
}
object InventorySourceAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): InventorySourceAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class InventorySourceAssignedTargetingOptionDetailsOps[Self <: InventorySourceAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setInventorySourceId(value: String): Self = this.set("inventorySourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceId: Self = this.set("inventorySourceId", js.undefined)
  }
}
