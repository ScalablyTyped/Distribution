package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAxisFormat object, for use in `chartAxisFormat.set({ ... })`. */
@js.native
trait ChartAxisFormatUpdateData extends StObject {
  
  /**
    *
    * Specifies the font attributes (font name, font size, color, etc.) for a chart axis element.
    *
    * [Api set: ExcelApi 1.1]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.native
  
  /**
    *
    * Specifies chart line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.native
}
object ChartAxisFormatUpdateData {
  
  @scala.inline
  def apply(): ChartAxisFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisFormatUpdateData]
  }
  
  @scala.inline
  implicit class ChartAxisFormatUpdateDataMutableBuilder[Self <: ChartAxisFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: ChartFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setLine(value: ChartLineFormatUpdateData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
