package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Encapsulates the bin options for histogram charts and pareto charts.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ChartBinOptionsLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if bin overflow is enabled in a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if bin underflow is enabled in a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the bin count of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var count: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the bin overflow value of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the bin's type for a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the bin underflow value of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the bin width value of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object ChartBinOptionsLoadOptions {
  
  @scala.inline
  def apply(): ChartBinOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBinOptionsLoadOptions]
  }
  
  @scala.inline
  implicit class ChartBinOptionsLoadOptionsMutableBuilder[Self <: ChartBinOptionsLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAllowOverflow(value: Boolean): Self = StObject.set(x, "allowOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOverflowUndefined: Self = StObject.set(x, "allowOverflow", js.undefined)
    
    @scala.inline
    def setAllowUnderflow(value: Boolean): Self = StObject.set(x, "allowUnderflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnderflowUndefined: Self = StObject.set(x, "allowUnderflow", js.undefined)
    
    @scala.inline
    def setCount(value: Boolean): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setOverflowValue(value: Boolean): Self = StObject.set(x, "overflowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowValueUndefined: Self = StObject.set(x, "overflowValue", js.undefined)
    
    @scala.inline
    def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnderflowValue(value: Boolean): Self = StObject.set(x, "underflowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderflowValueUndefined: Self = StObject.set(x, "underflowValue", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
