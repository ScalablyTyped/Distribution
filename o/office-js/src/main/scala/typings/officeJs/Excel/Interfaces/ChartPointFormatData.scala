package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartPointFormat.toJSON()`. */
trait ChartPointFormatData extends StObject {
  
  /**
    * Represents the border format of a chart data point, which includes color, style, and weight information.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
}
object ChartPointFormatData {
  
  inline def apply(): ChartPointFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointFormatData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartPointFormatData] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: ChartBorderData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
