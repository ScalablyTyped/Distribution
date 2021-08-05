package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartTrendlineFormat object, for use in `chartTrendlineFormat.set({ ... })`. */
trait ChartTrendlineFormatUpdateData extends StObject {
  
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.7]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}
object ChartTrendlineFormatUpdateData {
  
  inline def apply(): ChartTrendlineFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineFormatUpdateData]
  }
  
  extension [Self <: ChartTrendlineFormatUpdateData](x: Self) {
    
    inline def setLine(value: ChartLineFormatUpdateData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
