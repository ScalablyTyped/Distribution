package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanChangeCopyRequiresWriterPermissionRestriction extends StObject {
  
  /** Whether the current user can add children to folders in this Team Drive. */
  var canAddChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can change the copyRequiresWriterPermission restriction of this Team Drive. */
  var canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can change the domainUsersOnly restriction of this Team Drive. */
  var canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can change the background of this Team Drive. */
  var canChangeTeamDriveBackground: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can change the teamMembersOnly restriction of this Team Drive. */
  var canChangeTeamMembersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can comment on files in this Team Drive. */
  var canComment: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can copy files in this Team Drive. */
  var canCopy: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can delete children from folders in this Team Drive. */
  var canDeleteChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can delete this Team Drive. Attempting to delete the Team Drive may still fail if there are untrashed items inside the Team Drive. */
  var canDeleteTeamDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can download files in this Team Drive. */
  var canDownload: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can edit files in this Team Drive */
  var canEdit: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can list the children of folders in this Team Drive. */
  var canListChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can add members to this Team Drive or remove them or change their role. */
  var canManageMembers: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can read the revisions resource of files in this Team Drive. */
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated - use canDeleteChildren or canTrashChildren instead. */
  var canRemoveChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can rename files or folders in this Team Drive. */
  var canRename: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can rename this Team Drive. */
  var canRenameTeamDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can reset the Team Drive restrictions to defaults. */
  var canResetTeamDriveRestrictions: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can share files or folders in this Team Drive. */
  var canShare: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can trash children from folders in this Team Drive. */
  var canTrashChildren: js.UndefOr[Boolean] = js.undefined
}
object CanChangeCopyRequiresWriterPermissionRestriction {
  
  inline def apply(): CanChangeCopyRequiresWriterPermissionRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanChangeCopyRequiresWriterPermissionRestriction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanChangeCopyRequiresWriterPermissionRestriction] (val x: Self) extends AnyVal {
    
    inline def setCanAddChildren(value: Boolean): Self = StObject.set(x, "canAddChildren", value.asInstanceOf[js.Any])
    
    inline def setCanAddChildrenUndefined: Self = StObject.set(x, "canAddChildren", js.undefined)
    
    inline def setCanChangeCopyRequiresWriterPermissionRestriction(value: Boolean): Self = StObject.set(x, "canChangeCopyRequiresWriterPermissionRestriction", value.asInstanceOf[js.Any])
    
    inline def setCanChangeCopyRequiresWriterPermissionRestrictionUndefined: Self = StObject.set(x, "canChangeCopyRequiresWriterPermissionRestriction", js.undefined)
    
    inline def setCanChangeDomainUsersOnlyRestriction(value: Boolean): Self = StObject.set(x, "canChangeDomainUsersOnlyRestriction", value.asInstanceOf[js.Any])
    
    inline def setCanChangeDomainUsersOnlyRestrictionUndefined: Self = StObject.set(x, "canChangeDomainUsersOnlyRestriction", js.undefined)
    
    inline def setCanChangeTeamDriveBackground(value: Boolean): Self = StObject.set(x, "canChangeTeamDriveBackground", value.asInstanceOf[js.Any])
    
    inline def setCanChangeTeamDriveBackgroundUndefined: Self = StObject.set(x, "canChangeTeamDriveBackground", js.undefined)
    
    inline def setCanChangeTeamMembersOnlyRestriction(value: Boolean): Self = StObject.set(x, "canChangeTeamMembersOnlyRestriction", value.asInstanceOf[js.Any])
    
    inline def setCanChangeTeamMembersOnlyRestrictionUndefined: Self = StObject.set(x, "canChangeTeamMembersOnlyRestriction", js.undefined)
    
    inline def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
    
    inline def setCanCommentUndefined: Self = StObject.set(x, "canComment", js.undefined)
    
    inline def setCanCopy(value: Boolean): Self = StObject.set(x, "canCopy", value.asInstanceOf[js.Any])
    
    inline def setCanCopyUndefined: Self = StObject.set(x, "canCopy", js.undefined)
    
    inline def setCanDeleteChildren(value: Boolean): Self = StObject.set(x, "canDeleteChildren", value.asInstanceOf[js.Any])
    
    inline def setCanDeleteChildrenUndefined: Self = StObject.set(x, "canDeleteChildren", js.undefined)
    
    inline def setCanDeleteTeamDrive(value: Boolean): Self = StObject.set(x, "canDeleteTeamDrive", value.asInstanceOf[js.Any])
    
    inline def setCanDeleteTeamDriveUndefined: Self = StObject.set(x, "canDeleteTeamDrive", js.undefined)
    
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
    
    inline def setCanRemoveChildren(value: Boolean): Self = StObject.set(x, "canRemoveChildren", value.asInstanceOf[js.Any])
    
    inline def setCanRemoveChildrenUndefined: Self = StObject.set(x, "canRemoveChildren", js.undefined)
    
    inline def setCanRename(value: Boolean): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    inline def setCanRenameTeamDrive(value: Boolean): Self = StObject.set(x, "canRenameTeamDrive", value.asInstanceOf[js.Any])
    
    inline def setCanRenameTeamDriveUndefined: Self = StObject.set(x, "canRenameTeamDrive", js.undefined)
    
    inline def setCanRenameUndefined: Self = StObject.set(x, "canRename", js.undefined)
    
    inline def setCanResetTeamDriveRestrictions(value: Boolean): Self = StObject.set(x, "canResetTeamDriveRestrictions", value.asInstanceOf[js.Any])
    
    inline def setCanResetTeamDriveRestrictionsUndefined: Self = StObject.set(x, "canResetTeamDriveRestrictions", js.undefined)
    
    inline def setCanShare(value: Boolean): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
    
    inline def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
    
    inline def setCanTrashChildren(value: Boolean): Self = StObject.set(x, "canTrashChildren", value.asInstanceOf[js.Any])
    
    inline def setCanTrashChildrenUndefined: Self = StObject.set(x, "canTrashChildren", js.undefined)
  }
}
