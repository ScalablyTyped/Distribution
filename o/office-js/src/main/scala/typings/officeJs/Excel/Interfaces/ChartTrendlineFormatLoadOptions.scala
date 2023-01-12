package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the format properties for the chart trendline.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait ChartTrendlineFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents chart line formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var line: js.UndefOr[ChartLineFormatLoadOptions] = js.undefined
}
object ChartTrendlineFormatLoadOptions {
  
  inline def apply(): ChartTrendlineFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineFormatLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartTrendlineFormatLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setLine(value: ChartLineFormatLoadOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
