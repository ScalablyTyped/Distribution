package typings.pEvent

import org.scalablytyped.runtime.Instantiable1
import typings.pEvent.pEventBooleans.`true`
import typings.std.AsyncIterableIterator
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: String): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
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
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: String,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Array[String | js.Symbol]): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[String | js.Symbol],
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Symbol): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  @scala.inline
  def apply[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: Options[js.Array[EmittedType]]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  
  @JSImport("p-event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("p-event", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pEvent */ js.Any = js.native
  
  @JSImport("p-event", "TimeoutError")
  @js.native
  def TimeoutError: Instantiable1[/* message */ js.UndefOr[String], TimeoutErrorClass] = js.native
  type TimeoutError = TimeoutErrorClass
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("p-event", "TimeoutError")
  @js.native
  class TimeoutErrorCls ()
    extends StObject
       with TimeoutErrorClass {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_TimeoutErrorClass: typings.pEvent.pEventStrings.TimeoutError = js.native
  }
  
  @scala.inline
  def TimeoutError_=(x: Instantiable1[/* message */ js.UndefOr[String], TimeoutErrorClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TimeoutError")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pEvent */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: String): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    filter: FilterFunction[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  /**
  	@returns An [async iterator](https://2ality.com/2016/10/asynchronous-iteration.html) that lets you asynchronously iterate over events of `event` emitted from `emitter`. The iterator ends when `emitter` emits an event matching any of the events defined in `resolutionEvents`, or rejects if `emitter` emits any of the events defined in the `rejectionEvents` option.
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
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: String,
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    options: IteratorOptions[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Array[String | js.Symbol]): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    filter: FilterFunction[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[String | js.Symbol],
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    options: IteratorOptions[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Symbol): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  @scala.inline
  def iterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: IteratorOptions[js.Array[EmittedType]]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  
  /**
  	Wait for multiple event emissions. Returns an array.
  	*/
  @scala.inline
  def multiple[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: String,
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  @scala.inline
  def multiple[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  @scala.inline
  def multiple[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[String | js.Symbol],
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  @scala.inline
  def multiple[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  @scala.inline
  def multiple[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  @scala.inline
  def multiple[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: MultipleOptions[js.Array[EmittedType]]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  
  type AddRemoveListener[EventName /* <: String | js.Symbol */, Arguments /* <: js.Array[js.Any] */] = js.Function2[
    /* event */ EventName, 
    /* listener */ js.Function1[/* arguments */ Arguments, Unit], 
    Unit
  ]
  
  @js.native
  trait CancelablePromise[ResolveType]
    extends js.Promise[ResolveType] {
    
    def cancel(): Unit = js.native
  }
  
  trait Emitter[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */] extends StObject {
    
    var addEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
    
    var addListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
    
    var off: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
    
    var on: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
    
    var removeEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
    
    var removeListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  }
  object Emitter {
    
    @scala.inline
    def apply[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */](): Emitter[EventName, EmittedType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Emitter[EventName, EmittedType]]
    }
    
    @scala.inline
    implicit class EmitterMutableBuilder[Self <: Emitter[?, ?], EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[js.Any] */] (val x: Self & (Emitter[EventName, EmittedType])) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
      
      @scala.inline
      def setAddListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      @scala.inline
      def setOff(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      @scala.inline
      def setOn(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setRemoveEventListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
      
      @scala.inline
      def setRemoveListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    }
  }
  
  type FilterFunction[ElementType /* <: js.Array[js.Any] */] = js.Function1[/* arguments */ ElementType, Boolean]
  
  trait IteratorMultiArgumentsOptions[EmittedType /* <: js.Array[js.Any] */]
    extends StObject
       with IteratorOptions[EmittedType] {
    
    @JSName("multiArgs")
    var multiArgs_IteratorMultiArgumentsOptions: `true`
  }
  object IteratorMultiArgumentsOptions {
    
    @scala.inline
    def apply[EmittedType /* <: js.Array[js.Any] */](): IteratorMultiArgumentsOptions[EmittedType] = {
      val __obj = js.Dynamic.literal(multiArgs = true)
      __obj.asInstanceOf[IteratorMultiArgumentsOptions[EmittedType]]
    }
    
    @scala.inline
    implicit class IteratorMultiArgumentsOptionsMutableBuilder[Self <: IteratorMultiArgumentsOptions[?], EmittedType /* <: js.Array[js.Any] */] (val x: Self & IteratorMultiArgumentsOptions[EmittedType]) extends AnyVal {
      
      @scala.inline
      def setMultiArgs(value: `true`): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
    }
  }
  
  trait IteratorOptions[EmittedType /* <: js.Array[js.Any] */]
    extends StObject
       with Options[EmittedType] {
    
    /**
    		Maximum number of events for the iterator before it ends. When the limit is reached, the iterator will be marked as `done`. This option is useful to paginate events, for example, fetching 10 events per page.
    		@default Infinity
    		*/
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
    		Events that will end the iterator.
    		@default []
    		*/
    var resolutionEvents: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
  }
  object IteratorOptions {
    
    @scala.inline
    def apply[EmittedType /* <: js.Array[js.Any] */](): IteratorOptions[EmittedType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IteratorOptions[EmittedType]]
    }
    
    @scala.inline
    implicit class IteratorOptionsMutableBuilder[Self <: IteratorOptions[?], EmittedType /* <: js.Array[js.Any] */] (val x: Self & IteratorOptions[EmittedType]) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setResolutionEvents(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "resolutionEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionEventsUndefined: Self = StObject.set(x, "resolutionEvents", js.undefined)
      
      @scala.inline
      def setResolutionEventsVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "resolutionEvents", js.Array(value :_*))
    }
  }
  
  trait MultiArgumentsOptions[EmittedType /* <: js.Array[js.Any] */]
    extends StObject
       with Options[EmittedType] {
    
    @JSName("multiArgs")
    val multiArgs_MultiArgumentsOptions: `true`
  }
  object MultiArgumentsOptions {
    
    @scala.inline
    def apply[EmittedType /* <: js.Array[js.Any] */](): MultiArgumentsOptions[EmittedType] = {
      val __obj = js.Dynamic.literal(multiArgs = true)
      __obj.asInstanceOf[MultiArgumentsOptions[EmittedType]]
    }
    
    @scala.inline
    implicit class MultiArgumentsOptionsMutableBuilder[Self <: MultiArgumentsOptions[?], EmittedType /* <: js.Array[js.Any] */] (val x: Self & MultiArgumentsOptions[EmittedType]) extends AnyVal {
      
      @scala.inline
      def setMultiArgs(value: `true`): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultipleMultiArgumentsOptions[EmittedType /* <: js.Array[js.Any] */]
    extends StObject
       with MultipleOptions[EmittedType] {
    
    @JSName("multiArgs")
    val multiArgs_MultipleMultiArgumentsOptions: `true`
  }
  object MultipleMultiArgumentsOptions {
    
    @scala.inline
    def apply[EmittedType /* <: js.Array[js.Any] */](count: Double): MultipleMultiArgumentsOptions[EmittedType] = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], multiArgs = true)
      __obj.asInstanceOf[MultipleMultiArgumentsOptions[EmittedType]]
    }
    
    @scala.inline
    implicit class MultipleMultiArgumentsOptionsMutableBuilder[Self <: MultipleMultiArgumentsOptions[?], EmittedType /* <: js.Array[js.Any] */] (val x: Self & MultipleMultiArgumentsOptions[EmittedType]) extends AnyVal {
      
      @scala.inline
      def setMultiArgs(value: `true`): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultipleOptions[EmittedType /* <: js.Array[js.Any] */]
    extends StObject
       with Options[EmittedType] {
    
    /**
    		The number of times the event needs to be emitted before the promise resolves.
    		*/
    val count: Double
    
    /**
    		Whether to resolve the promise immediately. Emitting one of the `rejectionEvents` won't throw an error.
    		__Note__: The returned array will be mutated when an event is emitted.
    		@example
    		```
    		import pEvent = require('p-event');
    		const emitter = new EventEmitter();
    		const promise = pEvent.multiple(emitter, 'hello', {
    			resolveImmediately: true,
    			count: Infinity
    		});
    		const result = await promise;
    		console.log(result);
    		//=> []
    		emitter.emit('hello', 'Jack');
    		console.log(result);
    		//=> ['Jack']
    		emitter.emit('hello', 'Mark');
    		console.log(result);
    		//=> ['Jack', 'Mark']
    		// Stops listening
    		emitter.emit('error', new Error('😿'));
    		emitter.emit('hello', 'John');
    		console.log(result);
    		//=> ['Jack', 'Mark']
    		```
    		*/
    val resolveImmediately: js.UndefOr[Boolean] = js.undefined
  }
  object MultipleOptions {
    
    @scala.inline
    def apply[EmittedType /* <: js.Array[js.Any] */](count: Double): MultipleOptions[EmittedType] = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleOptions[EmittedType]]
    }
    
    @scala.inline
    implicit class MultipleOptionsMutableBuilder[Self <: MultipleOptions[?], EmittedType /* <: js.Array[js.Any] */] (val x: Self & MultipleOptions[EmittedType]) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveImmediately(value: Boolean): Self = StObject.set(x, "resolveImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveImmediatelyUndefined: Self = StObject.set(x, "resolveImmediately", js.undefined)
    }
  }
  
  trait Options[EmittedType /* <: js.Array[js.Any] */] extends StObject {
    
    /**
    		Filter function for accepting an event.
    		@example
    		```
    		import pEvent = require('p-event');
    		import emitter from './some-event-emitter';
    		(async () => {
    			const result = await pEvent(emitter, '🦄', value => value > 3);
    			// Do something with first 🦄 event with a value greater than 3
    		})();
    		```
    		*/
    val filter: js.UndefOr[FilterFunction[EmittedType]] = js.undefined
    
    /**
    		By default, the promisified function will only return the first argument from the event callback, which works fine for most APIs. This option can be useful for APIs that return multiple arguments in the callback. Turning this on will make it return an array of all arguments from the callback, instead of just the first argument. This also applies to rejections.
    		@default false
    		@example
    		```
    		import pEvent = require('p-event');
    		import emitter from './some-event-emitter';
    		(async () => {
    			const [foo, bar] = await pEvent(emitter, 'finish', {multiArgs: true});
    		})();
    		```
    		*/
    val multiArgs: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Events that will reject the promise.
    		@default ['error']
    		*/
    val rejectionEvents: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
    
    /**
    		Time in milliseconds before timing out.
    		@default Infinity
    		*/
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[EmittedType /* <: js.Array[js.Any] */](): Options[EmittedType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[EmittedType]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], EmittedType /* <: js.Array[js.Any] */] (val x: Self & Options[EmittedType]) extends AnyVal {
      
      @scala.inline
      def setFilter(value: EmittedType => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setMultiArgs(value: Boolean): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
      
      @scala.inline
      def setRejectionEvents(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "rejectionEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectionEventsUndefined: Self = StObject.set(x, "rejectionEvents", js.undefined)
      
      @scala.inline
      def setRejectionEventsVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "rejectionEvents", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait TimeoutErrorClass
    extends StObject
       with Error {
    
    @JSName("name")
    val name_TimeoutErrorClass: typings.pEvent.pEventStrings.TimeoutError
  }
  object TimeoutErrorClass {
    
    @scala.inline
    def apply(message: String): TimeoutErrorClass = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "TimeoutError")
      __obj.asInstanceOf[TimeoutErrorClass]
    }
    
    @scala.inline
    implicit class TimeoutErrorClassMutableBuilder[Self <: TimeoutErrorClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.pEvent.pEventStrings.TimeoutError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
