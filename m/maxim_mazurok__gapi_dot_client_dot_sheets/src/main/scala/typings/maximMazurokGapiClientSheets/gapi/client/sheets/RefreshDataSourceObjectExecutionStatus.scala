package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshDataSourceObjectExecutionStatus extends StObject {
  
  /** The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.undefined
  
  /** Reference to a data source object being refreshed. */
  var reference: js.UndefOr[DataSourceObjectReference] = js.undefined
}
object RefreshDataSourceObjectExecutionStatus {
  
  inline def apply(): RefreshDataSourceObjectExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshDataSourceObjectExecutionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshDataSourceObjectExecutionStatus] (val x: Self) extends AnyVal {
    
    inline def setDataExecutionStatus(value: DataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    inline def setReference(value: DataSourceObjectReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
