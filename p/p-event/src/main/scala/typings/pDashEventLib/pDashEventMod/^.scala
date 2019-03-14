package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-event", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[EmittedType](emitter: Emitter[js.Array[EmittedType]], event: java.lang.String): CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: java.lang.String,
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  /**
    * Promisify an event by waiting for it to be emitted.
    *
    * @param emitter - Event emitter object. Should have either a `.on()`/`.addListener()`/`.addEventListener()` and `.off()`/`.removeListener()`/`.removeEventListener()` method, like the [Node.js `EventEmitter`](https://nodejs.org/api/events.html) and [DOM events](https://developer.mozilla.org/en-US/docs/Web/Events).
    * @param event - Name of the event or events to listen to. If the same event is defined both here and in `rejectionEvents`, this one takes priority. **Note**: `event` is a string for a single event type, for example, `'data'`. To listen on multiple events, pass an array of strings, such as `['started', 'stopped']`.
    * @returns A `Promise` that is fulfilled when emitter emits an event matching `event`, or rejects if emitter emits any of the events defined in the `rejectionEvents` option. The returned promise has a `.cancel()` method, which when called, removes the event listeners and causes the promise to never be settled.
    */
  def default[EmittedType /* <: pDashEventLib.Array[_] */](
    emitter: Emitter[EmittedType],
    event: java.lang.String,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: java.lang.String,
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def default[EmittedType](emitter: Emitter[js.Array[EmittedType]], event: js.Symbol): CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def default[EmittedType /* <: pDashEventLib.Array[_] */](emitter: Emitter[EmittedType], event: js.Symbol, options: MultiArgumentsOptions[EmittedType]): CancelablePromise[EmittedType] = js.native
  def default[EmittedType](emitter: Emitter[js.Array[EmittedType]], event: js.Symbol, options: Options[js.Array[EmittedType]]): CancelablePromise[EmittedType] = js.native
  def default[EmittedType](emitter: Emitter[js.Array[EmittedType]], event: pDashEventLib.Array[java.lang.String | js.Symbol]): CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def default[EmittedType /* <: pDashEventLib.Array[_] */](
    emitter: Emitter[EmittedType],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def iterator[EmittedType](emitter: Emitter[js.Array[EmittedType]], event: java.lang.String): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: java.lang.String,
    filter: FilterFunction[js.Array[EmittedType]]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType /* <: pDashEventLib.Array[_] */](
    emitter: Emitter[EmittedType],
    event: java.lang.String,
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: java.lang.String,
    options: IteratorOptions[js.Array[EmittedType]]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](emitter: Emitter[js.Array[EmittedType]], event: js.Symbol): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[js.Array[EmittedType]]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType /* <: pDashEventLib.Array[_] */](
    emitter: Emitter[EmittedType],
    event: js.Symbol,
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: js.Symbol,
    options: IteratorOptions[js.Array[EmittedType]]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](emitter: Emitter[js.Array[EmittedType]], event: pDashEventLib.Array[java.lang.String | js.Symbol]): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    filter: FilterFunction[js.Array[EmittedType]]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType /* <: pDashEventLib.Array[_] */](
    emitter: Emitter[EmittedType],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: IteratorOptions[js.Array[EmittedType]]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def multiple[EmittedType /* <: pDashEventLib.Array[_] */](
    emitter: Emitter[EmittedType],
    event: java.lang.String,
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[pDashEventLib.Array[EmittedType]] = js.native
  def multiple[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: java.lang.String,
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[pDashEventLib.Array[EmittedType]] = js.native
  def multiple[EmittedType /* <: pDashEventLib.Array[_] */](
    emitter: Emitter[EmittedType],
    event: js.Symbol,
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[pDashEventLib.Array[EmittedType]] = js.native
  def multiple[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: js.Symbol,
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[pDashEventLib.Array[EmittedType]] = js.native
  def multiple[EmittedType /* <: pDashEventLib.Array[_] */](
    emitter: Emitter[EmittedType],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[pDashEventLib.Array[EmittedType]] = js.native
  def multiple[EmittedType](
    emitter: Emitter[js.Array[EmittedType]],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[pDashEventLib.Array[EmittedType]] = js.native
}

