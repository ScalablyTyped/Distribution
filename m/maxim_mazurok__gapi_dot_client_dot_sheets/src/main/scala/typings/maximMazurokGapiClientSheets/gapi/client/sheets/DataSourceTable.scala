package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceTable extends js.Object {
  
  /** The type to select columns for the data source table. Defaults to SELECTED. */
  var columnSelectionType: js.UndefOr[String] = js.native
  
  /** Columns selected for the data source table. The column_selection_type must be SELECTED. */
  var columns: js.UndefOr[js.Array[DataSourceColumnReference]] = js.native
  
  /** Output only. The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.native
  
  /** The ID of the data source the data source table is associated with. */
  var dataSourceId: js.UndefOr[String] = js.native
  
  /** Filter specifications in the data source table. */
  var filterSpecs: js.UndefOr[js.Array[FilterSpec]] = js.native
  
  /** The limit of rows to return. If not set, a default limit is applied. Please refer to the Sheets editor for the default and max limit. */
  var rowLimit: js.UndefOr[Double] = js.native
  
  /** Sort specifications in the data source table. The result of the data source table is sorted based on the sort specifications in order. */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
}
object DataSourceTable {
  
  @scala.inline
  def apply(): DataSourceTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTable]
  }
  
  @scala.inline
  implicit class DataSourceTableOps[Self <: DataSourceTable] (val x: Self) extends AnyVal {
    
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
    def setColumnSelectionType(value: String): Self = this.set("columnSelectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSelectionType: Self = this.set("columnSelectionType", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: DataSourceColumnReference*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[DataSourceColumnReference]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDataExecutionStatus(value: DataExecutionStatus): Self = this.set("dataExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataExecutionStatus: Self = this.set("dataExecutionStatus", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: String): Self = this.set("dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceId: Self = this.set("dataSourceId", js.undefined)
    
    @scala.inline
    def setFilterSpecsVarargs(value: FilterSpec*): Self = this.set("filterSpecs", js.Array(value :_*))
    
    @scala.inline
    def setFilterSpecs(value: js.Array[FilterSpec]): Self = this.set("filterSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSpecs: Self = this.set("filterSpecs", js.undefined)
    
    @scala.inline
    def setRowLimit(value: Double): Self = this.set("rowLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLimit: Self = this.set("rowLimit", js.undefined)
    
    @scala.inline
    def setSortSpecsVarargs(value: SortSpec*): Self = this.set("sortSpecs", js.Array(value :_*))
    
    @scala.inline
    def setSortSpecs(value: js.Array[SortSpec]): Self = this.set("sortSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortSpecs: Self = this.set("sortSpecs", js.undefined)
  }
}
