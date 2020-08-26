package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartAxes.toJSON()`. */
@js.native
trait ChartAxesData extends js.Object {
  /**
    *
    * Represents the category axis in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisData] = js.native
  /**
    *
    * Represents the series axis of a 3-dimensional chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisData] = js.native
  /**
    *
    * Represents the value axis in an axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisData] = js.native
}

object ChartAxesData {
  @scala.inline
  def apply(): ChartAxesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxesData]
  }
  @scala.inline
  implicit class ChartAxesDataOps[Self <: ChartAxesData] (val x: Self) extends AnyVal {
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
    def setCategoryAxis(value: ChartAxisData): Self = this.set("categoryAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryAxis: Self = this.set("categoryAxis", js.undefined)
    @scala.inline
    def setSeriesAxis(value: ChartAxisData): Self = this.set("seriesAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesAxis: Self = this.set("seriesAxis", js.undefined)
    @scala.inline
    def setValueAxis(value: ChartAxisData): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
  }
  
}

