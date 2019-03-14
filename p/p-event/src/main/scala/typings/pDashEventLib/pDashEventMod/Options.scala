package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[EmittedType /* <: pDashEventLib.Array[_] */] extends js.Object {
  /**
  	 * Filter function for accepting an event.
  	 *
  	 * @example
  	 *
  	 * const pEvent = require('p-event');
  	 * const emitter = require('./some-event-emitter');
  	 *
  	 * (async () => {
  	 * 	const result = await pEvent(emitter, '🦄', value => value > 3);
  	 * 	// Do something with first 🦄 event with a value greater than 3
  	 * })();
  	 */
  val filter: js.UndefOr[FilterFunction[EmittedType]] = js.undefined
  /**
  	 * By default, the promisified function will only return the first argument from the event callback, which works fine for most APIs. This option can be useful for APIs that return multiple arguments in the callback. Turning this on will make it return an array of all arguments from the callback, instead of just the first argument. This also applies to rejections.
  	 *
  	 * @default false
  	 *
  	 * @example
  	 *
  	 * const pEvent = require('p-event');
  	 * const emitter = require('./some-event-emitter');
  	 *
  	 * (async () => {
  	 * 	const [foo, bar] = await pEvent(emitter, 'finish', {multiArgs: true});
  	 * })();
  	 */
  val multiArgs: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Events that will reject the promise.
  	 *
  	 * @default ['error']
  	 */
  val rejectionEvents: js.UndefOr[pDashEventLib.Array[java.lang.String | js.Symbol]] = js.undefined
  /**
  	 * Time in milliseconds before timing out.
  	 *
  	 * @default Infinity
  	 */
  val timeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[EmittedType /* <: pDashEventLib.Array[_] */](
    filter: FilterFunction[EmittedType] = null,
    multiArgs: js.UndefOr[scala.Boolean] = js.undefined,
    rejectionEvents: pDashEventLib.Array[java.lang.String | js.Symbol] = null,
    timeout: scala.Int | scala.Double = null
  ): Options[EmittedType] = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs)
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[EmittedType]]
  }
}

