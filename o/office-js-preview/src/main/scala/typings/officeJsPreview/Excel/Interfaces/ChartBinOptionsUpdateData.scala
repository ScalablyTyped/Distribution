package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartBinType
import typings.officeJsPreview.officeJsPreviewStrings.Auto
import typings.officeJsPreview.officeJsPreviewStrings.BinCount
import typings.officeJsPreview.officeJsPreviewStrings.BinWidth
import typings.officeJsPreview.officeJsPreviewStrings.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartBinOptions object, for use in `chartBinOptions.set({ ... })`. */
@js.native
trait ChartBinOptionsUpdateData extends js.Object {
  
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
  implicit class ChartBinOptionsUpdateDataOps[Self <: ChartBinOptionsUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowOverflow(value: Boolean): Self = this.set("allowOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOverflow: Self = this.set("allowOverflow", js.undefined)
    
    @scala.inline
    def setAllowUnderflow(value: Boolean): Self = this.set("allowUnderflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnderflow: Self = this.set("allowUnderflow", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setOverflowValue(value: Double): Self = this.set("overflowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowValue: Self = this.set("overflowValue", js.undefined)
    
    @scala.inline
    def setType(value: ChartBinType | Category | Auto | BinWidth | BinCount): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnderflowValue(value: Double): Self = this.set("underflowValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderflowValue: Self = this.set("underflowValue", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
