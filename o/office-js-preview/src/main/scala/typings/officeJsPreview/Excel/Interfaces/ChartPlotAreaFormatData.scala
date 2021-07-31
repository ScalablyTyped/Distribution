package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartPlotAreaFormat.toJSON()`. */
trait ChartPlotAreaFormatData extends StObject {
  
  /**
    *
    * Specifies the border attributes of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderData] = js.undefined
}
object ChartPlotAreaFormatData {
  
  @scala.inline
  def apply(): ChartPlotAreaFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaFormatData]
  }
  
  @scala.inline
  implicit class ChartPlotAreaFormatDataMutableBuilder[Self <: ChartPlotAreaFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ChartBorderData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
