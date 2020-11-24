package typings.openfin.monitorMod

import typings.openfin.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorInfo extends js.Object {
  
  var deviceScaleFactor: Double = js.native
  
  var dpi: Point = js.native
  
  var nonPrimaryMonitors: js.Array[MonitorDetails] = js.native
  
  var primaryMonitor: MonitorDetails = js.native
  
  var reason: String = js.native
  
  var taskBar: TaskBar = js.native
  
  var virtualScreen: DipRect = js.native
}
object MonitorInfo {
  
  @scala.inline
  def apply(
    deviceScaleFactor: Double,
    dpi: Point,
    nonPrimaryMonitors: js.Array[MonitorDetails],
    primaryMonitor: MonitorDetails,
    reason: String,
    taskBar: TaskBar,
    virtualScreen: DipRect
  ): MonitorInfo = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], nonPrimaryMonitors = nonPrimaryMonitors.asInstanceOf[js.Any], primaryMonitor = primaryMonitor.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], taskBar = taskBar.asInstanceOf[js.Any], virtualScreen = virtualScreen.asInstanceOf[js.Any])
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
    def setDeviceScaleFactor(value: Double): Self = this.set("deviceScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpi(value: Point): Self = this.set("dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonPrimaryMonitorsVarargs(value: MonitorDetails*): Self = this.set("nonPrimaryMonitors", js.Array(value :_*))
    
    @scala.inline
    def setNonPrimaryMonitors(value: js.Array[MonitorDetails]): Self = this.set("nonPrimaryMonitors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryMonitor(value: MonitorDetails): Self = this.set("primaryMonitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskBar(value: TaskBar): Self = this.set("taskBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualScreen(value: DipRect): Self = this.set("virtualScreen", value.asInstanceOf[js.Any])
  }
}
