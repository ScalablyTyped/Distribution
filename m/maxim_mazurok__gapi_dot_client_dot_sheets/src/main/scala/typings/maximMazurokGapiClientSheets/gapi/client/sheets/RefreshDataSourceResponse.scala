package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshDataSourceResponse extends js.Object {
  
  /** All the refresh status for the data source object references specified in the request. If is_all is specified, the field contains only those in failure status. */
  var statuses: js.UndefOr[js.Array[RefreshDataSourceObjectExecutionStatus]] = js.native
}
object RefreshDataSourceResponse {
  
  @scala.inline
  def apply(): RefreshDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshDataSourceResponse]
  }
  
  @scala.inline
  implicit class RefreshDataSourceResponseOps[Self <: RefreshDataSourceResponse] (val x: Self) extends AnyVal {
    
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
    def setStatusesVarargs(value: RefreshDataSourceObjectExecutionStatus*): Self = this.set("statuses", js.Array(value :_*))
    
    @scala.inline
    def setStatuses(value: js.Array[RefreshDataSourceObjectExecutionStatus]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatuses: Self = this.set("statuses", js.undefined)
  }
}
