package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileShareConfig extends StObject {
  
  /** File share capacity in gigabytes (GB). Cloud Filestore defines 1 GB as 1024^3 bytes. */
  var capacityGb: js.UndefOr[String] = js.undefined
  
  /** The name of the file share (must be 16 characters or less). */
  var name: js.UndefOr[String] = js.undefined
  
  /** The resource name of the backup, in the format projects/{project_number}/locations/{location_id}/backups/{backup_id}, that this file share has been restored from. */
  var sourceBackup: js.UndefOr[String] = js.undefined
}
object FileShareConfig {
  
  @scala.inline
  def apply(): FileShareConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileShareConfig]
  }
  
  @scala.inline
  implicit class FileShareConfigMutableBuilder[Self <: FileShareConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityGb(value: String): Self = StObject.set(x, "capacityGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityGbUndefined: Self = StObject.set(x, "capacityGb", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSourceBackup(value: String): Self = StObject.set(x, "sourceBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupUndefined: Self = StObject.set(x, "sourceBackup", js.undefined)
  }
}
