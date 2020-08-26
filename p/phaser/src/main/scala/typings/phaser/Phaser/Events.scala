package typings.phaser.Phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Events")
@js.native
object Events extends js.Object {
  /**
    * EventEmitter is a Scene Systems plugin compatible version of eventemitter3.
    */
  @js.native
  trait EventEmitter extends js.Object {
    /**
      * Add a listener for a given event.
      * @param event The event name.
      * @param fn The listener function.
      * @param context The context to invoke the listener with. Default this.
      */
    def addListener(event: String, fn: js.Function): this.type = js.native
    def addListener(event: String, fn: js.Function, context: js.Any): this.type = js.native
    def addListener(event: js.Symbol, fn: js.Function): this.type = js.native
    def addListener(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
    /**
      * Removes all listeners.
      */
    def destroy(): Unit = js.native
    /**
      * Calls each of the listeners registered for a given event.
      * @param event The event name.
      * @param args Additional arguments that will be passed to the event handler.
      */
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    /**
      * Return an array listing the events for which the emitter has registered listeners.
      */
    def eventNames(): js.Array[String | js.Symbol] = js.native
    /**
      * Return the number of listeners listening to a given event.
      * @param event The event name.
      */
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    /**
      * Return the listeners registered for a given event.
      * @param event The event name.
      */
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    /**
      * Remove the listeners of a given event.
      * @param event The event name.
      * @param fn Only remove the listeners that match this function.
      * @param context Only remove the listeners that have this context.
      * @param once Only remove one-time listeners.
      */
    def off(event: String): this.type = js.native
    def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any, once: Boolean): this.type = js.native
    def off(event: String, fn: js.Function): this.type = js.native
    def off(event: String, fn: js.Function, context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def off(event: String, fn: js.Function, context: js.Any): this.type = js.native
    def off(event: String, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
    def off(event: js.Symbol): this.type = js.native
    def off(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def off(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def off(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.Any, once: Boolean): this.type = js.native
    def off(event: js.Symbol, fn: js.Function): this.type = js.native
    def off(event: js.Symbol, fn: js.Function, context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def off(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
    def off(event: js.Symbol, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
    /**
      * Add a listener for a given event.
      * @param event The event name.
      * @param fn The listener function.
      * @param context The context to invoke the listener with. Default this.
      */
    def on(event: String, fn: js.Function): this.type = js.native
    def on(event: String, fn: js.Function, context: js.Any): this.type = js.native
    def on(event: js.Symbol, fn: js.Function): this.type = js.native
    def on(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
    /**
      * Add a one-time listener for a given event.
      * @param event The event name.
      * @param fn The listener function.
      * @param context The context to invoke the listener with. Default this.
      */
    def once(event: String, fn: js.Function): this.type = js.native
    def once(event: String, fn: js.Function, context: js.Any): this.type = js.native
    def once(event: js.Symbol, fn: js.Function): this.type = js.native
    def once(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
    /**
      * Remove all listeners, or those of the specified event.
      * @param event The event name.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    /**
      * Remove the listeners of a given event.
      * @param event The event name.
      * @param fn Only remove the listeners that match this function.
      * @param context Only remove the listeners that have this context.
      * @param once Only remove one-time listeners.
      */
    def removeListener(event: String): this.type = js.native
    def removeListener(event: String, fn: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def removeListener(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def removeListener(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any, once: Boolean): this.type = js.native
    def removeListener(event: String, fn: js.Function): this.type = js.native
    def removeListener(event: String, fn: js.Function, context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def removeListener(event: String, fn: js.Function, context: js.Any): this.type = js.native
    def removeListener(event: String, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
    def removeListener(event: js.Symbol): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.Any, once: Boolean): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function, context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
    /**
      * Removes all listeners.
      */
    def shutdown(): Unit = js.native
  }
  
}

