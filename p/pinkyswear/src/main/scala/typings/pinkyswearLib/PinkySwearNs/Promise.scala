package typings
package pinkyswearLib.PinkySwearNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise extends js.Object {
  /**
           * Get the promise's current state; true if fulfilled, false if rejected, and undefined, otherwise.
           */
  def apply(): scala.Boolean = js.native
  /**
           * Fulfill or reject the promise.
           *
           * @param fulfilled true to fulfill promise, false to reject
           * @param values Value(s) with which to fulfill or reject the promise
           * @returns PinkySwear.Promise
           */
  def apply(fulfilled: scala.Boolean, values: js.Any*): Promise = js.native
  /**
           * onFulfilled is called when or if the promise is resolved.
           * onRejected is called when or if the promise is rejected.
           *
           * @param onFulfilled Called when or if the promise is resolved.
           * @param onRejected Called when or if the promise is rejected.
           * @returns PinkySwear.Promise
           */
  def `then`(): Promise = js.native
  /**
           * onFulfilled is called when or if the promise is resolved.
           * onRejected is called when or if the promise is rejected.
           *
           * @param onFulfilled Called when or if the promise is resolved.
           * @param onRejected Called when or if the promise is rejected.
           * @returns PinkySwear.Promise
           */
  def `then`(onFulfilled: js.Function1[/* repeated */js.Any, this.type | scala.Unit | _]): Promise = js.native
  /**
           * onFulfilled is called when or if the promise is resolved.
           * onRejected is called when or if the promise is rejected.
           *
           * @param onFulfilled Called when or if the promise is resolved.
           * @param onRejected Called when or if the promise is rejected.
           * @returns PinkySwear.Promise
           */
  def `then`(
    onFulfilled: js.Function1[/* repeated */js.Any, this.type | scala.Unit | _],
    onRejected: js.Function1[/* repeated */js.Any, scala.Unit]
  ): Promise = js.native
}

