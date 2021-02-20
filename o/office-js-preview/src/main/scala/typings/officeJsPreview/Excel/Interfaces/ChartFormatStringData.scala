package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartFormatString.toJSON()`. */
@js.native
trait ChartFormatStringData extends StObject {
  
  /**
    *
    * Represents the font attributes, such as font name, font size, color, etc. of chart characters object.
    *
    * [Api set: ExcelApi 1.7]
    */
  var font: js.UndefOr[ChartFontData] = js.native
}
object ChartFormatStringData {
  
  @scala.inline
  def apply(): ChartFormatStringData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartFormatStringData]
  }
  
  @scala.inline
  implicit class ChartFormatStringDataMutableBuilder[Self <: ChartFormatStringData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: ChartFontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
