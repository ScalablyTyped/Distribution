package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartGridlines extends Entity {
  // Represents the formatting of chart gridlines. Read-only.
  var format: js.UndefOr[WorkbookChartGridlinesFormat] = js.undefined
  // Boolean value representing if the axis gridlines are visible or not.
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkbookChartGridlines {
  @scala.inline
  def apply(
    format: WorkbookChartGridlinesFormat = null,
    id: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): WorkbookChartGridlines = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[WorkbookChartGridlines]
  }
}

