package typings
package newmanLib.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunStat extends js.Object {
  var failed: js.UndefOr[scala.Double] = js.undefined
  var pending: js.UndefOr[scala.Double] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object NewmanRunStat {
  @scala.inline
  def apply(
    failed: scala.Int | scala.Double = null,
    pending: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null
  ): NewmanRunStat = {
    val __obj = js.Dynamic.literal()
    if (failed != null) __obj.updateDynamic("failed")(failed.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunStat]
  }
}

