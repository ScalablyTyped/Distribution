package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteItem extends js.Object {
  /**
    * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some
    * contexts and folders in others. Read-only.
    */
  @JSName("package")
  var _package: js.UndefOr[Package] = js.native
  // Identity of the user, device, and application which created the item. Read-only.
  var createdBy: js.UndefOr[IdentitySet] = js.native
  // Date and time of item creation. Read-only.
  var createdDateTime: js.UndefOr[String] = js.native
  // Indicates that the remote item is a file. Read-only.
  var file: js.UndefOr[File] = js.native
  // Information about the remote item from the local file system. Read-only.
  var fileSystemInfo: js.UndefOr[FileSystemInfo] = js.native
  // Indicates that the remote item is a folder. Read-only.
  var folder: js.UndefOr[Folder] = js.native
  // Unique identifier for the remote item in its drive. Read-only.
  var id: js.UndefOr[String] = js.native
  // Image metadata, if the item is an image. Read-only.
  var image: js.UndefOr[Image] = js.native
  // Identity of the user, device, and application which last modified the item. Read-only.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.native
  // Date and time the item was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Optional. Filename of the remote item. Read-only.
  var name: js.UndefOr[String] = js.native
  // Properties of the parent of the remote item. Read-only.
  var parentReference: js.UndefOr[ItemReference] = js.native
  /**
    * Indicates that the item has been shared with others and provides information about the shared state of the item.
    * Read-only.
    */
  var shared: js.UndefOr[Shared] = js.native
  /**
    * Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers.
    * Read-only.
    */
  var sharepointIds: js.UndefOr[SharepointIds] = js.native
  // Size of the remote item. Read-only.
  var size: js.UndefOr[Double] = js.native
  // If the current item is also available as a special folder, this facet is returned. Read-only.
  var specialFolder: js.UndefOr[SpecialFolder] = js.native
  // Video metadata, if the item is a video. Read-only.
  var video: js.UndefOr[Video] = js.native
  // DAV compatible URL for the item.
  var webDavUrl: js.UndefOr[String] = js.native
  // URL that displays the resource in the browser. Read-only.
  var webUrl: js.UndefOr[String] = js.native
}

object RemoteItem {
  @scala.inline
  def apply(): RemoteItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteItem]
  }
  @scala.inline
  implicit class RemoteItemOps[Self <: RemoteItem] (val x: Self) extends AnyVal {
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
    def set_package(value: Package): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    @scala.inline
    def setCreatedBy(value: IdentitySet): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFileSystemInfo(value: FileSystemInfo): Self = this.set("fileSystemInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSystemInfo: Self = this.set("fileSystemInfo", js.undefined)
    @scala.inline
    def setFolder(value: Folder): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: IdentitySet): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("lastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentReference(value: ItemReference): Self = this.set("parentReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentReference: Self = this.set("parentReference", js.undefined)
    @scala.inline
    def setShared(value: Shared): Self = this.set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    @scala.inline
    def setSharepointIds(value: SharepointIds): Self = this.set("sharepointIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharepointIds: Self = this.set("sharepointIds", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSpecialFolder(value: SpecialFolder): Self = this.set("specialFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecialFolder: Self = this.set("specialFolder", js.undefined)
    @scala.inline
    def setVideo(value: Video): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setWebDavUrl(value: String): Self = this.set("webDavUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebDavUrl: Self = this.set("webDavUrl", js.undefined)
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
  
}

