package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveItem
  extends StObject
     with BaseItem {
  
  /**
    * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some
    * contexts and folders in others. Read-only.
    */
  @JSName("package")
  var _package: js.UndefOr[NullableOption[Package]] = js.undefined
  
  // Analytics about the view activities that took place on this item.
  var analytics: js.UndefOr[NullableOption[ItemAnalytics]] = js.undefined
  
  // Audio metadata, if the item is an audio file. Read-only.
  var audio: js.UndefOr[NullableOption[Audio]] = js.undefined
  
  /**
    * An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is
    * not returned if the item is a folder. Read-only.
    */
  var cTag: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Collection containing Item objects for the immediate children of Item. Only items representing folders have children.
    * Read-only. Nullable.
    */
  var children: js.UndefOr[NullableOption[js.Array[DriveItem]]] = js.undefined
  
  // The content stream, if the item represents a file.
  var content: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Information about the deleted state of the item. Read-only.
  var deleted: js.UndefOr[NullableOption[Deleted]] = js.undefined
  
  // File metadata, if the item is a file. Read-only.
  var file: js.UndefOr[NullableOption[File]] = js.undefined
  
  // File system information on client. Read-write.
  var fileSystemInfo: js.UndefOr[NullableOption[FileSystemInfo]] = js.undefined
  
  // Folder metadata, if the item is a folder. Read-only.
  var folder: js.UndefOr[NullableOption[Folder]] = js.undefined
  
  // Image metadata, if the item is an image. Read-only.
  var image: js.UndefOr[NullableOption[Image]] = js.undefined
  
  // For drives in SharePoint, the associated document library list item. Read-only. Nullable.
  var listItem: js.UndefOr[NullableOption[ListItem]] = js.undefined
  
  // Location metadata, if the item has location data. Read-only.
  var location: js.UndefOr[NullableOption[GeoCoordinates]] = js.undefined
  
  /**
    * If present, indicates that one or more operations that might affect the state of the driveItem are pending completion.
    * Read-only.
    */
  var pendingOperations: js.UndefOr[NullableOption[PendingOperations]] = js.undefined
  
  // The set of permissions for the item. Read-only. Nullable.
  var permissions: js.UndefOr[NullableOption[js.Array[Permission]]] = js.undefined
  
  // Photo metadata, if the item is a photo. Read-only.
  var photo: js.UndefOr[NullableOption[Photo]] = js.undefined
  
  /**
    * Provides information about the published or checked-out state of an item, in locations that support such actions. This
    * property is not returned by default. Read-only.
    */
  var publication: js.UndefOr[NullableOption[PublicationFacet]] = js.undefined
  
  // Remote item data, if the item is shared from a drive other than the one being accessed. Read-only.
  var remoteItem: js.UndefOr[NullableOption[RemoteItem]] = js.undefined
  
  // If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive.
  var root: js.UndefOr[NullableOption[Root]] = js.undefined
  
  // Search metadata, if the item is from a search result. Read-only.
  var searchResult: js.UndefOr[NullableOption[SearchResult]] = js.undefined
  
  /**
    * Indicates that the item has been shared with others and provides information about the shared state of the item.
    * Read-only.
    */
  var shared: js.UndefOr[NullableOption[Shared]] = js.undefined
  
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.undefined
  
  // Size of the item in bytes. Read-only.
  var size: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // If the current item is also available as a special folder, this facet is returned. Read-only.
  var specialFolder: js.UndefOr[NullableOption[SpecialFolder]] = js.undefined
  
  // The set of subscriptions on the item. Only supported on the root of a drive.
  var subscriptions: js.UndefOr[NullableOption[js.Array[Subscription]]] = js.undefined
  
  /**
    * Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][].
    * Read-only. Nullable.
    */
  var thumbnails: js.UndefOr[NullableOption[js.Array[ThumbnailSet]]] = js.undefined
  
  // The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable.
  var versions: js.UndefOr[NullableOption[js.Array[DriveItemVersion]]] = js.undefined
  
  // Video metadata, if the item is a video. Read-only.
  var video: js.UndefOr[NullableOption[Video]] = js.undefined
  
  // WebDAV compatible URL for the item.
  var webDavUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable.
  var workbook: js.UndefOr[NullableOption[Workbook]] = js.undefined
}
object DriveItem {
  
