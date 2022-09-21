package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeHistoryEntry extends StObject {
  
  /** Action. Rolloback or Upgrade. */
  var action: js.UndefOr[String] = js.undefined
  
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
  
  /** Target VM Image. Format: ainotebooks-vm/project/image-name/name. */
  var targetImage: js.UndefOr[String] = js.undefined
  
  /** Target VM Version, like m63. */
  var targetVersion: js.UndefOr[String] = js.undefined
  
  /** The version of the notebook instance before this upgrade. */
  var version: js.UndefOr[String] = js.undefined
  
  /** The VM image before this instance upgrade. */
  var vmImage: js.UndefOr[String] = js.undefined
}
object UpgradeHistoryEntry {
  
  inline def apply(): UpgradeHistoryEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeHistoryEntry]
  }
  
  extension [Self <: UpgradeHistoryEntry](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTargetImage(value: String): Self = StObject.set(x, "targetImage", value.asInstanceOf[js.Any])
    
    inline def setTargetImageUndefined: Self = StObject.set(x, "targetImage", js.undefined)
    
    inline def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVmImage(value: String): Self = StObject.set(x, "vmImage", value.asInstanceOf[js.Any])
    
    inline def setVmImageUndefined: Self = StObject.set(x, "vmImage", js.undefined)
  }
}
