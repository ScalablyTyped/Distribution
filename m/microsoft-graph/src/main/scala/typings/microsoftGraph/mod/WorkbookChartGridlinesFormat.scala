package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartGridlinesFormat extends Entity {
  // Represents chart line formatting. Read-only.
  var line: js.UndefOr[WorkbookChartLineFormat] = js.undefined
}

object WorkbookChartGridlinesFormat {
  @scala.inline
  def apply(id: String = null, line: WorkbookChartLineFormat = null): WorkbookChartGridlinesFormat = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartGridlinesFormat]
  }
}

