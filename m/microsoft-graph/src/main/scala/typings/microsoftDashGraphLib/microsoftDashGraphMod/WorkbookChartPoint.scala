package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartPoint extends Entity {
  /** Encapsulates the format properties chart point. Read-only. */
  var format: js.UndefOr[WorkbookChartPointFormat] = js.undefined
  /** Returns the value of a chart point. Read-only. */
  var value: js.UndefOr[js.Any] = js.undefined
}

object WorkbookChartPoint {
  @scala.inline
  def apply(format: WorkbookChartPointFormat = null, id: java.lang.String = null, value: js.Any = null): WorkbookChartPoint = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[WorkbookChartPoint]
  }
}

