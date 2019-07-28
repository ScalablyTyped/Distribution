package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartAxisFormat extends Entity {
  // Represents the font attributes (font name, font size, color, etc.) for a chart axis element. Read-only.
  var font: js.UndefOr[WorkbookChartFont] = js.undefined
  // Represents chart line formatting. Read-only.
  var line: js.UndefOr[WorkbookChartLineFormat] = js.undefined
}

object WorkbookChartAxisFormat {
  @scala.inline
  def apply(font: WorkbookChartFont = null, id: String = null, line: WorkbookChartLineFormat = null): WorkbookChartAxisFormat = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (id != null) __obj.updateDynamic("id")(id)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[WorkbookChartAxisFormat]
  }
}

