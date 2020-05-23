package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartAxisTitle extends Entity {
  // Represents the formatting of chart axis title. Read-only.
  var format: js.UndefOr[WorkbookChartAxisTitleFormat] = js.undefined
  // Represents the axis title.
  var text: js.UndefOr[String] = js.undefined
  // A boolean that specifies the visibility of an axis title.
  var visible: js.UndefOr[Boolean] = js.undefined
}

object WorkbookChartAxisTitle {
  @scala.inline
  def apply(
    format: WorkbookChartAxisTitleFormat = null,
    id: String = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): WorkbookChartAxisTitle = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartAxisTitle]
  }
}

