package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartTitle extends Entity {
  /** Represents the formatting of a chart title, which includes fill and font formatting. Read-only. */
  var format: js.UndefOr[WorkbookChartTitleFormat] = js.undefined
  /** Boolean value representing if the chart title will overlay the chart or not. */
  var overlay: js.UndefOr[scala.Boolean] = js.undefined
  /** Represents the title text of a chart. */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** A boolean value the represents the visibility of a chart title object. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkbookChartTitle {
  @scala.inline
  def apply(
    format: WorkbookChartTitleFormat = null,
    id: java.lang.String = null,
    overlay: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): WorkbookChartTitle = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[WorkbookChartTitle]
  }
}

