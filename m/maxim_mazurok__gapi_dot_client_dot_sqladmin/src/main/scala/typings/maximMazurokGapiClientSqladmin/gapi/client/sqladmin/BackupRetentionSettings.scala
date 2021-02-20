package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupRetentionSettings extends StObject {
  
  /** Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit is 'COUNT', we will retain this many backups. */
  var retainedBackups: js.UndefOr[Double] = js.native
  
  /** The unit that 'retained_backups' represents. */
  var retentionUnit: js.UndefOr[String] = js.native
}
object BackupRetentionSettings {
  
  @scala.inline
  def apply(): BackupRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupRetentionSettings]
  }
  
  @scala.inline
  implicit class BackupRetentionSettingsMutableBuilder[Self <: BackupRetentionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetainedBackups(value: Double): Self = StObject.set(x, "retainedBackups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainedBackupsUndefined: Self = StObject.set(x, "retainedBackups", js.undefined)
    
    @scala.inline
    def setRetentionUnit(value: String): Self = StObject.set(x, "retentionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionUnitUndefined: Self = StObject.set(x, "retentionUnit", js.undefined)
  }
}
