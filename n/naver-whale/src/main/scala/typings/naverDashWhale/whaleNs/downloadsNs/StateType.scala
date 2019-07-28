package typings.naverDashWhale.whaleNs.downloadsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  val COMPLETE: String
  val INTERRUPTED: String
  val IN_PROGRESS: String
}

object StateType {
  @scala.inline
  def apply(COMPLETE: String, INTERRUPTED: String, IN_PROGRESS: String): StateType = {
    val __obj = js.Dynamic.literal(COMPLETE = COMPLETE, INTERRUPTED = INTERRUPTED, IN_PROGRESS = IN_PROGRESS)
  
    __obj.asInstanceOf[StateType]
  }
}

