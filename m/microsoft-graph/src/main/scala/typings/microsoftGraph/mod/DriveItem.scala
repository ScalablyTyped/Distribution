package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveItem extends BaseItem {
  
  /**
    * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some
    * contexts and folders in others. Read-only.
    */
  @JSName("package")
  var _package: js.UndefOr[NullableOption[Package]] = js.native
  
  // Analytics about the view activities that took place on this item.
  var analytics: js.UndefOr[NullableOption[ItemAnalytics]] = js.native
  
  // Audio metadata, if the item is an audio file. Read-only.
  var audio: js.UndefOr[NullableOption[Audio]] = js.native
  
  /**
    * An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is
    * not returned if the item is a folder. Read-only.
    */
  var cTag: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Collection containing Item objects for the immediate children of Item. Only items representing folders have children.
    * Read-only. Nullable.
    */
  var children: js.UndefOr[NullableOption[js.Array[DriveItem]]] = js.native
  
  // The content stream, if the item represents a file.
  var content: js.UndefOr[NullableOption[_]] = js.native
  
  // Information about the deleted state of the item. Read-only.
  var deleted: js.UndefOr[NullableOption[Deleted]] = js.native
  
  // File metadata, if the item is a file. Read-only.
  var file: js.UndefOr[NullableOption[File]] = js.native
  
  // File system information on client. Read-write.
  var fileSystemInfo: js.UndefOr[NullableOption[FileSystemInfo]] = js.native
  
  // Folder metadata, if the item is a folder. Read-only.
  var folder: js.UndefOr[NullableOption[Folder]] = js.native
  
  // Image metadata, if the item is an image. Read-only.
  var image: js.UndefOr[NullableOption[Image]] = js.native
  
  // For drives in SharePoint, the associated document library list item. Read-only. Nullable.
  var listItem: js.UndefOr[NullableOption[ListItem]] = js.native
  
  // Location metadata, if the item has location data. Read-only.
  var location: js.UndefOr[NullableOption[GeoCoordinates]] = js.native
  
  /**
    * If present, indicates that one or more operations that might affect the state of the driveItem are pending completion.
    * Read-only.
    */
  var pendingOperations: js.UndefOr[NullableOption[PendingOperations]] = js.native
  
  // The set of permissions for the item. Read-only. Nullable.
  var permissions: js.UndefOr[NullableOption[js.Array[Permission]]] = js.native
  
  // Photo metadata, if the item is a photo. Read-only.
  var photo: js.UndefOr[NullableOption[Photo]] = js.native
  
  /**
    * Provides information about the published or checked-out state of an item, in locations that support such actions. This
    * property is not returned by default. Read-only.
    */
  var publication: js.UndefOr[NullableOption[PublicationFacet]] = js.native
  
  // Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
  var remoteItem: js.UndefOr[NullableOption[RemoteItem]] = js.native
  
  // If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
  var root: js.UndefOr[NullableOption[Root]] = js.native
  
  // Search metadata, if the item is from a search result. Read-only.
  var searchResult: js.UndefOr[NullableOption[SearchResult]] = js.native
  
  /**
    * Indicates that the item has been shared with others and provides information about the shared state of the item.
    * Read-only.
    */
  var shared: js.UndefOr[NullableOption[Shared]] = js.native
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.native
  
  // Size of the item in bytes. Read-only.
  var size: js.UndefOr[NullableOption[Double]] = js.native
  
  // If the current item is also available as a special folder, this facet is returned. Read-only.
  var specialFolder: js.UndefOr[NullableOption[SpecialFolder]] = js.native
  
  // The set of subscriptions on the item. Only supported on the root of a drive.
  var subscriptions: js.UndefOr[NullableOption[js.Array[Subscription]]] = js.native
  
  /**
    * Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][].
    * Read-only. Nullable.
    */
  var thumbnails: js.UndefOr[NullableOption[js.Array[ThumbnailSet]]] = js.native
  
  // The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
  var versions: js.UndefOr[NullableOption[js.Array[DriveItemVersion]]] = js.native
  
  // Video metadata, if the item is a video. Read-only.
  var video: js.UndefOr[NullableOption[Video]] = js.native
  
  // WebDAV compatible URL for the item.
  var webDavUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
  var workbook: js.UndefOr[NullableOption[Workbook]] = js.native
}
object DriveItem {
  
