package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartTitleFormat.toJSON()`. */
trait ChartTitleFormatData extends StObject {
  
  /**
    * Represents the border format of chart title, which includes color, linestyle, and weight.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  
  /**
    * Represents the font attributes (such as font name, font size, and color) for an object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
}
object ChartTitleFormatData {
  
  inline def apply(): ChartTitleFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTitleFormatData]
  }
  
  extension [Self <: ChartTitleFormatData](x: Self) {
    
    inline def setBorder(value: ChartBorderData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFont(value: ChartFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
