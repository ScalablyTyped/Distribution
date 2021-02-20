package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreInstanceRequest extends StObject {
  
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
  implicit class RestoreInstanceRequestMutableBuilder[Self <: RestoreInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileShare(value: String): Self = StObject.set(x, "fileShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShareUndefined: Self = StObject.set(x, "fileShare", js.undefined)
    
    @scala.inline
    def setSourceBackup(value: String): Self = StObject.set(x, "sourceBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupUndefined: Self = StObject.set(x, "sourceBackup", js.undefined)
  }
}
