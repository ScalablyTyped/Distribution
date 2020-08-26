package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A high performance event emitter
  *
  * @see {@link https://github.com/primus/eventemitter3}
  *
  * @memberof PIXI.utils
  * @class EventEmitter
  * @type {EventEmitter}
  */
@js.native
trait EventEmitter extends js.Object {
  /**
    * Alias method for `on`
    */
  //tslint:disable-next-line:ban-types forbidden-types
  def addListener(event: String, fn: js.Function): this.type = js.native
  def addListener(event: String, fn: js.Function, context: js.Any): this.type = js.native
  def addListener(event: js.Symbol, fn: js.Function): this.type = js.native
  def addListener(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
  /**
    * Calls each of the listeners registered for a given event.
    *
    * @param {(string | symbol)} event The event name.
    * @param {...*} args Arguments that are passed to registered listeners
    * @returns {boolean} `true` if the event had listeners, else `false`.
    */
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  /**
    * Return an array listing the events for which the emitter has registered listeners.
    *
    * @returns {(string | symbol)[]}
    */
  def eventNames(): js.Array[String | js.Symbol] = js.native
  /**
    * Return the number of listeners listening to a given event.
    *
    * @param {(string | symbol)} event The event name.
    * @returns {number}
    */
  def listenerCount(event: String): Double = js.native
  def listenerCount(event: js.Symbol): Double = js.native
  /**
    * Return the listeners registered for a given event.
    *
    * @param {(string | symbol)} event The event name.
    * @returns {Function[]}
    */
  //tslint:disable-next-line:ban-types forbidden-types
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /**
    * Alias method for `removeListener`
    */
  //tslint:disable-next-line:ban-types forbidden-types
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
    *
    * @param {(string | symbol)} event The event name.
    * @param {Function} fn The listener function.
    * @param {*} [context=this] The context to invoke the listener with.
    * @returns {EventEmitter} `this`.
    */
  //tslint:disable-next-line:ban-types forbidden-types
  def on(event: String, fn: js.Function): this.type = js.native
  def on(event: String, fn: js.Function, context: js.Any): this.type = js.native
  def on(event: js.Symbol, fn: js.Function): this.type = js.native
  def on(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
  /**
    * Add a one-time listener for a given event.
    *
    * @param {(string | symbol)} event The event name.
    * @param {Function} fn The listener function.
    * @param {*} [context=this] The context to invoke the listener with.
    * @returns {EventEmitter} `this`.
    */
  //tslint:disable-next-line:ban-types forbidden-types
  def once(event: String, fn: js.Function): this.type = js.native
  def once(event: String, fn: js.Function, context: js.Any): this.type = js.native
  def once(event: js.Symbol, fn: js.Function): this.type = js.native
  def once(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
  /**
    * Remove all listeners, or those of the specified event.
    *
    * @param {(string | symbol)} event The event name.
    * @returns {EventEmitter} `this`.
    */
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
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
  //tslint:disable-next-line:ban-types forbidden-types
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
}

