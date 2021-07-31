package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartLegendFormat object, for use in `chartLegendFormat.set({ ... })`. */
trait ChartLegendFormatUpdateData extends StObject {
  
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  
  /**
    *
    * Represents the font attributes such as font name, font size, color, etc. of a chart legend.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}
object ChartLegendFormatUpdateData {
  
  @scala.inline
  def apply(): ChartLegendFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendFormatUpdateData]
  }
  
  @scala.inline
  implicit class ChartLegendFormatUpdateDataMutableBuilder[Self <: ChartLegendFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ChartBorderUpdateData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setFont(value: ChartFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
