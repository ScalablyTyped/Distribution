package typings.newman.mod

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
  def apply(
    failed: js.UndefOr[Double] = js.undefined,
    pending: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined
  ): NewmanRunStat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failed)) __obj.updateDynamic("failed")(failed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunStat]
  }
}

