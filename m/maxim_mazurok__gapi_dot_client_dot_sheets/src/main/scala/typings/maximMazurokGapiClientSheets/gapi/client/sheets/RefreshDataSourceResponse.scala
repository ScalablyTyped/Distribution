package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshDataSourceResponse extends StObject {
  
  /** All the refresh status for the data source object references specified in the request. If is_all is specified, the field contains only those in failure status. */
  var statuses: js.UndefOr[js.Array[RefreshDataSourceObjectExecutionStatus]] = js.undefined
}
object RefreshDataSourceResponse {
  
  inline def apply(): RefreshDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshDataSourceResponse]
  }
  
  extension [Self <: RefreshDataSourceResponse](x: Self) {
    
    inline def setStatuses(value: js.Array[RefreshDataSourceObjectExecutionStatus]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setStatusesVarargs(value: RefreshDataSourceObjectExecutionStatus*): Self = StObject.set(x, "statuses", js.Array(value*))
  }
}