  @scala.inline
  def apply(): DriveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItem]
  }
  
  @scala.inline
  implicit class DriveItemOps[Self <: DriveItem] (val x: Self) extends AnyVal {
    
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
    def setAnalytics(value: NullableOption[ItemAnalytics]): Self = this.set("analytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalytics: Self = this.set("analytics", js.undefined)
    
    @scala.inline
    def setAnalyticsNull: Self = this.set("analytics", null)
    
    @scala.inline
    def setAudio(value: NullableOption[Audio]): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setAudioNull: Self = this.set("audio", null)
    
    @scala.inline
    def setCTag(value: NullableOption[String]): Self = this.set("cTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCTag: Self = this.set("cTag", js.undefined)
    
    @scala.inline
    def setCTagNull: Self = this.set("cTag", null)
    
    @scala.inline
    def setChildrenVarargs(value: DriveItem*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: NullableOption[js.Array[DriveItem]]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
    @scala.inline
    def setContent(value: NullableOption[_]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setDeleted(value: NullableOption[Deleted]): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDeletedNull: Self = this.set("deleted", null)
    
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
    def setImage(value: NullableOption[Image]): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageNull: Self = this.set("image", null)
    
    @scala.inline
    def setListItem(value: NullableOption[ListItem]): Self = this.set("listItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItem: Self = this.set("listItem", js.undefined)
    
    @scala.inline
    def setListItemNull: Self = this.set("listItem", null)
    
    @scala.inline
    def setLocation(value: NullableOption[GeoCoordinates]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
    
    @scala.inline
    def setPendingOperations(value: NullableOption[PendingOperations]): Self = this.set("pendingOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingOperations: Self = this.set("pendingOperations", js.undefined)
    
    @scala.inline
    def setPendingOperationsNull: Self = this.set("pendingOperations", null)
    
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: NullableOption[js.Array[Permission]]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setPermissionsNull: Self = this.set("permissions", null)
    
    @scala.inline
    def setPhoto(value: NullableOption[Photo]): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setPhotoNull: Self = this.set("photo", null)
    
    @scala.inline
    def setPublication(value: NullableOption[PublicationFacet]): Self = this.set("publication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublication: Self = this.set("publication", js.undefined)
    
    @scala.inline
    def setPublicationNull: Self = this.set("publication", null)
    
    @scala.inline
    def setRemoteItem(value: NullableOption[RemoteItem]): Self = this.set("remoteItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteItem: Self = this.set("remoteItem", js.undefined)
    
    @scala.inline
    def setRemoteItemNull: Self = this.set("remoteItem", null)
    
    @scala.inline
    def setRoot(value: NullableOption[Root]): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setSearchResult(value: NullableOption[SearchResult]): Self = this.set("searchResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchResult: Self = this.set("searchResult", js.undefined)
    
    @scala.inline
    def setSearchResultNull: Self = this.set("searchResult", null)
    
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
    def setSubscriptionsVarargs(value: Subscription*): Self = this.set("subscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptions(value: NullableOption[js.Array[Subscription]]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptions: Self = this.set("subscriptions", js.undefined)
    
    @scala.inline
    def setSubscriptionsNull: Self = this.set("subscriptions", null)
    
    @scala.inline
    def setThumbnailsVarargs(value: ThumbnailSet*): Self = this.set("thumbnails", js.Array(value :_*))
    
    @scala.inline
    def setThumbnails(value: NullableOption[js.Array[ThumbnailSet]]): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    
    @scala.inline
    def setThumbnailsNull: Self = this.set("thumbnails", null)
    
    @scala.inline
    def setVersionsVarargs(value: DriveItemVersion*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: NullableOption[js.Array[DriveItemVersion]]): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
    
    @scala.inline
    def setVersionsNull: Self = this.set("versions", null)
    
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
    def setWorkbook(value: NullableOption[Workbook]): Self = this.set("workbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkbook: Self = this.set("workbook", js.undefined)
    
    @scala.inline
    def setWorkbookNull: Self = this.set("workbook", null)
  }
}
