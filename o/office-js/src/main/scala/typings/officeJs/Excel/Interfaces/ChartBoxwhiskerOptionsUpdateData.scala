package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartBoxQuartileCalculation
import typings.officeJs.officeJsStrings.Exclusive
import typings.officeJs.officeJsStrings.Inclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartBoxwhiskerOptions object, for use in `chartBoxwhiskerOptions.set({ ... })`. */
trait ChartBoxwhiskerOptionsUpdateData extends StObject {
  
  /**
    *
    * Specifies if the quartile calculation type of a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[ChartBoxQuartileCalculation | Inclusive | Exclusive] = js.undefined
  
  /**
    *
    * Specifies if inner points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the mean line is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the mean marker is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if outlier points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.undefined
}
object ChartBoxwhiskerOptionsUpdateData {
  
  inline def apply(): ChartBoxwhiskerOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBoxwhiskerOptionsUpdateData]
  }
  
  extension [Self <: ChartBoxwhiskerOptionsUpdateData](x: Self) {
    
    inline def setQuartileCalculation(value: ChartBoxQuartileCalculation | Inclusive | Exclusive): Self = StObject.set(x, "quartileCalculation", value.asInstanceOf[js.Any])
    
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
