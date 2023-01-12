package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartDataTableFormat.toJSON()`. */
trait ChartDataTableFormatData extends StObject {
  
  /**
    * Represents the border format of chart data table, which includes color, line style, and weight.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  
  /**
    * Represents the font attributes (such as font name, font size, and color) for the current object.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
}
object ChartDataTableFormatData {
  
  inline def apply(): ChartDataTableFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataTableFormatData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartDataTableFormatData] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: ChartBorderData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFont(value: ChartFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
