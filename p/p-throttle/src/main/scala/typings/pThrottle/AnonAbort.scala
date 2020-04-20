package typings.pThrottle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbort extends js.Object {
  /**
  		Abort pending executions. All unresolved promises are rejected with a `pThrottle.AbortError` error.
  		*/
  def abort(): Unit
}

object AnonAbort {
  @scala.inline
  def apply(abort: () => Unit): AnonAbort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[AnonAbort]
  }
}

