package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartPointFormat extends Entity {
  // Represents the fill format of a chart, which includes background formating information. Read-only.
  var fill: js.UndefOr[WorkbookChartFill] = js.undefined
}

object WorkbookChartPointFormat {
  @scala.inline
  def apply(fill: WorkbookChartFill = null, id: String = null): WorkbookChartPointFormat = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartPointFormat]
  }
}

