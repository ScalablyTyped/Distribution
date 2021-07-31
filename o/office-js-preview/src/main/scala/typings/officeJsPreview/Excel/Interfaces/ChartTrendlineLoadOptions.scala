package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * This object represents the attributes for a chart trendline object.
  *
  * [Api set: ExcelApi 1.7]
  */
trait ChartTrendlineLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the number of periods that the trendline extends backward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the formatting of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var format: js.UndefOr[ChartTrendlineFormatLoadOptions] = js.undefined
  
  /**
    *
    * Represents the number of periods that the trendline extends forward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var intercept: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the label of a chart trendline.
    *
    * [Api set: ExcelApi 1.8]
    */
  var label: js.UndefOr[ChartTrendlineLabelLoadOptions] = js.undefined
  
  /**
    *
    * Represents the period of a chart trendline. Only applicable for trendline with MovingAverage type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the name of the trendline. Can be set to a string value, or can be set to null value represents automatic values. The returned value is always a string
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the order of a chart trendline. Only applicable for trendline with Polynomial type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * True if the equation for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * True if the R-squared for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the type of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object ChartTrendlineLoadOptions {
  
  @scala.inline
  def apply(): ChartTrendlineLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineLoadOptions]
  }
  
  @scala.inline
  implicit class ChartTrendlineLoadOptionsMutableBuilder[Self <: ChartTrendlineLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setBackwardPeriod(value: Boolean): Self = StObject.set(x, "backwardPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackwardPeriodUndefined: Self = StObject.set(x, "backwardPeriod", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartTrendlineFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setForwardPeriod(value: Boolean): Self = StObject.set(x, "forwardPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardPeriodUndefined: Self = StObject.set(x, "forwardPeriod", js.undefined)
    
    @scala.inline
    def setIntercept(value: Boolean): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
    
    @scala.inline
    def setLabel(value: ChartTrendlineLabelLoadOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMovingAveragePeriod(value: Boolean): Self = StObject.set(x, "movingAveragePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovingAveragePeriodUndefined: Self = StObject.set(x, "movingAveragePeriod", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPolynomialOrder(value: Boolean): Self = StObject.set(x, "polynomialOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolynomialOrderUndefined: Self = StObject.set(x, "polynomialOrder", js.undefined)
    
    @scala.inline
    def setShowEquation(value: Boolean): Self = StObject.set(x, "showEquation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowEquationUndefined: Self = StObject.set(x, "showEquation", js.undefined)
    
    @scala.inline
    def setShowRSquared(value: Boolean): Self = StObject.set(x, "showRSquared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRSquaredUndefined: Self = StObject.set(x, "showRSquared", js.undefined)
    
    @scala.inline
    def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
