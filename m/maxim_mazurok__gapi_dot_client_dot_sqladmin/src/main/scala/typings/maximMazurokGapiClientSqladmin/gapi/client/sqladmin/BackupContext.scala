package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupContext extends js.Object {
  
  /** The identifier of the backup. */
  var backupId: js.UndefOr[String] = js.native
  
  /** This is always *sql#backupContext*. */
  var kind: js.UndefOr[String] = js.native
}
object BackupContext {
  
  @scala.inline
  def apply(): BackupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupContext]
  }
  
  @scala.inline
  implicit class BackupContextOps[Self <: BackupContext] (val x: Self) extends AnyVal {
    
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
    def setBackupId(value: String): Self = this.set("backupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupId: Self = this.set("backupId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
