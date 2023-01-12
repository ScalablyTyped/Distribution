package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the bin options for histogram charts and pareto charts.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait ChartBinOptionsLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if bin overflow is enabled in a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if bin underflow is enabled in a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the bin count of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var count: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the bin overflow value of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the bin's type for a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the bin underflow value of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the bin width value of a histogram chart or pareto chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object ChartBinOptionsLoadOptions {
  
  inline def apply(): ChartBinOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBinOptionsLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartBinOptionsLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAllowOverflow(value: Boolean): Self = StObject.set(x, "allowOverflow", value.asInstanceOf[js.Any])
    
    inline def setAllowOverflowUndefined: Self = StObject.set(x, "allowOverflow", js.undefined)
    
    inline def setAllowUnderflow(value: Boolean): Self = StObject.set(x, "allowUnderflow", value.asInstanceOf[js.Any])
    
    inline def setAllowUnderflowUndefined: Self = StObject.set(x, "allowUnderflow", js.undefined)
    
    inline def setCount(value: Boolean): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setOverflowValue(value: Boolean): Self = StObject.set(x, "overflowValue", value.asInstanceOf[js.Any])
    
    inline def setOverflowValueUndefined: Self = StObject.set(x, "overflowValue", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnderflowValue(value: Boolean): Self = StObject.set(x, "underflowValue", value.asInstanceOf[js.Any])
    
    inline def setUnderflowValueUndefined: Self = StObject.set(x, "underflowValue", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
