package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contact extends js.Object {
  
  /** Required. Email address of the contact. */
  var email: js.UndefOr[String] = js.native
  
  /** Fax number of the contact in international format. For example, `"+1-800-555-0123"`. */
  var faxNumber: js.UndefOr[String] = js.native
  
  /** Required. Phone number of the contact in international format. For example, `"+1-800-555-0123"`. */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /** Required. Postal address of the contact. */
  var postalAddress: js.UndefOr[PostalAddress] = js.native
}
object Contact {
  
  @scala.inline
  def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFaxNumber(value: String): Self = this.set("faxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaxNumber: Self = this.set("faxNumber", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setPostalAddress(value: PostalAddress): Self = this.set("postalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalAddress: Self = this.set("postalAddress", js.undefined)
  }
}
