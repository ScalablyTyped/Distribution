package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemAnalytics extends Entity {
  var allTime: js.UndefOr[ItemActivityStat] = js.native
  var itemActivityStats: js.UndefOr[js.Array[ItemActivityStat]] = js.native
  var lastSevenDays: js.UndefOr[ItemActivityStat] = js.native
}

object ItemAnalytics {
  @scala.inline
  def apply(): ItemAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemAnalytics]
  }
  @scala.inline
  implicit class ItemAnalyticsOps[Self <: ItemAnalytics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllTime(value: ItemActivityStat): Self = this.set("allTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllTime: Self = this.set("allTime", js.undefined)
    @scala.inline
    def setItemActivityStatsVarargs(value: ItemActivityStat*): Self = this.set("itemActivityStats", js.Array(value :_*))
    @scala.inline
    def setItemActivityStats(value: js.Array[ItemActivityStat]): Self = this.set("itemActivityStats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemActivityStats: Self = this.set("itemActivityStats", js.undefined)
    @scala.inline
    def setLastSevenDays(value: ItemActivityStat): Self = this.set("lastSevenDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSevenDays: Self = this.set("lastSevenDays", js.undefined)
  }
  
}

