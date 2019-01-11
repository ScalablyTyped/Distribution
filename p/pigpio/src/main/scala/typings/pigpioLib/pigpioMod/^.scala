package typings
package pigpioLib.pigpioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pigpio", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CLOCK_PCM: scala.Double = js.native
  val CLOCK_PWM: scala.Double = js.native
  def configureClock(microseconds: scala.Double, peripheral: scala.Double): scala.Unit = js.native
  def configureSocketPort(port: scala.Double): scala.Unit = js.native
  def getTick(): scala.Double = js.native
  def hardwareRevision(): scala.Double = js.native
  def initialize(): scala.Unit = js.native
  def terminate(): scala.Unit = js.native
  def tickDiff(startTick: scala.Double, endTick: scala.Double): scala.Double = js.native
}

