package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTable extends StObject {
  
  /** Each column grouping in the pivot table. */
  var columns: js.UndefOr[js.Array[PivotGroup]] = js.undefined
  
  /**
    * An optional mapping of filters per source column offset. The filters are applied before aggregating data into the pivot table. The map's key is the column offset of the source range
    * that you want to filter, and the value is the criteria for that column. For example, if the source was `C10:E15`, a key of `0` will have the filter for column `C`, whereas the key
    * `1` is for column `D`. This field is deprecated in favor of filter_specs.
    */
  var criteria: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.sheets.gapi.client.sheets.PivotFilterCriteria}
    */ typings.maximMazurokGapiClientSheets.maximMazurokGapiClientSheetsStrings.PivotTable & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The data execution status for data source pivot tables. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.undefined
  
  /** The ID of the data source the pivot table is reading data from. */
  var dataSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The filters applied to the source columns before aggregating data for the pivot table. Both criteria and filter_specs are populated in responses. If both fields are specified in an
    * update request, this field takes precedence.
    */
  var filterSpecs: js.UndefOr[js.Array[PivotFilterSpec]] = js.undefined
  
  /** Each row grouping in the pivot table. */
  var rows: js.UndefOr[js.Array[PivotGroup]] = js.undefined
  
  /** The range the pivot table is reading data from. */
  var source: js.UndefOr[GridRange] = js.undefined
  
  /** Whether values should be listed horizontally (as columns) or vertically (as rows). */
  var valueLayout: js.UndefOr[String] = js.undefined
  
  /** A list of values to include in the pivot table. */
  var values: js.UndefOr[js.Array[PivotValue]] = js.undefined
}
object PivotTable {
  
  @scala.inline
  def apply(): PivotTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTable]
  }
  
  @scala.inline
  implicit class PivotTableMutableBuilder[Self <: PivotTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[PivotGroup]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: PivotGroup*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCriteria(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.sheets.gapi.client.sheets.PivotFilterCriteria}
      */ typings.maximMazurokGapiClientSheets.maximMazurokGapiClientSheetsStrings.PivotTable & TopLevel[js.Any]
    ): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setDataExecutionStatus(value: DataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    @scala.inline
    def setFilterSpecs(value: js.Array[PivotFilterSpec]): Self = StObject.set(x, "filterSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSpecsUndefined: Self = StObject.set(x, "filterSpecs", js.undefined)
    
    @scala.inline
    def setFilterSpecsVarargs(value: PivotFilterSpec*): Self = StObject.set(x, "filterSpecs", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[PivotGroup]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: PivotGroup*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: GridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setValueLayout(value: String): Self = StObject.set(x, "valueLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLayoutUndefined: Self = StObject.set(x, "valueLayout", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[PivotValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: PivotValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
