package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quota extends js.Object {
  // Total space consumed by files in the recycle bin, in bytes. Read-only.
  var deleted: js.UndefOr[Double] = js.undefined
  // Total space remaining before reaching the quota limit, in bytes. Read-only.
  var remaining: js.UndefOr[Double] = js.undefined
  // Enumeration value that indicates the state of the storage space. Read-only.
  var state: js.UndefOr[String] = js.undefined
  // Total allowed storage space, in bytes. Read-only.
  var total: js.UndefOr[Double] = js.undefined
  // Total space used, in bytes. Read-only.
  var used: js.UndefOr[Double] = js.undefined
}

object Quota {
  @scala.inline
  def apply(
    deleted: js.UndefOr[Double] = js.undefined,
    remaining: js.UndefOr[Double] = js.undefined,
    state: String = null,
    total: js.UndefOr[Double] = js.undefined,
    used: js.UndefOr[Double] = js.undefined
  ): Quota = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remaining)) __obj.updateDynamic("remaining")(remaining.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(used)) __obj.updateDynamic("used")(used.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quota]
  }
}

