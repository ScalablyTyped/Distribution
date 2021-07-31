package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartErrorBarsFormat object, for use in `chartErrorBarsFormat.set({ ... })`. */
trait ChartErrorBarsFormatUpdateData extends StObject {
  
  /**
    *
    * Represents the chart line formatting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.undefined
}
object ChartErrorBarsFormatUpdateData {
  
  @scala.inline
  def apply(): ChartErrorBarsFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsFormatUpdateData]
  }
  
  @scala.inline
  implicit class ChartErrorBarsFormatUpdateDataMutableBuilder[Self <: ChartErrorBarsFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: ChartLineFormatUpdateData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
