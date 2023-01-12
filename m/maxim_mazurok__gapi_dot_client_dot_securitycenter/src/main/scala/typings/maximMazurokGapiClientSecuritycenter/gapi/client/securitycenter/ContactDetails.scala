package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactDetails extends StObject {
  
  /** A list of contacts */
  var contacts: js.UndefOr[js.Array[Contact]] = js.undefined
}
object ContactDetails {
  
  inline def apply(): ContactDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactDetails] (val x: Self) extends AnyVal {
    
    inline def setContacts(value: js.Array[Contact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContactsVarargs(value: Contact*): Self = StObject.set(x, "contacts", js.Array(value*))
  }
}
