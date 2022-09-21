package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartErrorBarsFormat object, for use in `chartErrorBarsFormat.set({ ... })`. */
trait ChartErrorBarsFormatUpdateData extends StObject {
  
  /**
    * Represents the chart line formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}
object ChartErrorBarsFormatUpdateData {
  
  inline def apply(): ChartErrorBarsFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsFormatUpdateData]
  }
  
  extension [Self <: ChartErrorBarsFormatUpdateData](x: Self) {
    
    inline def setLine(value: ChartLineFormatUpdateData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
