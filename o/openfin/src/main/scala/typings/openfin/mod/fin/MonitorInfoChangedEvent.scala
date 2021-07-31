package typings.openfin.mod.fin

import typings.openfin.monitorMod.DipRect
import typings.openfin.monitorMod.MonitorDetails
import typings.openfin.monitorMod.TaskBar
import typings.openfin.openfinStrings.`monitor-info-changed`
import typings.openfin.openfinStrings.system
import typings.openfin.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorInfoChangedEvent
  extends StObject
     with typings.openfin.monitorMod.MonitorInfo {
  
  var topic: system
  
  var `type`: `monitor-info-changed`
}
object MonitorInfoChangedEvent {
  
  @scala.inline
  def apply(
    deviceScaleFactor: Double,
    dpi: Point,
    nonPrimaryMonitors: js.Array[MonitorDetails],
    primaryMonitor: MonitorDetails,
    reason: String,
    taskBar: TaskBar,
    virtualScreen: DipRect
  ): MonitorInfoChangedEvent = {
    val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], nonPrimaryMonitors = nonPrimaryMonitors.asInstanceOf[js.Any], primaryMonitor = primaryMonitor.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], taskBar = taskBar.asInstanceOf[js.Any], topic = "system", virtualScreen = virtualScreen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("monitor-info-changed")
    __obj.asInstanceOf[MonitorInfoChangedEvent]
  }
  
  @scala.inline
  implicit class MonitorInfoChangedEventMutableBuilder[Self <: MonitorInfoChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopic(value: system): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `monitor-info-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
