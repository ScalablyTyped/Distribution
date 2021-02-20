package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartSeriesFormat.toJSON()`. */
@js.native
trait ChartSeriesFormatData extends StObject {
  
  /**
    *
    * Represents line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.native
}
object ChartSeriesFormatData {
  
  @scala.inline
  def apply(): ChartSeriesFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesFormatData]
  }
  
  @scala.inline
  implicit class ChartSeriesFormatDataMutableBuilder[Self <: ChartSeriesFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: ChartLineFormatData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
