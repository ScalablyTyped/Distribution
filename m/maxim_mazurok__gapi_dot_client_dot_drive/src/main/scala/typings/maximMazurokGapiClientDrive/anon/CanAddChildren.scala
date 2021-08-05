package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanAddChildren extends StObject {
  
  /** Whether the current user can add children to folders in this shared drive. */
  var canAddChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can change the copyRequiresWriterPermission restriction of this shared drive. */
  var canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can change the domainUsersOnly restriction of this shared drive. */
  var canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can change the background of this shared drive. */
  var canChangeDriveBackground: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can change the driveMembersOnly restriction of this shared drive. */
  var canChangeDriveMembersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can comment on files in this shared drive. */
  var canComment: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can copy files in this shared drive. */
  var canCopy: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can delete children from folders in this shared drive. */
  var canDeleteChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can delete this shared drive. Attempting to delete the shared drive may still fail if there are untrashed items inside the shared drive. */
  var canDeleteDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can download files in this shared drive. */
  var canDownload: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can edit files in this shared drive */
  var canEdit: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can list the children of folders in this shared drive. */
  var canListChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can add members to this shared drive or remove them or change their role. */
  var canManageMembers: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can read the revisions resource of files in this shared drive. */
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can rename files or folders in this shared drive. */
  var canRename: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can rename this shared drive. */
  var canRenameDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can share files or folders in this shared drive. */
  var canShare: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can trash children from folders in this shared drive. */
  var canTrashChildren: js.UndefOr[Boolean] = js.undefined
}
object CanAddChildren {
  
  inline def apply(): CanAddChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanAddChildren]
  }
  
  extension [Self <: CanAddChildren](x: Self) {
    
    inline def setCanAddChildren(value: Boolean): Self = StObject.set(x, "canAddChildren", value.asInstanceOf[js.Any])
    
    inline def setCanAddChildrenUndefined: Self = StObject.set(x, "canAddChildren", js.undefined)
    
    inline def setCanChangeCopyRequiresWriterPermissionRestriction(value: Boolean): Self = StObject.set(x, "canChangeCopyRequiresWriterPermissionRestriction", value.asInstanceOf[js.Any])
    
    inline def setCanChangeCopyRequiresWriterPermissionRestrictionUndefined: Self = StObject.set(x, "canChangeCopyRequiresWriterPermissionRestriction", js.undefined)
    
    inline def setCanChangeDomainUsersOnlyRestriction(value: Boolean): Self = StObject.set(x, "canChangeDomainUsersOnlyRestriction", value.asInstanceOf[js.Any])
    
    inline def setCanChangeDomainUsersOnlyRestrictionUndefined: Self = StObject.set(x, "canChangeDomainUsersOnlyRestriction", js.undefined)
    
    inline def setCanChangeDriveBackground(value: Boolean): Self = StObject.set(x, "canChangeDriveBackground", value.asInstanceOf[js.Any])
    
    inline def setCanChangeDriveBackgroundUndefined: Self = StObject.set(x, "canChangeDriveBackground", js.undefined)
    
    inline def setCanChangeDriveMembersOnlyRestriction(value: Boolean): Self = StObject.set(x, "canChangeDriveMembersOnlyRestriction", value.asInstanceOf[js.Any])
    
    inline def setCanChangeDriveMembersOnlyRestrictionUndefined: Self = StObject.set(x, "canChangeDriveMembersOnlyRestriction", js.undefined)
    
    inline def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
    
    inline def setCanCommentUndefined: Self = StObject.set(x, "canComment", js.undefined)
    
    inline def setCanCopy(value: Boolean): Self = StObject.set(x, "canCopy", value.asInstanceOf[js.Any])
    
    inline def setCanCopyUndefined: Self = StObject.set(x, "canCopy", js.undefined)
    
    inline def setCanDeleteChildren(value: Boolean): Self = StObject.set(x, "canDeleteChildren", value.asInstanceOf[js.Any])
    
    inline def setCanDeleteChildrenUndefined: Self = StObject.set(x, "canDeleteChildren", js.undefined)
    
    inline def setCanDeleteDrive(value: Boolean): Self = StObject.set(x, "canDeleteDrive", value.asInstanceOf[js.Any])
    
    inline def setCanDeleteDriveUndefined: Self = StObject.set(x, "canDeleteDrive", js.undefined)
    
    inline def setCanDownload(value: Boolean): Self = StObject.set(x, "canDownload", value.asInstanceOf[js.Any])
    
    inline def setCanDownloadUndefined: Self = StObject.set(x, "canDownload", js.undefined)
    
    inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    inline def setCanEditUndefined: Self = StObject.set(x, "canEdit", js.undefined)
    
    inline def setCanListChildren(value: Boolean): Self = StObject.set(x, "canListChildren", value.asInstanceOf[js.Any])
    
    inline def setCanListChildrenUndefined: Self = StObject.set(x, "canListChildren", js.undefined)
    
    inline def setCanManageMembers(value: Boolean): Self = StObject.set(x, "canManageMembers", value.asInstanceOf[js.Any])
    
    inline def setCanManageMembersUndefined: Self = StObject.set(x, "canManageMembers", js.undefined)
    
    inline def setCanReadRevisions(value: Boolean): Self = StObject.set(x, "canReadRevisions", value.asInstanceOf[js.Any])
    
    inline def setCanReadRevisionsUndefined: Self = StObject.set(x, "canReadRevisions", js.undefined)
    
    inline def setCanRename(value: Boolean): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    inline def setCanRenameDrive(value: Boolean): Self = StObject.set(x, "canRenameDrive", value.asInstanceOf[js.Any])
    
    inline def setCanRenameDriveUndefined: Self = StObject.set(x, "canRenameDrive", js.undefined)
    
    inline def setCanRenameUndefined: Self = StObject.set(x, "canRename", js.undefined)
    
    inline def setCanShare(value: Boolean): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
    
    inline def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
    
    inline def setCanTrashChildren(value: Boolean): Self = StObject.set(x, "canTrashChildren", value.asInstanceOf[js.Any])
    
    inline def setCanTrashChildrenUndefined: Self = StObject.set(x, "canTrashChildren", js.undefined)
  }
}
