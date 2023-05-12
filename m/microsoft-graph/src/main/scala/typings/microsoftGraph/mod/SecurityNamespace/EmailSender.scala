package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailSender extends StObject {
  
  // The name of the sender.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Sender domain.
  var domainName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Sender email address.
  var emailAddress: js.UndefOr[NullableOption[String]] = js.undefined
}
object EmailSender {
  
  inline def apply(): EmailSender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailSender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailSender] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDomainName(value: NullableOption[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
  }
}
