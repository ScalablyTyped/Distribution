package typings.maximMazurokGapiClientFile.gapi.client.file

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreInstanceRequest extends js.Object {
  
  /** Required. Name of the file share in the Cloud Filestore instance that the backup is being restored to. */
  var fileShare: js.UndefOr[String] = js.native
  
  /** The resource name of the backup, in the format projects/{project_number}/locations/{location_id}/backups/{backup_id}. */
  var sourceBackup: js.UndefOr[String] = js.native
}
object RestoreInstanceRequest {
  
  @scala.inline
  def apply(): RestoreInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreInstanceRequest]
  }
  
  @scala.inline
  implicit class RestoreInstanceRequestOps[Self <: RestoreInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setFileShare(value: String): Self = this.set("fileShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileShare: Self = this.set("fileShare", js.undefined)
    
    @scala.inline
    def setSourceBackup(value: String): Self = this.set("sourceBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceBackup: Self = this.set("sourceBackup", js.undefined)
  }
}
