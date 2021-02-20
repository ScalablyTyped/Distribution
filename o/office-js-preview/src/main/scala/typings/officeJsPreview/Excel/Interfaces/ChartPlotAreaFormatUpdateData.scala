package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartPlotAreaFormat object, for use in `chartPlotAreaFormat.set({ ... })`. */
@js.native
trait ChartPlotAreaFormatUpdateData extends StObject {
  
  /**
    *
    * Specifies the border attributes of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderUpdateData] = js.native
}
object ChartPlotAreaFormatUpdateData {
  
  @scala.inline
  def apply(): ChartPlotAreaFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaFormatUpdateData]
  }
  
  @scala.inline
  implicit class ChartPlotAreaFormatUpdateDataMutableBuilder[Self <: ChartPlotAreaFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ChartBorderUpdateData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
