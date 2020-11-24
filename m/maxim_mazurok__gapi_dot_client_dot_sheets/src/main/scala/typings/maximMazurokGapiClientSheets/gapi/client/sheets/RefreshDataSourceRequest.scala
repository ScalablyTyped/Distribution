package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshDataSourceRequest extends js.Object {
  
  /** Reference to a DataSource. If specified, refreshes all associated data source objects for the data source. */
  var dataSourceId: js.UndefOr[String] = js.native
  
  /** Refreshes the data source objects regardless of the current state. If not set and a referenced data source object was in error state, the refresh will fail immediately. */
  var force: js.UndefOr[Boolean] = js.native
  
  /** Refreshes all existing data source objects in the spreadsheet. */
  var isAll: js.UndefOr[Boolean] = js.native
  
  /** References to data source objects to refresh. */
  var references: js.UndefOr[DataSourceObjectReferences] = js.native
}
object RefreshDataSourceRequest {
  
  @scala.inline
  def apply(): RefreshDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshDataSourceRequest]
  }
  
  @scala.inline
  implicit class RefreshDataSourceRequestOps[Self <: RefreshDataSourceRequest] (val x: Self) extends AnyVal {
    
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
    def setDataSourceId(value: String): Self = this.set("dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceId: Self = this.set("dataSourceId", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setIsAll(value: Boolean): Self = this.set("isAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAll: Self = this.set("isAll", js.undefined)
    
    @scala.inline
    def setReferences(value: DataSourceObjectReferences): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
  }
}
