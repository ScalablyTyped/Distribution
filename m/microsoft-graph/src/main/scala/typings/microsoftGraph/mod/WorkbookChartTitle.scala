package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartTitle extends Entity {
  // Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
  var format: js.UndefOr[WorkbookChartTitleFormat] = js.undefined
  // Boolean value representing if the chart title will overlay the chart or not.
  var overlay: js.UndefOr[Boolean] = js.undefined
  // Represents the title text of a chart.
  var text: js.UndefOr[String] = js.undefined
  // A boolean value the represents the visibility of a chart title object.
  var visible: js.UndefOr[Boolean] = js.undefined
}

object WorkbookChartTitle {
  @scala.inline
  def apply(
    format: WorkbookChartTitleFormat = null,
    id: String = null,
    overlay: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): WorkbookChartTitle = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartTitle]
  }
}

