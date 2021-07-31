package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartLegendFormat.toJSON()`. */
trait ChartLegendFormatData extends StObject {
  
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
  
  /**
    *
    * Represents the font attributes such as font name, font size, color, etc. of a chart legend.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
}
object ChartLegendFormatData {
  
  @scala.inline
  def apply(): ChartLegendFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendFormatData]
  }
  
  @scala.inline
  implicit class ChartLegendFormatDataMutableBuilder[Self <: ChartLegendFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ChartBorderData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setFont(value: ChartFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
