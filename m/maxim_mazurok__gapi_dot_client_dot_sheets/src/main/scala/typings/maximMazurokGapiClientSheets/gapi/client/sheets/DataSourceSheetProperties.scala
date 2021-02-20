package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSheetProperties extends StObject {
  
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
  implicit class DataSourceSheetPropertiesMutableBuilder[Self <: DataSourceSheetProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[DataSourceColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: DataSourceColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDataExecutionStatus(value: DataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
  }
}
