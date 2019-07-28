package typings.onoff.onoffMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("onoff", "Gpio")
@js.native
class Gpio protected () extends js.Object {
  def this(gpio: Double, direction: Direction) = this()
  def this(gpio: Double, direction: Direction, edge: Edge) = this()
  def this(gpio: Double, direction: Direction, options: GpioOptions) = this()
  def this(gpio: Double, direction: Direction, edge: Edge, options: GpioOptions) = this()
  var _valueFd: Double = js.native
  var gpio: Double = js.native
  var gpioPath: String = js.native
  var listeners: js.Array[js.Function2[/* err */ Error, /* value */ Double, Unit]] = js.native
  var opts: GpioOptions = js.native
  var readBuffer: Buffer = js.native
  def activeLow(): Boolean = js.native
  def direction(): Direction = js.native
  def edge(): Edge = js.native
  def options(): GpioOptions = js.native
  def read(cb: js.Function2[/* err */ Error, /* value */ Double, Unit]): Unit = js.native
  def readSync(): Double = js.native
  def setActiveLow(): Unit = js.native
  def setActiveLow(invert: Boolean): Unit = js.native
  def setDirection(value: Direction): Unit = js.native
  def setEdge(value: Edge): Unit = js.native
  def unexport(): Unit = js.native
  def unwatch(): Unit = js.native
  def unwatch(cb: js.Function2[/* err */ Error, /* value */ Double, Unit]): Unit = js.native
  def unwatchAll(): Unit = js.native
  def watch(cb: js.Function2[/* err */ Error, /* value */ Double, Unit]): Unit = js.native
  def write(value: Double, cb: js.Function2[/* err */ Error, /* value */ Double, Unit]): Unit = js.native
  def writeSync(value: Double): Unit = js.native
}

/* static members */
@JSImport("onoff", "Gpio")
@js.native
object Gpio extends js.Object {
  var accessible: Boolean = js.native
}

