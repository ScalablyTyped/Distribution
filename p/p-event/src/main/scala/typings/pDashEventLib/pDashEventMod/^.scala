package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-event", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[EmittedType](emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _], event: java.lang.String): pDashEventLib.pDashEventMod.CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: java.lang.String,
    filter: pDashEventLib.pDashEventMod.FilterFunction[EmittedType]
  ): pDashEventLib.pDashEventMod.CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: java.lang.String,
    options: pDashEventLib.pDashEventMod.Options[EmittedType]
  ): pDashEventLib.pDashEventMod.CancelablePromise[EmittedType] = js.native
  def default[EmittedType](emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _], event: js.Symbol): pDashEventLib.pDashEventMod.CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: js.Symbol,
    filter: pDashEventLib.pDashEventMod.FilterFunction[EmittedType]
  ): pDashEventLib.pDashEventMod.CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: js.Symbol,
    options: pDashEventLib.pDashEventMod.Options[EmittedType]
  ): pDashEventLib.pDashEventMod.CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: pDashEventLib.Array[java.lang.String | js.Symbol]
  ): pDashEventLib.pDashEventMod.CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    filter: pDashEventLib.pDashEventMod.FilterFunction[EmittedType]
  ): pDashEventLib.pDashEventMod.CancelablePromise[EmittedType] = js.native
  def default[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: pDashEventLib.pDashEventMod.Options[EmittedType]
  ): pDashEventLib.pDashEventMod.CancelablePromise[EmittedType] = js.native
  /**
    * Promisify an event by waiting for it to be emitted.
    *
    * @param emitter - Event emitter object. Should have either a `.on()`/`.addListener()`/`.addEventListener()` and `.off()`/`.removeListener()`/`.removeEventListener()` method, like the [Node.js `EventEmitter`](https://nodejs.org/api/events.html) and [DOM events](https://developer.mozilla.org/en-US/docs/Web/Events).
    * @param event - Name of the event or events to listen to. If the same event is defined both here and in `rejectionEvents`, this one takes priority. **Note**: `event` is a string for a single event type, for example, `'data'`. To listen on multiple events, pass an array of strings, such as `['started', 'stopped']`.
    * @returns A `Promise` that is fulfilled when emitter emits an event matching `event`, or rejects if emitter emits any of the events defined in the `rejectionEvents` option. The returned promise has a `.cancel()` method, which when called, removes the event listeners and causes the promise to never be settled.
    */
  def default[EmittedType, EmittedTypeRest](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, EmittedTypeRest],
    event: java.lang.String,
    options: pDashEventLib.pDashEventMod.MultiArgumentsOptions[EmittedType | EmittedTypeRest]
  ): pDashEventLib.pDashEventMod.CancelablePromise[pDashEventLib.Array[EmittedType | EmittedTypeRest]] = js.native
  def default[EmittedType, EmittedTypeRest](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, EmittedTypeRest],
    event: js.Symbol,
    options: pDashEventLib.pDashEventMod.MultiArgumentsOptions[EmittedType | EmittedTypeRest]
  ): pDashEventLib.pDashEventMod.CancelablePromise[pDashEventLib.Array[EmittedType | EmittedTypeRest]] = js.native
  def default[EmittedType, EmittedTypeRest](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, EmittedTypeRest],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: pDashEventLib.pDashEventMod.MultiArgumentsOptions[EmittedType | EmittedTypeRest]
  ): pDashEventLib.pDashEventMod.CancelablePromise[pDashEventLib.Array[EmittedType | EmittedTypeRest]] = js.native
  def iterator[EmittedType](emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _], event: java.lang.String): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: java.lang.String,
    filter: pDashEventLib.pDashEventMod.FilterFunction[EmittedType]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: java.lang.String,
    options: pDashEventLib.pDashEventMod.IteratorOptions[EmittedType]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _], event: js.Symbol): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: js.Symbol,
    filter: pDashEventLib.pDashEventMod.FilterFunction[EmittedType]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: js.Symbol,
    options: pDashEventLib.pDashEventMod.IteratorOptions[EmittedType]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: pDashEventLib.Array[java.lang.String | js.Symbol]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    filter: pDashEventLib.pDashEventMod.FilterFunction[EmittedType]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: pDashEventLib.pDashEventMod.IteratorOptions[EmittedType]
  ): pDashEventLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EmittedType, EmittedTypeRest](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, EmittedTypeRest],
    event: java.lang.String,
    options: pDashEventLib.pDashEventMod.IteratorMultiArgumentsOptions[EmittedType | EmittedTypeRest]
  ): pDashEventLib.AsyncIterableIterator[pDashEventLib.Array[EmittedType | EmittedTypeRest]] = js.native
  def iterator[EmittedType, EmittedTypeRest](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, EmittedTypeRest],
    event: js.Symbol,
    options: pDashEventLib.pDashEventMod.IteratorMultiArgumentsOptions[EmittedType | EmittedTypeRest]
  ): pDashEventLib.AsyncIterableIterator[pDashEventLib.Array[EmittedType | EmittedTypeRest]] = js.native
  def iterator[EmittedType, EmittedTypeRest](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, EmittedTypeRest],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: pDashEventLib.pDashEventMod.IteratorMultiArgumentsOptions[EmittedType | EmittedTypeRest]
  ): pDashEventLib.AsyncIterableIterator[pDashEventLib.Array[EmittedType | EmittedTypeRest]] = js.native
  def multiple[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: java.lang.String,
    options: pDashEventLib.pDashEventMod.MultipleOptions[EmittedType]
  ): pDashEventLib.pDashEventMod.CancelablePromise[pDashEventLib.Array[EmittedType]] = js.native
  def multiple[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: js.Symbol,
    options: pDashEventLib.pDashEventMod.MultipleOptions[EmittedType]
  ): pDashEventLib.pDashEventMod.CancelablePromise[pDashEventLib.Array[EmittedType]] = js.native
  def multiple[EmittedType](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, _],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: pDashEventLib.pDashEventMod.MultipleOptions[EmittedType]
  ): pDashEventLib.pDashEventMod.CancelablePromise[pDashEventLib.Array[EmittedType]] = js.native
  def multiple[EmittedType, EmittedTypeRest](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, EmittedTypeRest],
    event: java.lang.String,
    options: pDashEventLib.pDashEventMod.MultipleMultiArgumentsOptions[EmittedType | EmittedTypeRest]
  ): pDashEventLib.pDashEventMod.CancelablePromise[pDashEventLib.Array[pDashEventLib.Array[EmittedType | EmittedTypeRest]]] = js.native
  def multiple[EmittedType, EmittedTypeRest](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, EmittedTypeRest],
    event: js.Symbol,
    options: pDashEventLib.pDashEventMod.MultipleMultiArgumentsOptions[EmittedType | EmittedTypeRest]
  ): pDashEventLib.pDashEventMod.CancelablePromise[pDashEventLib.Array[pDashEventLib.Array[EmittedType | EmittedTypeRest]]] = js.native
  def multiple[EmittedType, EmittedTypeRest](
    emitter: pDashEventLib.pDashEventMod.Emitter[EmittedType, EmittedTypeRest],
    event: pDashEventLib.Array[java.lang.String | js.Symbol],
    options: pDashEventLib.pDashEventMod.MultipleMultiArgumentsOptions[EmittedType | EmittedTypeRest]
  ): pDashEventLib.pDashEventMod.CancelablePromise[pDashEventLib.Array[pDashEventLib.Array[EmittedType | EmittedTypeRest]]] = js.native
}

