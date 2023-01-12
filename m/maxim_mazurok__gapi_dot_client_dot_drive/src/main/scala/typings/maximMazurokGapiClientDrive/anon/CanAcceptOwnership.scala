package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanAcceptOwnership extends StObject {
  
  /** Whether the current user is the pending owner of the file. Not populated for shared drive files. */
  var canAcceptOwnership: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can add children to this folder. This is always false when the item is not a folder. */
  var canAddChildren: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the current user can add a folder from another drive (different shared drive or My Drive) to this folder. This is false when the item is not a folder. Only populated for
    * items in shared drives.
    */
  var canAddFolderFromAnotherDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can add a parent for the item without removing an existing parent in the same request. Not populated for shared drive files. */
  var canAddMyDriveParent: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can change the copyRequiresWriterPermission restriction of this file. */
  var canChangeCopyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can change the securityUpdateEnabled field on link share metadata. */
  var canChangeSecurityUpdateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated */
  var canChangeViewersCanCopyContent: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can comment on this file. */
  var canComment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the current user can copy this file. For an item in a shared drive, whether the current user can copy non-folder descendants of this item, or this item itself if it is
    * not a folder.
    */
  var canCopy: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can delete this file. */
  var canDelete: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can delete children of this folder. This is false when the item is not a folder. Only populated for items in shared drives. */
  var canDeleteChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can download this file. */
  var canDownload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the current user can edit this file. Other factors may limit the type of changes a user can make to a file. For example, see canChangeCopyRequiresWriterPermission or
    * canModifyContent.
    */
  var canEdit: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can list the children of this folder. This is always false when the item is not a folder. */
  var canListChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can modify the content of this file. */
  var canModifyContent: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can modify restrictions on content of this file. */
  var canModifyContentRestriction: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can modify the labels on this file. */
  var canModifyLabels: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can move children of this folder outside of the shared drive. This is false when the item is not a folder. Only populated for items in shared drives. */
  var canMoveChildrenOutOfDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated - use canMoveChildrenOutOfDrive instead. */
  var canMoveChildrenOutOfTeamDrive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the current user can move children of this folder within this drive. This is false when the item is not a folder. Note that a request to move the child may still fail
    * depending on the current user's access to the child and to the destination folder.
    */
  var canMoveChildrenWithinDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated - use canMoveChildrenWithinDrive instead. */
  var canMoveChildrenWithinTeamDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated - use canMoveItemOutOfDrive instead. */
  var canMoveItemIntoTeamDrive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the current user can move this item outside of this drive by changing its parent. Note that a request to change the parent of the item may still fail depending on the
    * new parent that is being added.
    */
  var canMoveItemOutOfDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated - use canMoveItemOutOfDrive instead. */
  var canMoveItemOutOfTeamDrive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the current user can move this item within this drive. Note that a request to change the parent of the item may still fail depending on the new parent that is being
    * added and the parent that is being removed.
    */
  var canMoveItemWithinDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated - use canMoveItemWithinDrive instead. */
  var canMoveItemWithinTeamDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated - use canMoveItemWithinDrive or canMoveItemOutOfDrive instead. */
  var canMoveTeamDriveItem: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can read the shared drive to which this file belongs. Only populated for items in shared drives. */
  var canReadDrive: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can read the labels on this file. */
  var canReadLabels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the current user can read the revisions resource of this file. For a shared drive item, whether revisions of non-folder descendants of this item, or this item itself if
    * it is not a folder, can be read.
    */
  var canReadRevisions: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated - use canReadDrive instead. */
  var canReadTeamDrive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the current user can remove children from this folder. This is always false when the item is not a folder. For a folder in a shared drive, use canDeleteChildren or
    * canTrashChildren instead.
    */
  var canRemoveChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can remove a parent from the item without adding another parent in the same request. Not populated for shared drive files. */
  var canRemoveMyDriveParent: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can rename this file. */
  var canRename: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can modify the sharing settings for this file. */
  var canShare: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can move this file to trash. */
  var canTrash: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can trash children of this folder. This is false when the item is not a folder. Only populated for items in shared drives. */
  var canTrashChildren: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the current user can restore this file from trash. */
  var canUntrash: js.UndefOr[Boolean] = js.undefined
}
object CanAcceptOwnership {
  
