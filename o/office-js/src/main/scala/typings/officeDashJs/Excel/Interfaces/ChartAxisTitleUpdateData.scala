package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxisTitle object, for use in `chartAxisTitle.set({ ... })`. */
trait ChartAxisTitleUpdateData extends js.Object {
  /**
    *
    * Represents the formatting of chart axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisTitleFormatUpdateData] = js.undefined
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    *
    * A boolean that specifies the visibility of an axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartAxisTitleUpdateData {
  @scala.inline
  def apply(
    format: ChartAxisTitleFormatUpdateData = null,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartAxisTitleUpdateData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartAxisTitleUpdateData]
  }
}

