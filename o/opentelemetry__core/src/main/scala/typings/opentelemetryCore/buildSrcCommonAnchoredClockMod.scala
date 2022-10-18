package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCommonAnchoredClockMod {
  
  @JSImport("@opentelemetry/core/build/src/common/anchored-clock", "AnchoredClock")
  @js.native
  open class AnchoredClock protected ()
    extends StObject
       with Clock {
    /**
      * Create a new AnchoredClock anchored to the current time returned by systemClock.
      *
      * @param systemClock should be a clock that returns the number of milliseconds since January 1 1970 such as Date
      * @param monotonicClock should be a clock that counts milliseconds monotonically such as window.performance or perf_hooks.performance
      */
    def this(systemClock: Clock, monotonicClock: Clock) = this()
    
    /* private */ var _epochMillis: Any = js.native
    
    /* private */ var _monotonicClock: Any = js.native
    
    /* private */ var _performanceMillis: Any = js.native
    
    /**
      * Return the current time in milliseconds from some epoch such as the Unix epoch or process start
      */
    /* CompleteClass */
    override def now(): Double = js.native
  }
  
  trait Clock extends StObject {
    
    /**
      * Return the current time in milliseconds from some epoch such as the Unix epoch or process start
      */
    def now(): Double
  }
  object Clock {
    
    inline def apply(now: () => Double): Clock = {
      val __obj = js.Dynamic.literal(now = js.Any.fromFunction0(now))
      __obj.asInstanceOf[Clock]
    }
    
    extension [Self <: Clock](x: Self) {
      
      inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    }
  }
}
