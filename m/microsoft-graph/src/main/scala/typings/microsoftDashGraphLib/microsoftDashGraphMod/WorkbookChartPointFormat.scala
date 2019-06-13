package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartPointFormat extends Entity {
  /** Represents the fill format of a chart, which includes background formating information. Read-only. */
  var fill: js.UndefOr[WorkbookChartFill] = js.undefined
}

object WorkbookChartPointFormat {
  @scala.inline
  def apply(fill: WorkbookChartFill = null, id: java.lang.String = null): WorkbookChartPointFormat = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WorkbookChartPointFormat]
  }
}

