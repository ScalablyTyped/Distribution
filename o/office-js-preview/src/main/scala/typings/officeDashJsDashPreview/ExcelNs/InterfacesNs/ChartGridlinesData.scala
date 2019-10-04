package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartGridlines.toJSON()`. */
trait ChartGridlinesData extends js.Object {
  /**
    *
    * Represents the formatting of chart gridlines. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartGridlinesFormatData] = js.undefined
  /**
    *
    * Boolean value representing if the axis gridlines are visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartGridlinesData {
  @scala.inline
  def apply(format: ChartGridlinesFormatData = null, visible: js.UndefOr[Boolean] = js.undefined): ChartGridlinesData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartGridlinesData]
  }
}

