package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionDetail extends StObject {
  
  /** A change about comments was made. */
  var comment: js.UndefOr[Comment] = js.undefined
  
  /** An object was created. */
  var create: js.UndefOr[Create] = js.undefined
  
  /** An object was deleted. */
  var delete: js.UndefOr[Delete] = js.undefined
  
  /** A change happened in data leak prevention status. */
  var dlpChange: js.UndefOr[DataLeakPreventionChange] = js.undefined
  
  /** An object was edited. */
  var edit: js.UndefOr[js.Any] = js.undefined
  
  /** An object was moved. */
  var move: js.UndefOr[Move] = js.undefined
  
  /** The permission on an object was changed. */
  var permissionChange: js.UndefOr[PermissionChange] = js.undefined
  
  /** An object was referenced in an application outside of Drive/Docs. */
  var reference: js.UndefOr[ApplicationReference] = js.undefined
  
  /** An object was renamed. */
  var rename: js.UndefOr[Rename] = js.undefined
  
  /** A deleted object was restored. */
  var restore: js.UndefOr[Restore] = js.undefined
  
  /** Settings were changed. */
  var settingsChange: js.UndefOr[SettingsChange] = js.undefined
}
object ActionDetail {
  
  inline def apply(): ActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionDetail]
  }
  
  extension [Self <: ActionDetail](x: Self) {
    
    inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreate(value: Create): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDelete(value: Delete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setDlpChange(value: DataLeakPreventionChange): Self = StObject.set(x, "dlpChange", value.asInstanceOf[js.Any])
    
    inline def setDlpChangeUndefined: Self = StObject.set(x, "dlpChange", js.undefined)
    
    inline def setEdit(value: js.Any): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setMove(value: Move): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setPermissionChange(value: PermissionChange): Self = StObject.set(x, "permissionChange", value.asInstanceOf[js.Any])
    
    inline def setPermissionChangeUndefined: Self = StObject.set(x, "permissionChange", js.undefined)
    
    inline def setReference(value: ApplicationReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRename(value: Rename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    inline def setRestore(value: Restore): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
    
    inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    inline def setSettingsChange(value: SettingsChange): Self = StObject.set(x, "settingsChange", value.asInstanceOf[js.Any])
    
    inline def setSettingsChangeUndefined: Self = StObject.set(x, "settingsChange", js.undefined)
  }
}
