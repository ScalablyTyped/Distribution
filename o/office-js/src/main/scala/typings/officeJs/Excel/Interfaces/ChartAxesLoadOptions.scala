package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the chart axes.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartAxesLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the category axis in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisLoadOptions] = js.undefined
  
  /**
    *
    * Represents the series axis of a 3-dimensional chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisLoadOptions] = js.undefined
  
  /**
    *
    * Represents the value axis in an axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisLoadOptions] = js.undefined
}
object ChartAxesLoadOptions {
  
  @scala.inline
  def apply(): ChartAxesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxesLoadOptions]
  }
  
  @scala.inline
  implicit class ChartAxesLoadOptionsMutableBuilder[Self <: ChartAxesLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setCategoryAxis(value: ChartAxisLoadOptions): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    @scala.inline
    def setSeriesAxis(value: ChartAxisLoadOptions): Self = StObject.set(x, "seriesAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesAxisUndefined: Self = StObject.set(x, "seriesAxis", js.undefined)
    
    @scala.inline
    def setValueAxis(value: ChartAxisLoadOptions): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
