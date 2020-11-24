package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorInfo extends js.Object {
  
  var monitorInfo: typings.openfin.monitorMod.MonitorInfo = js.native
  
  var runtimeInfo: String = js.native
  
  var timeStamp: String = js.native
}
object MonitorInfo {
  
  @scala.inline
  def apply(monitorInfo: typings.openfin.monitorMod.MonitorInfo, runtimeInfo: String, timeStamp: String): MonitorInfo = {
    val __obj = js.Dynamic.literal(monitorInfo = monitorInfo.asInstanceOf[js.Any], runtimeInfo = runtimeInfo.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorInfo]
  }
  
  @scala.inline
  implicit class MonitorInfoOps[Self <: MonitorInfo] (val x: Self) extends AnyVal {
    
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
    def setMonitorInfo(value: typings.openfin.monitorMod.MonitorInfo): Self = this.set("monitorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeInfo(value: String): Self = this.set("runtimeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: String): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
}