  inline def apply(): DriveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItem]
  }
  
  extension [Self <: DriveItem](x: Self) {
    
    inline def setAnalytics(value: NullableOption[ItemAnalytics]): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsNull: Self = StObject.set(x, "analytics", null)
    
    inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    inline def setAudio(value: NullableOption[Audio]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioNull: Self = StObject.set(x, "audio", null)
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setCTag(value: NullableOption[String]): Self = StObject.set(x, "cTag", value.asInstanceOf[js.Any])
    
    inline def setCTagNull: Self = StObject.set(x, "cTag", null)
    
    inline def setCTagUndefined: Self = StObject.set(x, "cTag", js.undefined)
    
    inline def setChildren(value: NullableOption[js.Array[DriveItem]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: DriveItem*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setContent(value: NullableOption[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDeleted(value: NullableOption[Deleted]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setFile(value: NullableOption[File]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileNull: Self = StObject.set(x, "file", null)
    
    inline def setFileSystemInfo(value: NullableOption[FileSystemInfo]): Self = StObject.set(x, "fileSystemInfo", value.asInstanceOf[js.Any])
    
    inline def setFileSystemInfoNull: Self = StObject.set(x, "fileSystemInfo", null)
    
    inline def setFileSystemInfoUndefined: Self = StObject.set(x, "fileSystemInfo", js.undefined)
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFolder(value: NullableOption[Folder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderNull: Self = StObject.set(x, "folder", null)
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setImage(value: NullableOption[Image]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setListItem(value: NullableOption[ListItem]): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setListItemNull: Self = StObject.set(x, "listItem", null)
    
    inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    
    inline def setLocation(value: NullableOption[GeoCoordinates]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPendingOperations(value: NullableOption[PendingOperations]): Self = StObject.set(x, "pendingOperations", value.asInstanceOf[js.Any])
    
    inline def setPendingOperationsNull: Self = StObject.set(x, "pendingOperations", null)
    
    inline def setPendingOperationsUndefined: Self = StObject.set(x, "pendingOperations", js.undefined)
    
    inline def setPermissions(value: NullableOption[js.Array[Permission]]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    inline def setPhoto(value: NullableOption[Photo]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPublication(value: NullableOption[PublicationFacet]): Self = StObject.set(x, "publication", value.asInstanceOf[js.Any])
    
    inline def setPublicationNull: Self = StObject.set(x, "publication", null)
    
    inline def setPublicationUndefined: Self = StObject.set(x, "publication", js.undefined)
    
    inline def setRemoteItem(value: NullableOption[RemoteItem]): Self = StObject.set(x, "remoteItem", value.asInstanceOf[js.Any])
    
    inline def setRemoteItemNull: Self = StObject.set(x, "remoteItem", null)
    
    inline def setRemoteItemUndefined: Self = StObject.set(x, "remoteItem", js.undefined)
    
    inline def setRoot(value: NullableOption[Root]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSearchResult(value: NullableOption[SearchResult]): Self = StObject.set(x, "searchResult", value.asInstanceOf[js.Any])
    
    inline def setSearchResultNull: Self = StObject.set(x, "searchResult", null)
    
    inline def setSearchResultUndefined: Self = StObject.set(x, "searchResult", js.undefined)
    
    inline def setShared(value: NullableOption[Shared]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedNull: Self = StObject.set(x, "shared", null)
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    
    inline def setSharepointIds(value: NullableOption[SharepointIds]): Self = StObject.set(x, "sharepointIds", value.asInstanceOf[js.Any])
    
    inline def setSharepointIdsNull: Self = StObject.set(x, "sharepointIds", null)
    
    inline def setSharepointIdsUndefined: Self = StObject.set(x, "sharepointIds", js.undefined)
    
    inline def setSize(value: NullableOption[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSpecialFolder(value: NullableOption[SpecialFolder]): Self = StObject.set(x, "specialFolder", value.asInstanceOf[js.Any])
    
    inline def setSpecialFolderNull: Self = StObject.set(x, "specialFolder", null)
    
    inline def setSpecialFolderUndefined: Self = StObject.set(x, "specialFolder", js.undefined)
    
    inline def setSubscriptions(value: NullableOption[js.Array[Subscription]]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsNull: Self = StObject.set(x, "subscriptions", null)
    
    inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
    
    inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
    
    inline def setThumbnails(value: NullableOption[js.Array[ThumbnailSet]]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsNull: Self = StObject.set(x, "thumbnails", null)
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setThumbnailsVarargs(value: ThumbnailSet*): Self = StObject.set(x, "thumbnails", js.Array(value :_*))
    
    inline def setVersions(value: NullableOption[js.Array[DriveItemVersion]]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsNull: Self = StObject.set(x, "versions", null)
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: DriveItemVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
    
    inline def setVideo(value: NullableOption[Video]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoNull: Self = StObject.set(x, "video", null)
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setWebDavUrl(value: NullableOption[String]): Self = StObject.set(x, "webDavUrl", value.asInstanceOf[js.Any])
    
    inline def setWebDavUrlNull: Self = StObject.set(x, "webDavUrl", null)
    
    inline def setWebDavUrlUndefined: Self = StObject.set(x, "webDavUrl", js.undefined)
    
    inline def setWorkbook(value: NullableOption[Workbook]): Self = StObject.set(x, "workbook", value.asInstanceOf[js.Any])
    
    inline def setWorkbookNull: Self = StObject.set(x, "workbook", null)
    
    inline def setWorkbookUndefined: Self = StObject.set(x, "workbook", js.undefined)
    
    inline def set_package(value: NullableOption[Package]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageNull: Self = StObject.set(x, "package", null)
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
