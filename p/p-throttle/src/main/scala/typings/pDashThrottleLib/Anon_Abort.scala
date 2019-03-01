package typings
package pDashThrottleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abort extends js.Object {
  /**
  	 * Abort pending executions. All unresolved promises are rejected with a `pThrottle.AbortError` error.
  	 */
  def abort(): scala.Unit
}

object Anon_Abort {
  @scala.inline
  def apply(abort: js.Function0[scala.Unit]): Anon_Abort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.asInstanceOf[Anon_Abort]
  }
}

