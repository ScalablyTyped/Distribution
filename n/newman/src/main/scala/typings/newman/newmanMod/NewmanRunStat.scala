package typings.newman.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunStat extends js.Object {
  var failed: js.UndefOr[Double] = js.undefined
  var pending: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object NewmanRunStat {
  @scala.inline
  def apply(failed: Int | Double = null, pending: Int | Double = null, total: Int | Double = null): NewmanRunStat = {
    val __obj = js.Dynamic.literal()
    if (failed != null) __obj.updateDynamic("failed")(failed.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunStat]
  }
}

