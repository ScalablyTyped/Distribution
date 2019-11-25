package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartLegendFormat extends Entity {
  // Represents the fill format of an object, which includes background formating information. Read-only.
  var fill: js.UndefOr[WorkbookChartFill] = js.undefined
  // Represents the font attributes such as font name, font size, color, etc. of a chart legend. Read-only.
  var font: js.UndefOr[WorkbookChartFont] = js.undefined
}

object WorkbookChartLegendFormat {
  @scala.inline
  def apply(fill: WorkbookChartFill = null, font: WorkbookChartFont = null, id: String = null): WorkbookChartLegendFormat = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartLegendFormat]
  }
}

