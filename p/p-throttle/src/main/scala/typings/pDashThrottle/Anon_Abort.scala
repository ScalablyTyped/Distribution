package typings.pDashThrottle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abort extends js.Object {
  /**
  		Abort pending executions. All unresolved promises are rejected with a `pThrottle.AbortError` error.
  		*/
  def abort(): Unit
}

object Anon_Abort {
  @scala.inline
  def apply(abort: () => Unit): Anon_Abort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
  
    __obj.asInstanceOf[Anon_Abort]
  }
}

