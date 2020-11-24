package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesTruncateLogRequest extends js.Object {
  
  /** Contains details about the truncate log operation. */
  var truncateLogContext: js.UndefOr[TruncateLogContext] = js.native
}
object InstancesTruncateLogRequest {
  
  @scala.inline
  def apply(): InstancesTruncateLogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesTruncateLogRequest]
  }
  
  @scala.inline
  implicit class InstancesTruncateLogRequestOps[Self <: InstancesTruncateLogRequest] (val x: Self) extends AnyVal {
    
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
    def setTruncateLogContext(value: TruncateLogContext): Self = this.set("truncateLogContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncateLogContext: Self = this.set("truncateLogContext", js.undefined)
  }
}
