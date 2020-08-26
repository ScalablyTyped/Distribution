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

/** An interface describing the data returned by calling `chartBorder.toJSON()`. */
@js.native
trait ChartBorderData extends js.Object {
  /**
    *
    * HTML color code representing the color of borders in the chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Represents the line style of the border. See Excel.ChartLineStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: js.UndefOr[
    ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot
  ] = js.native
  /**
    *
    * Represents weight of the border, in points.
    *
    * [Api set: ExcelApi 1.7]
    */
  var weight: js.UndefOr[Double] = js.native
}

object ChartBorderData {
  @scala.inline
  def apply(): ChartBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBorderData]
  }
  @scala.inline
  implicit class ChartBorderDataOps[Self <: ChartBorderData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setLineStyle(
      value: ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot
    ): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

