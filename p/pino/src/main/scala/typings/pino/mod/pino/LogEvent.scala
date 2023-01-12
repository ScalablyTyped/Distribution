package typings.pino.mod.pino

import typings.pino.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A data structure representing a log message, it represents the arguments passed to a logger statement, the level
  * at which they were logged and the hierarchy of child bindings.
  *
  * @description By default serializers are not applied to log output in the browser, but they will always be applied
  * to `messages` and `bindings` in the `logEvent` object. This allows  us to ensure a consistent format for all
  * values between server and client.
  */
trait LogEvent extends StObject {
  
  /**
    * Represents each child logger (if any), and the relevant bindings.
    *
    * @description For instance, given `logger.child({a: 1}).child({b: 2}).info({c: 3})`, the bindings array would
    * hold `[{a: 1}, {b: 2}]` and the `messages` array would be `[{c: 3}]`. The `bindings` are ordered according to
    * their position in the child logger hierarchy, with the lowest index being the top of the hierarchy.
    */
  var bindings: js.Array[Bindings]
  
  /**
    * Holds the `label` (for instance `info`), and the corresponding numerical `value` (for instance `30`).
    * This could be important in cases where client side level values and labels differ from server side.
    */
  var level: Label
  
  /**
    * All arguments passed to logger method, (for instance `logger.info('a', 'b', 'c')` would result in `messages`
    * array `['a', 'b', 'c']`).
    */
  var messages: js.Array[Any]
  
  /**
    * Unix epoch timestamp in milliseconds, the time is taken from the moment the logger method is called.
    */
  var ts: Double
}
object LogEvent {
  
  inline def apply(bindings: js.Array[Bindings], level: Label, messages: js.Array[Any], ts: Double): LogEvent = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogEvent] (val x: Self) extends AnyVal {
    
    inline def setBindings(value: js.Array[Bindings]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsVarargs(value: Bindings*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setLevel(value: Label): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[Any]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Any*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
