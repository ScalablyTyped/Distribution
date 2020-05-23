package typings.pThrottle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Abort extends js.Object {
  /**
  		Abort pending executions. All unresolved promises are rejected with a `pThrottle.AbortError` error.
  		*/
  def abort(): Unit
}

object Abort {
  @scala.inline
  def apply(abort: () => Unit): Abort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[Abort]
  }
}

