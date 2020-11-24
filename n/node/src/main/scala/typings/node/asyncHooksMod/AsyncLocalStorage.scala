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
    * `asyncLocalStorage.run()` is called again.
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
    * This methods runs a function synchronously outside of a context and return its
    * return value. The store is not accessible within the callback function or the
    * asynchronous operations created within the callback.
    *
    * Optionally, arguments can be passed to the function. They will be passed to the
    * callback function.
    *
    * If the callback function throws an error, it will be thrown by `exit` too. The
    * stacktrace will not be impacted by this call and the context will be
    * re-entered.
    */
  // TODO: Apply generic vararg once available
  def exit[R](callback: js.Function1[/* repeated */ js.Any, R], args: js.Any*): R = js.native
  
  /**
    * This method returns the current store. If this method is called outside of an
    * asynchronous context initialized by calling `asyncLocalStorage.run`, it will
    * return `undefined`.
    */
  def getStore(): js.UndefOr[T] = js.native
  
  /**
    * This methods runs a function synchronously within a context and return its
    * return value. The store is not accessible outside of the callback function or
    * the asynchronous operations created within the callback.
    *
    * Optionally, arguments can be passed to the function. They will be passed to the
    * callback function.
    *
    * I the callback function throws an error, it will be thrown by `run` too. The
    * stacktrace will not be impacted by this call and the context will be exited.
    */
  // TODO: Apply generic vararg once available
  def run[R](store: T, callback: js.Function1[/* repeated */ js.Any, R], args: js.Any*): R = js.native
}
