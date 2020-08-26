package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartAxisTitleFormat extends Entity {
  // Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only.
  var font: js.UndefOr[WorkbookChartFont] = js.native
}

object WorkbookChartAxisTitleFormat {
  @scala.inline
  def apply(): WorkbookChartAxisTitleFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxisTitleFormat]
  }
  @scala.inline
  implicit class WorkbookChartAxisTitleFormatOps[Self <: WorkbookChartAxisTitleFormat] (val x: Self) extends AnyVal {
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
    def setFont(value: WorkbookChartFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
  }
  
}

