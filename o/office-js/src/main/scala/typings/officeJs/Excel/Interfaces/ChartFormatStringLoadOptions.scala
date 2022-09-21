package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the substring in chart related objects that contain text, like a `ChartTitle` object or `ChartAxisTitle` object.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait ChartFormatStringLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the font attributes, such as font name, font size, and color of a chart characters object.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[ChartFontLoadOptions] = js.undefined
}
object ChartFormatStringLoadOptions {
  
  inline def apply(): ChartFormatStringLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFormatStringLoadOptions]
  }
  
  extension [Self <: ChartFormatStringLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setFont(value: ChartFontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
