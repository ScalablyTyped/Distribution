package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the chart axes.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartAxesLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the category axis in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisLoadOptions] = js.native
  
  /**
    *
    * Represents the series axis of a 3-dimensional chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisLoadOptions] = js.native
  
  /**
    *
    * Represents the value axis in an axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisLoadOptions] = js.native
}
object ChartAxesLoadOptions {
  
  @scala.inline
  def apply(): ChartAxesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxesLoadOptions]
  }
  
  @scala.inline
  implicit class ChartAxesLoadOptionsOps[Self <: ChartAxesLoadOptions] (val x: Self) extends AnyVal {
    
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setCategoryAxis(value: ChartAxisLoadOptions): Self = this.set("categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryAxis: Self = this.set("categoryAxis", js.undefined)
    
    @scala.inline
    def setSeriesAxis(value: ChartAxisLoadOptions): Self = this.set("seriesAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesAxis: Self = this.set("seriesAxis", js.undefined)
    
    @scala.inline
    def setValueAxis(value: ChartAxisLoadOptions): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
  }
}
