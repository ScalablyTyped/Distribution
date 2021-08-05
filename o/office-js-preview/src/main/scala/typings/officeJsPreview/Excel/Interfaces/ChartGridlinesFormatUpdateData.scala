package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartGridlinesFormat object, for use in `chartGridlinesFormat.set({ ... })`. */
trait ChartGridlinesFormatUpdateData extends StObject {
  
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}
object ChartGridlinesFormatUpdateData {
  
  inline def apply(): ChartGridlinesFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlinesFormatUpdateData]
  }
  
  extension [Self <: ChartGridlinesFormatUpdateData](x: Self) {
    
    inline def setLine(value: ChartLineFormatUpdateData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
