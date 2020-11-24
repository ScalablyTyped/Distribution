package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupInfo extends js.Object {
  
  /** Name of the backup. */
  var backup: js.UndefOr[String] = js.native
  
  /** The backup contains an externally consistent copy of `source_database` at the timestamp specified by `create_time`. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Name of the database the backup was created from. */
  var sourceDatabase: js.UndefOr[String] = js.native
}
object BackupInfo {
  
  @scala.inline
  def apply(): BackupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupInfo]
  }
  
  @scala.inline
  implicit class BackupInfoOps[Self <: BackupInfo] (val x: Self) extends AnyVal {
    
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
    def setBackup(value: String): Self = this.set("backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackup: Self = this.set("backup", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setSourceDatabase(value: String): Self = this.set("sourceDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDatabase: Self = this.set("sourceDatabase", js.undefined)
  }
}
