package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookChartDataLabels extends Entity {
  // Represents the format of chart data labels, which includes fill and font formatting. Read-only.
  var format: js.UndefOr[WorkbookChartDataLabelFormat] = js.native
  /**
    * DataLabelPosition value that represents the position of the data label. The possible values are: None, Center,
    * InsideEnd, InsideBase, OutsideEnd, Left, Right, Top, Bottom, BestFit, Callout.
    */
  var position: js.UndefOr[String] = js.native
  // String representing the separator used for the data labels on a chart.
  var separator: js.UndefOr[String] = js.native
  // Boolean value representing if the data label bubble size is visible or not.
  var showBubbleSize: js.UndefOr[Boolean] = js.native
  // Boolean value representing if the data label category name is visible or not.
  var showCategoryName: js.UndefOr[Boolean] = js.native
  // Boolean value representing if the data label legend key is visible or not.
  var showLegendKey: js.UndefOr[Boolean] = js.native
  // Boolean value representing if the data label percentage is visible or not.
  var showPercentage: js.UndefOr[Boolean] = js.native
  // Boolean value representing if the data label series name is visible or not.
  var showSeriesName: js.UndefOr[Boolean] = js.native
  // Boolean value representing if the data label value is visible or not.
  var showValue: js.UndefOr[Boolean] = js.native
}

object WorkbookChartDataLabels {
  @scala.inline
  def apply(): WorkbookChartDataLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartDataLabels]
  }
  @scala.inline
  implicit class WorkbookChartDataLabelsOps[Self <: WorkbookChartDataLabels] (val x: Self) extends AnyVal {
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
    def setFormat(value: WorkbookChartDataLabelFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setShowBubbleSize(value: Boolean): Self = this.set("showBubbleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBubbleSize: Self = this.set("showBubbleSize", js.undefined)
    @scala.inline
    def setShowCategoryName(value: Boolean): Self = this.set("showCategoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCategoryName: Self = this.set("showCategoryName", js.undefined)
    @scala.inline
    def setShowLegendKey(value: Boolean): Self = this.set("showLegendKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLegendKey: Self = this.set("showLegendKey", js.undefined)
    @scala.inline
    def setShowPercentage(value: Boolean): Self = this.set("showPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPercentage: Self = this.set("showPercentage", js.undefined)
    @scala.inline
    def setShowSeriesName(value: Boolean): Self = this.set("showSeriesName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSeriesName: Self = this.set("showSeriesName", js.undefined)
    @scala.inline
    def setShowValue(value: Boolean): Self = this.set("showValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowValue: Self = this.set("showValue", js.undefined)
  }
  
}

