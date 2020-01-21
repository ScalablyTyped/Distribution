package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartGridlines extends Entity {
  // Represents the formatting of chart gridlines. Read-only.
  var format: js.UndefOr[WorkbookChartGridlinesFormat] = js.undefined
  // Boolean value representing if the axis gridlines are visible or not.
  var visible: js.UndefOr[Boolean] = js.undefined
}

object WorkbookChartGridlines {
  @scala.inline
  def apply(
    format: WorkbookChartGridlinesFormat = null,
    id: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): WorkbookChartGridlines = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartGridlines]
  }
}

