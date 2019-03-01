package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the format properties for chart trendline.
  *
  * [Api set: ExcelApi 1.7]
  */
trait ChartTrendlineFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.7]
    */
  var line: js.UndefOr[ChartLineFormatLoadOptions] = js.undefined
}

object ChartTrendlineFormatLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[scala.Boolean] = js.undefined, line: ChartLineFormatLoadOptions = null): ChartTrendlineFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartTrendlineFormatLoadOptions]
  }
}

