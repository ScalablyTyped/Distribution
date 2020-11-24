package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryItem extends js.Object {
  
  /** Software package available to be installed on the VM instance. */
  var availablePackage: js.UndefOr[InventorySoftwarePackage] = js.native
  
  /** When this inventory item was first detected. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Identifier for this item, unique across items for this VM. */
  var id: js.UndefOr[String] = js.native
  
  /** Software package present on the VM instance. */
  var installedPackage: js.UndefOr[InventorySoftwarePackage] = js.native
  
  /** The origin of this inventory item. */
  var originType: js.UndefOr[String] = js.native
  
  /** The specific type of inventory, correlating to its specific details. */
  var `type`: js.UndefOr[String] = js.native
  
  /** When this inventory item was last modified. */
  var updateTime: js.UndefOr[String] = js.native
}
object InventoryItem {
  
  @scala.inline
  def apply(): InventoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryItem]
  }
  
  @scala.inline
  implicit class InventoryItemOps[Self <: InventoryItem] (val x: Self) extends AnyVal {
    
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
    def setAvailablePackage(value: InventorySoftwarePackage): Self = this.set("availablePackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailablePackage: Self = this.set("availablePackage", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInstalledPackage(value: InventorySoftwarePackage): Self = this.set("installedPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalledPackage: Self = this.set("installedPackage", js.undefined)
    
    @scala.inline
    def setOriginType(value: String): Self = this.set("originType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginType: Self = this.set("originType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
