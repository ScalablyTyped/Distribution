package typings.pixiDotJs.PIXINs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionTrackingData extends js.Object {
  var flags: Double
  var leftDown: Boolean
  var none: Double
  var over: Boolean
  val pointerId: Double
  var rightDown: Boolean
}

object InteractionTrackingData {
  @scala.inline
  def apply(
    flags: Double,
    leftDown: Boolean,
    none: Double,
    over: Boolean,
    pointerId: Double,
    rightDown: Boolean
  ): InteractionTrackingData = {
    val __obj = js.Dynamic.literal(flags = flags, leftDown = leftDown, none = none, over = over, pointerId = pointerId, rightDown = rightDown)
  
    __obj.asInstanceOf[InteractionTrackingData]
  }
}

