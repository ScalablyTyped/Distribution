package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshDataSourceObjectExecutionStatus extends js.Object {
  
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
  implicit class RefreshDataSourceObjectExecutionStatusOps[Self <: RefreshDataSourceObjectExecutionStatus] (val x: Self) extends AnyVal {
    
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
    def setDataExecutionStatus(value: DataExecutionStatus): Self = this.set("dataExecutionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataExecutionStatus: Self = this.set("dataExecutionStatus", js.undefined)
    
    @scala.inline
    def setReference(value: DataSourceObjectReference): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
  }
}
