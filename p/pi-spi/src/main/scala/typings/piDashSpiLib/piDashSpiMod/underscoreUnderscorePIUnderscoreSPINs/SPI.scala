package typings
package piDashSpiLib.piDashSpiMod.underscoreUnderscorePIUnderscoreSPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SPI extends js.Object {
  def bitOrder(): scala.Double = js.native
  def bitOrder(order: order): scala.Unit = js.native
  def clockSpeed(): scala.Double = js.native
  def clockSpeed(speed: scala.Double): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def dataMode(): scala.Double = js.native
  def dataMode(mode: mode): scala.Unit = js.native
  def read(
    readcount: scala.Double,
    cb: js.Function2[/* error */ nodeLib.Error, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def transfer(
    writebuf: nodeLib.Buffer,
    cb: js.Function2[/* error */ nodeLib.Error, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def transfer(
    writebuf: nodeLib.Buffer,
    readcount: scala.Double,
    cb: js.Function2[/* error */ nodeLib.Error, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def write(
    writebuf: nodeLib.Buffer,
    cb: js.Function2[/* error */ nodeLib.Error, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
}

