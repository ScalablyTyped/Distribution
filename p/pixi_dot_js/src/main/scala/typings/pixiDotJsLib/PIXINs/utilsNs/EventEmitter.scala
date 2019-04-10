package typings
package pixiDotJsLib.PIXINs.utilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/primus/eventemitter3
@JSGlobal("PIXI.utils.EventEmitter")
@js.native
/**
  * Minimal EventEmitter interface that is molded against the Node.js
  * EventEmitter interface.
  *
  * @constructor
  * @api public
  */
class EventEmitter () extends js.Object {
  /**
    * Alias method for `on`
    */
  def addListener(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def addListener(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  def addListener(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def addListener(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  /**
    * Calls each of the listeners registered for a given event.
    *
    * @param {(string | symbol)} event The event name.
    * @param {...*} args Arguments that are passed to registered listeners
    * @returns {boolean} `true` if the event had listeners, else `false`.
    */
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /**
    * Return an array listing the events for which the emitter has registered listeners.
    *
    * @returns {(string | symbol)[]}
    */
  def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  /**
    * Return the listeners registered for a given event.
    *
    * @param {(string | symbol)} event The event name.
    * @returns {Function[]}
    */
  //tslint:disable-next-line:ban-types forbidden-types
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /**
    * Check if there listeners for a given event.
    * If `exists` argument is not `true` lists listeners.
    *
    * @param {(string | symbol)} event The event name.
    * @param {boolean} exists Only check if there are listeners.
    * @returns {boolean}
    */
  def listeners(event: java.lang.String, exists: scala.Boolean): scala.Boolean = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol, exists: scala.Boolean): scala.Boolean = js.native
  /**
    * Alias method for `removeListener`
    */
  def off(event: java.lang.String): this.type = js.native
  def off(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def off(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  def off(
    event: java.lang.String,
    fn: js.Function1[/* repeated */ js.Any, _],
    context: js.Any,
    once: scala.Boolean
  ): this.type = js.native
  def off(event: js.Symbol): this.type = js.native
  def off(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def off(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  def off(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, once: scala.Boolean): this.type = js.native
  /**
    * Add a listener for a given event.
    *
    * @param {(string | symbol)} event The event name.
    * @param {Function} fn The listener function.
    * @param {*} [context=this] The context to invoke the listener with.
    * @returns {EventEmitter} `this`.
    */
  def on(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def on(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  def on(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def on(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  /**
    * Add a one-time listener for a given event.
    *
    * @param {(string | symbol)} event The event name.
    * @param {Function} fn The listener function.
    * @param {*} [context=this] The context to invoke the listener with.
    * @returns {EventEmitter} `this`.
    */
  def once(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def once(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  def once(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def once(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  /**
    * Remove all listeners, or those of the specified event.
    *
    * @param {(string | symbol)} event The event name.
    * @returns {EventEmitter} `this`.
    */
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: java.lang.String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  /**
    * Remove the listeners of a given event.
    *
    * @param {(string | symbol)} event The event name.
    * @param {Function} fn Only remove the listeners that match this function.
    * @param {*} context Only remove the listeners that have this context.
    * @param {boolean} once Only remove one-time listeners.
    * @returns {EventEmitter} `this`.
    */
  def removeListener(event: java.lang.String): this.type = js.native
  def removeListener(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def removeListener(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  def removeListener(
    event: java.lang.String,
    fn: js.Function1[/* repeated */ js.Any, _],
    context: js.Any,
    once: scala.Boolean
  ): this.type = js.native
  def removeListener(event: js.Symbol): this.type = js.native
  def removeListener(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  def removeListener(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  def removeListener(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, once: scala.Boolean): this.type = js.native
  /**
    * This function doesn"t apply anymore.
    * @deprecated
    */
  def setMaxListeners(): this.type = js.native
}

/* static members */
@JSGlobal("PIXI.utils.EventEmitter")
@js.native
object EventEmitter extends js.Object {
  var EventEmitter: pixiDotJsLib.Anon_Prefixed = js.native
  var prefixed: java.lang.String | scala.Boolean = js.native
}

