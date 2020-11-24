package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlExternalSyncSettingError extends js.Object {
  
  /** Additional information about the error encountered. */
  var detail: js.UndefOr[String] = js.native
  
  /** This is always *sql#migrationSettingError*. */
  var kind: js.UndefOr[String] = js.native
  
  /** Identifies the specific error that occurred. */
  var `type`: js.UndefOr[String] = js.native
}
object SqlExternalSyncSettingError {
  
  @scala.inline
  def apply(): SqlExternalSyncSettingError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlExternalSyncSettingError]
  }
  
  @scala.inline
  implicit class SqlExternalSyncSettingErrorOps[Self <: SqlExternalSyncSettingError] (val x: Self) extends AnyVal {
    
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
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
