package typings.naverDashWhale.whaleNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovedResult extends js.Object {
  /** True if all history was removed. If true, then urls will be empty. */
  var allHistory: Boolean
  /** Optional. */
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}

object RemovedResult {
  @scala.inline
  def apply(allHistory: Boolean, urls: js.Array[String] = null): RemovedResult = {
    val __obj = js.Dynamic.literal(allHistory = allHistory)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[RemovedResult]
  }
}

