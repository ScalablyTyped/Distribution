package typings.pigpio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBits extends js.Object {
  /**
    * a bit mask indicating the GPIOs of interest, bit0 corresponds to GPIO0, bit1 corresponds to GPIO1, ..., bit31 corresponds to GPIO31.
    * If a bit is set, the corresponding GPIO will be monitored for state changes. (optional, no default)
    */
  var bits: Double
}

object AnonBits {
  @scala.inline
  def apply(bits: Double): AnonBits = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBits]
  }
}

