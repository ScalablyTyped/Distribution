package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartGridlinesFormat extends Entity {
  /** Represents chart line formatting. Read-only. */
  var line: js.UndefOr[WorkbookChartLineFormat] = js.undefined
}

object WorkbookChartGridlinesFormat {
  @scala.inline
  def apply(id: java.lang.String = null, line: WorkbookChartLineFormat = null): WorkbookChartGridlinesFormat = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[WorkbookChartGridlinesFormat]
  }
}

