package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents the attributes for a chart trendline object.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait ChartTrendlineLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the number of periods that the trendline extends backward.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the formatting of a chart trendline.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var format: js.UndefOr[ChartTrendlineFormatLoadOptions] = js.undefined
  
  /**
    * Represents the number of periods that the trendline extends forward.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var intercept: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the label of a chart trendline.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var label: js.UndefOr[ChartTrendlineLabelLoadOptions] = js.undefined
  
  /**
    * Represents the period of a chart trendline. Only applicable to trendlines with the type `MovingAverage`.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the name of the trendline. Can be set to a string value, a `null` value represents automatic values. The returned value is always a string
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the order of a chart trendline. Only applicable to trendlines with the type `Polynomial`.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the equation for the trendline is displayed on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the r-squared value for the trendline is displayed on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the type of a chart trendline.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object ChartTrendlineLoadOptions {
  
  inline def apply(): ChartTrendlineLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartTrendlineLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setBackwardPeriod(value: Boolean): Self = StObject.set(x, "backwardPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackwardPeriodUndefined: Self = StObject.set(x, "backwardPeriod", js.undefined)
    
    inline def setFormat(value: ChartTrendlineFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setForwardPeriod(value: Boolean): Self = StObject.set(x, "forwardPeriod", value.asInstanceOf[js.Any])
    
    inline def setForwardPeriodUndefined: Self = StObject.set(x, "forwardPeriod", js.undefined)
    
    inline def setIntercept(value: Boolean): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
    
    inline def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
    
    inline def setLabel(value: ChartTrendlineLabelLoadOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMovingAveragePeriod(value: Boolean): Self = StObject.set(x, "movingAveragePeriod", value.asInstanceOf[js.Any])
    
    inline def setMovingAveragePeriodUndefined: Self = StObject.set(x, "movingAveragePeriod", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolynomialOrder(value: Boolean): Self = StObject.set(x, "polynomialOrder", value.asInstanceOf[js.Any])
    
    inline def setPolynomialOrderUndefined: Self = StObject.set(x, "polynomialOrder", js.undefined)
    
    inline def setShowEquation(value: Boolean): Self = StObject.set(x, "showEquation", value.asInstanceOf[js.Any])
    
    inline def setShowEquationUndefined: Self = StObject.set(x, "showEquation", js.undefined)
    
    inline def setShowRSquared(value: Boolean): Self = StObject.set(x, "showRSquared", value.asInstanceOf[js.Any])
    
    inline def setShowRSquaredUndefined: Self = StObject.set(x, "showRSquared", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
