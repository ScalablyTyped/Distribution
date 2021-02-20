package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanAddFolderFromAnotherDrive extends StObject {
  
  /** Whether the current user can add children to this folder. This is always false when the item is not a folder. */
  var canAddChildren: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the current user can add a folder from another drive (different shared drive or My Drive) to this folder. This is false when the item is not a folder. Only populated for
    * items in shared drives.
    */
  var canAddFolderFromAnotherDrive: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can add a parent for the item without removing an existing parent in the same request. Not populated for shared drive files. */
  var canAddMyDriveParent: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can change the copyRequiresWriterPermission restriction of this file. */
  var canChangeCopyRequiresWriterPermission: js.UndefOr[Boolean] = js.native
  
  /** Deprecated */
  var canChangeViewersCanCopyContent: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can comment on this file. */
  var canComment: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the current user can copy this file. For an item in a shared drive, whether the current user can copy non-folder descendants of this item, or this item itself if it is
    * not a folder.
    */
  var canCopy: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can delete this file. */
  var canDelete: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can delete children of this folder. This is false when the item is not a folder. Only populated for items in shared drives. */
  var canDeleteChildren: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can download this file. */
  var canDownload: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the current user can edit this file. Other factors may limit the type of changes a user can make to a file. For example, see canChangeCopyRequiresWriterPermission or
    * canModifyContent.
    */
  var canEdit: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can list the children of this folder. This is always false when the item is not a folder. */
  var canListChildren: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can modify the content of this file. */
  var canModifyContent: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can modify restrictions on content of this file. */
  var canModifyContentRestriction: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can move children of this folder outside of the shared drive. This is false when the item is not a folder. Only populated for items in shared drives. */
  var canMoveChildrenOutOfDrive: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use canMoveChildrenOutOfDrive instead. */
  var canMoveChildrenOutOfTeamDrive: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the current user can move children of this folder within this drive. This is false when the item is not a folder. Note that a request to move the child may still fail
    * depending on the current user's access to the child and to the destination folder.
    */
  var canMoveChildrenWithinDrive: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use canMoveChildrenWithinDrive instead. */
  var canMoveChildrenWithinTeamDrive: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use canMoveItemOutOfDrive instead. */
  var canMoveItemIntoTeamDrive: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the current user can move this item outside of this drive by changing its parent. Note that a request to change the parent of the item may still fail depending on the
    * new parent that is being added.
    */
  var canMoveItemOutOfDrive: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use canMoveItemOutOfDrive instead. */
  var canMoveItemOutOfTeamDrive: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the current user can move this item within this drive. Note that a request to change the parent of the item may still fail depending on the new parent that is being
    * added and the parent that is being removed.
    */
  var canMoveItemWithinDrive: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use canMoveItemWithinDrive instead. */
  var canMoveItemWithinTeamDrive: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use canMoveItemWithinDrive or canMoveItemOutOfDrive instead. */
  var canMoveTeamDriveItem: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can read the shared drive to which this file belongs. Only populated for items in shared drives. */
  var canReadDrive: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the current user can read the revisions resource of this file. For a shared drive item, whether revisions of non-folder descendants of this item, or this item itself if
    * it is not a folder, can be read.
    */
  var canReadRevisions: js.UndefOr[Boolean] = js.native
  
  /** Deprecated - use canReadDrive instead. */
  var canReadTeamDrive: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the current user can remove children from this folder. This is always false when the item is not a folder. For a folder in a shared drive, use canDeleteChildren or
    * canTrashChildren instead.
    */
  var canRemoveChildren: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can remove a parent from the item without adding another parent in the same request. Not populated for shared drive files. */
  var canRemoveMyDriveParent: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can rename this file. */
  var canRename: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can modify the sharing settings for this file. */
  var canShare: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can move this file to trash. */
  var canTrash: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can trash children of this folder. This is false when the item is not a folder. Only populated for items in shared drives. */
  var canTrashChildren: js.UndefOr[Boolean] = js.native
  
  /** Whether the current user can restore this file from trash. */
  var canUntrash: js.UndefOr[Boolean] = js.native
}
object CanAddFolderFromAnotherDrive {
  
