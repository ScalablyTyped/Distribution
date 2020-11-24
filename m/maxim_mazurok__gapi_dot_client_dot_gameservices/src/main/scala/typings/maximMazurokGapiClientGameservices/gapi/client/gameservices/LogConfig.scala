package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfig extends js.Object {
  
  /** Cloud audit options. */
  var cloudAudit: js.UndefOr[CloudAuditOptions] = js.native
  
  /** Counter options. */
  var counter: js.UndefOr[CounterOptions] = js.native
  
  /** Data access options. */
  var dataAccess: js.UndefOr[DataAccessOptions] = js.native
}
object LogConfig {
  
  @scala.inline
  def apply(): LogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfig]
  }
  
  @scala.inline
  implicit class LogConfigOps[Self <: LogConfig] (val x: Self) extends AnyVal {
    
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
    def setCloudAudit(value: CloudAuditOptions): Self = this.set("cloudAudit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudAudit: Self = this.set("cloudAudit", js.undefined)
    
    @scala.inline
    def setCounter(value: CounterOptions): Self = this.set("counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    
    @scala.inline
    def setDataAccess(value: DataAccessOptions): Self = this.set("dataAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAccess: Self = this.set("dataAccess", js.undefined)
  }
}
