package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartAxisTitle.toJSON()". */
trait ChartAxisTitleData extends js.Object {
  /**
    *
    * Represents the formatting of chart axis title. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisTitleFormatData] = js.undefined
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * A boolean that specifies the visibility of an axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartAxisTitleData {
  @scala.inline
  def apply(
    format: ChartAxisTitleFormatData = null,
    text: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartAxisTitleData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartAxisTitleData]
  }
}

