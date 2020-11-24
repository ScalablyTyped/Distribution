package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveItemUploadableProperties extends js.Object {
  
  // Provides a user-visible description of the item. Read-write. Only on OneDrive Personal.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Provides an expected file size to perform a quota check prior to upload. Only on OneDrive Personal.
  var fileSize: js.UndefOr[NullableOption[Double]] = js.native
  
  // File system information on client. Read-write.
  var fileSystemInfo: js.UndefOr[NullableOption[FileSystemInfo]] = js.native
  
  // The name of the item (filename and extension). Read-write.
  var name: js.UndefOr[NullableOption[String]] = js.native
}
object DriveItemUploadableProperties {
  
  @scala.inline
  def apply(): DriveItemUploadableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItemUploadableProperties]
  }
  
  @scala.inline
  implicit class DriveItemUploadablePropertiesOps[Self <: DriveItemUploadableProperties] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setFileSize(value: NullableOption[Double]): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setFileSizeNull: Self = this.set("fileSize", null)
    
    @scala.inline
    def setFileSystemInfo(value: NullableOption[FileSystemInfo]): Self = this.set("fileSystemInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemInfo: Self = this.set("fileSystemInfo", js.undefined)
    
    @scala.inline
    def setFileSystemInfoNull: Self = this.set("fileSystemInfo", null)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
