package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the attributes for a chart plotArea object.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartPlotAreaLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the formatting of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartPlotAreaFormatLoadOptions] = js.undefined
  /**
    *
    * Represents the height value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the insideHeight value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideHeight: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the insideLeft value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideLeft: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the insideTop value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideTop: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the insideWidth value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var insideWidth: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the left value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the position of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the top value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the width value of plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}

object ChartPlotAreaLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    format: ChartPlotAreaFormatLoadOptions = null,
    height: js.UndefOr[Boolean] = js.undefined,
    insideHeight: js.UndefOr[Boolean] = js.undefined,
    insideLeft: js.UndefOr[Boolean] = js.undefined,
    insideTop: js.UndefOr[Boolean] = js.undefined,
    insideWidth: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    position: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined
  ): ChartPlotAreaLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(insideHeight)) __obj.updateDynamic("insideHeight")(insideHeight)
    if (!js.isUndefined(insideLeft)) __obj.updateDynamic("insideLeft")(insideLeft)
    if (!js.isUndefined(insideTop)) __obj.updateDynamic("insideTop")(insideTop)
    if (!js.isUndefined(insideWidth)) __obj.updateDynamic("insideWidth")(insideWidth)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ChartPlotAreaLoadOptions]
  }
}

