package typings.mitt.mittNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter extends js.Object {
  /**
  		 * Invoke all handlers for the given type.
  		 * If present, `"*"` handlers are invoked prior to type-matched handlers.
  		 * 
  		 * @param {string} type The event type to invoke
  		 * @param {any} [event] An event object, passed to each handler
  		 * 
  		 * @memberOf Mitt
  		 */
  def emit(`type`: String): Unit = js.native
  def emit(`type`: String, event: js.Any): Unit = js.native
  /**
  		 * Function to call in response to the given event
  		 * 
  		 * @param {string} type Type of event to unregister `handler` from, or `"*"`
  		 * @param {Handler} handler Handler function to remove.
  		 * 
  		 * @memberOf Mitt
  		 */
  def off(`type`: String, handler: Handler): Unit = js.native
  /**
  		 * Register an event handler for the given type.
  		 * 
  		 * @param {string} type Type of event to listen for, or `"*"` for all events.
  		 * @param {Handler} handler Function to call in response to the given event.
  		 * 
  		 * @memberOf Mitt
  		 */
  def on(`type`: String, handler: Handler): Unit = js.native
}

