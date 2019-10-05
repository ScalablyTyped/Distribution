package typings.pDashEvent.pDashEventMod

import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-event", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pEvent */ js.Any = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: String): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  /**
  	Promisify an event by waiting for it to be emitted.
  	@param emitter - Event emitter object. Should have either a `.on()`/`.addListener()`/`.addEventListener()` and `.off()`/`.removeListener()`/`.removeEventListener()` method, like the [Node.js `EventEmitter`](https://nodejs.org/api/events.html) and [DOM events](https://developer.mozilla.org/en-US/docs/Web/Events).
  	@param event - Name of the event or events to listen to. If the same event is defined both here and in `rejectionEvents`, this one takes priority.*Note**: `event` is a string for a single event type, for example, `'data'`. To listen on multiple events, pass an array of strings, such as `['started', 'stopped']`.
  	@returns Fulfills when emitter emits an event matching `event`, or rejects if emitter emits any of the events defined in the `rejectionEvents` option. The returned promise has a `.cancel()` method, which when called, removes the event listeners and causes the promise to never be settled.
  	@example
  	```
  	// In Node.js:
  	import pEvent = require('p-event');
  	import emitter from './some-event-emitter';
  	(async () => {
  		try {
  			const result = await pEvent(emitter, 'finish');
  			// `emitter` emitted a `finish` event
  			console.log(result);
  		} catch (error) {
  			// `emitter` emitted an `error` event
  			console.error(error);
  		}
  	})();
  	// In the browser:
  	(async () => {
  		await pEvent(document, 'DOMContentLoaded');
  		console.log('😎');
  	})();
  	```
  	*/
  def apply[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: String,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Array[String | js.Symbol]): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[String | js.Symbol],
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Symbol): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: String): AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    filter: FilterFunction[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = js.native
  /**
  	@returns An [async iterator](http://2ality.com/2016/10/asynchronous-iteration.html) that lets you asynchronously iterate over events of `event` emitted from `emitter`. The iterator ends when `emitter` emits an event matching any of the events defined in `resolutionEvents`, or rejects if `emitter` emits any of the events defined in the `rejectionEvents` option.
  	@example
  	```
  	import pEvent = require('p-event');
  	import emitter from './some-event-emitter';
  	(async () => {
  		const asyncIterator = pEvent.iterator(emitter, 'data', {
  			resolutionEvents: ['finish']
  		});
  		for await (const event of asyncIterator) {
  			console.log(event);
  		}
  	})();
  	```
  	*/
  def iterator[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: String,
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    options: IteratorOptions[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Array[String | js.Symbol]): AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    filter: FilterFunction[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[String | js.Symbol],
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    options: IteratorOptions[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Symbol): AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: IteratorOptions[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = js.native
  /**
  	Wait for multiple event emissions. Returns an array.
  	*/
  def multiple[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: String,
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
  def multiple[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
  def multiple[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[String | js.Symbol],
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
  def multiple[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
  def multiple[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
  def multiple[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
}

