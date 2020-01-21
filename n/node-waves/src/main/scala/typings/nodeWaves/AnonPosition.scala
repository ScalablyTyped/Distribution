package typings.nodeWaves

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var position: js.UndefOr[AnonX] = js.undefined
  @JSName("wait")
  var wait_FAnonPosition: js.UndefOr[Double] = js.undefined
}

object AnonPosition {
  @scala.inline
  def apply(position: AnonX = null, wait: Int | Double = null): AnonPosition = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

