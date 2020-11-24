package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupRetentionSettings extends js.Object {
  
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
  implicit class BackupRetentionSettingsOps[Self <: BackupRetentionSettings] (val x: Self) extends AnyVal {
    
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
    def setRetainedBackups(value: Double): Self = this.set("retainedBackups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainedBackups: Self = this.set("retainedBackups", js.undefined)
    
    @scala.inline
    def setRetentionUnit(value: String): Self = this.set("retentionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionUnit: Self = this.set("retentionUnit", js.undefined)
  }
}
