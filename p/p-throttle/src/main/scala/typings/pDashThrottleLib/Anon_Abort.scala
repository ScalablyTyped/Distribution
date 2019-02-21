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

