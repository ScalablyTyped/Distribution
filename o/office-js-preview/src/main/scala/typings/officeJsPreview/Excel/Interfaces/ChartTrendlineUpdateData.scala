package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartTrendlineType
import typings.officeJsPreview.officeJsPreviewStrings.Exponential
import typings.officeJsPreview.officeJsPreviewStrings.Linear
import typings.officeJsPreview.officeJsPreviewStrings.Logarithmic
import typings.officeJsPreview.officeJsPreviewStrings.MovingAverage
import typings.officeJsPreview.officeJsPreviewStrings.Polynomial
import typings.officeJsPreview.officeJsPreviewStrings.Power
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartTrendline object, for use in `chartTrendline.set({ ... })`. */
@js.native
trait ChartTrendlineUpdateData extends js.Object {
  
  /**
    *
    * Represents the number of periods that the trendline extends backward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the formatting of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var format: js.UndefOr[ChartTrendlineFormatUpdateData] = js.native
  
  /**
    *
    * Represents the number of periods that the trendline extends forward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var intercept: js.UndefOr[js.Any] = js.native
  
  /**
    *
    * Represents the label of a chart trendline.
    *
    * [Api set: ExcelApi 1.8]
    */
  var label: js.UndefOr[ChartTrendlineLabelUpdateData] = js.native
  
  /**
    *
    * Represents the period of a chart trendline. Only applicable for trendline with MovingAverage type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the name of the trendline. Can be set to a string value, or can be set to null value represents automatic values. The returned value is always a string
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the order of a chart trendline. Only applicable for trendline with Polynomial type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: js.UndefOr[Double] = js.native
  
  /**
    *
    * True if the equation for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * True if the R-squared for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the type of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    ChartTrendlineType | Linear | Exponential | Logarithmic | MovingAverage | Polynomial | Power
  ] = js.native
}
object ChartTrendlineUpdateData {
  
  @scala.inline
  def apply(): ChartTrendlineUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineUpdateData]
  }
  
  @scala.inline
  implicit class ChartTrendlineUpdateDataOps[Self <: ChartTrendlineUpdateData] (val x: Self) extends AnyVal {
    
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
    def setBackwardPeriod(value: Double): Self = this.set("backwardPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackwardPeriod: Self = this.set("backwardPeriod", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartTrendlineFormatUpdateData): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setForwardPeriod(value: Double): Self = this.set("forwardPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardPeriod: Self = this.set("forwardPeriod", js.undefined)
    
    @scala.inline
    def setIntercept(value: js.Any): Self = this.set("intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntercept: Self = this.set("intercept", js.undefined)
    
    @scala.inline
    def setLabel(value: ChartTrendlineLabelUpdateData): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMovingAveragePeriod(value: Double): Self = this.set("movingAveragePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovingAveragePeriod: Self = this.set("movingAveragePeriod", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPolynomialOrder(value: Double): Self = this.set("polynomialOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolynomialOrder: Self = this.set("polynomialOrder", js.undefined)
    
    @scala.inline
    def setShowEquation(value: Boolean): Self = this.set("showEquation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEquation: Self = this.set("showEquation", js.undefined)
    
    @scala.inline
    def setShowRSquared(value: Boolean): Self = this.set("showRSquared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRSquared: Self = this.set("showRSquared", js.undefined)
    
    @scala.inline
    def setType(
      value: ChartTrendlineType | Linear | Exponential | Logarithmic | MovingAverage | Polynomial | Power
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
