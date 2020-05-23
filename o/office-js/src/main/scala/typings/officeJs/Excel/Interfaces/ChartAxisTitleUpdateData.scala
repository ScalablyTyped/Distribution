package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxisTitle object, for use in `chartAxisTitle.set({ ... })`. */
trait ChartAxisTitleUpdateData extends js.Object {
  /**
    *
    * Specifies the formatting of chart axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisTitleFormatUpdateData] = js.undefined
  /**
    *
    * Specifies the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the angle to which the text is oriented for the chart axis title. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApiOnline 1.1]
    */
  var textOrientation: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies if the axis title is visibile.
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
    textOrientation: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartAxisTitleUpdateData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisTitleUpdateData]
  }
}

