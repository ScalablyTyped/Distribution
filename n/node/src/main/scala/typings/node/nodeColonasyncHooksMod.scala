package typings.node

import typings.node.asyncHooksMod.AsyncHook
import typings.node.asyncHooksMod.AsyncResourceOptions
import typings.node.asyncHooksMod.HookCallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonasyncHooksMod {
  
  @JSImport("node:async_hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This class creates stores that stay coherent through asynchronous operations.
    *
    * While you can create your own implementation on top of the `node:async_hooks`module, `AsyncLocalStorage` should be preferred as it is a performant and memory
    * safe implementation that involves significant optimizations that are non-obvious
    * to implement.
    *
    * The following example uses `AsyncLocalStorage` to build a simple logger
    * that assigns IDs to incoming HTTP requests and includes them in messages
    * logged within each request.
    *
    * ```js
    * import http from 'node:http';
    * import { AsyncLocalStorage } from 'node:async_hooks';
    *
    * const asyncLocalStorage = new AsyncLocalStorage();
    *
    * function logWithId(msg) {
    *   const id = asyncLocalStorage.getStore();
    *   console.log(`${id !== undefined ? id : '-'}:`, msg);
    * }
    *
    * let idSeq = 0;
    * http.createServer((req, res) => {
    *   asyncLocalStorage.run(idSeq++, () => {
    *     logWithId('start');
    *     // Imagine any chain of async operations here
    *     setImmediate(() => {
    *       logWithId('finish');
    *       res.end();
    *     });
    *   });
    * }).listen(8080);
    *
    * http.get('http://localhost:8080');
    * http.get('http://localhost:8080');
    * // Prints:
    * //   0: start
    * //   1: start
    * //   0: finish
    * //   1: finish
    * ```
    *
    * Each instance of `AsyncLocalStorage` maintains an independent storage context.
    * Multiple instances can safely exist simultaneously without risk of interfering
    * with each other's data.
    * @since v13.10.0, v12.17.0
    */
  @JSImport("node:async_hooks", "AsyncLocalStorage")
  @js.native
  open class AsyncLocalStorage[T] ()
    extends typings.node.asyncHooksMod.AsyncLocalStorage[T]
  object AsyncLocalStorage {
    
    @JSImport("node:async_hooks", "AsyncLocalStorage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Binds the given function to the current execution context.
      * @since v19.8.0
      * @experimental
      * @param fn The function to bind to the current execution context.
      * @return A new function that calls `fn` within the captured execution context.
      */
    /* static member */
    inline def bind[Func /* <: js.Function1[/* repeated */ Any, Any] */](fn: Func): Func = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any]).asInstanceOf[Func]
    
    /**
      * Captures the current execution context and returns a function that accepts a
      * function as an argument. Whenever the returned function is called, it
      * calls the function passed to it within the captured context.
      *
      * ```js
      * const asyncLocalStorage = new AsyncLocalStorage();
      * const runInAsyncScope = asyncLocalStorage.run(123, () => AsyncLocalStorage.snapshot());
      * const result = asyncLocalStorage.run(321, () => runInAsyncScope(() => asyncLocalStorage.getStore()));
      * console.log(result);  // returns 123
      * ```
      *
      * AsyncLocalStorage.snapshot() can replace the use of AsyncResource for simple
      * async context tracking purposes, for example:
      *
      * ```js
      * class Foo {
      *   #runInAsyncScope = AsyncLocalStorage.snapshot();
      *
      *   get() { return this.#runInAsyncScope(() => asyncLocalStorage.getStore()); }
      * }
      *
      * const foo = asyncLocalStorage.run(123, () => new Foo());
      * console.log(asyncLocalStorage.run(321, () => foo.get())); // returns 123
      * ```
      * @since v19.8.0
      * @experimental
      * @return A new function with the signature `(fn: (...args) : R, ...args) : R`.
      */
    /* static member */
    inline def snapshot(): js.Function2[/* fn */ js.Function1[/* args */ js.Array[Any], Any], /* args */ js.Array[Any], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")().asInstanceOf[js.Function2[/* fn */ js.Function1[/* args */ js.Array[Any], Any], /* args */ js.Array[Any], Any]]
  }
  
  /**
    * The class `AsyncResource` is designed to be extended by the embedder's async
    * resources. Using this, users can easily trigger the lifetime events of their
    * own resources.
    *
    * The `init` hook will trigger when an `AsyncResource` is instantiated.
    *
    * The following is an overview of the `AsyncResource` API.
    *
    * ```js
    * import { AsyncResource, executionAsyncId } from 'node:async_hooks';
    *
    * // AsyncResource() is meant to be extended. Instantiating a
    * // new AsyncResource() also triggers init. If triggerAsyncId is omitted then
    * // async_hook.executionAsyncId() is used.
    * const asyncResource = new AsyncResource(
    *   type, { triggerAsyncId: executionAsyncId(), requireManualDestroy: false },
    * );
    *
    * // Run a function in the execution context of the resource. This will
    * // * establish the context of the resource
    * // * trigger the AsyncHooks before callbacks
    * // * call the provided function `fn` with the supplied arguments
    * // * trigger the AsyncHooks after callbacks
    * // * restore the original execution context
    * asyncResource.runInAsyncScope(fn, thisArg, ...args);
    *
    * // Call AsyncHooks destroy callbacks.
    * asyncResource.emitDestroy();
    *
    * // Return the unique ID assigned to the AsyncResource instance.
    * asyncResource.asyncId();
    *
    * // Return the trigger ID for the AsyncResource instance.
    * asyncResource.triggerAsyncId();
    * ```
    */
  @JSImport("node:async_hooks", "AsyncResource")
  @js.native
  open class AsyncResource protected ()
    extends typings.node.asyncHooksMod.AsyncResource {
    /**
      * AsyncResource() is meant to be extended. Instantiating a
      * new AsyncResource() also triggers init. If triggerAsyncId is omitted then
      * async_hook.executionAsyncId() is used.
      * @param type The type of async event.
      * @param triggerAsyncId The ID of the execution context that created
      *   this async event (default: `executionAsyncId()`), or an
      *   AsyncResourceOptions object (since v9.3.0)
      */
    def this(`type`: String) = this()
    def this(`type`: String, triggerAsyncId: Double) = this()
    def this(`type`: String, triggerAsyncId: AsyncResourceOptions) = this()
  }
  object AsyncResource {
    
    @JSImport("node:async_hooks", "AsyncResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Binds the given function to the current execution context.
      * @since v14.8.0, v12.19.0
      * @param fn The function to bind to the current execution context.
      * @param type An optional name to associate with the underlying `AsyncResource`.
      */
    /* static member */
    inline def bind[Func /* <: js.ThisFunction1[/* this */ ThisArg, /* repeated */ Any, Any] */, ThisArg](fn: Func): Func = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any]).asInstanceOf[Func]
    inline def bind[Func /* <: js.ThisFunction1[/* this */ ThisArg, /* repeated */ Any, Any] */, ThisArg](fn: Func, `type`: String): Func = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Func]
    inline def bind[Func /* <: js.ThisFunction1[/* this */ ThisArg, /* repeated */ Any, Any] */, ThisArg](fn: Func, `type`: String, thisArg: ThisArg): Func = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Func]
    inline def bind[Func /* <: js.ThisFunction1[/* this */ ThisArg, /* repeated */ Any, Any] */, ThisArg](fn: Func, `type`: Unit, thisArg: ThisArg): Func = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Func]
  }
  
  /**
    * Registers functions to be called for different lifetime events of each async
    * operation.
    *
    * The callbacks `init()`/`before()`/`after()`/`destroy()` are called for the
    * respective asynchronous event during a resource's lifetime.
    *
    * All callbacks are optional. For example, if only resource cleanup needs to
    * be tracked, then only the `destroy` callback needs to be passed. The
    * specifics of all functions that can be passed to `callbacks` is in the `Hook Callbacks` section.
    *
    * ```js
    * import { createHook } from 'node:async_hooks';
    *
    * const asyncHook = createHook({
    *   init(asyncId, type, triggerAsyncId, resource) { },
    *   destroy(asyncId) { },
    * });
    * ```
    *
    * The callbacks will be inherited via the prototype chain:
    *
    * ```js
    * class MyAsyncCallbacks {
    *   init(asyncId, type, triggerAsyncId, resource) { }
    *   destroy(asyncId) {}
    * }
    *
    * class MyAddedCallbacks extends MyAsyncCallbacks {
    *   before(asyncId) { }
    *   after(asyncId) { }
    * }
    *
    * const asyncHook = async_hooks.createHook(new MyAddedCallbacks());
    * ```
    *
    * Because promises are asynchronous resources whose lifecycle is tracked
    * via the async hooks mechanism, the `init()`, `before()`, `after()`, and`destroy()` callbacks _must not_ be async functions that return promises.
    * @since v8.1.0
    * @param callbacks The `Hook Callbacks` to register
    * @return Instance used for disabling and enabling hooks
    */
  inline def createHook(callbacks: HookCallbacks): AsyncHook = ^.asInstanceOf[js.Dynamic].applyDynamic("createHook")(callbacks.asInstanceOf[js.Any]).asInstanceOf[AsyncHook]
  
  /**
    * ```js
    * import { executionAsyncId } from 'node:async_hooks';
    * import fs from 'node:fs';
    *
    * console.log(executionAsyncId());  // 1 - bootstrap
    * fs.open(path, 'r', (err, fd) => {
    *   console.log(executionAsyncId());  // 6 - open()
    * });
    * ```
    *
    * The ID returned from `executionAsyncId()` is related to execution timing, not
    * causality (which is covered by `triggerAsyncId()`):
    *
    * ```js
    * const server = net.createServer((conn) => {
    *   // Returns the ID of the server, not of the new connection, because the
    *   // callback runs in the execution scope of the server's MakeCallback().
    *   async_hooks.executionAsyncId();
    *
    * }).listen(port, () => {
    *   // Returns the ID of a TickObject (process.nextTick()) because all
    *   // callbacks passed to .listen() are wrapped in a nextTick().
    *   async_hooks.executionAsyncId();
    * });
    * ```
    *
    * Promise contexts may not get precise `executionAsyncIds` by default.
    * See the section on `promise execution tracking`.
    * @since v8.1.0
    * @return The `asyncId` of the current execution context. Useful to track when something calls.
    */
  inline def executionAsyncId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("executionAsyncId")().asInstanceOf[Double]
  
  /**
    * Resource objects returned by `executionAsyncResource()` are most often internal
    * Node.js handle objects with undocumented APIs. Using any functions or properties
    * on the object is likely to crash your application and should be avoided.
    *
    * Using `executionAsyncResource()` in the top-level execution context will
    * return an empty object as there is no handle or request object to use,
    * but having an object representing the top-level can be helpful.
    *
    * ```js
    * import { open } from 'node:fs';
    * import { executionAsyncId, executionAsyncResource } from 'node:async_hooks';
    *
    * console.log(executionAsyncId(), executionAsyncResource());  // 1 {}
    * open(new URL(import.meta.url), 'r', (err, fd) => {
    *   console.log(executionAsyncId(), executionAsyncResource());  // 7 FSReqWrap
    * });
    * ```
    *
    * This can be used to implement continuation local storage without the
    * use of a tracking `Map` to store the metadata:
    *
    * ```js
    * import { createServer } from 'node:http';
    * import {
    *   executionAsyncId,
    *   executionAsyncResource,
    *   createHook,
    * } from 'async_hooks';
    * const sym = Symbol('state'); // Private symbol to avoid pollution
    *
    * createHook({
    *   init(asyncId, type, triggerAsyncId, resource) {
    *     const cr = executionAsyncResource();
    *     if (cr) {
    *       resource[sym] = cr[sym];
    *     }
    *   },
    * }).enable();
    *
    * const server = createServer((req, res) => {
    *   executionAsyncResource()[sym] = { state: req.url };
    *   setTimeout(function() {
    *     res.end(JSON.stringify(executionAsyncResource()[sym]));
    *   }, 100);
    * }).listen(3000);
    * ```
    * @since v13.9.0, v12.17.0
    * @return The resource representing the current execution. Useful to store data within the resource.
    */
  inline def executionAsyncResource(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("executionAsyncResource")().asInstanceOf[js.Object]
  
  /**
    * ```js
    * const server = net.createServer((conn) => {
    *   // The resource that caused (or triggered) this callback to be called
    *   // was that of the new connection. Thus the return value of triggerAsyncId()
    *   // is the asyncId of "conn".
    *   async_hooks.triggerAsyncId();
    *
    * }).listen(port, () => {
    *   // Even though all callbacks passed to .listen() are wrapped in a nextTick()
    *   // the callback itself exists because the call to the server's .listen()
    *   // was made. So the return value would be the ID of the server.
    *   async_hooks.triggerAsyncId();
    * });
    * ```
    *
    * Promise contexts may not get valid `triggerAsyncId`s by default. See
    * the section on `promise execution tracking`.
    * @return The ID of the resource responsible for calling the callback that is currently being executed.
    */
  inline def triggerAsyncId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerAsyncId")().asInstanceOf[Double]
}
