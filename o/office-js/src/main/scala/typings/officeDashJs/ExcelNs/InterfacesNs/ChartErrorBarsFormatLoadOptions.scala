package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the format properties for chart error bars.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ChartErrorBarsFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the chart line formatting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var line: js.UndefOr[ChartLineFormatLoadOptions] = js.undefined
}

object ChartErrorBarsFormatLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, line: ChartLineFormatLoadOptions = null): ChartErrorBarsFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (line != null) __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[ChartErrorBarsFormatLoadOptions]
  }
}

