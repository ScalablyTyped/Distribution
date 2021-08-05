package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.AggregationFunction
import typings.officeJsPreview.Excel.ShowAsRule
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Average
import typings.officeJsPreview.officeJsPreviewStrings.Count
import typings.officeJsPreview.officeJsPreviewStrings.CountNumbers
import typings.officeJsPreview.officeJsPreviewStrings.Max
import typings.officeJsPreview.officeJsPreviewStrings.Min
import typings.officeJsPreview.officeJsPreviewStrings.Product
import typings.officeJsPreview.officeJsPreviewStrings.StandardDeviation
import typings.officeJsPreview.officeJsPreviewStrings.StandardDeviationP
import typings.officeJsPreview.officeJsPreviewStrings.Sum
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import typings.officeJsPreview.officeJsPreviewStrings.Variance
import typings.officeJsPreview.officeJsPreviewStrings.VarianceP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DataPivotHierarchy object, for use in `dataPivotHierarchy.set({ ... })`. */
trait DataPivotHierarchyUpdateData extends StObject {
  
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldUpdateData] = js.undefined
  
  /**
    *
    * Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies if the data should be shown as a specific summary calculation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[ShowAsRule] = js.undefined
  
  /**
    *
    * Specifies if all items of the DataPivotHierarchy are shown.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[
    AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
  ] = js.undefined
}
object DataPivotHierarchyUpdateData {
  
  inline def apply(): DataPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyUpdateData]
  }
  
  extension [Self <: DataPivotHierarchyUpdateData](x: Self) {
    
    inline def setField(value: PivotFieldUpdateData): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowAs(value: ShowAsRule): Self = StObject.set(x, "showAs", value.asInstanceOf[js.Any])
    
    inline def setShowAsUndefined: Self = StObject.set(x, "showAs", js.undefined)
    
    inline def setSummarizeBy(
      value: AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
    ): Self = StObject.set(x, "summarizeBy", value.asInstanceOf[js.Any])
    
    inline def setSummarizeByUndefined: Self = StObject.set(x, "summarizeBy", js.undefined)
  }
}
