package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeHistoryEntry extends js.Object {
  
  /** The container image before this instance upgrade. */
  var containerImage: js.UndefOr[String] = js.native
  
  /** The time that this instance upgrade history entry is created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The framework of this notebook instance. */
  var framework: js.UndefOr[String] = js.native
  
  /** The snapshot of the boot disk of this notebook instance before upgrade. */
  var snapshot: js.UndefOr[String] = js.native
  
  /** The state of this instance upgrade history entry. */
  var state: js.UndefOr[String] = js.native
  
  /** The version of the notebook instance before this upgrade. */
  var version: js.UndefOr[String] = js.native
  
  /** The VM image before this instance upgrade. */
  var vmImage: js.UndefOr[String] = js.native
}
object UpgradeHistoryEntry {
  
  @scala.inline
  def apply(): UpgradeHistoryEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeHistoryEntry]
  }
  
  @scala.inline
  implicit class UpgradeHistoryEntryOps[Self <: UpgradeHistoryEntry] (val x: Self) extends AnyVal {
    
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
    def setContainerImage(value: String): Self = this.set("containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerImage: Self = this.set("containerImage", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setFramework(value: String): Self = this.set("framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    
    @scala.inline
    def setSnapshot(value: String): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVmImage(value: String): Self = this.set("vmImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmImage: Self = this.set("vmImage", js.undefined)
  }
}
