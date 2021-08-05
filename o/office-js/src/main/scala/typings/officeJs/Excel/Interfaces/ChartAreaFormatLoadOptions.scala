package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Encapsulates the format properties for the overall chart area.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartAreaFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the border format of chart area, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.undefined
  
  /**
    *
    * Specifies the color scheme of the chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var colorScheme: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the font attributes (font name, font size, color, etc.) for the current object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
  
  /**
    *
    * Specifies if the chart area of the chart has rounded corners.
    *
    * [Api set: ExcelApi 1.9]
    */
  var roundedCorners: js.UndefOr[Boolean] = js.undefined
}
object ChartAreaFormatLoadOptions {
  
  inline def apply(): ChartAreaFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAreaFormatLoadOptions]
  }
  
  extension [Self <: ChartAreaFormatLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBorder(value: ChartBorderLoadOptions): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColorScheme(value: Boolean): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    inline def setFont(value: ChartFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setRoundedCorners(value: Boolean): Self = StObject.set(x, "roundedCorners", value.asInstanceOf[js.Any])
    
    inline def setRoundedCornersUndefined: Self = StObject.set(x, "roundedCorners", js.undefined)
  }
}
