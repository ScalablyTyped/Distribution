package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartSeriesFormat object, for use in `chartSeriesFormat.set({ ... })`. */
trait ChartSeriesFormatUpdateData extends StObject {
  
  /**
    * Represents line formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}
object ChartSeriesFormatUpdateData {
  
  inline def apply(): ChartSeriesFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesFormatUpdateData]
  }
  
  extension [Self <: ChartSeriesFormatUpdateData](x: Self) {
    
    inline def setLine(value: ChartLineFormatUpdateData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
