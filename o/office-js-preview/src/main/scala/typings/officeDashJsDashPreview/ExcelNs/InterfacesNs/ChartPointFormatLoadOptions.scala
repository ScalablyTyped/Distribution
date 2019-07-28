package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents formatting object for chart points.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartPointFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the border format of a chart data point, which includes color, style, and weight information.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.undefined
}

object ChartPointFormatLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, border: ChartBorderLoadOptions = null): ChartPointFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (border != null) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[ChartPointFormatLoadOptions]
  }
}

