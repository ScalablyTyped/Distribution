package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveItem extends StObject {
  
  /** The Drive item is a file. */
  var driveFile: js.UndefOr[Any] = js.undefined
  
  /** The Drive item is a folder. Includes information about the type of folder. */
  var driveFolder: js.UndefOr[DriveFolder] = js.undefined
  
  /** This field is deprecated; please use the `driveFile` field instead. */
  var file: js.UndefOr[Any] = js.undefined
  
  /** This field is deprecated; please use the `driveFolder` field instead. */
  var folder: js.UndefOr[Folder] = js.undefined
  
  /** The MIME type of the Drive item. See https://developers.google.com/drive/v3/web/mime-types. */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** The target Drive item. The format is `items/ITEM_ID`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Information about the owner of this Drive item. */
  var owner: js.UndefOr[Owner] = js.undefined
  
  /** The title of the Drive item. */
  var title: js.UndefOr[String] = js.undefined
}
object DriveItem {
  
  inline def apply(): DriveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DriveItem] (val x: Self) extends AnyVal {
    
    inline def setDriveFile(value: Any): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    inline def setDriveFolder(value: DriveFolder): Self = StObject.set(x, "driveFolder", value.asInstanceOf[js.Any])
    
    inline def setDriveFolderUndefined: Self = StObject.set(x, "driveFolder", js.undefined)
    
    inline def setFile(value: Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
