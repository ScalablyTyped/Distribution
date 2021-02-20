package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartErrorBarsFormat.toJSON()`. */
@js.native
trait ChartErrorBarsFormatData extends StObject {
  
  /**
    *
    * Represents the chart line formatting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.native
}
object ChartErrorBarsFormatData {
  
  @scala.inline
  def apply(): ChartErrorBarsFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsFormatData]
  }
  
  @scala.inline
  implicit class ChartErrorBarsFormatDataMutableBuilder[Self <: ChartErrorBarsFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: ChartLineFormatData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
