package typings.openfin.monitorMod

import typings.openfin.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorDetails extends js.Object {
  
  var available: DipScaleRects = js.native
  
  var availableRect: Rect = js.native
  
  var deviceId: String = js.native
  
  var deviceScaleFactor: Double = js.native
  
  var displayDeviceActive: Boolean = js.native
  
  var dpi: Point = js.native
  
  var monitor: DipScaleRects = js.native
  
  var monitorRect: Rect = js.native
  
  var name: String = js.native
}
object MonitorDetails {
  
  @scala.inline
  def apply(
    available: DipScaleRects,
    availableRect: Rect,
    deviceId: String,
    deviceScaleFactor: Double,
    displayDeviceActive: Boolean,
    dpi: Point,
    monitor: DipScaleRects,
    monitorRect: Rect,
    name: String
  ): MonitorDetails = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], availableRect = availableRect.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], displayDeviceActive = displayDeviceActive.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], monitorRect = monitorRect.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitorDetails]
  }
  
  @scala.inline
  implicit class MonitorDetailsOps[Self <: MonitorDetails] (val x: Self) extends AnyVal {
    
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
    def setAvailable(value: DipScaleRects): Self = this.set("available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableRect(value: Rect): Self = this.set("availableRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceScaleFactor(value: Double): Self = this.set("deviceScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDeviceActive(value: Boolean): Self = this.set("displayDeviceActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpi(value: Point): Self = this.set("dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitor(value: DipScaleRects): Self = this.set("monitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorRect(value: Rect): Self = this.set("monitorRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
