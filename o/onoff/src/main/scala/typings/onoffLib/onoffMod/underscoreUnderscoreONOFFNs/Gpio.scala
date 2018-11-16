package typings
package onoffLib.onoffMod.underscoreUnderscoreONOFFNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gpio extends js.Object {
  var _valueFd: scala.Double = js.native
  var gpio: scala.Double = js.native
  var gpioPath: java.lang.String = js.native
  var listeners: js.Array[js.Function2[/* err */ nodeLib.Error, /* value */ scala.Double, scala.Unit]] = js.native
  var opts: GpioOptions = js.native
  var readBuffer: nodeLib.Buffer = js.native
  def activeLow(): scala.Boolean = js.native
  def direction(): Direction = js.native
  def edge(): Edge = js.native
  def options(): GpioOptions = js.native
  def read(cb: js.Function2[/* err */ nodeLib.Error, /* value */ scala.Double, scala.Unit]): scala.Unit = js.native
  def readSync(): scala.Double = js.native
  def setActiveLow(): scala.Unit = js.native
  def setActiveLow(invert: scala.Boolean): scala.Unit = js.native
  def setDirection(value: Direction): scala.Unit = js.native
  def setEdge(value: Edge): scala.Unit = js.native
  def unexport(): scala.Unit = js.native
  def unwatch(): scala.Unit = js.native
  def unwatch(cb: js.Function2[/* err */ nodeLib.Error, /* value */ scala.Double, scala.Unit]): scala.Unit = js.native
  def unwatchAll(): scala.Unit = js.native
  def watch(cb: js.Function2[/* err */ nodeLib.Error, /* value */ scala.Double, scala.Unit]): scala.Unit = js.native
  def write(
    value: scala.Double,
    cb: js.Function2[/* err */ nodeLib.Error, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def writeSync(value: scala.Double): scala.Unit = js.native
}

