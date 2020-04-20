package typings.offlineJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelay extends js.Object {
  var delay: Double
  var initialDelay: Double
}

object AnonDelay {
  @scala.inline
  def apply(delay: Double, initialDelay: Double): AnonDelay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], initialDelay = initialDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelay]
  }
}

