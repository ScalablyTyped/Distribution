package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceGroup extends js.Object {
  
  /** Required. The display name of the inventory source group. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the inventory source group. Assigned by the system. */
  var inventorySourceGroupId: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the inventory source group. */
  var name: js.UndefOr[String] = js.native
}
object InventorySourceGroup {
  
  @scala.inline
  def apply(): InventorySourceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceGroup]
  }
  
  @scala.inline
  implicit class InventorySourceGroupOps[Self <: InventorySourceGroup] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setInventorySourceGroupId(value: String): Self = this.set("inventorySourceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceGroupId: Self = this.set("inventorySourceGroupId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
