package typings.node

import typings.node.anon.Message
import typings.node.nodeStreamMod.Readable
import typings.node.nodeStreamMod.Writable
import typings.node.nodeStrings.close
import typings.node.nodeStrings.error
import typings.node.nodeStrings.exit
import typings.node.nodeStrings.message
import typings.node.nodeStrings.messageerror
import typings.node.nodeStrings.online
import typings.node.nodeUrlMod.URL
import typings.node.perfHooksMod.EventLoopUtilityFunction
import typings.node.perfHooksMod.EventLoopUtilization
import typings.node.vmMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerThreadsMod {
  
  @JSImport("worker_threads", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Instances of `BroadcastChannel` allow asynchronous one-to-many communication
    * with all other `BroadcastChannel` instances bound to the same channel name.
    *
    * ```js
    * 'use strict';
    *
    * const {
    *   isMainThread,
    *   BroadcastChannel,
    *   Worker
    * } = require('worker_threads');
    *
    * const bc = new BroadcastChannel('hello');
    *
    * if (isMainThread) {
    *   let c = 0;
    *   bc.onmessage = (event) => {
    *     console.log(event.data);
    *     if (++c === 10) bc.close();
    *   };
    *   for (let n = 0; n < 10; n++)
    *     new Worker(__filename);
    * } else {
    *   bc.postMessage('hello from every worker');
    *   bc.close();
    * }
    * ```
    * @since v15.4.0
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.RefCounted * / any */ @JSImport("worker_threads", "BroadcastChannel")
  @js.native
  open class BroadcastChannel protected () extends StObject {
    def this(name: String) = this()
    
    /**
      * Closes the `BroadcastChannel` connection.
      * @since v15.4.0
      */
    def close(): Unit = js.native
    
    val name: String = js.native
    
    /**
      * Invoked with a single \`MessageEvent\` argument when a message is received.
      * @since v15.4.0
      */
    def onmessage(message: Any): Unit = js.native
    
    /**
      * Invoked with a received message cannot be deserialized.
      * @since v15.4.0
      */
    def onmessageerror(message: Any): Unit = js.native
    
    /**
      * @since v15.4.0
      * @param message Any cloneable JavaScript value.
      */
    def postMessage(message: Any): Unit = js.native
  }
  
  /**
    * Instances of the `worker.MessageChannel` class represent an asynchronous,
    * two-way communications channel.
    * The `MessageChannel` has no methods of its own. `new MessageChannel()`yields an object with `port1` and `port2` properties, which refer to linked `MessagePort` instances.
    *
    * ```js
    * const { MessageChannel } = require('worker_threads');
    *
    * const { port1, port2 } = new MessageChannel();
    * port1.on('message', (message) => console.log('received', message));
    * port2.postMessage({ foo: 'bar' });
    * // Prints: received { foo: 'bar' } from the `port1.on('message')` listener
    * ```
    * @since v10.5.0
    */
  @JSImport("worker_threads", "MessageChannel")
  @js.native
  open class MessageChannel () extends StObject {
    
    val port1: MessagePort = js.native
    
    val port2: MessagePort = js.native
  }
  
  /**
    * Instances of the `worker.MessagePort` class represent one end of an
    * asynchronous, two-way communications channel. It can be used to transfer
    * structured data, memory regions and other `MessagePort`s between different `Worker` s.
    *
    * This implementation matches [browser `MessagePort`](https://developer.mozilla.org/en-US/docs/Web/API/MessagePort) s.
    * @since v10.5.0
    */
  @JSImport("worker_threads", "MessagePort")
  @js.native
  open class MessagePort ()
    extends StObject
       with _TransferListItem {
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    
    /**
      * Disables further sending of messages on either side of the connection.
      * This method can be called when no further communication will happen over this`MessagePort`.
      *
      * The `'close' event` is emitted on both `MessagePort` instances that
      * are part of the channel.
      * @since v10.5.0
      */
    def close(): Unit = js.native
    
    def emit(event: String, args: Any*): Boolean = js.native
    def emit(event: js.Symbol, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, value: Any): Boolean = js.native
    @JSName("emit")
    def emit_messageerror(event: messageerror, error: js.Error): Boolean = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("off")
    def off_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("off")
    def off_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("off")
    def off_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    
    /**
      * Sends a JavaScript value to the receiving side of this channel.`value` is transferred in a way which is compatible with
      * the [HTML structured clone algorithm](https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API/Structured_clone_algorithm).
      *
      * In particular, the significant differences to `JSON` are:
      *
      * * `value` may contain circular references.
      * * `value` may contain instances of builtin JS types such as `RegExp`s,`BigInt`s, `Map`s, `Set`s, etc.
      * * `value` may contain typed arrays, both using `ArrayBuffer`s
      * and `SharedArrayBuffer`s.
      * * `value` may contain [`WebAssembly.Module`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/Module) instances.
      * * `value` may not contain native (C++-backed) objects other than:
      *
      * ```js
      * const { MessageChannel } = require('worker_threads');
      * const { port1, port2 } = new MessageChannel();
      *
      * port1.on('message', (message) => console.log(message));
      *
      * const circularData = {};
      * circularData.foo = circularData;
      * // Prints: { foo: [Circular] }
      * port2.postMessage(circularData);
      * ```
      *
      * `transferList` may be a list of [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), `MessagePort` and `FileHandle` objects.
      * After transferring, they are not usable on the sending side of the channel
      * anymore (even if they are not contained in `value`). Unlike with `child processes`, transferring handles such as network sockets is currently
      * not supported.
      *
      * If `value` contains [`SharedArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer) instances, those are accessible
      * from either thread. They cannot be listed in `transferList`.
      *
      * `value` may still contain `ArrayBuffer` instances that are not in`transferList`; in that case, the underlying memory is copied rather than moved.
      *
      * ```js
      * const { MessageChannel } = require('worker_threads');
      * const { port1, port2 } = new MessageChannel();
      *
      * port1.on('message', (message) => console.log(message));
      *
      * const uint8Array = new Uint8Array([ 1, 2, 3, 4 ]);
      * // This posts a copy of `uint8Array`:
      * port2.postMessage(uint8Array);
      * // This does not copy data, but renders `uint8Array` unusable:
      * port2.postMessage(uint8Array, [ uint8Array.buffer ]);
      *
      * // The memory for the `sharedUint8Array` is accessible from both the
      * // original and the copy received by `.on('message')`:
      * const sharedUint8Array = new Uint8Array(new SharedArrayBuffer(4));
      * port2.postMessage(sharedUint8Array);
      *
      * // This transfers a freshly created message port to the receiver.
      * // This can be used, for example, to create communication channels between
      * // multiple `Worker` threads that are children of the same parent thread.
      * const otherChannel = new MessageChannel();
      * port2.postMessage({ port: otherChannel.port1 }, [ otherChannel.port1 ]);
      * ```
      *
      * The message object is cloned immediately, and can be modified after
      * posting without having side effects.
      *
      * For more information on the serialization and deserialization mechanisms
      * behind this API, see the `serialization API of the v8 module`.
      * @since v10.5.0
      */
    def postMessage(value: Any): Unit = js.native
    def postMessage(value: Any, transferList: js.Array[TransferListItem]): Unit = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    
    /**
      * Opposite of `unref()`. Calling `ref()` on a previously `unref()`ed port does _not_ let the program exit if it's the only active handle left (the default
      * behavior). If the port is `ref()`ed, calling `ref()` again has no effect.
      *
      * If listeners are attached or removed using `.on('message')`, the port
      * is `ref()`ed and `unref()`ed automatically depending on whether
      * listeners for the event exist.
      * @since v10.5.0
      */
    def ref(): Unit = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    
    /**
      * Starts receiving messages on this `MessagePort`. When using this port
      * as an event emitter, this is called automatically once `'message'`listeners are attached.
      *
      * This method exists for parity with the Web `MessagePort` API. In Node.js,
      * it is only useful for ignoring messages when no event listener is present.
      * Node.js also diverges in its handling of `.onmessage`. Setting it
      * automatically calls `.start()`, but unsetting it lets messages queue up
      * until a new handler is set or the port is discarded.
      * @since v10.5.0
      */
    def start(): Unit = js.native
    
    /**
      * Calling `unref()` on a port allows the thread to exit if this is the only
      * active handle in the event system. If the port is already `unref()`ed calling`unref()` again has no effect.
      *
      * If listeners are attached or removed using `.on('message')`, the port is`ref()`ed and `unref()`ed automatically depending on whether
      * listeners for the event exist.
      * @since v10.5.0
      */
    def unref(): Unit = js.native
  }
  
  @JSImport("worker_threads", "SHARE_ENV")
  @js.native
  val SHARE_ENV: js.Symbol = js.native
  
  /**
    * The `Worker` class represents an independent JavaScript execution thread.
    * Most Node.js APIs are available inside of it.
    *
    * Notable differences inside a Worker environment are:
    *
    * * The `process.stdin`, `process.stdout` and `process.stderr` may be redirected by the parent thread.
    * * The `require('worker_threads').isMainThread` property is set to `false`.
    * * The `require('worker_threads').parentPort` message port is available.
    * * `process.exit()` does not stop the whole program, just the single thread,
    * and `process.abort()` is not available.
    * * `process.chdir()` and `process` methods that set group or user ids
    * are not available.
    * * `process.env` is a copy of the parent thread's environment variables,
    * unless otherwise specified. Changes to one copy are not visible in other
    * threads, and are not visible to native add-ons (unless `worker.SHARE_ENV` is passed as the `env` option to the `Worker` constructor).
    * * `process.title` cannot be modified.
    * * Signals are not delivered through `process.on('...')`.
    * * Execution may stop at any point as a result of `worker.terminate()` being invoked.
    * * IPC channels from parent processes are not accessible.
    * * The `trace_events` module is not supported.
    * * Native add-ons can only be loaded from multiple threads if they fulfill `certain conditions`.
    *
    * Creating `Worker` instances inside of other `Worker`s is possible.
    *
    * Like [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API) and the `cluster module`, two-way communication can be
    * achieved through inter-thread message passing. Internally, a `Worker` has a
    * built-in pair of `MessagePort` s that are already associated with each other
    * when the `Worker` is created. While the `MessagePort` object on the parent side
    * is not directly exposed, its functionalities are exposed through `worker.postMessage()` and the `worker.on('message')` event
    * on the `Worker` object for the parent thread.
    *
    * To create custom messaging channels (which is encouraged over using the default
    * global channel because it facilitates separation of concerns), users can create
    * a `MessageChannel` object on either thread and pass one of the`MessagePort`s on that `MessageChannel` to the other thread through a
    * pre-existing channel, such as the global one.
    *
    * See `port.postMessage()` for more information on how messages are passed,
    * and what kind of JavaScript values can be successfully transported through
    * the thread barrier.
    *
    * ```js
    * const assert = require('assert');
    * const {
    *   Worker, MessageChannel, MessagePort, isMainThread, parentPort
    * } = require('worker_threads');
    * if (isMainThread) {
    *   const worker = new Worker(__filename);
    *   const subChannel = new MessageChannel();
    *   worker.postMessage({ hereIsYourPort: subChannel.port1 }, [subChannel.port1]);
    *   subChannel.port2.on('message', (value) => {
    *     console.log('received:', value);
    *   });
    * } else {
    *   parentPort.once('message', (value) => {
    *     assert(value.hereIsYourPort instanceof MessagePort);
    *     value.hereIsYourPort.postMessage('the worker is sending this');
    *     value.hereIsYourPort.close();
    *   });
    * }
    * ```
    * @since v10.5.0
    */
  @JSImport("worker_threads", "Worker")
  @js.native
  open class Worker protected () extends StObject {
    /**
      * @param filename  The path to the Worker’s main script or module.
      *                  Must be either an absolute path or a relative path (i.e. relative to the current working directory) starting with ./ or ../,
      *                  or a WHATWG URL object using file: protocol. If options.eval is true, this is a string containing JavaScript code rather than a path.
      */
    def this(filename: String) = this()
    def this(filename: URL) = this()
    def this(filename: String, options: WorkerOptions) = this()
    def this(filename: URL, options: WorkerOptions) = this()
    
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    def emit(event: String, args: Any*): Boolean = js.native
    def emit(event: js.Symbol, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_exit(event: exit, exitCode: Double): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, value: Any): Boolean = js.native
    @JSName("emit")
    def emit_messageerror(event: messageerror, error: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_online(event: online): Boolean = js.native
    
    /**
      * Returns a readable stream for a V8 snapshot of the current state of the Worker.
      * See `v8.getHeapSnapshot()` for more details.
      *
      * If the Worker thread is no longer running, which may occur before the `'exit' event` is emitted, the returned `Promise` is rejected
      * immediately with an `ERR_WORKER_NOT_RUNNING` error.
      * @since v13.9.0, v12.17.0
      * @return A promise for a Readable Stream containing a V8 heap snapshot
      */
    def getHeapSnapshot(): js.Promise[Readable] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("off")
    def off_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("off")
    def off_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("off")
    def off_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("off")
    def off_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("off")
    def off_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("once")
    def once_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * An object that can be used to query performance information from a worker
      * instance. Similar to `perf_hooks.performance`.
      * @since v15.1.0, v14.17.0, v12.22.0
      */
    val performance: WorkerPerformance = js.native
    
    /**
      * Send a message to the worker that is received via `require('worker_threads').parentPort.on('message')`.
      * See `port.postMessage()` for more details.
      * @since v10.5.0
      */
    def postMessage(value: Any): Unit = js.native
    def postMessage(value: Any, transferList: js.Array[TransferListItem]): Unit = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Opposite of `unref()`, calling `ref()` on a previously `unref()`ed worker does _not_ let the program exit if it's the only active handle left (the default
      * behavior). If the worker is `ref()`ed, calling `ref()` again has
      * no effect.
      * @since v10.5.0
      */
    def ref(): Unit = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_exit(event: exit, listener: js.Function1[/* exitCode */ Double, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_message(event: message, listener: js.Function1[/* value */ Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_messageerror(event: messageerror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_online(event: online, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * Provides the set of JS engine resource constraints for this Worker thread.
      * If the `resourceLimits` option was passed to the `Worker` constructor,
      * this matches its values.
      *
      * If the worker has stopped, the return value is an empty object.
      * @since v13.2.0, v12.16.0
      */
    val resourceLimits: js.UndefOr[ResourceLimits_] = js.native
    
    /**
      * This is a readable stream which contains data written to `process.stderr` inside the worker thread. If `stderr: true` was not passed to the `Worker` constructor, then data is piped to the
      * parent thread's `process.stderr` stream.
      * @since v10.5.0
      */
    val stderr: Readable = js.native
    
    /**
      * If `stdin: true` was passed to the `Worker` constructor, this is a
      * writable stream. The data written to this stream will be made available in
      * the worker thread as `process.stdin`.
      * @since v10.5.0
      */
    val stdin: Writable | Null = js.native
    
    /**
      * This is a readable stream which contains data written to `process.stdout` inside the worker thread. If `stdout: true` was not passed to the `Worker` constructor, then data is piped to the
      * parent thread's `process.stdout` stream.
      * @since v10.5.0
      */
    val stdout: Readable = js.native
    
    /**
      * Stop all JavaScript execution in the worker thread as soon as possible.
      * Returns a Promise for the exit code that is fulfilled when the `'exit' event` is emitted.
      * @since v10.5.0
      */
    def terminate(): js.Promise[Double] = js.native
    
    /**
      * An integer identifier for the referenced thread. Inside the worker thread,
      * it is available as `require('worker_threads').threadId`.
      * This value is unique for each `Worker` instance inside a single process.
      * @since v10.5.0
      */
    val threadId: Double = js.native
    
    /**
      * Calling `unref()` on a worker allows the thread to exit if this is the only
      * active handle in the event system. If the worker is already `unref()`ed calling`unref()` again has no effect.
      * @since v10.5.0
      */
    def unref(): Unit = js.native
  }
  
  /**
    * Within a worker thread, `worker.getEnvironmentData()` returns a clone
    * of data passed to the spawning thread's `worker.setEnvironmentData()`.
    * Every new `Worker` receives its own copy of the environment data
    * automatically.
    *
    * ```js
    * const {
    *   Worker,
    *   isMainThread,
    *   setEnvironmentData,
    *   getEnvironmentData,
    * } = require('worker_threads');
    *
    * if (isMainThread) {
    *   setEnvironmentData('Hello', 'World!');
    *   const worker = new Worker(__filename);
    * } else {
    *   console.log(getEnvironmentData('Hello'));  // Prints 'World!'.
    * }
    * ```
    * @since v15.12.0, v14.18.0
    * @param key Any arbitrary, cloneable JavaScript value that can be used as a {Map} key.
    */
  inline def getEnvironmentData(key: Serializable): Serializable = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentData")(key.asInstanceOf[js.Any]).asInstanceOf[Serializable]
  
  @JSImport("worker_threads", "isMainThread")
  @js.native
  val isMainThread: Boolean = js.native
  
  /**
    * Mark an object as not transferable. If `object` occurs in the transfer list of
    * a `port.postMessage()` call, it is ignored.
    *
    * In particular, this makes sense for objects that can be cloned, rather than
    * transferred, and which are used by other objects on the sending side.
    * For example, Node.js marks the `ArrayBuffer`s it uses for its `Buffer pool` with this.
    *
    * This operation cannot be undone.
    *
    * ```js
    * const { MessageChannel, markAsUntransferable } = require('worker_threads');
    *
    * const pooledBuffer = new ArrayBuffer(8);
    * const typedArray1 = new Uint8Array(pooledBuffer);
    * const typedArray2 = new Float64Array(pooledBuffer);
    *
    * markAsUntransferable(pooledBuffer);
    *
    * const { port1 } = new MessageChannel();
    * port1.postMessage(typedArray1, [ typedArray1.buffer ]);
    *
    * // The following line prints the contents of typedArray1 -- it still owns
    * // its memory and has been cloned, not transferred. Without
    * // `markAsUntransferable()`, this would print an empty Uint8Array.
    * // typedArray2 is intact as well.
    * console.log(typedArray1);
    * console.log(typedArray2);
    * ```
    *
    * There is no equivalent to this API in browsers.
    * @since v14.5.0, v12.19.0
    */
  inline def markAsUntransferable(`object`: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markAsUntransferable")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Transfer a `MessagePort` to a different `vm` Context. The original `port`object is rendered unusable, and the returned `MessagePort` instance
    * takes its place.
    *
    * The returned `MessagePort` is an object in the target context and
    * inherits from its global `Object` class. Objects passed to the [`port.onmessage()`](https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/onmessage) listener are also created in the
    * target context
    * and inherit from its global `Object` class.
    *
    * However, the created `MessagePort` no longer inherits from [`EventTarget`](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget), and only
    * [`port.onmessage()`](https://developer.mozilla.org/en-US/docs/Web/API/MessagePort/onmessage) can be used to receive
    * events using it.
    * @since v11.13.0
    * @param port The message port to transfer.
    * @param contextifiedSandbox A `contextified` object as returned by the `vm.createContext()` method.
    */
  inline def moveMessagePortToContext(port: MessagePort, contextifiedSandbox: Context): MessagePort = (^.asInstanceOf[js.Dynamic].applyDynamic("moveMessagePortToContext")(port.asInstanceOf[js.Any], contextifiedSandbox.asInstanceOf[js.Any])).asInstanceOf[MessagePort]
  
  @JSImport("worker_threads", "parentPort")
  @js.native
  val parentPort: Null | MessagePort = js.native
  
  /**
    * Receive a single message from a given `MessagePort`. If no message is available,`undefined` is returned, otherwise an object with a single `message` property
    * that contains the message payload, corresponding to the oldest message in the`MessagePort`’s queue.
    *
    * ```js
    * const { MessageChannel, receiveMessageOnPort } = require('worker_threads');
    * const { port1, port2 } = new MessageChannel();
    * port1.postMessage({ hello: 'world' });
    *
    * console.log(receiveMessageOnPort(port2));
    * // Prints: { message: { hello: 'world' } }
    * console.log(receiveMessageOnPort(port2));
    * // Prints: undefined
    * ```
    *
    * When this function is used, no `'message'` event is emitted and the`onmessage` listener is not invoked.
    * @since v12.3.0
    */
  inline def receiveMessageOnPort(port: MessagePort): js.UndefOr[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("receiveMessageOnPort")(port.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Message]]
  
  @JSImport("worker_threads", "resourceLimits")
  @js.native
  val resourceLimits: ResourceLimits_ = js.native
  
  /**
    * The `worker.setEnvironmentData()` API sets the content of`worker.getEnvironmentData()` in the current thread and all new `Worker`instances spawned from the current context.
    * @since v15.12.0, v14.18.0
    * @param key Any arbitrary, cloneable JavaScript value that can be used as a {Map} key.
    * @param value Any arbitrary, cloneable JavaScript value that will be cloned and passed automatically to all new `Worker` instances. If `value` is passed as `undefined`, any previously set value
    * for the `key` will be deleted.
    */
  inline def setEnvironmentData(key: Serializable, value: Serializable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEnvironmentData")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("worker_threads", "threadId")
  @js.native
  val threadId: Double = js.native
  
  @JSImport("worker_threads", "workerData")
  @js.native
  val workerData: Any = js.native
  
  trait ResourceLimits_ extends StObject {
    
    /**
      * The size of a pre-allocated memory range used for generated code.
      */
    var codeRangeSizeMb: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum size of the main heap in MB.
      */
    var maxOldGenerationSizeMb: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum size of a heap space for recently created objects.
      */
    var maxYoungGenerationSizeMb: js.UndefOr[Double] = js.undefined
    
    /**
      * The default maximum stack size for the thread. Small values may lead to unusable Worker instances.
      * @default 4
      */
    var stackSizeMb: js.UndefOr[Double] = js.undefined
  }
  object ResourceLimits_ {
    
    inline def apply(): ResourceLimits_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceLimits_]
    }
    
    extension [Self <: ResourceLimits_](x: Self) {
      
      inline def setCodeRangeSizeMb(value: Double): Self = StObject.set(x, "codeRangeSizeMb", value.asInstanceOf[js.Any])
      
      inline def setCodeRangeSizeMbUndefined: Self = StObject.set(x, "codeRangeSizeMb", js.undefined)
      
      inline def setMaxOldGenerationSizeMb(value: Double): Self = StObject.set(x, "maxOldGenerationSizeMb", value.asInstanceOf[js.Any])
      
      inline def setMaxOldGenerationSizeMbUndefined: Self = StObject.set(x, "maxOldGenerationSizeMb", js.undefined)
      
      inline def setMaxYoungGenerationSizeMb(value: Double): Self = StObject.set(x, "maxYoungGenerationSizeMb", value.asInstanceOf[js.Any])
      
      inline def setMaxYoungGenerationSizeMbUndefined: Self = StObject.set(x, "maxYoungGenerationSizeMb", js.undefined)
      
      inline def setStackSizeMb(value: Double): Self = StObject.set(x, "stackSizeMb", value.asInstanceOf[js.Any])
      
      inline def setStackSizeMbUndefined: Self = StObject.set(x, "stackSizeMb", js.undefined)
    }
  }
  
  type Serializable = String | js.Object | Double | Boolean | js.BigInt
  
  /* Rewritten from type alias, can be one of: 
    - js.typedarray.ArrayBuffer
    - typings.node.workerThreadsMod.MessagePort
    - typings.node.fsPromisesMod.FileHandle
    - typings.node.nodeCryptoMod.X509Certificate
    - typings.node.nodeBufferMod.Blob
  */
  type TransferListItem = _TransferListItem | js.typedarray.ArrayBuffer
  
  trait WorkerOptions extends StObject {
    
    /**
      * List of arguments which would be stringified and appended to
      * `process.argv` in the worker. This is mostly similar to the `workerData`
      * but the values will be available on the global `process.argv` as if they
      * were passed as CLI options to the script.
      */
    var argv: js.UndefOr[js.Array[Any]] = js.undefined
    
    var env: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.Dict<string> */ Any) | js.Symbol
      ] = js.undefined
    
    var eval: js.UndefOr[Boolean] = js.undefined
    
    var execArgv: js.UndefOr[js.Array[String]] = js.undefined
    
    var resourceLimits: js.UndefOr[ResourceLimits_] = js.undefined
    
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdin: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var trackUnmanagedFds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional data to send in the first worker message.
      */
    var transferList: js.UndefOr[js.Array[TransferListItem]] = js.undefined
    
    var workerData: js.UndefOr[Any] = js.undefined
  }
  object WorkerOptions {
    
    inline def apply(): WorkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkerOptions]
    }
    
    extension [Self <: WorkerOptions](x: Self) {
      
      inline def setArgv(value: js.Array[Any]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      inline def setArgvVarargs(value: Any*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setEnv(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.Dict<string> */ Any) | js.Symbol
      ): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setEval(value: Boolean): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      inline def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
      
      inline def setResourceLimits(value: ResourceLimits_): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
      
      inline def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setTrackUnmanagedFds(value: Boolean): Self = StObject.set(x, "trackUnmanagedFds", value.asInstanceOf[js.Any])
      
      inline def setTrackUnmanagedFdsUndefined: Self = StObject.set(x, "trackUnmanagedFds", js.undefined)
      
      inline def setTransferList(value: js.Array[TransferListItem]): Self = StObject.set(x, "transferList", value.asInstanceOf[js.Any])
      
      inline def setTransferListUndefined: Self = StObject.set(x, "transferList", js.undefined)
      
      inline def setTransferListVarargs(value: TransferListItem*): Self = StObject.set(x, "transferList", js.Array(value*))
      
      inline def setWorkerData(value: Any): Self = StObject.set(x, "workerData", value.asInstanceOf[js.Any])
      
      inline def setWorkerDataUndefined: Self = StObject.set(x, "workerData", js.undefined)
    }
  }
  
  trait WorkerPerformance extends StObject {
    
    def eventLoopUtilization(): EventLoopUtilization
    def eventLoopUtilization(util1: Unit, util2: EventLoopUtilization): EventLoopUtilization
    def eventLoopUtilization(util1: EventLoopUtilization): EventLoopUtilization
    def eventLoopUtilization(util1: EventLoopUtilization, util2: EventLoopUtilization): EventLoopUtilization
    @JSName("eventLoopUtilization")
    var eventLoopUtilization_Original: EventLoopUtilityFunction
  }
  object WorkerPerformance {
    
    inline def apply(
      eventLoopUtilization: (/* util1 */ js.UndefOr[EventLoopUtilization], /* util2 */ js.UndefOr[EventLoopUtilization]) => EventLoopUtilization
    ): WorkerPerformance = {
      val __obj = js.Dynamic.literal(eventLoopUtilization = js.Any.fromFunction2(eventLoopUtilization))
      __obj.asInstanceOf[WorkerPerformance]
    }
    
    extension [Self <: WorkerPerformance](x: Self) {
      
      inline def setEventLoopUtilization(
        value: (/* util1 */ js.UndefOr[EventLoopUtilization], /* util2 */ js.UndefOr[EventLoopUtilization]) => EventLoopUtilization
      ): Self = StObject.set(x, "eventLoopUtilization", js.Any.fromFunction2(value))
    }
  }
  
  trait _TransferListItem extends StObject
}
