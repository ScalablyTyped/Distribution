package typings
package pinkyswearLib.PinkySwearNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericPromise[T] extends Promise {
  /**
    * Fulfill or reject the promise.
    *
    * @param fulfilled true to fulfill promise, false to reject
    * @param value Value with which to fulfill or reject the promise
    */
  def apply(fulfilled: scala.Boolean, value: T): scala.Boolean = js.native
  /**
    * onFulfilled is called when or if the promise is resolved.
    * onRejected is called when or if the promise is rejected.
    *
    * @param onFulfilled Called when or if the promise is resolved.
    * @param onRejected Called when or if the promise is rejected.
    * @returns PinkySwear.GenericPromise
    */
  @JSName("then")
  def then_GGenericPromise[G](): GenericPromise[G] = js.native
  @JSName("then")
  def then_GGenericPromise[G](onFulfilled: js.Function1[/* value */ T, G | GenericPromise[G]]): GenericPromise[G] = js.native
  @JSName("then")
  def then_GGenericPromise[G](
    onFulfilled: js.Function1[/* value */ T, G | GenericPromise[G]],
    onRejected: js.Function1[(/* value */ T) | (/* error */ stdLib.TypeError), scala.Unit]
  ): GenericPromise[G] = js.native
}