  inline def apply(): CanAcceptOwnership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanAcceptOwnership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanAcceptOwnership] (val x: Self) extends AnyVal {
    
    inline def setCanAcceptOwnership(value: Boolean): Self = StObject.set(x, "canAcceptOwnership", value.asInstanceOf[js.Any])
    
    inline def setCanAcceptOwnershipUndefined: Self = StObject.set(x, "canAcceptOwnership", js.undefined)
    
    inline def setCanAddChildren(value: Boolean): Self = StObject.set(x, "canAddChildren", value.asInstanceOf[js.Any])
    
    inline def setCanAddChildrenUndefined: Self = StObject.set(x, "canAddChildren", js.undefined)
    
    inline def setCanAddFolderFromAnotherDrive(value: Boolean): Self = StObject.set(x, "canAddFolderFromAnotherDrive", value.asInstanceOf[js.Any])
    
    inline def setCanAddFolderFromAnotherDriveUndefined: Self = StObject.set(x, "canAddFolderFromAnotherDrive", js.undefined)
    
    inline def setCanAddMyDriveParent(value: Boolean): Self = StObject.set(x, "canAddMyDriveParent", value.asInstanceOf[js.Any])
    
    inline def setCanAddMyDriveParentUndefined: Self = StObject.set(x, "canAddMyDriveParent", js.undefined)
    
    inline def setCanChangeCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "canChangeCopyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    inline def setCanChangeCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "canChangeCopyRequiresWriterPermission", js.undefined)
    
    inline def setCanChangeSecurityUpdateEnabled(value: Boolean): Self = StObject.set(x, "canChangeSecurityUpdateEnabled", value.asInstanceOf[js.Any])
    
    inline def setCanChangeSecurityUpdateEnabledUndefined: Self = StObject.set(x, "canChangeSecurityUpdateEnabled", js.undefined)
    
    inline def setCanChangeViewersCanCopyContent(value: Boolean): Self = StObject.set(x, "canChangeViewersCanCopyContent", value.asInstanceOf[js.Any])
    
    inline def setCanChangeViewersCanCopyContentUndefined: Self = StObject.set(x, "canChangeViewersCanCopyContent", js.undefined)
    
    inline def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
    
    inline def setCanCommentUndefined: Self = StObject.set(x, "canComment", js.undefined)
    
    inline def setCanCopy(value: Boolean): Self = StObject.set(x, "canCopy", value.asInstanceOf[js.Any])
    
    inline def setCanCopyUndefined: Self = StObject.set(x, "canCopy", js.undefined)
    
    inline def setCanDelete(value: Boolean): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
    
    inline def setCanDeleteChildren(value: Boolean): Self = StObject.set(x, "canDeleteChildren", value.asInstanceOf[js.Any])
    
    inline def setCanDeleteChildrenUndefined: Self = StObject.set(x, "canDeleteChildren", js.undefined)
    
    inline def setCanDeleteUndefined: Self = StObject.set(x, "canDelete", js.undefined)
    
    inline def setCanDownload(value: Boolean): Self = StObject.set(x, "canDownload", value.asInstanceOf[js.Any])
    
    inline def setCanDownloadUndefined: Self = StObject.set(x, "canDownload", js.undefined)
    
    inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    inline def setCanEditUndefined: Self = StObject.set(x, "canEdit", js.undefined)
    
    inline def setCanListChildren(value: Boolean): Self = StObject.set(x, "canListChildren", value.asInstanceOf[js.Any])
    
    inline def setCanListChildrenUndefined: Self = StObject.set(x, "canListChildren", js.undefined)
    
    inline def setCanModifyContent(value: Boolean): Self = StObject.set(x, "canModifyContent", value.asInstanceOf[js.Any])
    
    inline def setCanModifyContentRestriction(value: Boolean): Self = StObject.set(x, "canModifyContentRestriction", value.asInstanceOf[js.Any])
    
    inline def setCanModifyContentRestrictionUndefined: Self = StObject.set(x, "canModifyContentRestriction", js.undefined)
    
    inline def setCanModifyContentUndefined: Self = StObject.set(x, "canModifyContent", js.undefined)
    
    inline def setCanModifyLabels(value: Boolean): Self = StObject.set(x, "canModifyLabels", value.asInstanceOf[js.Any])
    
    inline def setCanModifyLabelsUndefined: Self = StObject.set(x, "canModifyLabels", js.undefined)
    
    inline def setCanMoveChildrenOutOfDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenOutOfDrive", value.asInstanceOf[js.Any])
    
    inline def setCanMoveChildrenOutOfDriveUndefined: Self = StObject.set(x, "canMoveChildrenOutOfDrive", js.undefined)
    
    inline def setCanMoveChildrenOutOfTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenOutOfTeamDrive", value.asInstanceOf[js.Any])
    
    inline def setCanMoveChildrenOutOfTeamDriveUndefined: Self = StObject.set(x, "canMoveChildrenOutOfTeamDrive", js.undefined)
    
    inline def setCanMoveChildrenWithinDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenWithinDrive", value.asInstanceOf[js.Any])
    
    inline def setCanMoveChildrenWithinDriveUndefined: Self = StObject.set(x, "canMoveChildrenWithinDrive", js.undefined)
    
    inline def setCanMoveChildrenWithinTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenWithinTeamDrive", value.asInstanceOf[js.Any])
    
    inline def setCanMoveChildrenWithinTeamDriveUndefined: Self = StObject.set(x, "canMoveChildrenWithinTeamDrive", js.undefined)
    
    inline def setCanMoveItemIntoTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveItemIntoTeamDrive", value.asInstanceOf[js.Any])
    
    inline def setCanMoveItemIntoTeamDriveUndefined: Self = StObject.set(x, "canMoveItemIntoTeamDrive", js.undefined)
    
    inline def setCanMoveItemOutOfDrive(value: Boolean): Self = StObject.set(x, "canMoveItemOutOfDrive", value.asInstanceOf[js.Any])
    
    inline def setCanMoveItemOutOfDriveUndefined: Self = StObject.set(x, "canMoveItemOutOfDrive", js.undefined)
    
    inline def setCanMoveItemOutOfTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveItemOutOfTeamDrive", value.asInstanceOf[js.Any])
    
    inline def setCanMoveItemOutOfTeamDriveUndefined: Self = StObject.set(x, "canMoveItemOutOfTeamDrive", js.undefined)
    
    inline def setCanMoveItemWithinDrive(value: Boolean): Self = StObject.set(x, "canMoveItemWithinDrive", value.asInstanceOf[js.Any])
    
    inline def setCanMoveItemWithinDriveUndefined: Self = StObject.set(x, "canMoveItemWithinDrive", js.undefined)
    
    inline def setCanMoveItemWithinTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveItemWithinTeamDrive", value.asInstanceOf[js.Any])
    
    inline def setCanMoveItemWithinTeamDriveUndefined: Self = StObject.set(x, "canMoveItemWithinTeamDrive", js.undefined)
    
    inline def setCanMoveTeamDriveItem(value: Boolean): Self = StObject.set(x, "canMoveTeamDriveItem", value.asInstanceOf[js.Any])
    
    inline def setCanMoveTeamDriveItemUndefined: Self = StObject.set(x, "canMoveTeamDriveItem", js.undefined)
    
    inline def setCanReadDrive(value: Boolean): Self = StObject.set(x, "canReadDrive", value.asInstanceOf[js.Any])
    
    inline def setCanReadDriveUndefined: Self = StObject.set(x, "canReadDrive", js.undefined)
    
    inline def setCanReadLabels(value: Boolean): Self = StObject.set(x, "canReadLabels", value.asInstanceOf[js.Any])
    
    inline def setCanReadLabelsUndefined: Self = StObject.set(x, "canReadLabels", js.undefined)
    
    inline def setCanReadRevisions(value: Boolean): Self = StObject.set(x, "canReadRevisions", value.asInstanceOf[js.Any])
    
    inline def setCanReadRevisionsUndefined: Self = StObject.set(x, "canReadRevisions", js.undefined)
    
    inline def setCanReadTeamDrive(value: Boolean): Self = StObject.set(x, "canReadTeamDrive", value.asInstanceOf[js.Any])
    
    inline def setCanReadTeamDriveUndefined: Self = StObject.set(x, "canReadTeamDrive", js.undefined)
    
    inline def setCanRemoveChildren(value: Boolean): Self = StObject.set(x, "canRemoveChildren", value.asInstanceOf[js.Any])
    
    inline def setCanRemoveChildrenUndefined: Self = StObject.set(x, "canRemoveChildren", js.undefined)
    
    inline def setCanRemoveMyDriveParent(value: Boolean): Self = StObject.set(x, "canRemoveMyDriveParent", value.asInstanceOf[js.Any])
    
    inline def setCanRemoveMyDriveParentUndefined: Self = StObject.set(x, "canRemoveMyDriveParent", js.undefined)
    
    inline def setCanRename(value: Boolean): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    inline def setCanRenameUndefined: Self = StObject.set(x, "canRename", js.undefined)
    
    inline def setCanShare(value: Boolean): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
    
    inline def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
    
    inline def setCanTrash(value: Boolean): Self = StObject.set(x, "canTrash", value.asInstanceOf[js.Any])
    
    inline def setCanTrashChildren(value: Boolean): Self = StObject.set(x, "canTrashChildren", value.asInstanceOf[js.Any])
    
    inline def setCanTrashChildrenUndefined: Self = StObject.set(x, "canTrashChildren", js.undefined)
    
    inline def setCanTrashUndefined: Self = StObject.set(x, "canTrash", js.undefined)
    
    inline def setCanUntrash(value: Boolean): Self = StObject.set(x, "canUntrash", value.asInstanceOf[js.Any])
    
    inline def setCanUntrashUndefined: Self = StObject.set(x, "canUntrash", js.undefined)
  }
}
