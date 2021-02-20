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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the DataPivotHierarchy object, for use in `dataPivotHierarchy.set({ ... })`. */
@js.native
trait DataPivotHierarchyUpdateData extends StObject {
  
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldUpdateData] = js.native
  
  /**
    *
    * Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.native
  
  /**
    *
    * Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies if the data should be shown as a specific summary calculation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[ShowAsRule] = js.native
  
  /**
    *
    * Specifies if all items of the DataPivotHierarchy are shown.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[
    AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
  ] = js.native
}
object DataPivotHierarchyUpdateData {
  
  @scala.inline
  def apply(): DataPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyUpdateData]
  }
  
  @scala.inline
  implicit class DataPivotHierarchyUpdateDataMutableBuilder[Self <: DataPivotHierarchyUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: PivotFieldUpdateData): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowAs(value: ShowAsRule): Self = StObject.set(x, "showAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAsUndefined: Self = StObject.set(x, "showAs", js.undefined)
    
    @scala.inline
    def setSummarizeBy(
      value: AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
    ): Self = StObject.set(x, "summarizeBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummarizeByUndefined: Self = StObject.set(x, "summarizeBy", js.undefined)
  }
}
