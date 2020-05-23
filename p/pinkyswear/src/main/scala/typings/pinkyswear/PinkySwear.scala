package typings.pinkyswear

import typings.std.TypeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PinkySwear")
@js.native
object PinkySwear extends js.Object {
  @js.native
  trait GenericPromise[T] extends Promise {
    /**
      * Fulfill or reject the promise.
      *
      * @param fulfilled true to fulfill promise, false to reject
      * @param value Value with which to fulfill or reject the promise
      */
    def apply(fulfilled: Boolean, value: T): Boolean = js.native
    /**
      * onFulfilled is called when or if the promise is resolved.
      * onRejected is called when or if the promise is rejected.
      *
      * @param onFulfilled Called when or if the promise is resolved.
      * @param onRejected Called when or if the promise is rejected.
      * @returns PinkySwear.GenericPromise
      */
    @JSName("then")
    def then_G_GenericPromise[G](): GenericPromise[G] = js.native
    @JSName("then")
    def then_G_GenericPromise[G](onFulfilled: js.Function1[/* value */ T, G | GenericPromise[G]]): GenericPromise[G] = js.native
    @JSName("then")
    def then_G_GenericPromise[G](
      onFulfilled: js.Function1[/* value */ T, G | GenericPromise[G]],
      onRejected: js.Function1[(/* value */ T) | (/* error */ TypeError), Unit]
    ): GenericPromise[G] = js.native
  }
  
  @js.native
  trait Promise extends js.Object {
    /**
      * Get the promise's current state; true if fulfilled, false if rejected, and undefined, otherwise.
      */
    def apply(): Boolean = js.native
    /**
      * Fulfill or reject the promise.
      *
      * @param fulfilled true to fulfill promise, false to reject
      * @param values Value(s) with which to fulfill or reject the promise
      * @returns PinkySwear.Promise
      */
    def apply(fulfilled: Boolean, values: js.Any*): Promise = js.native
    /**
      * onFulfilled is called when or if the promise is resolved.
      * onRejected is called when or if the promise is rejected.
      *
      * @param onFulfilled Called when or if the promise is resolved.
      * @param onRejected Called when or if the promise is rejected.
      * @returns PinkySwear.Promise
      */
    def `then`(): Promise = js.native
    def `then`(onFulfilled: js.Function1[/* repeated */ js.Any, this.type | Unit | _]): Promise = js.native
    def `then`(
      onFulfilled: js.Function1[/* repeated */ js.Any, this.type | Unit | _],
      onRejected: js.Function1[/* repeated */ js.Any, Unit]
    ): Promise = js.native
  }
  
}

