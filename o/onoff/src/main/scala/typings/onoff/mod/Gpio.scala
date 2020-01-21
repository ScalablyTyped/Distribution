package typings.onoff.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("onoff", "Gpio")
@js.native
class Gpio protected () extends js.Object {
  def this(gpio: Double, direction: Direction) = this()
  def this(gpio: Double, direction: Direction, edge: Edge) = this()
  def this(gpio: Double, direction: Direction, edge: Edge, options: Options) = this()
  def activeLow(): Boolean = js.native
  def direction(): Direction = js.native
  def edge(): Edge = js.native
  def read(): js.Promise[BinaryValue] = js.native
  def read(callback: ValueCallback): Unit = js.native
  def readSync(): BinaryValue = js.native
  def setActiveLow(invert: Boolean): Unit = js.native
  def setDirection(direction: Direction): Unit = js.native
  def setEdge(edge: Edge): Unit = js.native
  def unexport(): Unit = js.native
  def unwatch(): Unit = js.native
  def unwatch(callback: ValueCallback): Unit = js.native
  def unwatchAll(): Unit = js.native
  def watch(callback: ValueCallback): Unit = js.native
  def write(value: BinaryValue): js.Promise[Unit] = js.native
  def write(value: BinaryValue, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  def writeSync(value: BinaryValue): Unit = js.native
}

/* static members */
@JSImport("onoff", "Gpio")
@js.native
object Gpio extends js.Object {
  var HIGH: High = js.native
  var LOW: Low = js.native
  var accessible: Boolean = js.native
}

