package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the attributes for a chart trendline lable object.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartTrendlineLabelLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Boolean value representing if trendline label automatically generates appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the format of chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartTrendlineLabelFormatLoadOptions] = js.undefined
  /**
    *
    * String value that represents the formula of chart trendline label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the height, in points, of the chart trendline label. Read-only. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the horizontal alignment for chart trendline label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 90, -90 or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left edge of chart trendline label to the left edge of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * String value that represents the format code for trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * String representing the text of the trendline label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the text orientation of chart trendline label. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of chart trendline label to the top of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the vertical alignment of chart trendline label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the width, in points, of the chart trendline label. Read-only. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartTrendlineLabelLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    autoText: js.UndefOr[scala.Boolean] = js.undefined,
    format: ChartTrendlineLabelFormatLoadOptions = null,
    formula: js.UndefOr[scala.Boolean] = js.undefined,
    height: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalAlignment: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.UndefOr[scala.Boolean] = js.undefined,
    linkNumberFormat: js.UndefOr[scala.Boolean] = js.undefined,
    numberFormat: js.UndefOr[scala.Boolean] = js.undefined,
    text: js.UndefOr[scala.Boolean] = js.undefined,
    textOrientation: js.UndefOr[scala.Boolean] = js.undefined,
    top: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[scala.Boolean] = js.undefined,
    width: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartTrendlineLabelLoadOptions = {
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
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ChartTrendlineLabelLoadOptions]
  }
}

