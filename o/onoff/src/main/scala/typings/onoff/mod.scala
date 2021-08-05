package typings.onoff

import typings.onoff.onoffNumbers.`0`
import typings.onoff.onoffNumbers.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("onoff", "Gpio")
  @js.native
  class Gpio protected () extends StObject {
    def this(gpio: Double, direction: Direction) = this()
    def this(gpio: Double, direction: Direction, edge: Edge) = this()
    def this(gpio: Double, direction: Direction, edge: Unit, options: Options) = this()
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
  object Gpio {
    
    @JSImport("onoff", "Gpio")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("onoff", "Gpio.HIGH")
    @js.native
    def HIGH: High = js.native
    inline def HIGH_=(x: High): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIGH")(x.asInstanceOf[js.Any])
    
    @JSImport("onoff", "Gpio.LOW")
    @js.native
    def LOW: Low = js.native
    inline def LOW_=(x: Low): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOW")(x.asInstanceOf[js.Any])
    
    @JSImport("onoff", "Gpio.accessible")
    @js.native
    def accessible: Boolean = js.native
    inline def accessible_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessible")(x.asInstanceOf[js.Any])
  }
  
  type BinaryValue = High | Low
  
  /* Rewritten from type alias, can be one of: 
    - typings.onoff.onoffStrings.in
    - typings.onoff.onoffStrings.out
    - typings.onoff.onoffStrings.high
    - typings.onoff.onoffStrings.low
  */
  trait Direction extends StObject
  object Direction {
    
    inline def high: typings.onoff.onoffStrings.high = "high".asInstanceOf[typings.onoff.onoffStrings.high]
    
    inline def in: typings.onoff.onoffStrings.in = "in".asInstanceOf[typings.onoff.onoffStrings.in]
    
    inline def low: typings.onoff.onoffStrings.low = "low".asInstanceOf[typings.onoff.onoffStrings.low]
    
    inline def out: typings.onoff.onoffStrings.out = "out".asInstanceOf[typings.onoff.onoffStrings.out]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.onoff.onoffStrings.none
    - typings.onoff.onoffStrings.rising
    - typings.onoff.onoffStrings.falling
    - typings.onoff.onoffStrings.both
  */
  trait Edge extends StObject
  object Edge {
    
    inline def both: typings.onoff.onoffStrings.both = "both".asInstanceOf[typings.onoff.onoffStrings.both]
    
    inline def falling: typings.onoff.onoffStrings.falling = "falling".asInstanceOf[typings.onoff.onoffStrings.falling]
    
    inline def none: typings.onoff.onoffStrings.none = "none".asInstanceOf[typings.onoff.onoffStrings.none]
    
    inline def rising: typings.onoff.onoffStrings.rising = "rising".asInstanceOf[typings.onoff.onoffStrings.rising]
  }
  
  type High = `1`
  
  type Low = `0`
  
  trait Options extends StObject {
    
    var activeLow: js.UndefOr[Boolean] = js.undefined
    
    var debounceTimeout: js.UndefOr[Double] = js.undefined
    
    var reconfigureDirection: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActiveLow(value: Boolean): Self = StObject.set(x, "activeLow", value.asInstanceOf[js.Any])
      
      inline def setActiveLowUndefined: Self = StObject.set(x, "activeLow", js.undefined)
      
      inline def setDebounceTimeout(value: Double): Self = StObject.set(x, "debounceTimeout", value.asInstanceOf[js.Any])
      
      inline def setDebounceTimeoutUndefined: Self = StObject.set(x, "debounceTimeout", js.undefined)
      
      inline def setReconfigureDirection(value: Boolean): Self = StObject.set(x, "reconfigureDirection", value.asInstanceOf[js.Any])
      
      inline def setReconfigureDirectionUndefined: Self = StObject.set(x, "reconfigureDirection", js.undefined)
    }
  }
  
  type ValueCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* value */ BinaryValue, Unit]
}
