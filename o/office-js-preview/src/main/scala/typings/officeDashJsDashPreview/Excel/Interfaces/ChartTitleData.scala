package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.ChartTextHorizontalAlignment
import typings.officeDashJsDashPreview.Excel.ChartTextVerticalAlignment
import typings.officeDashJsDashPreview.Excel.ChartTitlePosition
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
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

/** An interface describing the data returned by calling `chartTitle.toJSON()`. */
trait ChartTitleData extends js.Object {
  /**
    *
    * Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartTitleFormatData] = js.undefined
  /**
    *
    * Returns the height, in points, of the chart title. Null if chart title is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the horizontal alignment for chart title.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left edge of chart title to the left edge of chart area. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Boolean value representing if the chart title will overlay the chart or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var overlay: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the position of chart title. See Excel.ChartTitlePosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var position: js.UndefOr[ChartTitlePosition | Automatic | Top | Bottom | Left | Right] = js.undefined
  /**
    *
    * Represents a boolean value that determines if the chart title has a shadow.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the title text of a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the text orientation of chart title. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of chart title to the top of chart area. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the vertical alignment of chart title. See Excel.ChartTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.undefined
  /**
    *
    * A boolean value the represents the visibility of a chart title object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the width, in points, of the chart title. Null if chart title is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChartTitleData {
  @scala.inline
  def apply(
    format: ChartTitleFormatData = null,
    height: Int | Double = null,
    horizontalAlignment: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed = null,
    left: Int | Double = null,
    overlay: js.UndefOr[Boolean] = js.undefined,
    position: ChartTitlePosition | Automatic | Top | Bottom | Left | Right = null,
    showShadow: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    textOrientation: Int | Double = null,
    top: Int | Double = null,
    verticalAlignment: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): ChartTitleData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textOrientation != null) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTitleData]
  }
}

