package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartAxes.toJSON()`. */
trait ChartAxesData extends StObject {
  
  /**
    *
    * Represents the category axis in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisData] = js.undefined
  
  /**
    *
    * Represents the series axis of a 3-dimensional chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisData] = js.undefined
  
  /**
    *
    * Represents the value axis in an axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisData] = js.undefined
}
object ChartAxesData {
  
  inline def apply(): ChartAxesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxesData]
  }
  
  extension [Self <: ChartAxesData](x: Self) {
    
    inline def setCategoryAxis(value: ChartAxisData): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    inline def setSeriesAxis(value: ChartAxisData): Self = StObject.set(x, "seriesAxis", value.asInstanceOf[js.Any])
    
    inline def setSeriesAxisUndefined: Self = StObject.set(x, "seriesAxis", js.undefined)
    
    inline def setValueAxis(value: ChartAxisData): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
