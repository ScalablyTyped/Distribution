package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the chart axis title formatting.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartAxisTitleFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the chart axis title's border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.undefined
  
  /**
    *
    * Specifies the chart axis title's font attributes, such as font name, font size, color, etc. of chart axis title object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
}
object ChartAxisTitleFormatLoadOptions {
  
  inline def apply(): ChartAxisTitleFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisTitleFormatLoadOptions]
  }
  
  extension [Self <: ChartAxisTitleFormatLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBorder(value: ChartBorderLoadOptions): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFont(value: ChartFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
