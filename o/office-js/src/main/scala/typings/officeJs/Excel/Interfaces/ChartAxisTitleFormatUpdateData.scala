package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAxisTitleFormat object, for use in `chartAxisTitleFormat.set({ ... })`. */
trait ChartAxisTitleFormatUpdateData extends StObject {
  
  /**
    *
    * Specifies the chart axis title's border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  
  /**
    *
    * Specifies the chart axis title's font attributes, such as font name, font size, color, etc. of chart axis title object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}
object ChartAxisTitleFormatUpdateData {
  
  inline def apply(): ChartAxisTitleFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisTitleFormatUpdateData]
  }
  
  extension [Self <: ChartAxisTitleFormatUpdateData](x: Self) {
    
    inline def setBorder(value: ChartBorderUpdateData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFont(value: ChartFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
