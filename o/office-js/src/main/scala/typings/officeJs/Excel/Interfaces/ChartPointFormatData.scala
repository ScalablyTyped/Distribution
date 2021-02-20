package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartPointFormat.toJSON()`. */
@js.native
trait ChartPointFormatData extends StObject {
  
  /**
    *
    * Represents the border format of a chart data point, which includes color, style, and weight information.
    *
    * [Api set: ExcelApi 1.7]
    */
  var border: js.UndefOr[ChartBorderData] = js.native
}
object ChartPointFormatData {
  
  @scala.inline
  def apply(): ChartPointFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointFormatData]
  }
  
  @scala.inline
  implicit class ChartPointFormatDataMutableBuilder[Self <: ChartPointFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ChartBorderData): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
