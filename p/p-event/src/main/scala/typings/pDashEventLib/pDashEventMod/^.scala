package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-event", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: java.lang.String | js.Symbol | (js.Array[java.lang.String | js.Symbol])
  ): pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[T] = js.native
  def apply[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: java.lang.String | js.Symbol | (js.Array[java.lang.String | js.Symbol]),
    filter: pDashEventLib.pDashEventMod.pEventNs.FilterFn[T]
  ): pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[T] = js.native
  def apply[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: java.lang.String | js.Symbol | (js.Array[java.lang.String | js.Symbol]),
    options: pDashEventLib.pDashEventMod.pEventNs.Options[T]
  ): pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[T] = js.native
  /**
    * Promisify an event by waiting for it to be emitted.
    *
    * Returns a `Promise` that is fulfilled when emitter emits an event matching `event`, or rejects if emitter emits
    * any of the events defined in the `rejectionEvents` option.
    *
    * **Note**: `event` is a string for a single event type, for example, `'data'`. To listen on multiple
    * events, pass an array of strings, such as `['started', 'stopped']`.
    *
    * The returned promise has a `.cancel()` method, which when called, removes the event listeners and causes the promise to never be settled.
    *
    * @param emitter Event emitter object. Should have either a `.on()`/`.addListener()`/`.addEventListener()` and
    * `.off()`/`.removeListener()`/`.removeEventListener()` method, like the [Node.js `EventEmitter`](https://nodejs.org/api/events.html) and
    * [DOM events](https://developer.mozilla.org/en-US/docs/Web/Events).
    * @param event Name of the event or events to listen to. If the same event is defined both here and in
    * `rejectionEvents`, this one takes priority.
    */
  def apply[T, TRest](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, TRest],
    event: java.lang.String | js.Symbol | (js.Array[java.lang.String | js.Symbol]),
    options: pDashEventLib.pDashEventMod.pEventNs.MultiArgsOptions[T | TRest]
  ): pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[js.Array[T | TRest]] = js.native
  def iterator[T](emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _], event: java.lang.String): stdLib.AsyncIterableIterator[T] = js.native
  def iterator[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: java.lang.String,
    filter: pDashEventLib.pDashEventMod.pEventNs.FilterFn[T]
  ): stdLib.AsyncIterableIterator[T] = js.native
  def iterator[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: java.lang.String,
    options: pDashEventLib.pDashEventMod.pEventNs.IteratorOptions[T]
  ): stdLib.AsyncIterableIterator[T] = js.native
  def iterator[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: js.Array[java.lang.String | js.Symbol]
  ): stdLib.AsyncIterableIterator[T] = js.native
  def iterator[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: js.Array[java.lang.String | js.Symbol],
    filter: pDashEventLib.pDashEventMod.pEventNs.FilterFn[T]
  ): stdLib.AsyncIterableIterator[T] = js.native
  def iterator[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: js.Array[java.lang.String | js.Symbol],
    options: pDashEventLib.pDashEventMod.pEventNs.IteratorOptions[T]
  ): stdLib.AsyncIterableIterator[T] = js.native
  def iterator[T](emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _], event: js.Symbol): stdLib.AsyncIterableIterator[T] = js.native
  def iterator[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: js.Symbol,
    filter: pDashEventLib.pDashEventMod.pEventNs.FilterFn[T]
  ): stdLib.AsyncIterableIterator[T] = js.native
  def iterator[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: js.Symbol,
    options: pDashEventLib.pDashEventMod.pEventNs.IteratorOptions[T]
  ): stdLib.AsyncIterableIterator[T] = js.native
  /**
    * Returns an [async iterator](http://2ality.com/2016/10/asynchronous-iteration.html) that lets you asynchronously
    * iterate over events of `event` emitted from `emitter`. The iterator ends when `emitter` emits an event matching
    * any of the events defined in `resolutionEvents`, or rejects if `emitter` emits any of the events defined in
    * the `rejectionEvents` option.
    */
  def iterator[T, TRest](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, TRest],
    event: java.lang.String,
    options: pDashEventLib.pDashEventMod.pEventNs.IteratorMultiArgsOptions[T | TRest]
  ): stdLib.AsyncIterableIterator[js.Array[T | TRest]] = js.native
  def iterator[T, TRest](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, TRest],
    event: js.Array[java.lang.String | js.Symbol],
    options: pDashEventLib.pDashEventMod.pEventNs.IteratorMultiArgsOptions[T | TRest]
  ): stdLib.AsyncIterableIterator[js.Array[T | TRest]] = js.native
  def iterator[T, TRest](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, TRest],
    event: js.Symbol,
    options: pDashEventLib.pDashEventMod.pEventNs.IteratorMultiArgsOptions[T | TRest]
  ): stdLib.AsyncIterableIterator[js.Array[T | TRest]] = js.native
  def multiple[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: java.lang.String,
    options: pDashEventLib.pDashEventMod.pEventNs.MultipleOptions[T]
  ): pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[js.Array[T]] = js.native
  def multiple[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: js.Array[java.lang.String | js.Symbol],
    options: pDashEventLib.pDashEventMod.pEventNs.MultipleOptions[T]
  ): pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[js.Array[T]] = js.native
  def multiple[T](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, _],
    event: js.Symbol,
    options: pDashEventLib.pDashEventMod.pEventNs.MultipleOptions[T]
  ): pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[js.Array[T]] = js.native
  /**
    * Wait for multiple event emissions. Returns an array.
    */
  def multiple[T, TRest](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, TRest],
    event: java.lang.String,
    options: pDashEventLib.pDashEventMod.pEventNs.MultipleMultiArgsOptions[T | TRest]
  ): pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[js.Array[js.Array[T | TRest]]] = js.native
  def multiple[T, TRest](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, TRest],
    event: js.Array[java.lang.String | js.Symbol],
    options: pDashEventLib.pDashEventMod.pEventNs.MultipleMultiArgsOptions[T | TRest]
  ): pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[js.Array[js.Array[T | TRest]]] = js.native
  def multiple[T, TRest](
    emitter: pDashEventLib.pDashEventMod.pEventNs.Emitter[T, TRest],
    event: js.Symbol,
    options: pDashEventLib.pDashEventMod.pEventNs.MultipleMultiArgsOptions[T | TRest]
  ): pDashCancelableLib.pDashCancelableMod.PCancelableNs.PCancelable[js.Array[js.Array[T | TRest]]] = js.native
}

