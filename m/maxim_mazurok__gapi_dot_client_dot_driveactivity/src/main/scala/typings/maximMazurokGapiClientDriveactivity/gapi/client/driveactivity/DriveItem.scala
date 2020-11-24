package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveItem extends js.Object {
  
  /** The Drive item is a file. */
  var driveFile: js.UndefOr[js.Any] = js.native
  
  /** The Drive item is a folder. Includes information about the type of folder. */
  var driveFolder: js.UndefOr[DriveFolder] = js.native
  
  /** This field is deprecated; please use the `driveFile` field instead. */
  var file: js.UndefOr[js.Any] = js.native
  
  /** This field is deprecated; please use the `driveFolder` field instead. */
  var folder: js.UndefOr[Folder] = js.native
  
  /** The MIME type of the Drive item. See https://developers.google.com/drive/v3/web/mime-types. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** The target Drive item. The format is "items/ITEM_ID". */
  var name: js.UndefOr[String] = js.native
  
  /** Information about the owner of this Drive item. */
  var owner: js.UndefOr[Owner] = js.native
  
  /** The title of the Drive item. */
  var title: js.UndefOr[String] = js.native
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
    def setDriveFile(value: js.Any): Self = this.set("driveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveFile: Self = this.set("driveFile", js.undefined)
    
    @scala.inline
    def setDriveFolder(value: DriveFolder): Self = this.set("driveFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveFolder: Self = this.set("driveFolder", js.undefined)
    
    @scala.inline
    def setFile(value: js.Any): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFolder(value: Folder): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
