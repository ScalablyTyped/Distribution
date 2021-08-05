package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartGridlines.toJSON()`. */
trait ChartGridlinesData extends StObject {
  
  /**
    *
    * Represents the formatting of chart gridlines.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartGridlinesFormatData] = js.undefined
  
  /**
    *
    * Specifies if the axis gridlines are visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartGridlinesData {
  
  inline def apply(): ChartGridlinesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlinesData]
  }
  
  extension [Self <: ChartGridlinesData](x: Self) {
    
    inline def setFormat(value: ChartGridlinesFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
