package typings.microsoftDashGraph.microsoftDashGraphMod

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
    deleted: Int | Double = null,
    remaining: Int | Double = null,
    state: String = null,
    total: Int | Double = null,
    used: Int | Double = null
  ): Quota = {
    val __obj = js.Dynamic.literal()
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (remaining != null) __obj.updateDynamic("remaining")(remaining.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (used != null) __obj.updateDynamic("used")(used.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quota]
  }
}

