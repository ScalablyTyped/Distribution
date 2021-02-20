package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartGridlinesFormat.toJSON()`. */
@js.native
trait ChartGridlinesFormatData extends StObject {
  
  /**
    *
    * Represents chart line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var line: js.UndefOr[ChartLineFormatData] = js.native
}
object ChartGridlinesFormatData {
  
  @scala.inline
  def apply(): ChartGridlinesFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlinesFormatData]
  }
  
  @scala.inline
  implicit class ChartGridlinesFormatDataMutableBuilder[Self <: ChartGridlinesFormatData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: ChartLineFormatData): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
