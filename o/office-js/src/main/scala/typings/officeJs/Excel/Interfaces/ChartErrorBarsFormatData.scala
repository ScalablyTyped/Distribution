package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartErrorBarsFormat.toJSON()`. */
trait ChartErrorBarsFormatData extends StObject {
  
  /**
    * Represents the chart line formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.undefined
}
object ChartErrorBarsFormatData {
  
  inline def apply(): ChartErrorBarsFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsFormatData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartErrorBarsFormatData] (val x: Self) extends AnyVal {
    
    inline def setLine(value: ChartLineFormatData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
