package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the format properties for the chart series
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartSeriesFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatLoadOptions] = js.undefined
}

object ChartSeriesFormatLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, line: ChartLineFormatLoadOptions = null): ChartSeriesFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartSeriesFormatLoadOptions]
  }
}

