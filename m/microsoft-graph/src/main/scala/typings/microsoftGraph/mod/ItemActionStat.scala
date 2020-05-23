package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemActionStat extends js.Object {
  // The number of times the action took place. Read-only.
  var actionCount: js.UndefOr[Double] = js.undefined
  // The number of distinct actors that performed the action. Read-only.
  var actorCount: js.UndefOr[Double] = js.undefined
}

object ItemActionStat {
  @scala.inline
  def apply(actionCount: js.UndefOr[Double] = js.undefined, actorCount: js.UndefOr[Double] = js.undefined): ItemActionStat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actionCount)) __obj.updateDynamic("actionCount")(actionCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(actorCount)) __obj.updateDynamic("actorCount")(actorCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemActionStat]
  }
}

