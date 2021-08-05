package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the format properties for chart plotArea.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartPlotAreaFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the border attributes of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.undefined
}
object ChartPlotAreaFormatLoadOptions {
  
  inline def apply(): ChartPlotAreaFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaFormatLoadOptions]
  }
  
  extension [Self <: ChartPlotAreaFormatLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBorder(value: ChartBorderLoadOptions): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
