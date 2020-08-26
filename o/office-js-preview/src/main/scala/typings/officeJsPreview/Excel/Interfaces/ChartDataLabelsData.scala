package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartDataLabelPosition
import typings.officeJsPreview.Excel.ChartTextHorizontalAlignment
import typings.officeJsPreview.Excel.ChartTextVerticalAlignment
import typings.officeJsPreview.officeJsPreviewStrings.BestFit
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Callout
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.Distributed
import typings.officeJsPreview.officeJsPreviewStrings.InsideBase
import typings.officeJsPreview.officeJsPreviewStrings.InsideEnd
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.Justify
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.OutsideEnd
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartDataLabels.toJSON()`. */
@js.native
trait ChartDataLabelsData extends js.Object {
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
  var format: js.UndefOr[ChartDataLabelFormatData] = js.native
  /**
    *
    * Specifies the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of data label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.native
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
  var numberFormat: js.UndefOr[String] = js.native
  /**
    *
    * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[
    ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
  ] = js.native
  /**
    *
    * String representing the separator used for the data labels on a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var separator: js.UndefOr[String] = js.native
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
  var textOrientation: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of data label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.native
}

object ChartDataLabelsData {
  @scala.inline
  def apply(): ChartDataLabelsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataLabelsData]
  }
  @scala.inline
  implicit class ChartDataLabelsDataOps[Self <: ChartDataLabelsData] (val x: Self) extends AnyVal {
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
    def setAutoText(value: Boolean): Self = this.set("autoText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoText: Self = this.set("autoText", js.undefined)
    @scala.inline
    def setFormat(value: ChartDataLabelFormatData): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setLinkNumberFormat(value: Boolean): Self = this.set("linkNumberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkNumberFormat: Self = this.set("linkNumberFormat", js.undefined)
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setPosition(
      value: ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
    ): Self = this.set("position", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setTextOrientation(value: Double): Self = this.set("textOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOrientation: Self = this.set("textOrientation", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
  
}

