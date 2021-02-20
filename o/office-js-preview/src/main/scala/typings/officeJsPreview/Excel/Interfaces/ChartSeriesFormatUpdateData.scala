package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartSeriesFormat object, for use in `chartSeriesFormat.set({ ... })`. */
@js.native
trait ChartSeriesFormatUpdateData extends StObject {
  
  /**
    *
    * Represents line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatUpdateData] = js.native
}
object ChartSeriesFormatUpdateData {
  
  @scala.inline
  def apply(): ChartSeriesFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesFormatUpdateData]
  }
  
  @scala.inline
  implicit class ChartSeriesFormatUpdateDataMutableBuilder[Self <: ChartSeriesFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: ChartLineFormatUpdateData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
