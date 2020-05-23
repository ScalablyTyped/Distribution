package typings.pigpio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bits extends js.Object {
  /**
    * a bit mask indicating the GPIOs of interest, bit0 corresponds to GPIO0, bit1 corresponds to GPIO1, ..., bit31 corresponds to GPIO31.
    * If a bit is set, the corresponding GPIO will be monitored for state changes. (optional, no default)
    */
  var bits: Double
}

object Bits {
  @scala.inline
  def apply(bits: Double): Bits = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bits]
  }
}

