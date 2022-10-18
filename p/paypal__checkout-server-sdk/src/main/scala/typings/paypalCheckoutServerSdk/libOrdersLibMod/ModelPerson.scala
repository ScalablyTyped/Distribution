package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libPaymentsLibMod.ActivityTimestamps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPerson
  extends StObject
     with ActivityTimestamps {
  
  var addresses: js.Array[ModelAddressWithConfirmation]
  
  var birth_date: String
  
  var citizenship: String
  
  var emails: js.Array[String]
  
  var external_id: String
  
  var id: String
  
  var identifications: IdentityDocument
  
  var names: js.Array[String]
  
  var phones: js.Array[ModelPhoneInfo]
  
  var primary: Boolean
  
  var primary_email: String
}
object ModelPerson {
  
  inline def apply(
    addresses: js.Array[ModelAddressWithConfirmation],
    birth_date: String,
    citizenship: String,
    create_time: String,
    emails: js.Array[String],
    external_id: String,
    id: String,
    identifications: IdentityDocument,
    names: js.Array[String],
    phones: js.Array[ModelPhoneInfo],
    primary: Boolean,
    primary_email: String,
    update_time: String
  ): ModelPerson = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], birth_date = birth_date.asInstanceOf[js.Any], citizenship = citizenship.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identifications = identifications.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], primary_email = primary_email.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPerson]
  }
  
  extension [Self <: ModelPerson](x: Self) {
    
    inline def setAddresses(value: js.Array[ModelAddressWithConfirmation]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: ModelAddressWithConfirmation*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setBirth_date(value: String): Self = StObject.set(x, "birth_date", value.asInstanceOf[js.Any])
    
    inline def setCitizenship(value: String): Self = StObject.set(x, "citizenship", value.asInstanceOf[js.Any])
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdentifications(value: IdentityDocument): Self = StObject.set(x, "identifications", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setPhones(value: js.Array[ModelPhoneInfo]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    inline def setPhonesVarargs(value: ModelPhoneInfo*): Self = StObject.set(x, "phones", js.Array(value*))
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimary_email(value: String): Self = StObject.set(x, "primary_email", value.asInstanceOf[js.Any])
  }
}
