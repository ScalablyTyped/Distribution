package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartFormatString object, for use in `chartFormatString.set({ ... })`. */
trait ChartFormatStringUpdateData extends StObject {
  
  /**
    * Represents the font attributes, such as font name, font size, and color of a chart characters object.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[ChartFontUpdateData] = js.undefined
}
object ChartFormatStringUpdateData {
  
  inline def apply(): ChartFormatStringUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFormatStringUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartFormatStringUpdateData] (val x: Self) extends AnyVal {
    
    inline def setFont(value: ChartFontUpdateData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
