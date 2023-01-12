package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the format of a chart data table.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
trait ChartDataTableFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the border format of chart data table, which includes color, line style, and weight.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.undefined
  
  /**
    * Represents the font attributes (such as font name, font size, and color) for the current object.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
}
object ChartDataTableFormatLoadOptions {
  
  inline def apply(): ChartDataTableFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataTableFormatLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartDataTableFormatLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBorder(value: ChartBorderLoadOptions): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFont(value: ChartFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
