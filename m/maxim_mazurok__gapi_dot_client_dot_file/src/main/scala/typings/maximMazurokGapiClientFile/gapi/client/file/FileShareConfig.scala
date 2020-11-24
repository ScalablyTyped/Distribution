package typings.maximMazurokGapiClientFile.gapi.client.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileShareConfig extends js.Object {
  
  /** File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes. */
  var capacityGb: js.UndefOr[String] = js.native
  
  /** The name of the file share (must be 16 characters or less). */
  var name: js.UndefOr[String] = js.native
  
  /** The resource name of the backup, in the format projects/{project_number}/locations/{location_id}/backups/{backup_id}, that this file share has been restored from. */
  var sourceBackup: js.UndefOr[String] = js.native
}
object FileShareConfig {
  
  @scala.inline
  def apply(): FileShareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileShareConfig]
  }
  
  @scala.inline
  implicit class FileShareConfigOps[Self <: FileShareConfig] (val x: Self) extends AnyVal {
    
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
    def setCapacityGb(value: String): Self = this.set("capacityGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityGb: Self = this.set("capacityGb", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSourceBackup(value: String): Self = this.set("sourceBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceBackup: Self = this.set("sourceBackup", js.undefined)
  }
}
