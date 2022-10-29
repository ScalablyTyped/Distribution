package typings.pixiTicker

import typings.pixiTicker.libTickerMod.TickerCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTickerListenerMod {
  
  @JSImport("@pixi/ticker/lib/TickerListener", "TickerListener")
  @js.native
  open class TickerListener[T] protected () extends StObject {
    /**
      * Constructor
      * @private
      * @param fn - The listener function to be added for one update
      * @param context - The listener context
      * @param priority - The priority for emitting
      * @param once - If the handler should fire once
      */
    def this(fn: TickerCallback[T]) = this()
    def this(fn: TickerCallback[T], context: T) = this()
    def this(fn: TickerCallback[T], context: T, priority: Double) = this()
    def this(fn: TickerCallback[T], context: Unit, priority: Double) = this()
    def this(fn: TickerCallback[T], context: T, priority: Double, once: Boolean) = this()
    def this(fn: TickerCallback[T], context: T, priority: Unit, once: Boolean) = this()
    def this(fn: TickerCallback[T], context: Unit, priority: Double, once: Boolean) = this()
    def this(fn: TickerCallback[T], context: Unit, priority: Unit, once: Boolean) = this()
    
    /** `true` if this listener has been destroyed already. */
    /* private */ var _destroyed: Any = js.native
    
    /**
      * Connect to the list.
      * @private
      * @param previous - Input node, previous listener
      */
    def connect(previous: TickerListener[Any]): Unit = js.native
    
    /** The calling to execute. */
    /* private */ var context: Any = js.native
    
    /**
      * Destroy and don't use after this.
      * @private
      * @param hard - `true` to remove the `next` reference, this
      *        is considered a hard destroy. Soft destroy maintains the next reference.
      * @returns The listener to redirect while emitting or removing.
      */
    def destroy(): TickerListener[Any] = js.native
    def destroy(hard: Boolean): TickerListener[Any] = js.native
    
    /**
      * Emit by calling the current function.
      * @private
      * @param deltaTime - time since the last emit.
      * @returns Next ticker
      */
    def emit(deltaTime: Double): TickerListener[Any] = js.native
    
    /** The handler function to execute. */
    /* private */ var fn: Any = js.native
    
    /**
      * Simple compare function to figure out if a function and context match.
      * @private
      * @param fn - The listener function to be added for one update
      * @param context - The listener context
      * @returns `true` if the listener match the arguments
      */
    def `match`(fn: TickerCallback[T]): Boolean = js.native
    def `match`(fn: TickerCallback[T], context: Any): Boolean = js.native
    
    /** The next item in chain. */
    var next: TickerListener[Any] = js.native
    
    /** If this should only execute once. */
    /* private */ var once: Any = js.native
    
    /** The previous item in chain. */
    var previous: TickerListener[Any] = js.native
    
    /** The current priority. */
    var priority: Double = js.native
  }
}
