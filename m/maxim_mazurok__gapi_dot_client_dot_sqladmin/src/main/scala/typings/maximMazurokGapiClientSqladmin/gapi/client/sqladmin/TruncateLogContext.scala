package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TruncateLogContext extends js.Object {
  
  /** This is always *sql#truncateLogContext*. */
  var kind: js.UndefOr[String] = js.native
  
  /** The type of log to truncate. Valid values are *MYSQL_GENERAL_TABLE* and *MYSQL_SLOW_TABLE*. */
  var logType: js.UndefOr[String] = js.native
}
object TruncateLogContext {
  
  @scala.inline
  def apply(): TruncateLogContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateLogContext]
  }
  
  @scala.inline
  implicit class TruncateLogContextOps[Self <: TruncateLogContext] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLogType(value: String): Self = this.set("logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogType: Self = this.set("logType", js.undefined)
  }
}
