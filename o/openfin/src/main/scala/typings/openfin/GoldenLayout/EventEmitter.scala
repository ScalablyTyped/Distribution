package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  /**
    * Notify listeners of an event and pass arguments along
    * @param eventName The name of the event to emit
    */
  def emit(eventName: String): Unit = js.native
  def emit(eventName: String, arg1: js.Any): Unit = js.native
  def emit(eventName: String, arg1: js.Any, arg2: js.Any, argN: js.Any*): Unit = js.native
  /**
    * Alias for unbind
    */
  def off(eventName: String): Unit = js.native
  def off(eventName: String, callback: js.Function): Unit = js.native
  def off(eventName: String, callback: js.Function, context: js.Any): Unit = js.native
  /**
    * Subscribe to an event
    * @param eventName The name of the event to describe to
    * @param callback The function that should be invoked when the event occurs
    * @param context The value of the this pointer in the callback function
    */
  def on(eventName: String, callback: js.Function): Unit = js.native
  def on(eventName: String, callback: js.Function, context: js.Any): Unit = js.native
  /**
    * Alias for emit
    */
  def trigger(eventName: String): Unit = js.native
  def trigger(eventName: String, arg1: js.Any): Unit = js.native
  def trigger(eventName: String, arg1: js.Any, arg2: js.Any, argN: js.Any*): Unit = js.native
  /**
    * Unsubscribes either all listeners if just an eventName is provided, just a specific callback if invoked with
    * eventName and callback or just a specific callback with a specific context if invoked with all three
    * arguments.
    * @param eventName The name of the event to unsubscribe from
    * @param callback The function that should be invoked when the event occurs
    * @param context The value of the this pointer in the callback function
    */
  def unbind(eventName: String): Unit = js.native
  def unbind(eventName: String, callback: js.Function): Unit = js.native
  def unbind(eventName: String, callback: js.Function, context: js.Any): Unit = js.native
}

