package typings.piDashSpi

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import typings.piDashSpi.piDashSpiMod.SPI
import typings.piDashSpi.piDashSpiMod.mode
import typings.piDashSpi.piDashSpiMod.mode.CPHA
import typings.piDashSpi.piDashSpiMod.mode.CPOL
import typings.piDashSpi.piDashSpiMod.order
import typings.piDashSpi.piDashSpiMod.order.LSB_FIRST
import typings.piDashSpi.piDashSpiMod.order.MSB_FIRST
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pi-spi", JSImport.Namespace)
@js.native
object piDashSpiMod extends js.Object {
  @js.native
  class SPI () extends js.Object {
    def bitOrder(): Double = js.native
    def bitOrder(order: order): Unit = js.native
    def clockSpeed(): Double = js.native
    def clockSpeed(speed: Double): Unit = js.native
    def close(cb: js.Function1[/* error */ Error, Unit]): Unit = js.native
    def dataMode(): Double = js.native
    def dataMode(mode: mode): Unit = js.native
    def read(readcount: Double, cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
    def transfer(writebuf: Buffer, cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
    def transfer(writebuf: Buffer, readcount: Double, cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
    def write(writebuf: Buffer, cb: js.Function2[/* error */ Error, /* data */ Buffer, Unit]): Unit = js.native
  }
  
  @js.native
  sealed trait mode extends js.Object
  
  @js.native
  sealed trait order extends js.Object
  
  def initialize(device: String): SPI = js.native
  @js.native
  object mode extends js.Object {
    @js.native
    sealed trait CPHA extends mode
    
    @js.native
    sealed trait CPOL extends mode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[mode with Double] = js.native
    /* 0x01 */ @js.native
    object CPHA extends TopLevel[CPHA with Double]
    
    /* 0x02 */ @js.native
    object CPOL extends TopLevel[CPOL with Double]
    
  }
  
  @js.native
  object order extends js.Object {
    @js.native
    sealed trait LSB_FIRST extends order
    
    @js.native
    sealed trait MSB_FIRST extends order
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[order with Double] = js.native
    /* 1 */ @js.native
    object LSB_FIRST extends TopLevel[LSB_FIRST with Double]
    
    /* 0 */ @js.native
    object MSB_FIRST extends TopLevel[MSB_FIRST with Double]
    
  }
  
}

