package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  /**
    * Filter function for accepting an event.
    *
    * @example
    * const pEvent = require('p-event');
    * const emitter = require('./some-event-emitter');
    *
    * (async () => {
    *     const result = await pEvent(emitter, '🦄', value => value > 3);
    *     // Do something with first 🦄 event with a value greater than 3
    * })();
    */
  var filter: js.UndefOr[FilterFn[T]] = js.undefined
  /**
    * By default, the promisified function will only return the first argument from the event callback,
    * which works fine for most APIs. This option can be useful for APIs that return multiple arguments
    * in the callback. Turning this on will make it return an array of all arguments from the callback,
    * instead of just the first argument. This also applies to rejections.
    *
    * @example
    * const pEvent = require('p-event');
    * const emitter = require('./some-event-emitter');
    *
    * (async () => {
    *    const [foo, bar] = await pEvent(emitter, 'finish', {multiArgs: true});
    * })();
    *
    * @default false
    */
  var multiArgs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Events that will reject the promise.
    * @default ['error']
    */
  var rejectionEvents: js.UndefOr[js.Array[java.lang.String | js.Symbol]] = js.undefined
  /**
    * Time in milliseconds before timing out.
    * @default Infinity
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

