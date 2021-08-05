package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartTrendlineLabelFormat.toJSON()`. */
trait ChartTrendlineLabelFormatData extends StObject {
  
  /**
    *
    * Specifies the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  
  /**
    *
    * Specifies the font attributes (font name, font size, color, etc.) for a chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
}
object ChartTrendlineLabelFormatData {
  
  inline def apply(): ChartTrendlineLabelFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineLabelFormatData]
  }
  
  extension [Self <: ChartTrendlineLabelFormatData](x: Self) {
    
    inline def setBorder(value: ChartBorderData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFont(value: ChartFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
