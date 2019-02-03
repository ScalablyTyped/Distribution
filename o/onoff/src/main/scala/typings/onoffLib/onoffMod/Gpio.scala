package typings
package onoffLib.onoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("onoff", "Gpio")
@js.native
class Gpio protected ()
  extends onoffLib.onoffMod.underscoreUnderscoreONOFFNs.Gpio {
  def this(gpio: scala.Double, direction: onoffLib.onoffMod.underscoreUnderscoreONOFFNs.Direction) = this()
  def this(gpio: scala.Double, direction: onoffLib.onoffMod.underscoreUnderscoreONOFFNs.Direction, edge: onoffLib.onoffMod.underscoreUnderscoreONOFFNs.Edge) = this()
  def this(gpio: scala.Double, direction: onoffLib.onoffMod.underscoreUnderscoreONOFFNs.Direction, options: onoffLib.onoffMod.underscoreUnderscoreONOFFNs.GpioOptions) = this()
  def this(gpio: scala.Double, direction: onoffLib.onoffMod.underscoreUnderscoreONOFFNs.Direction, edge: onoffLib.onoffMod.underscoreUnderscoreONOFFNs.Edge, options: onoffLib.onoffMod.underscoreUnderscoreONOFFNs.GpioOptions) = this()
}

/* static members */
@JSImport("onoff", "Gpio")
@js.native
object Gpio extends js.Object {
  var accessible: scala.Boolean = js.native
}

