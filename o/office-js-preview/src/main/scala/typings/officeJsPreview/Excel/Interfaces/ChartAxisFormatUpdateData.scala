package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAxisFormat object, for use in `chartAxisFormat.set({ ... })`. */
trait ChartAxisFormatUpdateData extends StObject {
  
  /**
    * Specifies the font attributes (font name, font size, color, etc.) for a chart axis element.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
  
  /**
    * Specifies chart line formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}
object ChartAxisFormatUpdateData {
  
  inline def apply(): ChartAxisFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisFormatUpdateData]
  }
  
  extension [Self <: ChartAxisFormatUpdateData](x: Self) {
    
    inline def setFont(value: ChartFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setLine(value: ChartLineFormatUpdateData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
