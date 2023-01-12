package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libPaymentsLibMod.ActivityTimestamps
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.INDIVIDUAL
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.PARTNERSHIP
import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.PROPRIETORSHIP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelBusiness
  extends StObject
     with ActivityTimestamps {
  
  var addresses: js.Array[ModelAddressWithConfirmation]
  
  var category: ModelBusinessCategory
  
  var customer_service_contactsobject: ModelCustomerServiceContact
  
  var description: String
  
  var emails: js.Array[String]
  
  var external_id: String
  
  var id: String
  
  var identifications: ModelBusinessIdentification
  
  var names: js.Array[BusinessName]
  
  var owners: js.Array[ModelPerson]
  
  var phones: js.Array[ModelPhoneInfo]
  
  var primary: Boolean
  
  var primary_email: String
  
  var `type`: INDIVIDUAL | PROPRIETORSHIP | PARTNERSHIP
  
  var url: String
}
object ModelBusiness {
  
  inline def apply(
    addresses: js.Array[ModelAddressWithConfirmation],
    category: ModelBusinessCategory,
    create_time: String,
    customer_service_contactsobject: ModelCustomerServiceContact,
    description: String,
    emails: js.Array[String],
    external_id: String,
    id: String,
    identifications: ModelBusinessIdentification,
    names: js.Array[BusinessName],
    owners: js.Array[ModelPerson],
    phones: js.Array[ModelPhoneInfo],
    primary: Boolean,
    primary_email: String,
    `type`: INDIVIDUAL | PROPRIETORSHIP | PARTNERSHIP,
    update_time: String,
    url: String
  ): ModelBusiness = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], customer_service_contactsobject = customer_service_contactsobject.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identifications = identifications.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], primary_email = primary_email.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelBusiness]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelBusiness] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: js.Array[ModelAddressWithConfirmation]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: ModelAddressWithConfirmation*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setCategory(value: ModelBusinessCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCustomer_service_contactsobject(value: ModelCustomerServiceContact): Self = StObject.set(x, "customer_service_contactsobject", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdentifications(value: ModelBusinessIdentification): Self = StObject.set(x, "identifications", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[BusinessName]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: BusinessName*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setOwners(value: js.Array[ModelPerson]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersVarargs(value: ModelPerson*): Self = StObject.set(x, "owners", js.Array(value*))
    
    inline def setPhones(value: js.Array[ModelPhoneInfo]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    inline def setPhonesVarargs(value: ModelPhoneInfo*): Self = StObject.set(x, "phones", js.Array(value*))
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimary_email(value: String): Self = StObject.set(x, "primary_email", value.asInstanceOf[js.Any])
    
    inline def setType(value: INDIVIDUAL | PROPRIETORSHIP | PARTNERSHIP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
