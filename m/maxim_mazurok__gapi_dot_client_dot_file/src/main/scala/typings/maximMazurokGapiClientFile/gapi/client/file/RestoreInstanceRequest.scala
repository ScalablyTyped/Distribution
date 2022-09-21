package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreInstanceRequest extends StObject {
  
  /** Required. Name of the file share in the Filestore instance that the backup is being restored to. */
  var fileShare: js.UndefOr[String] = js.undefined
  
  /** The resource name of the backup, in the format `projects/{project_number}/locations/{location_id}/backups/{backup_id}`. */
  var sourceBackup: js.UndefOr[String] = js.undefined
}
object RestoreInstanceRequest {
  
  inline def apply(): RestoreInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreInstanceRequest]
  }
  
  extension [Self <: RestoreInstanceRequest](x: Self) {
    
    inline def setFileShare(value: String): Self = StObject.set(x, "fileShare", value.asInstanceOf[js.Any])
    
    inline def setFileShareUndefined: Self = StObject.set(x, "fileShare", js.undefined)
    
    inline def setSourceBackup(value: String): Self = StObject.set(x, "sourceBackup", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupUndefined: Self = StObject.set(x, "sourceBackup", js.undefined)
  }
}
