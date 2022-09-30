package typings.node

import typings.node.anon.Once
import typings.std.AbortSignal
import typings.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  /**
    * The `EventEmitter` class is defined and exposed by the `events` module:
    *
    * ```js
    * const EventEmitter = require('events');
    * ```
    *
    * All `EventEmitter`s emit the event `'newListener'` when new listeners are
    * added and `'removeListener'` when existing listeners are removed.
    *
    * It supports the following option:
    * @since v0.1.26
    */
  @JSImport("events", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject {
    def this(options: EventEmitterOptions) = this()
  }
  @JSImport("events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `EventEmitter` class is defined and exposed by the `events` module:
    *
    * ```js
    * const EventEmitter = require('events');
    * ```
    *
    * All `EventEmitter`s emit the event `'newListener'` when new listeners are
    * added and `'removeListener'` when existing listeners are removed.
    *
    * It supports the following option:
    * @since v0.1.26
    */
  @JSImport("events", "EventEmitter")
  @js.native
  open class EventEmitter ()
    extends StObject
       with typings.node.eventsMod.global.NodeJS.EventEmitter {
    def this(options: EventEmitterOptions) = this()
  }
  object EventEmitter {
    
    @JSImport("events", "EventEmitter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("events", "EventEmitter.captureRejectionSymbol")
    @js.native
    val captureRejectionSymbol: js.Symbol = js.native
    
    /**
      * Sets or gets the default captureRejection value for all emitters.
      */
    // TODO: These should be described using static getter/setter pairs:
    /* static member */
    @JSImport("events", "EventEmitter.captureRejections")
    @js.native
    def captureRejections: Boolean = js.native
    inline def captureRejections_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captureRejections")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("events", "EventEmitter.defaultMaxListeners")
    @js.native
    def defaultMaxListeners: Double = js.native
    inline def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
    
    /**
      * This symbol shall be used to install a listener for only monitoring `'error'`
      * events. Listeners installed using this symbol are called before the regular
      * `'error'` listeners are called.
      *
      * Installing a listener using this symbol does not change the behavior once an
      * `'error'` event is emitted, therefore the process will still crash if no
      * regular `'error'` listener is installed.
      */
    /* static member */
    @JSImport("events", "EventEmitter.errorMonitor")
    @js.native
    val errorMonitor: js.Symbol = js.native
    
    /**
      * Returns a copy of the array of listeners for the event named `eventName`.
      *
      * For `EventEmitter`s this behaves exactly the same as calling `.listeners` on
      * the emitter.
      *
      * For `EventTarget`s this is the only way to get the event listeners for the
      * event target. This is useful for debugging and diagnostic purposes.
      *
      * ```js
      * const { getEventListeners, EventEmitter } = require('events');
      *
      * {
      *   const ee = new EventEmitter();
      *   const listener = () => console.log('Events are fun');
      *   ee.on('foo', listener);
      *   getEventListeners(ee, 'foo'); // [listener]
      * }
      * {
      *   const et = new EventTarget();
      *   const listener = () => console.log('Events are fun');
      *   et.addEventListener('foo', listener);
      *   getEventListeners(et, 'foo'); // [listener]
      * }
      * ```
      * @since v15.2.0, v14.17.0
      */
    /* static member */
    inline def getEventListeners(emitter: DOMEventTarget, name: String): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListeners")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
    inline def getEventListeners(emitter: DOMEventTarget, name: js.Symbol): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListeners")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
    inline def getEventListeners(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, name: String): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListeners")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
    inline def getEventListeners(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, name: js.Symbol): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListeners")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
    
    /**
      * A class method that returns the number of listeners for the given `eventName`registered on the given `emitter`.
      *
      * ```js
      * const { EventEmitter, listenerCount } = require('events');
      * const myEmitter = new EventEmitter();
      * myEmitter.on('event', () => {});
      * myEmitter.on('event', () => {});
      * console.log(listenerCount(myEmitter, 'event'));
      * // Prints: 2
      * ```
      * @since v0.9.12
      * @deprecated Since v3.2.0 - Use `listenerCount` instead.
      * @param emitter The emitter to query
      * @param eventName The event name
      */
    /* static member */
    inline def listenerCount(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, eventName: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def listenerCount(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, eventName: js.Symbol): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * ```js
      * const { on, EventEmitter } = require('events');
      *
      * (async () => {
      *   const ee = new EventEmitter();
      *
      *   // Emit later on
      *   process.nextTick(() => {
      *     ee.emit('foo', 'bar');
      *     ee.emit('foo', 42);
      *   });
      *
      *   for await (const event of on(ee, 'foo')) {
      *     // The execution of this inner block is synchronous and it
      *     // processes one event at a time (even with await). Do not use
      *     // if concurrent execution is required.
      *     console.log(event); // prints ['bar'] [42]
      *   }
      *   // Unreachable here
      * })();
      * ```
      *
      * Returns an `AsyncIterator` that iterates `eventName` events. It will throw
      * if the `EventEmitter` emits `'error'`. It removes all listeners when
      * exiting the loop. The `value` returned by each iteration is an array
      * composed of the emitted event arguments.
      *
      * An `AbortSignal` can be used to cancel waiting on events:
      *
      * ```js
      * const { on, EventEmitter } = require('events');
      * const ac = new AbortController();
      *
      * (async () => {
      *   const ee = new EventEmitter();
      *
      *   // Emit later on
      *   process.nextTick(() => {
      *     ee.emit('foo', 'bar');
      *     ee.emit('foo', 42);
      *   });
      *
      *   for await (const event of on(ee, 'foo', { signal: ac.signal })) {
      *     // The execution of this inner block is synchronous and it
      *     // processes one event at a time (even with await). Do not use
      *     // if concurrent execution is required.
      *     console.log(event); // prints ['bar'] [42]
      *   }
      *   // Unreachable here
      * })();
      *
      * process.nextTick(() => ac.abort());
      * ```
      * @since v13.6.0, v12.16.0
      * @param eventName The name of the event being listened for
      * @return that iterates `eventName` events emitted by the `emitter`
      */
    /* static member */
    inline def on(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, eventName: String): AsyncIterableIterator[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[Any]]
    inline def on(
      emitter: typings.node.eventsMod.global.NodeJS.EventEmitter,
      eventName: String,
      options: StaticEventEmitterOptions
    ): AsyncIterableIterator[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[Any]]
    
    /* static member */
    inline def once(emitter: DOMEventTarget, eventName: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def once(emitter: DOMEventTarget, eventName: String, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    /**
      * Creates a `Promise` that is fulfilled when the `EventEmitter` emits the given
      * event or that is rejected if the `EventEmitter` emits `'error'` while waiting.
      * The `Promise` will resolve with an array of all the arguments emitted to the
      * given event.
      *
      * This method is intentionally generic and works with the web platform [EventTarget](https://dom.spec.whatwg.org/#interface-eventtarget) interface, which has no special`'error'` event
      * semantics and does not listen to the `'error'` event.
      *
      * ```js
      * const { once, EventEmitter } = require('events');
      *
      * async function run() {
      *   const ee = new EventEmitter();
      *
      *   process.nextTick(() => {
      *     ee.emit('myevent', 42);
      *   });
      *
      *   const [value] = await once(ee, 'myevent');
      *   console.log(value);
      *
      *   const err = new Error('kaboom');
      *   process.nextTick(() => {
      *     ee.emit('error', err);
      *   });
      *
      *   try {
      *     await once(ee, 'myevent');
      *   } catch (err) {
      *     console.log('error happened', err);
      *   }
      * }
      *
      * run();
      * ```
      *
      * The special handling of the `'error'` event is only used when `events.once()`is used to wait for another event. If `events.once()` is used to wait for the
      * '`error'` event itself, then it is treated as any other kind of event without
      * special handling:
      *
      * ```js
      * const { EventEmitter, once } = require('events');
      *
      * const ee = new EventEmitter();
      *
      * once(ee, 'error')
      *   .then(([err]) => console.log('ok', err.message))
      *   .catch((err) => console.log('error', err.message));
      *
      * ee.emit('error', new Error('boom'));
      *
      * // Prints: ok boom
      * ```
      *
      * An `AbortSignal` can be used to cancel waiting for the event:
      *
      * ```js
      * const { EventEmitter, once } = require('events');
      *
      * const ee = new EventEmitter();
      * const ac = new AbortController();
      *
      * async function foo(emitter, event, signal) {
      *   try {
      *     await once(emitter, event, { signal });
      *     console.log('event emitted!');
      *   } catch (error) {
      *     if (error.name === 'AbortError') {
      *       console.error('Waiting for the event was canceled!');
      *     } else {
      *       console.error('There was an error', error.message);
      *     }
      *   }
      * }
      *
      * foo(ee, 'foo', ac.signal);
      * ac.abort(); // Abort waiting for the event
      * ee.emit('foo'); // Prints: Waiting for the event was canceled!
      * ```
      * @since v11.13.0, v10.16.0
      */
    /* static member */
    inline def once(emitter: NodeEventTarget, eventName: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def once(emitter: NodeEventTarget, eventName: String, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def once(emitter: NodeEventTarget, eventName: js.Symbol): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    inline def once(emitter: NodeEventTarget, eventName: js.Symbol, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
    
    /**
      * ```js
      * const {
      *   setMaxListeners,
      *   EventEmitter
      * } = require('events');
      *
      * const target = new EventTarget();
      * const emitter = new EventEmitter();
      *
      * setMaxListeners(5, target, emitter);
      * ```
      * @since v15.4.0
      * @param n A non-negative number. The maximum number of listeners per `EventTarget` event.
      * @param eventsTargets Zero or more {EventTarget} or {EventEmitter} instances. If none are specified, `n` is set as the default max for all newly created {EventTarget} and {EventEmitter}
      * objects.
      */
    /* static member */
    inline def setMaxListeners(n: Double, eventTargets: (DOMEventTarget | typings.node.eventsMod.global.NodeJS.EventEmitter)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxListeners")(scala.List(n.asInstanceOf[js.Any]).`++`(eventTargets.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def setMaxListeners(n: Unit, eventTargets: (DOMEventTarget | typings.node.eventsMod.global.NodeJS.EventEmitter)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxListeners")(scala.List(n.asInstanceOf[js.Any]).`++`(eventTargets.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  /* static member */
  @JSImport("events", "captureRejectionSymbol")
  @js.native
  val captureRejectionSymbol: js.Symbol = js.native
  
  /**
    * Sets or gets the default captureRejection value for all emitters.
    */
  // TODO: These should be described using static getter/setter pairs:
  /* static member */
  @JSImport("events", "captureRejections")
  @js.native
  def captureRejections: Boolean = js.native
  inline def captureRejections_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("captureRejections")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("events", "defaultMaxListeners")
  @js.native
  def defaultMaxListeners: Double = js.native
  inline def defaultMaxListeners_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxListeners")(x.asInstanceOf[js.Any])
  
  /**
    * This symbol shall be used to install a listener for only monitoring `'error'`
    * events. Listeners installed using this symbol are called before the regular
    * `'error'` listeners are called.
    *
    * Installing a listener using this symbol does not change the behavior once an
    * `'error'` event is emitted, therefore the process will still crash if no
    * regular `'error'` listener is installed.
    */
  /* static member */
  @JSImport("events", "errorMonitor")
  @js.native
  val errorMonitor: js.Symbol = js.native
  
  /**
    * Returns a copy of the array of listeners for the event named `eventName`.
    *
    * For `EventEmitter`s this behaves exactly the same as calling `.listeners` on
    * the emitter.
    *
    * For `EventTarget`s this is the only way to get the event listeners for the
    * event target. This is useful for debugging and diagnostic purposes.
    *
    * ```js
    * const { getEventListeners, EventEmitter } = require('events');
    *
    * {
    *   const ee = new EventEmitter();
    *   const listener = () => console.log('Events are fun');
    *   ee.on('foo', listener);
    *   getEventListeners(ee, 'foo'); // [listener]
    * }
    * {
    *   const et = new EventTarget();
    *   const listener = () => console.log('Events are fun');
    *   et.addEventListener('foo', listener);
    *   getEventListeners(et, 'foo'); // [listener]
    * }
    * ```
    * @since v15.2.0, v14.17.0
    */
  /* static member */
  inline def getEventListeners(emitter: DOMEventTarget, name: String): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListeners")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  inline def getEventListeners(emitter: DOMEventTarget, name: js.Symbol): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListeners")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  inline def getEventListeners(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, name: String): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListeners")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  inline def getEventListeners(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, name: js.Symbol): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEventListeners")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  
  /**
    * A class method that returns the number of listeners for the given `eventName`registered on the given `emitter`.
    *
    * ```js
    * const { EventEmitter, listenerCount } = require('events');
    * const myEmitter = new EventEmitter();
    * myEmitter.on('event', () => {});
    * myEmitter.on('event', () => {});
    * console.log(listenerCount(myEmitter, 'event'));
    * // Prints: 2
    * ```
    * @since v0.9.12
    * @deprecated Since v3.2.0 - Use `listenerCount` instead.
    * @param emitter The emitter to query
    * @param eventName The event name
    */
  /* static member */
  inline def listenerCount(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, eventName: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def listenerCount(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, eventName: js.Symbol): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listenerCount")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * ```js
    * const { on, EventEmitter } = require('events');
    *
    * (async () => {
    *   const ee = new EventEmitter();
    *
    *   // Emit later on
    *   process.nextTick(() => {
    *     ee.emit('foo', 'bar');
    *     ee.emit('foo', 42);
    *   });
    *
    *   for await (const event of on(ee, 'foo')) {
    *     // The execution of this inner block is synchronous and it
    *     // processes one event at a time (even with await). Do not use
    *     // if concurrent execution is required.
    *     console.log(event); // prints ['bar'] [42]
    *   }
    *   // Unreachable here
    * })();
    * ```
    *
    * Returns an `AsyncIterator` that iterates `eventName` events. It will throw
    * if the `EventEmitter` emits `'error'`. It removes all listeners when
    * exiting the loop. The `value` returned by each iteration is an array
    * composed of the emitted event arguments.
    *
    * An `AbortSignal` can be used to cancel waiting on events:
    *
    * ```js
    * const { on, EventEmitter } = require('events');
    * const ac = new AbortController();
    *
    * (async () => {
    *   const ee = new EventEmitter();
    *
    *   // Emit later on
    *   process.nextTick(() => {
    *     ee.emit('foo', 'bar');
    *     ee.emit('foo', 42);
    *   });
    *
    *   for await (const event of on(ee, 'foo', { signal: ac.signal })) {
    *     // The execution of this inner block is synchronous and it
    *     // processes one event at a time (even with await). Do not use
    *     // if concurrent execution is required.
    *     console.log(event); // prints ['bar'] [42]
    *   }
    *   // Unreachable here
    * })();
    *
    * process.nextTick(() => ac.abort());
    * ```
    * @since v13.6.0, v12.16.0
    * @param eventName The name of the event being listened for
    * @return that iterates `eventName` events emitted by the `emitter`
    */
  /* static member */
  inline def on(emitter: typings.node.eventsMod.global.NodeJS.EventEmitter, eventName: String): AsyncIterableIterator[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[Any]]
  inline def on(
    emitter: typings.node.eventsMod.global.NodeJS.EventEmitter,
    eventName: String,
    options: StaticEventEmitterOptions
  ): AsyncIterableIterator[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[Any]]
  
  /* static member */
  inline def once(emitter: DOMEventTarget, eventName: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def once(emitter: DOMEventTarget, eventName: String, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  /**
    * Creates a `Promise` that is fulfilled when the `EventEmitter` emits the given
    * event or that is rejected if the `EventEmitter` emits `'error'` while waiting.
    * The `Promise` will resolve with an array of all the arguments emitted to the
    * given event.
    *
    * This method is intentionally generic and works with the web platform [EventTarget](https://dom.spec.whatwg.org/#interface-eventtarget) interface, which has no special`'error'` event
    * semantics and does not listen to the `'error'` event.
    *
    * ```js
    * const { once, EventEmitter } = require('events');
    *
    * async function run() {
    *   const ee = new EventEmitter();
    *
    *   process.nextTick(() => {
    *     ee.emit('myevent', 42);
    *   });
    *
    *   const [value] = await once(ee, 'myevent');
    *   console.log(value);
    *
    *   const err = new Error('kaboom');
    *   process.nextTick(() => {
    *     ee.emit('error', err);
    *   });
    *
    *   try {
    *     await once(ee, 'myevent');
    *   } catch (err) {
    *     console.log('error happened', err);
    *   }
    * }
    *
    * run();
    * ```
    *
    * The special handling of the `'error'` event is only used when `events.once()`is used to wait for another event. If `events.once()` is used to wait for the
    * '`error'` event itself, then it is treated as any other kind of event without
    * special handling:
    *
    * ```js
    * const { EventEmitter, once } = require('events');
    *
    * const ee = new EventEmitter();
    *
    * once(ee, 'error')
    *   .then(([err]) => console.log('ok', err.message))
    *   .catch((err) => console.log('error', err.message));
    *
    * ee.emit('error', new Error('boom'));
    *
    * // Prints: ok boom
    * ```
    *
    * An `AbortSignal` can be used to cancel waiting for the event:
    *
    * ```js
    * const { EventEmitter, once } = require('events');
    *
    * const ee = new EventEmitter();
    * const ac = new AbortController();
    *
    * async function foo(emitter, event, signal) {
    *   try {
    *     await once(emitter, event, { signal });
    *     console.log('event emitted!');
    *   } catch (error) {
    *     if (error.name === 'AbortError') {
    *       console.error('Waiting for the event was canceled!');
    *     } else {
    *       console.error('There was an error', error.message);
    *     }
    *   }
    * }
    *
    * foo(ee, 'foo', ac.signal);
    * ac.abort(); // Abort waiting for the event
    * ee.emit('foo'); // Prints: Waiting for the event was canceled!
    * ```
    * @since v11.13.0, v10.16.0
    */
  /* static member */
  inline def once(emitter: NodeEventTarget, eventName: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def once(emitter: NodeEventTarget, eventName: String, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def once(emitter: NodeEventTarget, eventName: js.Symbol): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def once(emitter: NodeEventTarget, eventName: js.Symbol, options: StaticEventEmitterOptions): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(emitter.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  /**
    * ```js
    * const {
    *   setMaxListeners,
    *   EventEmitter
    * } = require('events');
    *
    * const target = new EventTarget();
    * const emitter = new EventEmitter();
    *
    * setMaxListeners(5, target, emitter);
    * ```
    * @since v15.4.0
    * @param n A non-negative number. The maximum number of listeners per `EventTarget` event.
    * @param eventsTargets Zero or more {EventTarget} or {EventEmitter} instances. If none are specified, `n` is set as the default max for all newly created {EventTarget} and {EventEmitter}
    * objects.
    */
  /* static member */
  inline def setMaxListeners(n: Double, eventTargets: (DOMEventTarget | typings.node.eventsMod.global.NodeJS.EventEmitter)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxListeners")(scala.List(n.asInstanceOf[js.Any]).`++`(eventTargets.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def setMaxListeners(n: Unit, eventTargets: (DOMEventTarget | typings.node.eventsMod.global.NodeJS.EventEmitter)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaxListeners")(scala.List(n.asInstanceOf[js.Any]).`++`(eventTargets.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  trait Abortable extends StObject {
    
    /**
      * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
      */
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object Abortable {
    
    inline def apply(): Abortable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Abortable]
    }
    
    extension [Self <: Abortable](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  @js.native
  trait DOMEventTarget extends StObject {
    
    def addEventListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): Any = js.native
    def addEventListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit], opts: Once): Any = js.native
  }
  
  trait EventEmitterOptions extends StObject {
    
    /**
      * Enables automatic capturing of promise rejection.
      */
    var captureRejections: js.UndefOr[Boolean] = js.undefined
  }
  object EventEmitterOptions {
    
    inline def apply(): EventEmitterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventEmitterOptions]
    }
    
    extension [Self <: EventEmitterOptions](x: Self) {
      
      inline def setCaptureRejections(value: Boolean): Self = StObject.set(x, "captureRejections", value.asInstanceOf[js.Any])
      
      inline def setCaptureRejectionsUndefined: Self = StObject.set(x, "captureRejections", js.undefined)
    }
  }
  
  @js.native
  trait NodeEventTarget extends StObject {
    
    def once(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  }
  
  trait StaticEventEmitterOptions extends StObject {
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object StaticEventEmitterOptions {
    
    inline def apply(): StaticEventEmitterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticEventEmitterOptions]
    }
    
    extension [Self <: StaticEventEmitterOptions](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  object global {
    
    object NodeJS {
      
      @js.native
      trait EventEmitter extends StObject {
        
        /**
          * Alias for `emitter.on(eventName, listener)`.
          * @since v0.1.26
          */
        def addListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        def addListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        
        /**
          * Synchronously calls each of the listeners registered for the event named`eventName`, in the order they were registered, passing the supplied arguments
          * to each.
          *
          * Returns `true` if the event had listeners, `false` otherwise.
          *
          * ```js
          * const EventEmitter = require('events');
          * const myEmitter = new EventEmitter();
          *
          * // First listener
          * myEmitter.on('event', function firstListener() {
          *   console.log('Helloooo! first listener');
          * });
          * // Second listener
          * myEmitter.on('event', function secondListener(arg1, arg2) {
          *   console.log(`event with parameters ${arg1}, ${arg2} in second listener`);
          * });
          * // Third listener
          * myEmitter.on('event', function thirdListener(...args) {
          *   const parameters = args.join(', ');
          *   console.log(`event with parameters ${parameters} in third listener`);
          * });
          *
          * console.log(myEmitter.listeners('event'));
          *
          * myEmitter.emit('event', 1, 2, 3, 4, 5);
          *
          * // Prints:
          * // [
          * //   [Function: firstListener],
          * //   [Function: secondListener],
          * //   [Function: thirdListener]
          * // ]
          * // Helloooo! first listener
          * // event with parameters 1, 2 in second listener
          * // event with parameters 1, 2, 3, 4, 5 in third listener
          * ```
          * @since v0.1.26
          */
        def emit(eventName: String, args: Any*): Boolean = js.native
        def emit(eventName: js.Symbol, args: Any*): Boolean = js.native
        
        /**
          * Returns an array listing the events for which the emitter has registered
          * listeners. The values in the array are strings or `Symbol`s.
          *
          * ```js
          * const EventEmitter = require('events');
          * const myEE = new EventEmitter();
          * myEE.on('foo', () => {});
          * myEE.on('bar', () => {});
          *
          * const sym = Symbol('symbol');
          * myEE.on(sym, () => {});
          *
          * console.log(myEE.eventNames());
          * // Prints: [ 'foo', 'bar', Symbol(symbol) ]
          * ```
          * @since v6.0.0
          */
        def eventNames(): js.Array[String | js.Symbol] = js.native
        
        /**
          * Returns the current max listener value for the `EventEmitter` which is either
          * set by `emitter.setMaxListeners(n)` or defaults to {@link defaultMaxListeners}.
          * @since v1.0.0
          */
        def getMaxListeners(): Double = js.native
        
        /**
          * Returns the number of listeners listening to the event named `eventName`.
          * @since v3.2.0
          * @param eventName The name of the event being listened for
          */
        def listenerCount(eventName: String): Double = js.native
        def listenerCount(eventName: js.Symbol): Double = js.native
        
        /**
          * Returns a copy of the array of listeners for the event named `eventName`.
          *
          * ```js
          * server.on('connection', (stream) => {
          *   console.log('someone connected!');
          * });
          * console.log(util.inspect(server.listeners('connection')));
          * // Prints: [ [Function] ]
          * ```
          * @since v0.1.26
          */
        def listeners(eventName: String): js.Array[js.Function] = js.native
        def listeners(eventName: js.Symbol): js.Array[js.Function] = js.native
        
        /**
          * Alias for `emitter.removeListener()`.
          * @since v10.0.0
          */
        def off(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        def off(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        
        /**
          * Adds the `listener` function to the end of the listeners array for the
          * event named `eventName`. No checks are made to see if the `listener` has
          * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
          * times.
          *
          * ```js
          * server.on('connection', (stream) => {
          *   console.log('someone connected!');
          * });
          * ```
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          *
          * By default, event listeners are invoked in the order they are added. The`emitter.prependListener()` method can be used as an alternative to add the
          * event listener to the beginning of the listeners array.
          *
          * ```js
          * const myEE = new EventEmitter();
          * myEE.on('foo', () => console.log('a'));
          * myEE.prependListener('foo', () => console.log('b'));
          * myEE.emit('foo');
          * // Prints:
          * //   b
          * //   a
          * ```
          * @since v0.1.101
          * @param eventName The name of the event.
          * @param listener The callback function
          */
        def on(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        def on(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        
        /**
          * Adds a **one-time**`listener` function for the event named `eventName`. The
          * next time `eventName` is triggered, this listener is removed and then invoked.
          *
          * ```js
          * server.once('connection', (stream) => {
          *   console.log('Ah, we have our first user!');
          * });
          * ```
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          *
          * By default, event listeners are invoked in the order they are added. The`emitter.prependOnceListener()` method can be used as an alternative to add the
          * event listener to the beginning of the listeners array.
          *
          * ```js
          * const myEE = new EventEmitter();
          * myEE.once('foo', () => console.log('a'));
          * myEE.prependOnceListener('foo', () => console.log('b'));
          * myEE.emit('foo');
          * // Prints:
          * //   b
          * //   a
          * ```
          * @since v0.3.0
          * @param eventName The name of the event.
          * @param listener The callback function
          */
        def once(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        def once(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        
        /**
          * Adds the `listener` function to the _beginning_ of the listeners array for the
          * event named `eventName`. No checks are made to see if the `listener` has
          * already been added. Multiple calls passing the same combination of `eventName`and `listener` will result in the `listener` being added, and called, multiple
          * times.
          *
          * ```js
          * server.prependListener('connection', (stream) => {
          *   console.log('someone connected!');
          * });
          * ```
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          * @since v6.0.0
          * @param eventName The name of the event.
          * @param listener The callback function
          */
        def prependListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        def prependListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        
        /**
          * Adds a **one-time**`listener` function for the event named `eventName` to the _beginning_ of the listeners array. The next time `eventName` is triggered, this
          * listener is removed, and then invoked.
          *
          * ```js
          * server.prependOnceListener('connection', (stream) => {
          *   console.log('Ah, we have our first user!');
          * });
          * ```
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          * @since v6.0.0
          * @param eventName The name of the event.
          * @param listener The callback function
          */
        def prependOnceListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        def prependOnceListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        
        /**
          * Returns a copy of the array of listeners for the event named `eventName`,
          * including any wrappers (such as those created by `.once()`).
          *
          * ```js
          * const emitter = new EventEmitter();
          * emitter.once('log', () => console.log('log once'));
          *
          * // Returns a new Array with a function `onceWrapper` which has a property
          * // `listener` which contains the original listener bound above
          * const listeners = emitter.rawListeners('log');
          * const logFnWrapper = listeners[0];
          *
          * // Logs "log once" to the console and does not unbind the `once` event
          * logFnWrapper.listener();
          *
          * // Logs "log once" to the console and removes the listener
          * logFnWrapper();
          *
          * emitter.on('log', () => console.log('log persistently'));
          * // Will return a new Array with a single function bound by `.on()` above
          * const newListeners = emitter.rawListeners('log');
          *
          * // Logs "log persistently" twice
          * newListeners[0]();
          * emitter.emit('log');
          * ```
          * @since v9.4.0
          */
        def rawListeners(eventName: String): js.Array[js.Function] = js.native
        def rawListeners(eventName: js.Symbol): js.Array[js.Function] = js.native
        
        /**
          * Removes all listeners, or those of the specified `eventName`.
          *
          * It is bad practice to remove listeners added elsewhere in the code,
          * particularly when the `EventEmitter` instance was created by some other
          * component or module (e.g. sockets or file streams).
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          * @since v0.1.26
          */
        def removeAllListeners(): this.type = js.native
        def removeAllListeners(event: String): this.type = js.native
        def removeAllListeners(event: js.Symbol): this.type = js.native
        
        /**
          * Removes the specified `listener` from the listener array for the event named`eventName`.
          *
          * ```js
          * const callback = (stream) => {
          *   console.log('someone connected!');
          * };
          * server.on('connection', callback);
          * // ...
          * server.removeListener('connection', callback);
          * ```
          *
          * `removeListener()` will remove, at most, one instance of a listener from the
          * listener array. If any single listener has been added multiple times to the
          * listener array for the specified `eventName`, then `removeListener()` must be
          * called multiple times to remove each instance.
          *
          * Once an event is emitted, all listeners attached to it at the
          * time of emitting are called in order. This implies that any`removeListener()` or `removeAllListeners()` calls _after_ emitting and _before_ the last listener finishes execution
          * will not remove them from`emit()` in progress. Subsequent events behave as expected.
          *
          * ```js
          * const myEmitter = new MyEmitter();
          *
          * const callbackA = () => {
          *   console.log('A');
          *   myEmitter.removeListener('event', callbackB);
          * };
          *
          * const callbackB = () => {
          *   console.log('B');
          * };
          *
          * myEmitter.on('event', callbackA);
          *
          * myEmitter.on('event', callbackB);
          *
          * // callbackA removes listener callbackB but it will still be called.
          * // Internal listener array at time of emit [callbackA, callbackB]
          * myEmitter.emit('event');
          * // Prints:
          * //   A
          * //   B
          *
          * // callbackB is now removed.
          * // Internal listener array [callbackA]
          * myEmitter.emit('event');
          * // Prints:
          * //   A
          * ```
          *
          * Because listeners are managed using an internal array, calling this will
          * change the position indices of any listener registered _after_ the listener
          * being removed. This will not impact the order in which listeners are called,
          * but it means that any copies of the listener array as returned by
          * the `emitter.listeners()` method will need to be recreated.
          *
          * When a single function has been added as a handler multiple times for a single
          * event (as in the example below), `removeListener()` will remove the most
          * recently added instance. In the example the `once('ping')`listener is removed:
          *
          * ```js
          * const ee = new EventEmitter();
          *
          * function pong() {
          *   console.log('pong');
          * }
          *
          * ee.on('ping', pong);
          * ee.once('ping', pong);
          * ee.removeListener('ping', pong);
          *
          * ee.emit('ping');
          * ee.emit('ping');
          * ```
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          * @since v0.1.26
          */
        def removeListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        def removeListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
        
        /**
          * By default `EventEmitter`s will print a warning if more than `10` listeners are
          * added for a particular event. This is a useful default that helps finding
          * memory leaks. The `emitter.setMaxListeners()` method allows the limit to be
          * modified for this specific `EventEmitter` instance. The value can be set to`Infinity` (or `0`) to indicate an unlimited number of listeners.
          *
          * Returns a reference to the `EventEmitter`, so that calls can be chained.
          * @since v0.3.5
          */
        def setMaxListeners(n: Double): this.type = js.native
      }
    }
  }
}
