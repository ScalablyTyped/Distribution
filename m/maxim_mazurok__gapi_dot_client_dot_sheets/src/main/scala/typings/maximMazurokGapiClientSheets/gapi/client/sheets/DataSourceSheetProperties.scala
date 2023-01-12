package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSheetProperties extends StObject {
  
  /** The columns displayed on the sheet, corresponding to the values in RowData. */
  var columns: js.UndefOr[js.Array[DataSourceColumn]] = js.undefined
  
  /** The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.undefined
  
  /** ID of the DataSource the sheet is connected to. */
  var dataSourceId: js.UndefOr[String] = js.undefined
}
object DataSourceSheetProperties {
  
  inline def apply(): DataSourceSheetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSheetProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceSheetProperties] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: js.Array[DataSourceColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: DataSourceColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDataExecutionStatus(value: DataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
  }
}
