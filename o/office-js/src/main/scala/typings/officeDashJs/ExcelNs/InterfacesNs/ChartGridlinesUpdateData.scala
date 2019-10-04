package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartGridlines object, for use in `chartGridlines.set({ ... })`. */
trait ChartGridlinesUpdateData extends js.Object {
  /**
    *
    * Represents the formatting of chart gridlines.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartGridlinesFormatUpdateData] = js.undefined
  /**
    *
    * Boolean value representing if the axis gridlines are visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartGridlinesUpdateData {
  @scala.inline
  def apply(format: ChartGridlinesFormatUpdateData = null, visible: js.UndefOr[Boolean] = js.undefined): ChartGridlinesUpdateData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartGridlinesUpdateData]
  }
}

