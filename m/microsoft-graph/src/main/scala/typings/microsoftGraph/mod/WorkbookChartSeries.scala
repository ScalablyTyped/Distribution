package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartSeries extends Entity {
  // Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
  var format: js.UndefOr[WorkbookChartSeriesFormat] = js.native
  // Represents the name of a series in a chart.
  var name: js.UndefOr[String] = js.native
  // Represents a collection of all points in the series. Read-only.
  var points: js.UndefOr[js.Array[WorkbookChartPoint]] = js.native
}

object WorkbookChartSeries {
  @scala.inline
  def apply(): WorkbookChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartSeries]
  }
  @scala.inline
  implicit class WorkbookChartSeriesOps[Self <: WorkbookChartSeries] (val x: Self) extends AnyVal {
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
    def setFormat(value: WorkbookChartSeriesFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPointsVarargs(value: WorkbookChartPoint*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[WorkbookChartPoint]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
  }
  
}

