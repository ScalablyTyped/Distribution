package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartGridlinesFormat extends Entity {
  // Represents chart line formatting. Read-only.
  var line: js.UndefOr[WorkbookChartLineFormat] = js.native
}

object WorkbookChartGridlinesFormat {
  @scala.inline
  def apply(): WorkbookChartGridlinesFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartGridlinesFormat]
  }
  @scala.inline
  implicit class WorkbookChartGridlinesFormatOps[Self <: WorkbookChartGridlinesFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLine(value: WorkbookChartLineFormat): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
  
}

