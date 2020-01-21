package typings.pino.mod

import typings.pino.AnonLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A data structure representing a log message, it represents the arguments passed to a logger statement, the level
  * at which they were logged and the hierarchy of child bindings.
  *
  * @description By default serializers are not applied to log output in the browser, but they will always be applied
  * to `messages` and `bindings` in the `logEvent` object. This allows  us to ensure a consistent format for all
  * values between server and client.
  */
trait LogEvent extends js.Object {
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
  var level: AnonLabel
  /**
    * All arguments passed to logger method, (for instance `logger.info('a', 'b', 'c')` would result in `messages`
    * array `['a', 'b', 'c']`).
    */
  var messages: js.Array[_]
  /**
    * Unix epoch timestamp in milliseconds, the time is taken from the moment the logger method is called.
    */
  var ts: Double
}

object LogEvent {
  @scala.inline
  def apply(bindings: js.Array[Bindings], level: AnonLabel, messages: js.Array[_], ts: Double): LogEvent = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogEvent]
  }
}

