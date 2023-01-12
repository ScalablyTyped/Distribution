package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteItem extends StObject {
  
  /**
    * If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some
    * contexts and folders in others. Read-only.
    */
  @JSName("package")
  var _package: js.UndefOr[NullableOption[Package]] = js.undefined
  
  // Identity of the user, device, and application which created the item. Read-only.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Date and time of item creation. Read-only.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates that the remote item is a file. Read-only.
  var file: js.UndefOr[NullableOption[File]] = js.undefined
  
  // Information about the remote item from the local file system. Read-only.
  var fileSystemInfo: js.UndefOr[NullableOption[FileSystemInfo]] = js.undefined
  
  // Indicates that the remote item is a folder. Read-only.
  var folder: js.UndefOr[NullableOption[Folder]] = js.undefined
  
  // Unique identifier for the remote item in its drive. Read-only.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Image metadata, if the item is an image. Read-only.
  var image: js.UndefOr[NullableOption[Image]] = js.undefined
  
  // Identity of the user, device, and application which last modified the item. Read-only.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Date and time the item was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional. Filename of the remote item. Read-only.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Properties of the parent of the remote item. Read-only.
  var parentReference: js.UndefOr[NullableOption[ItemReference]] = js.undefined
  
  /**
    * Indicates that the item has been shared with others and provides information about the shared state of the item.
    * Read-only.
    */
  var shared: js.UndefOr[NullableOption[Shared]] = js.undefined
  
  /**
    * Provides interop between items in OneDrive for Business and SharePoint with the full set of item identifiers.
    * Read-only.
    */
  var sharepointIds: js.UndefOr[NullableOption[SharepointIds]] = js.undefined
  
  // Size of the remote item. Read-only.
  var size: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // If the current item is also available as a special folder, this facet is returned. Read-only.
  var specialFolder: js.UndefOr[NullableOption[SpecialFolder]] = js.undefined
  
  // Video metadata, if the item is a video. Read-only.
  var video: js.UndefOr[NullableOption[Video]] = js.undefined
  
  // DAV compatible URL for the item.
  var webDavUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URL that displays the resource in the browser. Read-only.
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object RemoteItem {
  
  inline def apply(): RemoteItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteItem] (val x: Self) extends AnyVal {
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setFile(value: NullableOption[File]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileNull: Self = StObject.set(x, "file", null)
    
    inline def setFileSystemInfo(value: NullableOption[FileSystemInfo]): Self = StObject.set(x, "fileSystemInfo", value.asInstanceOf[js.Any])
    
    inline def setFileSystemInfoNull: Self = StObject.set(x, "fileSystemInfo", null)
    
    inline def setFileSystemInfoUndefined: Self = StObject.set(x, "fileSystemInfo", js.undefined)
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFolder(value: NullableOption[Folder]): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderNull: Self = StObject.set(x, "folder", null)
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: NullableOption[Image]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentReference(value: NullableOption[ItemReference]): Self = StObject.set(x, "parentReference", value.asInstanceOf[js.Any])
    
    inline def setParentReferenceNull: Self = StObject.set(x, "parentReference", null)
    
    inline def setParentReferenceUndefined: Self = StObject.set(x, "parentReference", js.undefined)
    
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
    
    inline def setVideo(value: NullableOption[Video]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoNull: Self = StObject.set(x, "video", null)
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setWebDavUrl(value: NullableOption[String]): Self = StObject.set(x, "webDavUrl", value.asInstanceOf[js.Any])
    
    inline def setWebDavUrlNull: Self = StObject.set(x, "webDavUrl", null)
    
    inline def setWebDavUrlUndefined: Self = StObject.set(x, "webDavUrl", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
    
    inline def set_package(value: NullableOption[Package]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageNull: Self = StObject.set(x, "package", null)
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
