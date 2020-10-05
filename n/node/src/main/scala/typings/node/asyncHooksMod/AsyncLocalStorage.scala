package typings.node.asyncHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When having multiple instances of `AsyncLocalStorage`, they are independent
  * from each other. It is safe to instantiate this class multiple times.
  */
@JSImport("async_hooks", "AsyncLocalStorage")
@js.native
class AsyncLocalStorage[T] () extends js.Object {
  /**
    * This method disables the instance of `AsyncLocalStorage`. All subsequent calls
    * to `asyncLocalStorage.getStore()` will return `undefined` until
    * `asyncLocalStorage.run()` or `asyncLocalStorage.runSyncAndReturn()`
    * is called again.
    *
    * When calling `asyncLocalStorage.disable()`, all current contexts linked to the
    * instance will be exited.
    *
    * Calling `asyncLocalStorage.disable()` is required before the
    * `asyncLocalStorage` can be garbage collected. This does not apply to stores
    * provided by the `asyncLocalStorage`, as those objects are garbage collected
    * along with the corresponding async resources.
    *
    * This method is to be used when the `asyncLocalStorage` is not in use anymore
    * in the current process.
    */
  def disable(): Unit = js.native
  /**
    * Calling `asyncLocalStorage.enterWith(store)` will transition into the context
    * for the remainder of the current synchronous execution and will persist
    * through any following asynchronous calls.
    */
  def enterWith(store: T): Unit = js.native
  /**
    * Calling `asyncLocalStorage.exit(callback)` will create a new asynchronous
    * context.
    * Within the callback function and the asynchronous operations from the callback,
    * `asyncLocalStorage.getStore()` will return `undefined`.
    *
    * The callback will be ran asynchronously. Optionally, arguments can be passed
    * to the function. They will be passed to the callback function.
    *
    * If an error is thrown by the callback function, it will not be caught by
    * a `try/catch` block as the callback is ran in a new asynchronous resource.
    * Also, the stacktrace will be impacted by the asynchronous call.
    */
  def exit(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Unit = js.native
  /**
    * This method returns the current store.
    * If this method is called outside of an asynchronous context initialized by
    * calling `asyncLocalStorage.run` or `asyncLocalStorage.runAndReturn`, it will
    * return `undefined`.
    */
  def getStore(): js.UndefOr[T] = js.native
  /**
    * Calling `asyncLocalStorage.run(callback)` will create a new asynchronous
    * context.
    * Within the callback function and the asynchronous operations from the callback,
    * `asyncLocalStorage.getStore()` will return an instance of `Map` known as
    * "the store". This store will be persistent through the following
    * asynchronous calls.
    *
    * The callback will be ran asynchronously. Optionally, arguments can be passed
    * to the function. They will be passed to the callback function.
    *
    * If an error is thrown by the callback function, it will not be caught by
    * a `try/catch` block as the callback is ran in a new asynchronous resource.
    * Also, the stacktrace will be impacted by the asynchronous call.
    */
  // TODO: Apply generic vararg once available
  def run(store: T, callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Unit = js.native
}

