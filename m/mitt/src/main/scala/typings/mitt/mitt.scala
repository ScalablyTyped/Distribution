package typings.mitt

import org.scalablytyped.runtime.StringDictionary
import typings.mitt.mittStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mitt {
  
  @js.native
  trait Emitter extends StObject {
    
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
    def off(`type`: Asterisk, handler: WildcardHandler): Unit = js.native
    
    /**
    		 * Register an event handler for the given type.
    		 *
    		 * @param {string} type Type of event to listen for, or `"*"` for all events.
    		 * @param {Handler} handler Function to call in response to the given event.
    		 *
    		 * @memberOf Mitt
    		 */
    def on(`type`: String, handler: Handler): Unit = js.native
    def on(`type`: Asterisk, handler: WildcardHandler): Unit = js.native
  }
  
  type Handler = js.Function1[/* event */ js.UndefOr[js.Any], Unit]
  
  type MittStatic = js.Function1[/* all */ js.UndefOr[StringDictionary[js.Array[Handler]]], Emitter]
  
  type WildcardHandler = js.Function2[/* type */ js.UndefOr[String], /* event */ js.UndefOr[js.Any], Unit]
}
