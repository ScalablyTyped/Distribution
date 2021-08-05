package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupInfo extends StObject {
  
  /** Name of the backup. */
  var backup: js.UndefOr[String] = js.undefined
  
  /** The backup contains an externally consistent copy of `source_database` at the timestamp specified by `create_time`. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Name of the database the backup was created from. */
  var sourceDatabase: js.UndefOr[String] = js.undefined
}
object BackupInfo {
  
  inline def apply(): BackupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupInfo]
  }
  
  extension [Self <: BackupInfo](x: Self) {
    
    inline def setBackup(value: String): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    inline def setBackupUndefined: Self = StObject.set(x, "backup", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setSourceDatabase(value: String): Self = StObject.set(x, "sourceDatabase", value.asInstanceOf[js.Any])
    
    inline def setSourceDatabaseUndefined: Self = StObject.set(x, "sourceDatabase", js.undefined)
  }
}
