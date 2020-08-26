package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the data labels on a chart point.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartDataLabelsLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if data labels automatically generate appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the format of chart data labels, which includes fill and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartDataLabelFormatLoadOptions] = js.native
  /**
    *
    * Specifies the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of data label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the number format is linked to the cells. If true, the number format will change in the labels when it changes in the cells.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the format code for data labels.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[Boolean] = js.native
  /**
    *
    * String representing the separator used for the data labels on a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var separator: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the data label bubble size is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showBubbleSize: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the data label category name is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showCategoryName: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the data label legend key is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the data label percentage is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showPercentage: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the data label series name is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showSeriesName: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the data label value is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showValue: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the angle to which the text is oriented for data labels. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of data label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
}

object ChartDataLabelsLoadOptions {
  @scala.inline
  def apply(): ChartDataLabelsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataLabelsLoadOptions]
  }
  @scala.inline
  implicit class ChartDataLabelsLoadOptionsOps[Self <: ChartDataLabelsLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setAutoText(value: Boolean): Self = this.set("autoText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoText: Self = this.set("autoText", js.undefined)
    @scala.inline
    def setFormat(value: ChartDataLabelFormatLoadOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setLinkNumberFormat(value: Boolean): Self = this.set("linkNumberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkNumberFormat: Self = this.set("linkNumberFormat", js.undefined)
    @scala.inline
    def setNumberFormat(value: Boolean): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setPosition(value: Boolean): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSeparator(value: Boolean): Self = this.set("separator", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setTextOrientation(value: Boolean): Self = this.set("textOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOrientation: Self = this.set("textOrientation", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: Boolean): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
  
}

