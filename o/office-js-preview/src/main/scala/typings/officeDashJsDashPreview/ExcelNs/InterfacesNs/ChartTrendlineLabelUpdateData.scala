package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import typings.officeDashJsDashPreview.ExcelNs.ChartTextHorizontalAlignment
import typings.officeDashJsDashPreview.ExcelNs.ChartTextVerticalAlignment
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Bottom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Center
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Distributed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Justify
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Left
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Right
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartTrendlineLabel object, for use in "chartTrendlineLabel.set({ ... })". */
trait ChartTrendlineLabelUpdateData extends js.Object {
  /**
    *
    * Boolean value representing if trendline label automatically generates appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the format of chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartTrendlineLabelFormatUpdateData] = js.undefined
  /**
    *
    * String value that represents the formula of chart trendline label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the horizontal alignment for chart trendline label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 90, -90 or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left edge of chart trendline label to the left edge of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Boolean value representing if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * String value that represents the format code for trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  /**
    *
    * String representing the text of the trendline label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the text orientation of chart trendline label. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of chart trendline label to the top of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the vertical alignment of chart trendline label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.undefined
}

object ChartTrendlineLabelUpdateData {
  @scala.inline
  def apply(
    autoText: js.UndefOr[Boolean] = js.undefined,
    format: ChartTrendlineLabelFormatUpdateData = null,
    formula: String = null,
    horizontalAlignment: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed = null,
    left: Int | Double = null,
    linkNumberFormat: js.UndefOr[Boolean] = js.undefined,
    numberFormat: String = null,
    text: String = null,
    textOrientation: Int | Double = null,
    top: Int | Double = null,
    verticalAlignment: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed = null
  ): ChartTrendlineLabelUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoText)) __obj.updateDynamic("autoText")(autoText)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(linkNumberFormat)) __obj.updateDynamic("linkNumberFormat")(linkNumberFormat)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textOrientation != null) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTrendlineLabelUpdateData]
  }
}

