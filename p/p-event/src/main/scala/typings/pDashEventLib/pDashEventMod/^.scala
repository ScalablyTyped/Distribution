package typings
package pDashEventLib.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-event", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: pDashEventLib.Anon_Default = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: java.lang.String): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: java.lang.String,
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
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: java.lang.String,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: java.lang.String,
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Array[java.lang.String | js.Symbol]): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[java.lang.String | js.Symbol],
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[java.lang.String | js.Symbol],
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[java.lang.String | js.Symbol],
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Symbol): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def apply[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  // TODO: Remove this for the next major release
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: java.lang.String): CancelablePromise[EmittedType] = js.native
  // TODO: Remove this for the next major release
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: java.lang.String,
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
  // TODO: Remove this for the next major release
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: java.lang.String,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: java.lang.String,
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Array[java.lang.String | js.Symbol]): CancelablePromise[EmittedType] = js.native
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[java.lang.String | js.Symbol],
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[java.lang.String | js.Symbol],
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[java.lang.String | js.Symbol],
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Symbol): CancelablePromise[EmittedType] = js.native
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = js.native
  def default[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: java.lang.String): stdLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: java.lang.String,
    filter: FilterFunction[js.Array[EmittedType]]
  ): stdLib.AsyncIterableIterator[EmittedType] = js.native
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
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: java.lang.String,
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): stdLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: java.lang.String,
    options: IteratorOptions[js.Array[EmittedType]]
  ): stdLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Array[java.lang.String | js.Symbol]): stdLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[java.lang.String | js.Symbol],
    filter: FilterFunction[js.Array[EmittedType]]
  ): stdLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[java.lang.String | js.Symbol],
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): stdLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[java.lang.String | js.Symbol],
    options: IteratorOptions[js.Array[EmittedType]]
  ): stdLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Symbol): stdLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[js.Array[EmittedType]]
  ): stdLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): stdLib.AsyncIterableIterator[EmittedType] = js.native
  def iterator[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: IteratorOptions[js.Array[EmittedType]]
  ): stdLib.AsyncIterableIterator[EmittedType] = js.native
  /**
  	Wait for multiple event emissions. Returns an array.
  	*/
  def multiple[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: java.lang.String,
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
  def multiple[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: java.lang.String,
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
  def multiple[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[java.lang.String | js.Symbol],
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
  def multiple[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[java.lang.String | js.Symbol],
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
  def multiple[EventName /* <: java.lang.String | js.Symbol */, EmittedType /* <: js.Array[_] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
  def multiple[EventName /* <: java.lang.String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[js.Array[EmittedType]] = js.native
}