  @scala.inline
  def apply(): CanAddFolderFromAnotherDrive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanAddFolderFromAnotherDrive]
  }
  
  @scala.inline
  implicit class CanAddFolderFromAnotherDriveMutableBuilder[Self <: CanAddFolderFromAnotherDrive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanAddChildren(value: Boolean): Self = StObject.set(x, "canAddChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanAddChildrenUndefined: Self = StObject.set(x, "canAddChildren", js.undefined)
    
    @scala.inline
    def setCanAddFolderFromAnotherDrive(value: Boolean): Self = StObject.set(x, "canAddFolderFromAnotherDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanAddFolderFromAnotherDriveUndefined: Self = StObject.set(x, "canAddFolderFromAnotherDrive", js.undefined)
    
    @scala.inline
    def setCanAddMyDriveParent(value: Boolean): Self = StObject.set(x, "canAddMyDriveParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanAddMyDriveParentUndefined: Self = StObject.set(x, "canAddMyDriveParent", js.undefined)
    
    @scala.inline
    def setCanChangeCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "canChangeCopyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanChangeCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "canChangeCopyRequiresWriterPermission", js.undefined)
    
    @scala.inline
    def setCanChangeViewersCanCopyContent(value: Boolean): Self = StObject.set(x, "canChangeViewersCanCopyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanChangeViewersCanCopyContentUndefined: Self = StObject.set(x, "canChangeViewersCanCopyContent", js.undefined)
    
    @scala.inline
    def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCommentUndefined: Self = StObject.set(x, "canComment", js.undefined)
    
    @scala.inline
    def setCanCopy(value: Boolean): Self = StObject.set(x, "canCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCopyUndefined: Self = StObject.set(x, "canCopy", js.undefined)
    
    @scala.inline
    def setCanDelete(value: Boolean): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDeleteChildren(value: Boolean): Self = StObject.set(x, "canDeleteChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDeleteChildrenUndefined: Self = StObject.set(x, "canDeleteChildren", js.undefined)
    
    @scala.inline
    def setCanDeleteUndefined: Self = StObject.set(x, "canDelete", js.undefined)
    
    @scala.inline
    def setCanDownload(value: Boolean): Self = StObject.set(x, "canDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDownloadUndefined: Self = StObject.set(x, "canDownload", js.undefined)
    
    @scala.inline
    def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanEditUndefined: Self = StObject.set(x, "canEdit", js.undefined)
    
    @scala.inline
    def setCanListChildren(value: Boolean): Self = StObject.set(x, "canListChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanListChildrenUndefined: Self = StObject.set(x, "canListChildren", js.undefined)
    
    @scala.inline
    def setCanModifyContent(value: Boolean): Self = StObject.set(x, "canModifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanModifyContentRestriction(value: Boolean): Self = StObject.set(x, "canModifyContentRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanModifyContentRestrictionUndefined: Self = StObject.set(x, "canModifyContentRestriction", js.undefined)
    
    @scala.inline
    def setCanModifyContentUndefined: Self = StObject.set(x, "canModifyContent", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenOutOfDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenOutOfDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveChildrenOutOfDriveUndefined: Self = StObject.set(x, "canMoveChildrenOutOfDrive", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenOutOfTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenOutOfTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveChildrenOutOfTeamDriveUndefined: Self = StObject.set(x, "canMoveChildrenOutOfTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenWithinDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenWithinDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveChildrenWithinDriveUndefined: Self = StObject.set(x, "canMoveChildrenWithinDrive", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenWithinTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenWithinTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveChildrenWithinTeamDriveUndefined: Self = StObject.set(x, "canMoveChildrenWithinTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemIntoTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveItemIntoTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveItemIntoTeamDriveUndefined: Self = StObject.set(x, "canMoveItemIntoTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemOutOfDrive(value: Boolean): Self = StObject.set(x, "canMoveItemOutOfDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveItemOutOfDriveUndefined: Self = StObject.set(x, "canMoveItemOutOfDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemOutOfTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveItemOutOfTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveItemOutOfTeamDriveUndefined: Self = StObject.set(x, "canMoveItemOutOfTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemWithinDrive(value: Boolean): Self = StObject.set(x, "canMoveItemWithinDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveItemWithinDriveUndefined: Self = StObject.set(x, "canMoveItemWithinDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemWithinTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveItemWithinTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveItemWithinTeamDriveUndefined: Self = StObject.set(x, "canMoveItemWithinTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveTeamDriveItem(value: Boolean): Self = StObject.set(x, "canMoveTeamDriveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMoveTeamDriveItemUndefined: Self = StObject.set(x, "canMoveTeamDriveItem", js.undefined)
    
    @scala.inline
    def setCanReadDrive(value: Boolean): Self = StObject.set(x, "canReadDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanReadDriveUndefined: Self = StObject.set(x, "canReadDrive", js.undefined)
    
    @scala.inline
    def setCanReadRevisions(value: Boolean): Self = StObject.set(x, "canReadRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanReadRevisionsUndefined: Self = StObject.set(x, "canReadRevisions", js.undefined)
    
    @scala.inline
    def setCanReadTeamDrive(value: Boolean): Self = StObject.set(x, "canReadTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanReadTeamDriveUndefined: Self = StObject.set(x, "canReadTeamDrive", js.undefined)
    
    @scala.inline
    def setCanRemoveChildren(value: Boolean): Self = StObject.set(x, "canRemoveChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRemoveChildrenUndefined: Self = StObject.set(x, "canRemoveChildren", js.undefined)
    
    @scala.inline
    def setCanRemoveMyDriveParent(value: Boolean): Self = StObject.set(x, "canRemoveMyDriveParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRemoveMyDriveParentUndefined: Self = StObject.set(x, "canRemoveMyDriveParent", js.undefined)
    
    @scala.inline
    def setCanRename(value: Boolean): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRenameUndefined: Self = StObject.set(x, "canRename", js.undefined)
    
    @scala.inline
    def setCanShare(value: Boolean): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
    
    @scala.inline
    def setCanTrash(value: Boolean): Self = StObject.set(x, "canTrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanTrashChildren(value: Boolean): Self = StObject.set(x, "canTrashChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanTrashChildrenUndefined: Self = StObject.set(x, "canTrashChildren", js.undefined)
    
    @scala.inline
    def setCanTrashUndefined: Self = StObject.set(x, "canTrash", js.undefined)
    
    @scala.inline
    def setCanUntrash(value: Boolean): Self = StObject.set(x, "canUntrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanUntrashUndefined: Self = StObject.set(x, "canUntrash", js.undefined)
  }
}
