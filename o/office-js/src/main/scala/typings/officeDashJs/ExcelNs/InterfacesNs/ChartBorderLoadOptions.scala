package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the border formatting of a chart element.
  *
  * [Api set: ExcelApi 1.7]
  */
trait ChartBorderLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representing the color of borders in the chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the line style of the border. See Excel.ChartLineStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents weight of the border, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var weight: js.UndefOr[Boolean] = js.undefined
}

object ChartBorderLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Boolean] = js.undefined,
    lineStyle: js.UndefOr[Boolean] = js.undefined,
    weight: js.UndefOr[Boolean] = js.undefined
  ): ChartBorderLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(lineStyle)) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[ChartBorderLoadOptions]
  }
}

