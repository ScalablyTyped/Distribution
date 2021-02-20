package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contact extends StObject {
  
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
  implicit class ContactMutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFaxNumber(value: String): Self = StObject.set(x, "faxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNumberUndefined: Self = StObject.set(x, "faxNumber", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPostalAddress(value: PostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
  }
}
