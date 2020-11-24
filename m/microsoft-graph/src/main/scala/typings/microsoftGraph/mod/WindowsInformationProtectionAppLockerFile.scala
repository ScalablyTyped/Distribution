package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsInformationProtectionAppLockerFile extends Entity {
  
  // The friendly name
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // File as a byte array
  var file: js.UndefOr[NullableOption[Double]] = js.native
  
  // SHA256 hash of the file
  var fileHash: js.UndefOr[NullableOption[String]] = js.native
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsInformationProtectionAppLockerFile {
  
  @scala.inline
  def apply(): WindowsInformationProtectionAppLockerFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionAppLockerFile]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionAppLockerFileOps[Self <: WindowsInformationProtectionAppLockerFile] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setFile(value: NullableOption[Double]): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setFileNull: Self = this.set("file", null)
    
    @scala.inline
    def setFileHash(value: NullableOption[String]): Self = this.set("fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileHash: Self = this.set("fileHash", js.undefined)
    
    @scala.inline
    def setFileHashNull: Self = this.set("fileHash", null)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionNull: Self = this.set("version", null)
  }
}
