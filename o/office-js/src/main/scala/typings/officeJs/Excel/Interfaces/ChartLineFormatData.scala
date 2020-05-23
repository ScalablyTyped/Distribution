package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartLineStyle
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Continuous
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DashDot
import typings.officeJs.officeJsStrings.DashDotDot
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.Grey25
import typings.officeJs.officeJsStrings.Grey50
import typings.officeJs.officeJsStrings.Grey75
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.RoundDot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartLineFormat.toJSON()`. */
trait ChartLineFormatData extends js.Object {
  /**
    *
    * HTML color code representing the color of lines in the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the line style. See Excel.ChartLineStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: js.UndefOr[
    ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot
  ] = js.undefined
  /**
    *
    * Represents weight of the line, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var weight: js.UndefOr[Double] = js.undefined
}

object ChartLineFormatData {
  @scala.inline
  def apply(
    color: String = null,
    lineStyle: ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot = null,
    weight: js.UndefOr[Double] = js.undefined
  ): ChartLineFormatData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLineFormatData]
  }
}

