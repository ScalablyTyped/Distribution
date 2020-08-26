package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartSeriesFormat extends Entity {
  // Represents the fill format of a chart series, which includes background formating information. Read-only.
  var fill: js.UndefOr[WorkbookChartFill] = js.native
  // Represents line formatting. Read-only.
  var line: js.UndefOr[WorkbookChartLineFormat] = js.native
}

object WorkbookChartSeriesFormat {
  @scala.inline
  def apply(): WorkbookChartSeriesFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartSeriesFormat]
  }
  @scala.inline
  implicit class WorkbookChartSeriesFormatOps[Self <: WorkbookChartSeriesFormat] (val x: Self) extends AnyVal {
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
    def setFill(value: WorkbookChartFill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setLine(value: WorkbookChartLineFormat): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
  
}

