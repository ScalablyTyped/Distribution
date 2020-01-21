package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartTitleFormat extends Entity {
  // Represents the fill format of an object, which includes background formatting information. Read-only.
  var fill: js.UndefOr[WorkbookChartFill] = js.undefined
  // Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
  var font: js.UndefOr[WorkbookChartFont] = js.undefined
}

object WorkbookChartTitleFormat {
  @scala.inline
  def apply(fill: WorkbookChartFill = null, font: WorkbookChartFont = null, id: String = null): WorkbookChartTitleFormat = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartTitleFormat]
  }
}

