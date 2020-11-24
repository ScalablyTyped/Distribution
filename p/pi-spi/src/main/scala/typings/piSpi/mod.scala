package typings.piSpi

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pi-spi", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def initialize(device: String): SPI = js.native
  
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
  object mode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[mode with Double] = js.native
    
    @js.native
    sealed trait CPHA extends mode
    /* 0x01 */ @js.native
    object CPHA extends TopLevel[CPHA with Double]
    
    @js.native
    sealed trait CPOL extends mode
    /* 0x02 */ @js.native
    object CPOL extends TopLevel[CPOL with Double]
  }
  
  @js.native
  sealed trait order extends js.Object
  @js.native
  object order extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[order with Double] = js.native
    
    @js.native
    sealed trait LSB_FIRST extends order
    /* 1 */ @js.native
    object LSB_FIRST extends TopLevel[LSB_FIRST with Double]
    
    @js.native
    sealed trait MSB_FIRST extends order
    /* 0 */ @js.native
    object MSB_FIRST extends TopLevel[MSB_FIRST with Double]
  }
}
