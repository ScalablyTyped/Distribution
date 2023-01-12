package typings.pEvent

import typings.pEvent.pEventBooleans.`true`
import typings.std.AsyncIterableIterator
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("p-event", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends typings.pTimeout.mod.TimeoutError {
    def this(message: String) = this()
  }
  
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: String): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    filter: FilterFunction[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: String,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: String, options: Options[EmittedType]): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Array[String | js.Symbol]): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    filter: FilterFunction[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[String | js.Symbol],
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    options: Options[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Symbol): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: MultiArgumentsOptions[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  inline def pEvent[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: Options[EmittedType]
  ): CancelablePromise[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[EmittedType]]
  
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: String): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    filter: FilterFunction[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: String,
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    options: IteratorOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Array[String | js.Symbol]): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    filter: FilterFunction[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[String | js.Symbol],
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    options: IteratorOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType](emitter: Emitter[EventName, js.Array[EmittedType]], event: js.Symbol): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    filter: FilterFunction[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: IteratorMultiArgumentsOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  inline def pEventIterator[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: IteratorOptions[EmittedType]
  ): AsyncIterableIterator[EmittedType] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventIterator")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[EmittedType]]
  
  inline def pEventMultiple[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: String,
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventMultiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  inline def pEventMultiple[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: String,
    options: MultipleOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventMultiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  inline def pEventMultiple[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Array[String | js.Symbol],
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventMultiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  inline def pEventMultiple[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Array[String | js.Symbol],
    options: MultipleOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventMultiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  inline def pEventMultiple[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */](
    emitter: Emitter[EventName, EmittedType],
    event: js.Symbol,
    options: MultipleMultiArgumentsOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventMultiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  inline def pEventMultiple[EventName /* <: String | js.Symbol */, EmittedType](
    emitter: Emitter[EventName, js.Array[EmittedType]],
    event: js.Symbol,
    options: MultipleOptions[EmittedType]
  ): CancelablePromise[js.Array[EmittedType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pEventMultiple")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[js.Array[EmittedType]]]
  
  type AddRemoveListener[EventName /* <: String | js.Symbol */, Arguments /* <: js.Array[Any] */] = js.Function2[
    /* event */ EventName, 
    /* listener */ js.Function1[/* arguments */ Arguments, Unit], 
    Unit
  ]
  
  @js.native
  trait CancelablePromise[ResolveType]
    extends StObject
       with Promise[ResolveType] {
    
    def cancel(): Unit = js.native
  }
  
  trait Emitter[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */] extends StObject {
    
    var addEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
    
    var addListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
    
    var off: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
    
    var on: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
    
    var removeEventListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
    
    var removeListener: js.UndefOr[AddRemoveListener[EventName, EmittedType]] = js.undefined
  }
  object Emitter {
    
    inline def apply[EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */](): Emitter[EventName, EmittedType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Emitter[EventName, EmittedType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Emitter[?, ?], EventName /* <: String | js.Symbol */, EmittedType /* <: js.Array[Any] */] (val x: Self & (Emitter[EventName, EmittedType])) extends AnyVal {
      
      inline def setAddEventListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
      
      inline def setAddListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      inline def setOff(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
      
      inline def setOn(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setRemoveEventListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
      
      inline def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
      
      inline def setRemoveListener(value: (EventName, /* listener */ js.Function1[EmittedType, Unit]) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
    }
  }
  
  type FilterFunction[ElementType /* <: Any | js.Array[Any] */] = js.Function1[/* value */ ElementType, Boolean]
  
  trait IteratorMultiArgumentsOptions[EmittedType /* <: js.Array[Any] */]
    extends StObject
       with IteratorOptions[EmittedType] {
    
    @JSName("multiArgs")
    var multiArgs_IteratorMultiArgumentsOptions: `true`
  }
  object IteratorMultiArgumentsOptions {
    
    inline def apply[EmittedType /* <: js.Array[Any] */](): IteratorMultiArgumentsOptions[EmittedType] = {
      val __obj = js.Dynamic.literal(multiArgs = true)
      __obj.asInstanceOf[IteratorMultiArgumentsOptions[EmittedType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IteratorMultiArgumentsOptions[?], EmittedType /* <: js.Array[Any] */] (val x: Self & IteratorMultiArgumentsOptions[EmittedType]) extends AnyVal {
      
      inline def setMultiArgs(value: `true`): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
    }
  }
  
  trait IteratorOptions[EmittedType /* <: Any | js.Array[Any] */]
    extends StObject
       with Options[EmittedType] {
    
    /**
    	The maximum number of events for the iterator before it ends. When the limit is reached, the iterator will be marked as `done`. This option is useful to paginate events, for example, fetching 10 events per page.
    	@default Infinity
    	*/
    val limit: js.UndefOr[Double] = js.undefined
    
    /**
    	Events that will end the iterator.
    	@default []
    	*/
    val resolutionEvents: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
  }
  object IteratorOptions {
    
    inline def apply[EmittedType /* <: Any | js.Array[Any] */](): IteratorOptions[EmittedType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IteratorOptions[EmittedType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IteratorOptions[?], EmittedType /* <: Any | js.Array[Any] */] (val x: Self & IteratorOptions[EmittedType]) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setResolutionEvents(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "resolutionEvents", value.asInstanceOf[js.Any])
      
      inline def setResolutionEventsUndefined: Self = StObject.set(x, "resolutionEvents", js.undefined)
      
      inline def setResolutionEventsVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "resolutionEvents", js.Array(value*))
    }
  }
  
  trait MultiArgumentsOptions[EmittedType /* <: js.Array[Any] */]
    extends StObject
       with Options[EmittedType] {
    
    @JSName("multiArgs")
    val multiArgs_MultiArgumentsOptions: `true`
  }
  object MultiArgumentsOptions {
    
    inline def apply[EmittedType /* <: js.Array[Any] */](): MultiArgumentsOptions[EmittedType] = {
      val __obj = js.Dynamic.literal(multiArgs = true)
      __obj.asInstanceOf[MultiArgumentsOptions[EmittedType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiArgumentsOptions[?], EmittedType /* <: js.Array[Any] */] (val x: Self & MultiArgumentsOptions[EmittedType]) extends AnyVal {
      
      inline def setMultiArgs(value: `true`): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultipleMultiArgumentsOptions[EmittedType /* <: js.Array[Any] */]
    extends StObject
       with MultipleOptions[EmittedType] {
    
    @JSName("multiArgs")
    val multiArgs_MultipleMultiArgumentsOptions: `true`
  }
  object MultipleMultiArgumentsOptions {
    
    inline def apply[EmittedType /* <: js.Array[Any] */](count: Double): MultipleMultiArgumentsOptions[EmittedType] = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], multiArgs = true)
      __obj.asInstanceOf[MultipleMultiArgumentsOptions[EmittedType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipleMultiArgumentsOptions[?], EmittedType /* <: js.Array[Any] */] (val x: Self & MultipleMultiArgumentsOptions[EmittedType]) extends AnyVal {
      
      inline def setMultiArgs(value: `true`): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultipleOptions[EmittedType /* <: Any | js.Array[Any] */]
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
    	import {pEventMultiple} from 'p-event';
    	const emitter = new EventEmitter();
    	const promise = pEventMultiple(emitter, 'hello', {
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
    
    inline def apply[EmittedType /* <: Any | js.Array[Any] */](count: Double): MultipleOptions[EmittedType] = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleOptions[EmittedType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipleOptions[?], EmittedType /* <: Any | js.Array[Any] */] (val x: Self & MultipleOptions[EmittedType]) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setResolveImmediately(value: Boolean): Self = StObject.set(x, "resolveImmediately", value.asInstanceOf[js.Any])
      
      inline def setResolveImmediatelyUndefined: Self = StObject.set(x, "resolveImmediately", js.undefined)
    }
  }
  
  trait Options[EmittedType /* <: Any | js.Array[Any] */] extends StObject {
    
    /**
    	A filter function for accepting an event.
    	@example
    	```
    	import {pEvent} from 'p-event';
    	import emitter from './some-event-emitter';
    	const result = await pEvent(emitter, '🦄', value => value > 3);
    	// Do something with first 🦄 event with a value greater than 3
    	```
    	*/
    val filter: js.UndefOr[FilterFunction[EmittedType]] = js.undefined
    
    /**
    	By default, the promisified function will only return the first argument from the event callback, which works fine for most APIs. This option can be useful for APIs that return multiple arguments in the callback. Turning this on will make it return an array of all arguments from the callback, instead of just the first argument. This also applies to rejections.
    	@default false
    	@example
    	```
    	import {pEvent} from 'p-event';
    	import emitter from './some-event-emitter';
    	const [foo, bar] = await pEvent(emitter, 'finish', {multiArgs: true});
    	```
    	*/
    val multiArgs: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Events that will reject the promise.
    	@default ['error']
    	*/
    val rejectionEvents: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
    
    /**
    	The time in milliseconds before timing out.
    	@default Infinity
    	*/
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[EmittedType /* <: Any | js.Array[Any] */](): Options[EmittedType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[EmittedType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], EmittedType /* <: Any | js.Array[Any] */] (val x: Self & Options[EmittedType]) extends AnyVal {
      
      inline def setFilter(value: EmittedType => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setMultiArgs(value: Boolean): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      inline def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
      
      inline def setRejectionEvents(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "rejectionEvents", value.asInstanceOf[js.Any])
      
      inline def setRejectionEventsUndefined: Self = StObject.set(x, "rejectionEvents", js.undefined)
      
      inline def setRejectionEventsVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "rejectionEvents", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
