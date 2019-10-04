package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import typings.officeDashJsDashPreview.ExcelNs.ChartDataLabelPosition
import typings.officeDashJsDashPreview.ExcelNs.ChartTextHorizontalAlignment
import typings.officeDashJsDashPreview.ExcelNs.ChartTextVerticalAlignment
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BestFit
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Bottom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Callout
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Center
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Distributed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.InsideBase
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.InsideEnd
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Invalid
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Justify
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Left
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.OutsideEnd
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Right
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartDataLabels.toJSON()`. */
trait ChartDataLabelsData extends js.Object {
  /**
    *
    * Represents whether data labels automatically generate appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the format of chart data labels, which includes fill and font formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartDataLabelFormatData] = js.undefined
  /**
    *
    * Represents the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of data label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.undefined
  /**
    *
    * Represents whether or not the number format is linked to the cells. If true, the number format will change in the labels when it changes in the cells
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the format code for data labels.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  /**
    *
    * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[
    ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
  ] = js.undefined
  /**
    *
    * String representing the separator used for the data labels on a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    *
    * Boolean value representing if the data label bubble size is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showBubbleSize: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label category name is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showCategoryName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label legend key is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label percentage is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showPercentage: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label series name is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showSeriesName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label value is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var showValue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the text orientation of data labels. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of data label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.undefined
}

object ChartDataLabelsData {
  @scala.inline
  def apply(
    autoText: js.UndefOr[Boolean] = js.undefined,
    format: ChartDataLabelFormatData = null,
    horizontalAlignment: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed = null,
    linkNumberFormat: js.UndefOr[Boolean] = js.undefined,
    numberFormat: String = null,
    position: ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout = null,
    separator: String = null,
    showBubbleSize: js.UndefOr[Boolean] = js.undefined,
    showCategoryName: js.UndefOr[Boolean] = js.undefined,
    showLegendKey: js.UndefOr[Boolean] = js.undefined,
    showPercentage: js.UndefOr[Boolean] = js.undefined,
    showSeriesName: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    textOrientation: Int | Double = null,
    verticalAlignment: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed = null
  ): ChartDataLabelsData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoText)) __obj.updateDynamic("autoText")(autoText)
    if (format != null) __obj.updateDynamic("format")(format)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(linkNumberFormat)) __obj.updateDynamic("linkNumberFormat")(linkNumberFormat)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(showBubbleSize)) __obj.updateDynamic("showBubbleSize")(showBubbleSize)
    if (!js.isUndefined(showCategoryName)) __obj.updateDynamic("showCategoryName")(showCategoryName)
    if (!js.isUndefined(showLegendKey)) __obj.updateDynamic("showLegendKey")(showLegendKey)
    if (!js.isUndefined(showPercentage)) __obj.updateDynamic("showPercentage")(showPercentage)
    if (!js.isUndefined(showSeriesName)) __obj.updateDynamic("showSeriesName")(showSeriesName)
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue)
    if (textOrientation != null) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataLabelsData]
  }
}

