package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureContactSettingsRequest extends js.Object {
  
  /** The list of contact notices that the caller acknowledges. The notices required here depend on the values specified in `contact_settings`. */
  var contactNotices: js.UndefOr[js.Array[String]] = js.native
  
  /** Fields of the `ContactSettings` to update. */
  var contactSettings: js.UndefOr[ContactSettings] = js.native
  
  /**
    * Required. The field mask describing which fields to update as a comma-separated list. For example, if only the registrant contact is being updated, the `update_mask` would be
    * `"registrant_contact"`.
    */
  var updateMask: js.UndefOr[String] = js.native
  
  /** Validate the request without actually updating the contact settings. */
  var validateOnly: js.UndefOr[Boolean] = js.native
}
object ConfigureContactSettingsRequest {
  
  @scala.inline
  def apply(): ConfigureContactSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureContactSettingsRequest]
  }
  
  @scala.inline
  implicit class ConfigureContactSettingsRequestOps[Self <: ConfigureContactSettingsRequest] (val x: Self) extends AnyVal {
    
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
    def setContactNoticesVarargs(value: String*): Self = this.set("contactNotices", js.Array(value :_*))
    
    @scala.inline
    def setContactNotices(value: js.Array[String]): Self = this.set("contactNotices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactNotices: Self = this.set("contactNotices", js.undefined)
    
    @scala.inline
    def setContactSettings(value: ContactSettings): Self = this.set("contactSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactSettings: Self = this.set("contactSettings", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = this.set("validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnly: Self = this.set("validateOnly", js.undefined)
  }
}
