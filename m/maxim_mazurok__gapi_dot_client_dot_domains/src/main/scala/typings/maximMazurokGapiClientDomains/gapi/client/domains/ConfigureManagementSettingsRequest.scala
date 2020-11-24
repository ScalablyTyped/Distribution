package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureManagementSettingsRequest extends js.Object {
  
  /** Fields of the `ManagementSettings` to update. */
  var managementSettings: js.UndefOr[ManagementSettings] = js.native
  
  /**
    * Required. The field mask describing which fields to update as a comma-separated list. For example, if only the transfer lock is being updated, the `update_mask` would be
    * `"transfer_lock_state"`.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object ConfigureManagementSettingsRequest {
  
  @scala.inline
  def apply(): ConfigureManagementSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureManagementSettingsRequest]
  }
  
  @scala.inline
  implicit class ConfigureManagementSettingsRequestOps[Self <: ConfigureManagementSettingsRequest] (val x: Self) extends AnyVal {
    
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
    def setManagementSettings(value: ManagementSettings): Self = this.set("managementSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementSettings: Self = this.set("managementSettings", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
