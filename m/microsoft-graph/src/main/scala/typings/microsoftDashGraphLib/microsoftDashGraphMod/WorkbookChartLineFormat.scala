package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartLineFormat extends Entity {
  /** HTML color code representing the color of lines in the chart. */
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object WorkbookChartLineFormat {
  @scala.inline
  def apply(color: java.lang.String = null, id: java.lang.String = null): WorkbookChartLineFormat = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WorkbookChartLineFormat]
  }
}

