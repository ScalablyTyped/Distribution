package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartAxisTitleFormat.toJSON()`. */
trait ChartAxisTitleFormatData extends StObject {
  
  /**
    * Specifies the chart axis title's border format, which includes color, linestyle, and weight.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  
  /**
    * Specifies the chart axis title's font attributes, such as font name, font size, or color, of the chart axis title object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
}
object ChartAxisTitleFormatData {
  
  inline def apply(): ChartAxisTitleFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisTitleFormatData]
  }
  
  extension [Self <: ChartAxisTitleFormatData](x: Self) {
    
    inline def setBorder(value: ChartBorderData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFont(value: ChartFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
