package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupRetentionSettings extends StObject {
  
  /** Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit is 'COUNT', we will retain this many backups. */
  var retainedBackups: js.UndefOr[Double] = js.undefined
  
  /** The unit that 'retained_backups' represents. */
  var retentionUnit: js.UndefOr[String] = js.undefined
}
object BackupRetentionSettings {
  
  inline def apply(): BackupRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupRetentionSettings]
  }
  
  extension [Self <: BackupRetentionSettings](x: Self) {
    
    inline def setRetainedBackups(value: Double): Self = StObject.set(x, "retainedBackups", value.asInstanceOf[js.Any])
    
    inline def setRetainedBackupsUndefined: Self = StObject.set(x, "retainedBackups", js.undefined)
    
    inline def setRetentionUnit(value: String): Self = StObject.set(x, "retentionUnit", value.asInstanceOf[js.Any])
    
    inline def setRetentionUnitUndefined: Self = StObject.set(x, "retentionUnit", js.undefined)
  }
}
