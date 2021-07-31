package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeHistoryEntry extends StObject {
  
  /** The container image before this instance upgrade. */
  var containerImage: js.UndefOr[String] = js.undefined
  
  /** The time that this instance upgrade history entry is created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The framework of this notebook instance. */
  var framework: js.UndefOr[String] = js.undefined
  
  /** The snapshot of the boot disk of this notebook instance before upgrade. */
  var snapshot: js.UndefOr[String] = js.undefined
  
  /** The state of this instance upgrade history entry. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The version of the notebook instance before this upgrade. */
  var version: js.UndefOr[String] = js.undefined
  
  /** The VM image before this instance upgrade. */
  var vmImage: js.UndefOr[String] = js.undefined
}
object UpgradeHistoryEntry {
  
  @scala.inline
  def apply(): UpgradeHistoryEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeHistoryEntry]
  }
  
  @scala.inline
  implicit class UpgradeHistoryEntryMutableBuilder[Self <: UpgradeHistoryEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    @scala.inline
    def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVmImage(value: String): Self = StObject.set(x, "vmImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmImageUndefined: Self = StObject.set(x, "vmImage", js.undefined)
  }
}
