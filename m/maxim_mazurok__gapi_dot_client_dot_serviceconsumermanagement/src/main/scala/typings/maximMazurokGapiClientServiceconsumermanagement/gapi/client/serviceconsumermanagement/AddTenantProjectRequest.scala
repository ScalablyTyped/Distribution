package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTenantProjectRequest extends js.Object {
  
  /** Configuration of the new tenant project to be added to tenancy unit resources. */
  var projectConfig: js.UndefOr[TenantProjectConfig] = js.native
  
  /** Required. Tag of the added project. Must be less than 128 characters. Required. */
  var tag: js.UndefOr[String] = js.native
}
object AddTenantProjectRequest {
  
  @scala.inline
  def apply(): AddTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTenantProjectRequest]
  }
  
  @scala.inline
  implicit class AddTenantProjectRequestOps[Self <: AddTenantProjectRequest] (val x: Self) extends AnyVal {
    
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
    def setProjectConfig(value: TenantProjectConfig): Self = this.set("projectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectConfig: Self = this.set("projectConfig", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
