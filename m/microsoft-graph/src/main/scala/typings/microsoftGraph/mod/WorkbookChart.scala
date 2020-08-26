package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChart extends Entity {
  // Represents chart axes. Read-only.
  var axes: js.UndefOr[WorkbookChartAxes] = js.native
  // Represents the datalabels on the chart. Read-only.
  var dataLabels: js.UndefOr[WorkbookChartDataLabels] = js.native
  // Encapsulates the format properties for the chart area. Read-only.
  var format: js.UndefOr[WorkbookChartAreaFormat] = js.native
  // Represents the height, in points, of the chart object.
  var height: js.UndefOr[Double] = js.native
  // The distance, in points, from the left side of the chart to the worksheet origin.
  var left: js.UndefOr[Double] = js.native
  // Represents the legend for the chart. Read-only.
  var legend: js.UndefOr[WorkbookChartLegend] = js.native
  // Represents the name of a chart object.
  var name: js.UndefOr[String] = js.native
  // Represents either a single series or collection of series in the chart. Read-only.
  var series: js.UndefOr[js.Array[WorkbookChartSeries]] = js.native
  /**
    * Represents the title of the specified chart, including the text, visibility, position and formating of the title.
    * Read-only.
    */
  var title: js.UndefOr[WorkbookChartTitle] = js.native
  /**
    * Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of
    * the chart area (on a chart).
    */
  var top: js.UndefOr[Double] = js.native
  // Represents the width, in points, of the chart object.
  var width: js.UndefOr[Double] = js.native
  // The worksheet containing the current chart. Read-only.
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.native
}

object WorkbookChart {
  @scala.inline
  def apply(): WorkbookChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChart]
  }
  @scala.inline
  implicit class WorkbookChartOps[Self <: WorkbookChart] (val x: Self) extends AnyVal {
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
    def setAxes(value: WorkbookChartAxes): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setDataLabels(value: WorkbookChartDataLabels): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setFormat(value: WorkbookChartAreaFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLegend(value: WorkbookChartLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: WorkbookChartSeries*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[WorkbookChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setTitle(value: WorkbookChartTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWorksheet(value: WorkbookWorksheet): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
  }
  
}

