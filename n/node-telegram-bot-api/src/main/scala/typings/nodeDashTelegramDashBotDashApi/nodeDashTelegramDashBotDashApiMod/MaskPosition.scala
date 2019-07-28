package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskPosition extends js.Object {
  var point: String
  var scale: Double
  var x_shift: Double
  var y_shift: Double
}

object MaskPosition {
  @scala.inline
  def apply(point: String, scale: Double, x_shift: Double, y_shift: Double): MaskPosition = {
    val __obj = js.Dynamic.literal(point = point, scale = scale, x_shift = x_shift, y_shift = y_shift)
  
    __obj.asInstanceOf[MaskPosition]
  }
}

