package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartGridlinesFormat.toJSON()`. */
trait ChartGridlinesFormatData extends StObject {
  
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.undefined
}
object ChartGridlinesFormatData {
  
  inline def apply(): ChartGridlinesFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlinesFormatData]
  }
  
  extension [Self <: ChartGridlinesFormatData](x: Self) {
    
    inline def setLine(value: ChartLineFormatData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
