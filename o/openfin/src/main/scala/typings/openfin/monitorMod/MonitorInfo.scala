package typings.openfin.monitorMod

import typings.openfin.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorInfo extends js.Object {
  var deviceScaleFactor: Double
  var dpi: Point
  var nonPrimaryMonitors: js.Array[MonitorDetails]
  var primaryMonitor: MonitorDetails
  var reason: String
  var taskBar: TaskBar
  var virtualScreen: DipRect
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
}

