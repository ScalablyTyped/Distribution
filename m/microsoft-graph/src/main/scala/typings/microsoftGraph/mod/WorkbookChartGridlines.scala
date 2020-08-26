package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartGridlines extends Entity {
  // Represents the formatting of chart gridlines. Read-only.
  var format: js.UndefOr[WorkbookChartGridlinesFormat] = js.native
  // Boolean value representing if the axis gridlines are visible or not.
  var visible: js.UndefOr[Boolean] = js.native
}

object WorkbookChartGridlines {
  @scala.inline
  def apply(): WorkbookChartGridlines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartGridlines]
  }
  @scala.inline
  implicit class WorkbookChartGridlinesOps[Self <: WorkbookChartGridlines] (val x: Self) extends AnyVal {
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
    def setFormat(value: WorkbookChartGridlinesFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

