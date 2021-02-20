package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartBinType
import typings.officeJsPreview.officeJsPreviewStrings.Auto
import typings.officeJsPreview.officeJsPreviewStrings.BinCount
import typings.officeJsPreview.officeJsPreviewStrings.BinWidth
import typings.officeJsPreview.officeJsPreviewStrings.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartBinOptions object, for use in `chartBinOptions.set({ ... })`. */
@js.native
trait ChartBinOptionsUpdateData extends StObject {
  
  /**
    *
    * Specifies if bin overflow is enabled in a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if bin underflow is enabled in a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies the bin count of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var count: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the bin overflow value of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the bin's type for a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ChartBinType | Category | Auto | BinWidth | BinCount] = js.native
  
  /**
    *
    * Specifies the bin underflow value of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies the bin width value of a histogram chart or pareto chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: js.UndefOr[Double] = js.native
}
object ChartBinOptionsUpdateData {
  
  @scala.inline
  def apply(): ChartBinOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBinOptionsUpdateData]
  }
  
  @scala.inline
  implicit class ChartBinOptionsUpdateDataMutableBuilder[Self <: ChartBinOptionsUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowOverflow(value: Boolean): Self = StObject.set(x, "allowOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOverflowUndefined: Self = StObject.set(x, "allowOverflow", js.undefined)
    
    @scala.inline
    def setAllowUnderflow(value: Boolean): Self = StObject.set(x, "allowUnderflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnderflowUndefined: Self = StObject.set(x, "allowUnderflow", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setOverflowValue(value: Double): Self = StObject.set(x, "overflowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowValueUndefined: Self = StObject.set(x, "overflowValue", js.undefined)
    
    @scala.inline
    def setType(value: ChartBinType | Category | Auto | BinWidth | BinCount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnderflowValue(value: Double): Self = StObject.set(x, "underflowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderflowValueUndefined: Self = StObject.set(x, "underflowValue", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
