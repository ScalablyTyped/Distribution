package typings.mockRaf

import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Creator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Creator]
  
  @JSImport("mock-raf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Creates a mockRaf instance, exposing the functions you'll use to interact with the mock. */
  @js.native
  trait Creator extends StObject {
    
    /** Replacement for cancelAnimationFrame or a polyfill.Removes all currently scheduled requestAnimationFrame callbacks from the queue. */
    def cancel(handle: Double): Unit = js.native
    
    /**
      * Returns the current now value of the mock. Starts at 0 and increases with each step() taken.
      * Useful for stubbing out performance.now() or a polyfill when using requestAnimationFrame with timers.
      */
    def now(): Double = js.native
    
    /** Replacement for requestAnimationFrame or a polyfill.Adds a callback to be fired on the next step. */
    def raf(callback: FrameRequestCallback): Double = js.native
    
    /** Takes requestAnimationFrame steps. Fires currently queued callbacks for each step and increments now time for each step. The primary way to interact with a mockRaf instance for testing. */
    def step(): Unit = js.native
    def step(options: Options): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /** The number of steps to take. */
    var count: js.UndefOr[Double] = js.undefined
    
    /** The time that should pass during each requestAnimationFrame step in milliseconds. Default is roughly equivalent to default browser behavior. */
    var time: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
