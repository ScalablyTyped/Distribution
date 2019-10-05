package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a chart title object of a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartTitleLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the formatting of a chart title, which includes fill and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartTitleFormatLoadOptions] = js.undefined
  /**
    *
    * Returns the height, in points, of the chart title. Null if chart title is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the horizontal alignment for chart title.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left edge of chart title to the left edge of chart area. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Boolean] = js.undefined
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
  var position: js.UndefOr[Boolean] = js.undefined
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
  var text: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the text orientation of chart title. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of chart title to the top of chart area. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the vertical alignment of chart title. See Excel.ChartTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.undefined
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
  var width: js.UndefOr[Boolean] = js.undefined
}

object ChartTitleLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    format: ChartTitleFormatLoadOptions = null,
    height: js.UndefOr[Boolean] = js.undefined,
    horizontalAlignment: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    overlay: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Boolean] = js.undefined,
    showShadow: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    textOrientation: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined
  ): ChartTitleLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ChartTitleLoadOptions]
  }
}

