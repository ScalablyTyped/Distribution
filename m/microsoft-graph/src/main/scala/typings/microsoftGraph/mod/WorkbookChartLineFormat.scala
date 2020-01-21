package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartLineFormat extends Entity {
  // HTML color code representing the color of lines in the chart.
  var color: js.UndefOr[String] = js.undefined
}

object WorkbookChartLineFormat {
  @scala.inline
  def apply(color: String = null, id: String = null): WorkbookChartLineFormat = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartLineFormat]
  }
}

