package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartPointFormat object, for use in `chartPointFormat.set({ ... })`. */
trait ChartPointFormatUpdateData extends StObject {
  
  /**
    *
    * Represents the border format of a chart data point, which includes color, style, and weight information.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
}
object ChartPointFormatUpdateData {
  
  inline def apply(): ChartPointFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointFormatUpdateData]
  }
  
  extension [Self <: ChartPointFormatUpdateData](x: Self) {
    
    inline def setBorder(value: ChartBorderUpdateData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
