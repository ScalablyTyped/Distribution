package typings.pDashCancelable.pDashCancelableMod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PCancelable[ValueType] extends Promise[ValueType] {
  /**
  	Whether the promise is canceled.
  	*/
  val isCanceled: Boolean = js.native
  /**
  	Cancel the promise and optionally provide a reason.
  	The cancellation is synchronous. Calling it after the promise has settled or multiple times does nothing.
  	@param reason - The cancellation reason to reject the promise with.
  	*/
  def cancel(): Unit = js.native
  def cancel(reason: String): Unit = js.native
}

