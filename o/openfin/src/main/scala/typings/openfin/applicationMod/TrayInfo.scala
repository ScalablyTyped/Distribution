package typings.openfin.applicationMod

import typings.openfin.monitorMod.MonitorInfo
import typings.openfin.shapesMod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrayInfo extends js.Object {
  var bounds: Bounds
  var monitorInfo: MonitorInfo
  var x: Double
  var y: Double
}

object TrayInfo {
  @scala.inline
  def apply(bounds: Bounds, monitorInfo: MonitorInfo, x: Double, y: Double): TrayInfo = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], monitorInfo = monitorInfo.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrayInfo]
  }
}

