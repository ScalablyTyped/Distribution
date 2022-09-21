package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the properties of a box and whisker chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait ChartBoxwhiskerOptionsLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the quartile calculation type of a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if inner points are shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the mean line is shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the mean marker is shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if outlier points are shown in a box and whisker chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.undefined
}
object ChartBoxwhiskerOptionsLoadOptions {
  
  inline def apply(): ChartBoxwhiskerOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBoxwhiskerOptionsLoadOptions]
  }
  
  extension [Self <: ChartBoxwhiskerOptionsLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setQuartileCalculation(value: Boolean): Self = StObject.set(x, "quartileCalculation", value.asInstanceOf[js.Any])
    
    inline def setQuartileCalculationUndefined: Self = StObject.set(x, "quartileCalculation", js.undefined)
    
    inline def setShowInnerPoints(value: Boolean): Self = StObject.set(x, "showInnerPoints", value.asInstanceOf[js.Any])
    
    inline def setShowInnerPointsUndefined: Self = StObject.set(x, "showInnerPoints", js.undefined)
    
    inline def setShowMeanLine(value: Boolean): Self = StObject.set(x, "showMeanLine", value.asInstanceOf[js.Any])
    
    inline def setShowMeanLineUndefined: Self = StObject.set(x, "showMeanLine", js.undefined)
    
    inline def setShowMeanMarker(value: Boolean): Self = StObject.set(x, "showMeanMarker", value.asInstanceOf[js.Any])
    
    inline def setShowMeanMarkerUndefined: Self = StObject.set(x, "showMeanMarker", js.undefined)
    
    inline def setShowOutlierPoints(value: Boolean): Self = StObject.set(x, "showOutlierPoints", value.asInstanceOf[js.Any])
    
    inline def setShowOutlierPointsUndefined: Self = StObject.set(x, "showOutlierPoints", js.undefined)
  }
}
