package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.ChartPlotAreaPosition
import typings.officeDashJs.officeDashJsStrings.Automatic
import typings.officeDashJs.officeDashJsStrings.Custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPlotArea.toJSON()`. */
trait ChartPlotAreaData extends js.Object {
  /**
    *
    * Represents the formatting of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatData] = js.undefined
  /**
    *
    * Represents the height value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the insideHeight value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the insideLeft value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the insideTop value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the insideWidth value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the left value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the position of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartPlotAreaPosition | Automatic | Custom] = js.undefined
  /**
    *
    * Represents the top value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the width value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChartPlotAreaData {
  @scala.inline
  def apply(
    format: ChartPlotAreaFormatData = null,
    height: Int | Double = null,
    insideHeight: Int | Double = null,
    insideLeft: Int | Double = null,
    insideTop: Int | Double = null,
    insideWidth: Int | Double = null,
    left: Int | Double = null,
    position: ChartPlotAreaPosition | Automatic | Custom = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): ChartPlotAreaData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (insideHeight != null) __obj.updateDynamic("insideHeight")(insideHeight.asInstanceOf[js.Any])
    if (insideLeft != null) __obj.updateDynamic("insideLeft")(insideLeft.asInstanceOf[js.Any])
    if (insideTop != null) __obj.updateDynamic("insideTop")(insideTop.asInstanceOf[js.Any])
    if (insideWidth != null) __obj.updateDynamic("insideWidth")(insideWidth.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPlotAreaData]
  }
}

