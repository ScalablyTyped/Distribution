package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactSettings extends js.Object {
  
  /** Required. The administrative contact for the `Registration`. */
  var adminContact: js.UndefOr[Contact] = js.native
  
  /** Required. Privacy setting for the contacts associated with the `Registration`. */
  var privacy: js.UndefOr[String] = js.native
  
  /**
    * Required. The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.*
    * *Warning: For new `Registration`s, the registrant will receive an email confirmation that they must complete within 15 days to avoid domain suspension.*
    */
  var registrantContact: js.UndefOr[Contact] = js.native
  
  /** Required. The technical contact for the `Registration`. */
  var technicalContact: js.UndefOr[Contact] = js.native
}
object ContactSettings {
  
  @scala.inline
  def apply(): ContactSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactSettings]
  }
  
  @scala.inline
  implicit class ContactSettingsOps[Self <: ContactSettings] (val x: Self) extends AnyVal {
    
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
    def setAdminContact(value: Contact): Self = this.set("adminContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminContact: Self = this.set("adminContact", js.undefined)
    
    @scala.inline
    def setPrivacy(value: String): Self = this.set("privacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacy: Self = this.set("privacy", js.undefined)
    
    @scala.inline
    def setRegistrantContact(value: Contact): Self = this.set("registrantContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrantContact: Self = this.set("registrantContact", js.undefined)
    
    @scala.inline
    def setTechnicalContact(value: Contact): Self = this.set("technicalContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTechnicalContact: Self = this.set("technicalContact", js.undefined)
  }
}
