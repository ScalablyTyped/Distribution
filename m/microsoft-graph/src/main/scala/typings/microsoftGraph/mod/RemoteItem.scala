package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteItem extends js.Object {
  
  /**
    * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some
    * contexts and folders in others. Read-only.
    */
  @JSName("package")
  var _package: js.UndefOr[NullableOption[Package]] = js.native
  
  // Identity of the user, device, and application which created the item. Read-only.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Date and time of item creation. Read-only.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates that the remote item is a file. Read-only.
  var file: js.UndefOr[NullableOption[File]] = js.native
  
  // Information about the remote item from the local file system. Read-only.
  var fileSystemInfo: js.UndefOr[NullableOption[FileSystemInfo]] = js.native
  
  // Indicates that the remote item is a folder. Read-only.
  var folder: js.UndefOr[NullableOption[Folder]] = js.native
  
  // Unique identifier for the remote item in its drive. Read-only.
  var id: js.UndefOr[NullableOption[String]] = js.native
  
  // Image metadata, if the item is an image. Read-only.
  var image: js.UndefOr[NullableOption[Image]] = js.native
  
  // Identity of the user, device, and application which last modified the item. Read-only.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Date and time the item was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Optional. Filename of the remote item. Read-only.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Properties of the parent of the remote item. Read-only.
  var parentReference: js.UndefOr[NullableOption[ItemReference]] = js.native
  
  /**
    * Indicates that the item has been shared with others and provides information about the shared state of the item.
    * Read-only.
    */
  var shared: js.UndefOr[NullableOption[Shared]] = js.native
  
  /**
    * Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers.
    * Read-only.
    */
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.native
  
  // Size of the remote item. Read-only.
  var size: js.UndefOr[NullableOption[Double]] = js.native
  
  // If the current item is also available as a special folder, this facet is returned. Read-only.
  var specialFolder: js.UndefOr[NullableOption[SpecialFolder]] = js.native
  
  // Video metadata, if the item is a video. Read-only.
  var video: js.UndefOr[NullableOption[Video]] = js.native
  
  // DAV compatible URL for the item.
  var webDavUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // URL that displays the resource in the browser. Read-only.
  var webUrl: js.UndefOr[NullableOption[String]] = js.native
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
    def set_package(value: NullableOption[Package]): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def set_packageNull: Self = this.set("package", null)
    
    @scala.inline
    def setCreatedBy(value: NullableOption[IdentitySet]): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setCreatedByNull: Self = this.set("createdBy", null)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setFile(value: NullableOption[File]): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFileNull: Self = this.set("file", null)
    
    @scala.inline
    def setFileSystemInfo(value: NullableOption[FileSystemInfo]): Self = this.set("fileSystemInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemInfo: Self = this.set("fileSystemInfo", js.undefined)
    
    @scala.inline
    def setFileSystemInfoNull: Self = this.set("fileSystemInfo", null)
    
    @scala.inline
    def setFolder(value: NullableOption[Folder]): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    
    @scala.inline
    def setFolderNull: Self = this.set("folder", null)
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setImage(value: NullableOption[Image]): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageNull: Self = this.set("image", null)
    
    @scala.inline
    def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("lastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedByNull: Self = this.set("lastModifiedBy", null)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = this.set("lastModifiedDateTime", null)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setParentReference(value: NullableOption[ItemReference]): Self = this.set("parentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentReference: Self = this.set("parentReference", js.undefined)
    
    @scala.inline
    def setParentReferenceNull: Self = this.set("parentReference", null)
    
    @scala.inline
    def setShared(value: NullableOption[Shared]): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setSharedNull: Self = this.set("shared", null)
    
    @scala.inline
    def setSharepointIds(value: NullableOption[SharepointIds]): Self = this.set("sharepointIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharepointIds: Self = this.set("sharepointIds", js.undefined)
    
    @scala.inline
    def setSharepointIdsNull: Self = this.set("sharepointIds", null)
    
    @scala.inline
    def setSize(value: NullableOption[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizeNull: Self = this.set("size", null)
    
    @scala.inline
    def setSpecialFolder(value: NullableOption[SpecialFolder]): Self = this.set("specialFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialFolder: Self = this.set("specialFolder", js.undefined)
    
    @scala.inline
    def setSpecialFolderNull: Self = this.set("specialFolder", null)
    
    @scala.inline
    def setVideo(value: NullableOption[Video]): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    
    @scala.inline
    def setVideoNull: Self = this.set("video", null)
    
    @scala.inline
    def setWebDavUrl(value: NullableOption[String]): Self = this.set("webDavUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebDavUrl: Self = this.set("webDavUrl", js.undefined)
    
    @scala.inline
    def setWebDavUrlNull: Self = this.set("webDavUrl", null)
    
    @scala.inline
    def setWebUrl(value: NullableOption[String]): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
    
    @scala.inline
    def setWebUrlNull: Self = this.set("webUrl", null)
  }
}
