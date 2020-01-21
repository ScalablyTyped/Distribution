package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemAnalytics extends Entity {
  var allTime: js.UndefOr[ItemActivityStat] = js.undefined
  var itemActivityStats: js.UndefOr[js.Array[ItemActivityStat]] = js.undefined
  var lastSevenDays: js.UndefOr[ItemActivityStat] = js.undefined
}

object ItemAnalytics {
  @scala.inline
  def apply(
    allTime: ItemActivityStat = null,
    id: String = null,
    itemActivityStats: js.Array[ItemActivityStat] = null,
    lastSevenDays: ItemActivityStat = null
  ): ItemAnalytics = {
    val __obj = js.Dynamic.literal()
    if (allTime != null) __obj.updateDynamic("allTime")(allTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemActivityStats != null) __obj.updateDynamic("itemActivityStats")(itemActivityStats.asInstanceOf[js.Any])
    if (lastSevenDays != null) __obj.updateDynamic("lastSevenDays")(lastSevenDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAnalytics]
  }
}

