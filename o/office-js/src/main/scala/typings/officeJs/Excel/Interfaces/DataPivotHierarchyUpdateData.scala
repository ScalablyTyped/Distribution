package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.AggregationFunction
import typings.officeJs.Excel.ShowAsRule
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Average
import typings.officeJs.officeJsStrings.Count
import typings.officeJs.officeJsStrings.CountNumbers
import typings.officeJs.officeJsStrings.Max
import typings.officeJs.officeJsStrings.Min
import typings.officeJs.officeJsStrings.Product
import typings.officeJs.officeJsStrings.StandardDeviation
import typings.officeJs.officeJsStrings.StandardDeviationP
import typings.officeJs.officeJsStrings.Sum
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.Variance
import typings.officeJs.officeJsStrings.VarianceP
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
