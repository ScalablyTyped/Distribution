package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactSettings extends StObject {
  
  /** Required. The administrative contact for the `Registration`. */
  var adminContact: js.UndefOr[Contact] = js.undefined
  
  /** Required. Privacy setting for the contacts associated with the `Registration`. */
  var privacy: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.*
    * *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
    */
  var registrantContact: js.UndefOr[Contact] = js.undefined
  
  /** Required. The technical contact for the `Registration`. */
  var technicalContact: js.UndefOr[Contact] = js.undefined
}
object ContactSettings {
  
  inline def apply(): ContactSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactSettings]
  }
  
  extension [Self <: ContactSettings](x: Self) {
    
    inline def setAdminContact(value: Contact): Self = StObject.set(x, "adminContact", value.asInstanceOf[js.Any])
    
    inline def setAdminContactUndefined: Self = StObject.set(x, "adminContact", js.undefined)
    
    inline def setPrivacy(value: String): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    inline def setRegistrantContact(value: Contact): Self = StObject.set(x, "registrantContact", value.asInstanceOf[js.Any])
    
    inline def setRegistrantContactUndefined: Self = StObject.set(x, "registrantContact", js.undefined)
    
    inline def setTechnicalContact(value: Contact): Self = StObject.set(x, "technicalContact", value.asInstanceOf[js.Any])
    
    inline def setTechnicalContactUndefined: Self = StObject.set(x, "technicalContact", js.undefined)
  }
}
