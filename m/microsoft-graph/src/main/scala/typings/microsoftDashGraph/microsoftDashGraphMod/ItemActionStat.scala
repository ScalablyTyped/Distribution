package typings.microsoftDashGraph.microsoftDashGraphMod

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
  def apply(actionCount: Int | Double = null, actorCount: Int | Double = null): ItemActionStat = {
    val __obj = js.Dynamic.literal()
    if (actionCount != null) __obj.updateDynamic("actionCount")(actionCount.asInstanceOf[js.Any])
    if (actorCount != null) __obj.updateDynamic("actorCount")(actorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemActionStat]
  }
}

