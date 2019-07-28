package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the data label of a chart point.
  *
  * [Api set: ExcelApi 1.7]
  */
trait ChartDataLabelLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if data label automatically generates appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the format of chart data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartDataLabelFormatLoadOptions] = js.undefined
  /**
    *
    * String value that represents the formula of chart data label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the height, in points, of the chart data label. Read-only. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of data label is 90, -90 or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left edge of chart data label to the left edge of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * String value that represents the format code for data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * String representing the separator used for the data label on a chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var separator: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label bubble size is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showBubbleSize: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label category name is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showCategoryName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label legend key is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label percentage is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showPercentage: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label series name is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showSeriesName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label value is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showValue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * String representing the text of the data label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the text orientation of chart data label. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of chart data label to the top of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of data label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the width, in points, of the chart data label. Read-only. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}

object ChartDataLabelLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    autoText: js.UndefOr[Boolean] = js.undefined,
    format: ChartDataLabelFormatLoadOptions = null,
    formula: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    linkNumberFormat: js.UndefOr[Boolean] = js.undefined,
    numberFormat: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Boolean] = js.undefined,
    separator: js.UndefOr[Boolean] = js.undefined,
    showBubbleSize: js.UndefOr[Boolean] = js.undefined,
    showCategoryName: js.UndefOr[Boolean] = js.undefined,
    showLegendKey: js.UndefOr[Boolean] = js.undefined,
    showPercentage: js.UndefOr[Boolean] = js.undefined,
    showSeriesName: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    textOrientation: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined
  ): ChartDataLabelLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(autoText)) __obj.updateDynamic("autoText")(autoText)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(formula)) __obj.updateDynamic("formula")(formula)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(linkNumberFormat)) __obj.updateDynamic("linkNumberFormat")(linkNumberFormat)
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(separator)) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(showBubbleSize)) __obj.updateDynamic("showBubbleSize")(showBubbleSize)
    if (!js.isUndefined(showCategoryName)) __obj.updateDynamic("showCategoryName")(showCategoryName)
    if (!js.isUndefined(showLegendKey)) __obj.updateDynamic("showLegendKey")(showLegendKey)
    if (!js.isUndefined(showPercentage)) __obj.updateDynamic("showPercentage")(showPercentage)
    if (!js.isUndefined(showSeriesName)) __obj.updateDynamic("showSeriesName")(showSeriesName)
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ChartDataLabelLoadOptions]
  }
}

