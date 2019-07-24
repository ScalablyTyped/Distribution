package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartAxisTitle extends Entity {
  // Represents the formatting of chart axis title. Read-only.
  var format: js.UndefOr[WorkbookChartAxisTitleFormat] = js.undefined
  // Represents the axis title.
  var text: js.UndefOr[java.lang.String] = js.undefined
  // A boolean that specifies the visibility of an axis title.
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkbookChartAxisTitle {
  @scala.inline
  def apply(
    format: WorkbookChartAxisTitleFormat = null,
    id: java.lang.String = null,
    text: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): WorkbookChartAxisTitle = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[WorkbookChartAxisTitle]
  }
}

