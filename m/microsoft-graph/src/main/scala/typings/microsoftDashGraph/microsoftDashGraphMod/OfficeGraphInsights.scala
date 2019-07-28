package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfficeGraphInsights extends Entity {
  var shared: js.UndefOr[js.Array[SharedInsight]] = js.undefined
  var trending: js.UndefOr[js.Array[Trending]] = js.undefined
  var used: js.UndefOr[js.Array[UsedInsight]] = js.undefined
}

object OfficeGraphInsights {
  @scala.inline
  def apply(
    id: String = null,
    shared: js.Array[SharedInsight] = null,
    trending: js.Array[Trending] = null,
    used: js.Array[UsedInsight] = null
  ): OfficeGraphInsights = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (shared != null) __obj.updateDynamic("shared")(shared)
    if (trending != null) __obj.updateDynamic("trending")(trending)
    if (used != null) __obj.updateDynamic("used")(used)
    __obj.asInstanceOf[OfficeGraphInsights]
  }
}

