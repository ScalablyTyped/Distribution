package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartTrendlineLabelFormat object, for use in `chartTrendlineLabelFormat.set({ ... })`. */
trait ChartTrendlineLabelFormatUpdateData extends StObject {
  
  /**
    *
    * Specifies the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
  
  /**
    *
    * Specifies the font attributes (font name, font size, color, etc.) for a chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}
object ChartTrendlineLabelFormatUpdateData {
  
  @scala.inline
  def apply(): ChartTrendlineLabelFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineLabelFormatUpdateData]
  }
  
  @scala.inline
  implicit class ChartTrendlineLabelFormatUpdateDataMutableBuilder[Self <: ChartTrendlineLabelFormatUpdateData] (val x: Self) extends AnyVal {
    
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
