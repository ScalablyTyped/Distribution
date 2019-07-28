package typings.pigpio.pigpioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pigpio", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CLOCK_PCM: Double = js.native
  val CLOCK_PWM: Double = js.native
  def configureClock(microseconds: Double, peripheral: Double): Unit = js.native
  def configureSocketPort(port: Double): Unit = js.native
  def getTick(): Double = js.native
  def hardwareRevision(): Double = js.native
  def initialize(): Unit = js.native
  def terminate(): Unit = js.native
  def tickDiff(startTick: Double, endTick: Double): Double = js.native
}

