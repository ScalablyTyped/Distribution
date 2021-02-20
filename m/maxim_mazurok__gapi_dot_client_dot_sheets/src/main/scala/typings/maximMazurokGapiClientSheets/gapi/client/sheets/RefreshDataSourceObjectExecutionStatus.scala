package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshDataSourceObjectExecutionStatus extends StObject {
  
  /** The data execution status. */
  var dataExecutionStatus: js.UndefOr[DataExecutionStatus] = js.native
  
  /** Reference to a data source object being refreshed. */
  var reference: js.UndefOr[DataSourceObjectReference] = js.native
}
object RefreshDataSourceObjectExecutionStatus {
  
  @scala.inline
  def apply(): RefreshDataSourceObjectExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshDataSourceObjectExecutionStatus]
  }
  
  @scala.inline
  implicit class RefreshDataSourceObjectExecutionStatusMutableBuilder[Self <: RefreshDataSourceObjectExecutionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataExecutionStatus(value: DataExecutionStatus): Self = StObject.set(x, "dataExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExecutionStatusUndefined: Self = StObject.set(x, "dataExecutionStatus", js.undefined)
    
    @scala.inline
    def setReference(value: DataSourceObjectReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
