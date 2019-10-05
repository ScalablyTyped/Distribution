package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the legendEntry in legendEntryCollection.
  *
  * [Api set: ExcelApi 1.7]
  */
trait ChartLegendEntryLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the height of the legendEntry on the chart legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the index of the legendEntry in the chart legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  var index: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the left of a chart legendEntry.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the top of a chart legendEntry.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the visible of a chart legend entry.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the width of the legendEntry on the chart Legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}

object ChartLegendEntryLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined
  ): ChartLegendEntryLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ChartLegendEntryLoadOptions]
  }
}

