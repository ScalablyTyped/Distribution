package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSheetProperties extends js.Object {
  
  /** The columns displayed on the sheet, corresponding to the values in RowData. */
  var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.native
  
  /** The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.native
  
  /** ID of the DataSource the sheet is connected to. */
  var dataSourceId: js.UndefOr[String] = js.native
}
object DataSourceSheetProperties {
  
  @scala.inline
  def apply(): DataSourceSheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSheetProperties]
  }
  
  @scala.inline
  implicit class DataSourceSheetPropertiesOps[Self <: DataSourceSheetProperties] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: DataSourceColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[DataSourceColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
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
  }
}
