package typings.piSpi

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pi-spi", "SPI")
  @js.native
  class SPI () extends StObject {
    
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
  
  @JSImport("pi-spi", "initialize")
  @js.native
  def initialize(device: String): SPI = js.native
  
  @js.native
  sealed trait mode extends StObject
  @JSImport("pi-spi", "mode")
  @js.native
  object mode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[mode with Double] = js.native
    
    @js.native
    sealed trait CPHA extends mode
    /* 0x01 */ val CPHA: typings.piSpi.mod.mode.CPHA with Double = js.native
    
    @js.native
    sealed trait CPOL extends mode
    /* 0x02 */ val CPOL: typings.piSpi.mod.mode.CPOL with Double = js.native
  }
  
  @js.native
  sealed trait order extends StObject
  @JSImport("pi-spi", "order")
  @js.native
  object order extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[order with Double] = js.native
    
    @js.native
    sealed trait LSB_FIRST extends order
    /* 1 */ val LSB_FIRST: typings.piSpi.mod.order.LSB_FIRST with Double = js.native
    
    @js.native
    sealed trait MSB_FIRST extends order
    /* 0 */ val MSB_FIRST: typings.piSpi.mod.order.MSB_FIRST with Double = js.native
  }
}
