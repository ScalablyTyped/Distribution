package typings.maximMazurokGapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanAddFolderFromAnotherDrive extends js.Object {
  
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
  implicit class CanAddFolderFromAnotherDriveOps[Self <: CanAddFolderFromAnotherDrive] (val x: Self) extends AnyVal {
    
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
    def setCanAddChildren(value: Boolean): Self = this.set("canAddChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanAddChildren: Self = this.set("canAddChildren", js.undefined)
    
    @scala.inline
    def setCanAddFolderFromAnotherDrive(value: Boolean): Self = this.set("canAddFolderFromAnotherDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanAddFolderFromAnotherDrive: Self = this.set("canAddFolderFromAnotherDrive", js.undefined)
    
    @scala.inline
    def setCanAddMyDriveParent(value: Boolean): Self = this.set("canAddMyDriveParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanAddMyDriveParent: Self = this.set("canAddMyDriveParent", js.undefined)
    
    @scala.inline
    def setCanChangeCopyRequiresWriterPermission(value: Boolean): Self = this.set("canChangeCopyRequiresWriterPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanChangeCopyRequiresWriterPermission: Self = this.set("canChangeCopyRequiresWriterPermission", js.undefined)
    
    @scala.inline
    def setCanChangeViewersCanCopyContent(value: Boolean): Self = this.set("canChangeViewersCanCopyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanChangeViewersCanCopyContent: Self = this.set("canChangeViewersCanCopyContent", js.undefined)
    
    @scala.inline
    def setCanComment(value: Boolean): Self = this.set("canComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanComment: Self = this.set("canComment", js.undefined)
    
    @scala.inline
    def setCanCopy(value: Boolean): Self = this.set("canCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanCopy: Self = this.set("canCopy", js.undefined)
    
    @scala.inline
    def setCanDelete(value: Boolean): Self = this.set("canDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDelete: Self = this.set("canDelete", js.undefined)
    
    @scala.inline
    def setCanDeleteChildren(value: Boolean): Self = this.set("canDeleteChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDeleteChildren: Self = this.set("canDeleteChildren", js.undefined)
    
    @scala.inline
    def setCanDownload(value: Boolean): Self = this.set("canDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDownload: Self = this.set("canDownload", js.undefined)
    
    @scala.inline
    def setCanEdit(value: Boolean): Self = this.set("canEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanEdit: Self = this.set("canEdit", js.undefined)
    
    @scala.inline
    def setCanListChildren(value: Boolean): Self = this.set("canListChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanListChildren: Self = this.set("canListChildren", js.undefined)
    
    @scala.inline
    def setCanModifyContent(value: Boolean): Self = this.set("canModifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanModifyContent: Self = this.set("canModifyContent", js.undefined)
    
    @scala.inline
    def setCanModifyContentRestriction(value: Boolean): Self = this.set("canModifyContentRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanModifyContentRestriction: Self = this.set("canModifyContentRestriction", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenOutOfDrive(value: Boolean): Self = this.set("canMoveChildrenOutOfDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveChildrenOutOfDrive: Self = this.set("canMoveChildrenOutOfDrive", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenOutOfTeamDrive(value: Boolean): Self = this.set("canMoveChildrenOutOfTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveChildrenOutOfTeamDrive: Self = this.set("canMoveChildrenOutOfTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenWithinDrive(value: Boolean): Self = this.set("canMoveChildrenWithinDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveChildrenWithinDrive: Self = this.set("canMoveChildrenWithinDrive", js.undefined)
    
    @scala.inline
    def setCanMoveChildrenWithinTeamDrive(value: Boolean): Self = this.set("canMoveChildrenWithinTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveChildrenWithinTeamDrive: Self = this.set("canMoveChildrenWithinTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemIntoTeamDrive(value: Boolean): Self = this.set("canMoveItemIntoTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveItemIntoTeamDrive: Self = this.set("canMoveItemIntoTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemOutOfDrive(value: Boolean): Self = this.set("canMoveItemOutOfDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveItemOutOfDrive: Self = this.set("canMoveItemOutOfDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemOutOfTeamDrive(value: Boolean): Self = this.set("canMoveItemOutOfTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveItemOutOfTeamDrive: Self = this.set("canMoveItemOutOfTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemWithinDrive(value: Boolean): Self = this.set("canMoveItemWithinDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveItemWithinDrive: Self = this.set("canMoveItemWithinDrive", js.undefined)
    
    @scala.inline
    def setCanMoveItemWithinTeamDrive(value: Boolean): Self = this.set("canMoveItemWithinTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveItemWithinTeamDrive: Self = this.set("canMoveItemWithinTeamDrive", js.undefined)
    
    @scala.inline
    def setCanMoveTeamDriveItem(value: Boolean): Self = this.set("canMoveTeamDriveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanMoveTeamDriveItem: Self = this.set("canMoveTeamDriveItem", js.undefined)
    
    @scala.inline
    def setCanReadDrive(value: Boolean): Self = this.set("canReadDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanReadDrive: Self = this.set("canReadDrive", js.undefined)
    
    @scala.inline
    def setCanReadRevisions(value: Boolean): Self = this.set("canReadRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanReadRevisions: Self = this.set("canReadRevisions", js.undefined)
    
    @scala.inline
    def setCanReadTeamDrive(value: Boolean): Self = this.set("canReadTeamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanReadTeamDrive: Self = this.set("canReadTeamDrive", js.undefined)
    
    @scala.inline
    def setCanRemoveChildren(value: Boolean): Self = this.set("canRemoveChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRemoveChildren: Self = this.set("canRemoveChildren", js.undefined)
    
    @scala.inline
    def setCanRemoveMyDriveParent(value: Boolean): Self = this.set("canRemoveMyDriveParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRemoveMyDriveParent: Self = this.set("canRemoveMyDriveParent", js.undefined)
    
    @scala.inline
    def setCanRename(value: Boolean): Self = this.set("canRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanRename: Self = this.set("canRename", js.undefined)
    
    @scala.inline
    def setCanShare(value: Boolean): Self = this.set("canShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanShare: Self = this.set("canShare", js.undefined)
    
    @scala.inline
    def setCanTrash(value: Boolean): Self = this.set("canTrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanTrash: Self = this.set("canTrash", js.undefined)
    
    @scala.inline
    def setCanTrashChildren(value: Boolean): Self = this.set("canTrashChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanTrashChildren: Self = this.set("canTrashChildren", js.undefined)
    
    @scala.inline
    def setCanUntrash(value: Boolean): Self = this.set("canUntrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUntrash: Self = this.set("canUntrash", js.undefined)
  }
}
