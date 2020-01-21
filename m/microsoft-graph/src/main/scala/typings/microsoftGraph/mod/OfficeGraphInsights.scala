package typings.microsoftGraph.mod

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
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (shared != null) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (trending != null) __obj.updateDynamic("trending")(trending.asInstanceOf[js.Any])
    if (used != null) __obj.updateDynamic("used")(used.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfficeGraphInsights]
  }
}

