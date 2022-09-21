package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the `ChartDataTableFormat` object, for use in `chartDataTableFormat.set({ ... })`. */
trait ChartDataTableFormatUpdateData extends StObject {
  
  /**
    * Represents the border format of chart data table, which includes color, line style, and weight.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  
  /**
    * Represents the font attributes (such as font name, font size, and color) for the current object.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}
object ChartDataTableFormatUpdateData {
  
  inline def apply(): ChartDataTableFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataTableFormatUpdateData]
  }
  
  extension [Self <: ChartDataTableFormatUpdateData](x: Self) {
    
    inline def setBorder(value: ChartBorderUpdateData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFont(value: ChartFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
