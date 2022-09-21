package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartPlotAreaFormat object, for use in `chartPlotAreaFormat.set({ ... })`. */
trait ChartPlotAreaFormatUpdateData extends StObject {
  
  /**
    * Specifies the border attributes of a chart plot area.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
}
object ChartPlotAreaFormatUpdateData {
  
  inline def apply(): ChartPlotAreaFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaFormatUpdateData]
  }
  
  extension [Self <: ChartPlotAreaFormatUpdateData](x: Self) {
    
    inline def setBorder(value: ChartBorderUpdateData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
