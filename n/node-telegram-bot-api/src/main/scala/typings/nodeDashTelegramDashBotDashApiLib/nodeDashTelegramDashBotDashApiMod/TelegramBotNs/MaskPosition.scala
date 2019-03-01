package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskPosition extends js.Object {
  var point: java.lang.String
  var scale: scala.Double
  var x_shift: scala.Double
  var y_shift: scala.Double
}

object MaskPosition {
  @scala.inline
  def apply(point: java.lang.String, scale: scala.Double, x_shift: scala.Double, y_shift: scala.Double): MaskPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("x_shift")(x_shift)
    __obj.updateDynamic("y_shift")(y_shift)
    __obj.asInstanceOf[MaskPosition]
  }
}

