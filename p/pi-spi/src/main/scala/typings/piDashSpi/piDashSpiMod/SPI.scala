package typings.piDashSpi.piDashSpiMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pi-spi", "SPI")
@js.native
class SPI () extends js.Object {
  def bitOrder(): Double = js.native
  def bitOrder(order: order): Unit = js.native
  def clockSpeed(): Double = js.native
  def clockSpeed(speed: Double): Unit = js.native
  def close(): Unit = js.native
  def dataMode(): Double = js.native
  def dataMode(mode: mode): Unit = js.native
  def read(readcount: Double, cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
  def transfer(writebuf: Buffer, cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
  def transfer(writebuf: Buffer, readcount: Double, cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
  def write(writebuf: Buffer, cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
}

