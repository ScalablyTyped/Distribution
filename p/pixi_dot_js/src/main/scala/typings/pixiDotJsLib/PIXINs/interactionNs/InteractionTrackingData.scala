package typings
package pixiDotJsLib.PIXINs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionTrackingData extends js.Object {
  var flags: scala.Double
  var leftDown: scala.Boolean
  var none: scala.Double
  var over: scala.Boolean
  val pointerId: scala.Double
  var rightDown: scala.Boolean
}

object InteractionTrackingData {
  @scala.inline
  def apply(
    flags: scala.Double,
    leftDown: scala.Boolean,
    none: scala.Double,
    over: scala.Boolean,
    pointerId: scala.Double,
    rightDown: scala.Boolean
  ): InteractionTrackingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("leftDown")(leftDown)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("over")(over)
    __obj.updateDynamic("pointerId")(pointerId)
    __obj.updateDynamic("rightDown")(rightDown)
    __obj.asInstanceOf[InteractionTrackingData]
  }
}

