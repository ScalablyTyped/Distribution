package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartPlotAreaPosition
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPlotArea.toJSON()`. */
trait ChartPlotAreaData extends js.Object {
  /**
    *
    * Specifies the formatting of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatData] = js.undefined
  /**
    *
    * Specifies the height value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the insideHeight value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the insideLeft value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the insideTop value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the insideWidth value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the left value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the position of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartPlotAreaPosition | Automatic | Custom] = js.undefined
  /**
    *
    * Specifies the top value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the width value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChartPlotAreaData {
  @scala.inline
  def apply(
    format: ChartPlotAreaFormatData = null,
    height: js.UndefOr[Double] = js.undefined,
    insideHeight: js.UndefOr[Double] = js.undefined,
    insideLeft: js.UndefOr[Double] = js.undefined,
    insideTop: js.UndefOr[Double] = js.undefined,
    insideWidth: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    position: ChartPlotAreaPosition | Automatic | Custom = null,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ChartPlotAreaData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insideHeight)) __obj.updateDynamic("insideHeight")(insideHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insideLeft)) __obj.updateDynamic("insideLeft")(insideLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insideTop)) __obj.updateDynamic("insideTop")(insideTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(insideWidth)) __obj.updateDynamic("insideWidth")(insideWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPlotAreaData]
  }
}

