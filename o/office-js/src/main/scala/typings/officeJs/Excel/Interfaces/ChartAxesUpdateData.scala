package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAxes object, for use in `chartAxes.set({ ... })`. */
@js.native
trait ChartAxesUpdateData extends StObject {
  
  /**
    *
    * Represents the category axis in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisUpdateData] = js.native
  
  /**
    *
    * Represents the series axis of a 3-dimensional chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisUpdateData] = js.native
  
  /**
    *
    * Represents the value axis in an axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisUpdateData] = js.native
}
object ChartAxesUpdateData {
  
  @scala.inline
  def apply(): ChartAxesUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxesUpdateData]
  }
  
  @scala.inline
  implicit class ChartAxesUpdateDataMutableBuilder[Self <: ChartAxesUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryAxis(value: ChartAxisUpdateData): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    @scala.inline
    def setSeriesAxis(value: ChartAxisUpdateData): Self = StObject.set(x, "seriesAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesAxisUndefined: Self = StObject.set(x, "seriesAxis", js.undefined)
    
    @scala.inline
    def setValueAxis(value: ChartAxisUpdateData): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
