package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartLineFormat extends Entity {
  // HTML color code representing the color of lines in the chart.
  var color: js.UndefOr[String] = js.native
}

object WorkbookChartLineFormat {
  @scala.inline
  def apply(): WorkbookChartLineFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartLineFormat]
  }
  @scala.inline
  implicit class WorkbookChartLineFormatOps[Self <: WorkbookChartLineFormat] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
  
}

