package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDataSourceResponse extends StObject {
  
  /** The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.undefined
  
  /** The data source that was created. */
  var dataSource: js.UndefOr[DataSource] = js.undefined
}
object AddDataSourceResponse {
  
  inline def apply(): AddDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDataSourceResponse]
  }
  
  extension [Self <: AddDataSourceResponse](x: Self) {
    
    inline def setDataExecutionStatus(value: DataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
