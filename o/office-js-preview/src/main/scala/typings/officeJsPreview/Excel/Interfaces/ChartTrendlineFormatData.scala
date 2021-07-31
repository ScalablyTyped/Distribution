package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartTrendlineFormat.toJSON()`. */
trait ChartTrendlineFormatData extends StObject {
  
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.7]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.undefined
}
object ChartTrendlineFormatData {
  
  @scala.inline
  def apply(): ChartTrendlineFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineFormatData]
  }
  
  @scala.inline
  implicit class ChartTrendlineFormatDataMutableBuilder[Self <: ChartTrendlineFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: ChartLineFormatData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
