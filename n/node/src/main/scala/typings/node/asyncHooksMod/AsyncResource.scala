package typings.node.asyncHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The class AsyncResource was designed to be extended by the embedder's async resources.
  * Using this users can easily trigger the lifetime events of their own resources.
  */
@JSImport("async_hooks", "AsyncResource")
@js.native
class AsyncResource protected () extends js.Object {
  /**
    * AsyncResource() is meant to be extended. Instantiating a
    * new AsyncResource() also triggers init. If triggerAsyncId is omitted then
    * async_hook.executionAsyncId() is used.
    * @param type The type of async event.
    * @param triggerAsyncId The ID of the execution context that created
    *   this async event (default: `executionAsyncId()`), or an
    *   AsyncResourceOptions object (since 9.3)
    */
  def this(`type`: String) = this()
  def this(`type`: String, triggerAsyncId: Double) = this()
  def this(`type`: String, triggerAsyncId: AsyncResourceOptions) = this()
  /**
    * @return the unique ID assigned to this AsyncResource instance.
    */
  def asyncId(): Double = js.native
  /**
    * Call AsyncHooks destroy callbacks.
    */
  def emitDestroy(): Unit = js.native
  /**
    * Call the provided function with the provided arguments in the
    * execution context of the async resource. This will establish the
    * context, trigger the AsyncHooks before callbacks, call the function,
    * trigger the AsyncHooks after callbacks, and then restore the original
    * execution context.
    * @param fn The function to call in the execution context of this
    *   async resource.
    * @param thisArg The receiver to be used for the function call.
    * @param args Optional arguments to pass to the function.
    */
  def runInAsyncScope[This, Result](fn: js.ThisFunction1[/* this */ This, /* repeated */ js.Any, Result]): Result = js.native
  def runInAsyncScope[This, Result](fn: js.ThisFunction1[/* this */ This, /* repeated */ js.Any, Result], thisArg: This, args: js.Any*): Result = js.native
  /**
    * @return the trigger ID for this AsyncResource instance.
    */
  def triggerAsyncId(): Double = js.native
}

