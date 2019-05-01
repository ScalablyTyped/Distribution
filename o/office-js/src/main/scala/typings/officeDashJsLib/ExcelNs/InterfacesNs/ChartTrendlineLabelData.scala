package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartTrendlineLabel.toJSON()". */
trait ChartTrendlineLabelData extends js.Object {
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
  var format: js.UndefOr[ChartTrendlineLabelFormatData] = js.undefined
  /**
    *
    * String value that represents the formula of chart trendline label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns the height, in points, of the chart trendline label. Read-only. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the horizontal alignment for chart trendline label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 90, -90 or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartTextHorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left edge of chart trendline label to the left edge of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[scala.Double] = js.undefined
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
  var numberFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * String representing the text of the trendline label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the text orientation of chart trendline label. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of chart trendline label to the top of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the vertical alignment of chart trendline label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartTextVerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed
  ] = js.undefined
  /**
    *
    * Returns the width, in points, of the chart trendline label. Read-only. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ChartTrendlineLabelData {
  @scala.inline
  def apply(
    autoText: js.UndefOr[scala.Boolean] = js.undefined,
    format: ChartTrendlineLabelFormatData = null,
    formula: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    horizontalAlignment: officeDashJsLib.ExcelNs.ChartTextHorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed = null,
    left: scala.Int | scala.Double = null,
    linkNumberFormat: js.UndefOr[scala.Boolean] = js.undefined,
    numberFormat: java.lang.String = null,
    text: java.lang.String = null,
    textOrientation: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    verticalAlignment: officeDashJsLib.ExcelNs.ChartTextVerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed = null,
    width: scala.Int | scala.Double = null
  ): ChartTrendlineLabelData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoText)) __obj.updateDynamic("autoText")(autoText)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(linkNumberFormat)) __obj.updateDynamic("linkNumberFormat")(linkNumberFormat)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textOrientation != null) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTrendlineLabelData]
  }
}

