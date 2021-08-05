package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartSeriesFormat.toJSON()`. */
trait ChartSeriesFormatData extends StObject {
  
  /**
    *
    * Represents line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.undefined
}
object ChartSeriesFormatData {
  
  inline def apply(): ChartSeriesFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesFormatData]
  }
  
  extension [Self <: ChartSeriesFormatData](x: Self) {
    
    inline def setLine(value: ChartLineFormatData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
