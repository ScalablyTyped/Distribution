package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartAxisTitleFormat extends Entity {
  // Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only.
  var font: js.UndefOr[WorkbookChartFont] = js.undefined
}

object WorkbookChartAxisTitleFormat {
  @scala.inline
  def apply(font: WorkbookChartFont = null, id: String = null): WorkbookChartAxisTitleFormat = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartAxisTitleFormat]
  }
}

