package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartPointFormat object, for use in `chartPointFormat.set({ ... })`. */
trait ChartPointFormatUpdateData extends StObject {
  
  /**
    *
    * Represents the border format of a chart data point, which includes color, style, and weight information.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.undefined
}
object ChartPointFormatUpdateData {
  
  @scala.inline
  def apply(): ChartPointFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointFormatUpdateData]
  }
  
  @scala.inline
  implicit class ChartPointFormatUpdateDataMutableBuilder[Self <: ChartPointFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ChartBorderUpdateData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
