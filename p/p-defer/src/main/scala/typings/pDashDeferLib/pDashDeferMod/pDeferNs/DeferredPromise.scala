package typings
package pDashDeferLib.pDashDeferMod.pDeferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredPromise[ValueType] extends js.Object {
  /**
  		The deferred promise.
  		*/
  var promise: js.Promise[ValueType] = js.native
  /**
  		Reject the promise with a provided reason or error.
  		@param reason - The reason or error to reject the promise with.
  		*/
  def reject(): scala.Unit = js.native
  def reject(reason: js.Any): scala.Unit = js.native
  /**
  		Resolves the promise with a value or the result of another promise.
  		@param value - The value to resolve the promise with.
  		*/
  def resolve(): scala.Unit = js.native
  def resolve(value: ValueType): scala.Unit = js.native
  def resolve(value: js.Thenable[ValueType]): scala.Unit = js.native
}

