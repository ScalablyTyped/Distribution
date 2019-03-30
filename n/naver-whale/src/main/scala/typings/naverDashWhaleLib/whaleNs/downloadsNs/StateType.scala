package typings
package naverDashWhaleLib.whaleNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  val COMPLETE: java.lang.String
  val INTERRUPTED: java.lang.String
  val IN_PROGRESS: java.lang.String
}

object StateType {
  @scala.inline
  def apply(COMPLETE: java.lang.String, INTERRUPTED: java.lang.String, IN_PROGRESS: java.lang.String): StateType = {
    val __obj = js.Dynamic.literal(COMPLETE = COMPLETE, INTERRUPTED = INTERRUPTED, IN_PROGRESS = IN_PROGRESS)
  
    __obj.asInstanceOf[StateType]
  }
}

