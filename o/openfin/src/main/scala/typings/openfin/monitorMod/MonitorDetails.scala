package typings.openfin.monitorMod

import typings.openfin.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitorDetails extends js.Object {
  var available: DipScaleRects
  var availableRect: Rect
  var deviceId: String
  var deviceScaleFactor: Double
  var displayDeviceActive: Boolean
  var dpi: Point
  var monitor: DipScaleRects
  var monitorRect: Rect
  var name: String
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
}

