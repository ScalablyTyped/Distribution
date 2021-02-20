package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionDetail extends StObject {
  
  /** A change about comments was made. */
  var comment: js.UndefOr[Comment] = js.native
  
  /** An object was created. */
  var create: js.UndefOr[Create] = js.native
  
  /** An object was deleted. */
  var delete: js.UndefOr[Delete] = js.native
  
  /** A change happened in data leak prevention status. */
  var dlpChange: js.UndefOr[DataLeakPreventionChange] = js.native
  
  /** An object was edited. */
  var edit: js.UndefOr[js.Any] = js.native
  
  /** An object was moved. */
  var move: js.UndefOr[Move] = js.native
  
  /** The permission on an object was changed. */
  var permissionChange: js.UndefOr[PermissionChange] = js.native
  
  /** An object was referenced in an application outside of Drive/Docs. */
  var reference: js.UndefOr[ApplicationReference] = js.native
  
  /** An object was renamed. */
  var rename: js.UndefOr[Rename] = js.native
  
  /** A deleted object was restored. */
  var restore: js.UndefOr[Restore] = js.native
  
  /** Settings were changed. */
  var settingsChange: js.UndefOr[SettingsChange] = js.native
}
object ActionDetail {
  
  @scala.inline
  def apply(): ActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionDetail]
  }
  
  @scala.inline
  implicit class ActionDetailMutableBuilder[Self <: ActionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCreate(value: Create): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDelete(value: Delete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setDlpChange(value: DataLeakPreventionChange): Self = StObject.set(x, "dlpChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlpChangeUndefined: Self = StObject.set(x, "dlpChange", js.undefined)
    
    @scala.inline
    def setEdit(value: js.Any): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setMove(value: Move): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setPermissionChange(value: PermissionChange): Self = StObject.set(x, "permissionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionChangeUndefined: Self = StObject.set(x, "permissionChange", js.undefined)
    
    @scala.inline
    def setReference(value: ApplicationReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    @scala.inline
    def setRename(value: Rename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    @scala.inline
    def setRestore(value: Restore): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    @scala.inline
    def setSettingsChange(value: SettingsChange): Self = StObject.set(x, "settingsChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsChangeUndefined: Self = StObject.set(x, "settingsChange", js.undefined)
  }
}
