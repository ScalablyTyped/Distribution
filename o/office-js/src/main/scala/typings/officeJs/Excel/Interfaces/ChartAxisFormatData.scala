package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartAxisFormat.toJSON()`. */
trait ChartAxisFormatData extends StObject {
  
  /**
    * Specifies the font attributes (font name, font size, color, etc.) for a chart axis element.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontData] = js.undefined
  
  /**
    * Specifies chart line formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.undefined
}
object ChartAxisFormatData {
  
  inline def apply(): ChartAxisFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisFormatData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartAxisFormatData] (val x: Self) extends AnyVal {
    
    inline def setFont(value: ChartFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setLine(value: ChartLineFormatData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
