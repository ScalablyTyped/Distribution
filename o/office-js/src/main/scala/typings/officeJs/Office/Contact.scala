package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the details about a contact (similar to what's on a physical contact or business card) extracted from the item's body. Read mode only.
  *
  * The list of contacts extracted from the body of an email message or appointment is returned in the `contacts` property of the
  * {@link Office.Entities | Entities} object returned by the `getEntities` or `getEntitiesByType` method of the current item.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `Restricted`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
trait Contact extends StObject {
  
  /**
    * An array of strings containing the mailing and street addresses associated with the contact. Nullable.
    */
  var addresses: js.Array[String]
  
  /**
    * A string containing the name of the business associated with the contact. Nullable.
    */
  var businessName: String
  
  /**
    * An array of strings containing the SMTP email addresses associated with the contact. Nullable.
    */
  var emailAddresses: js.Array[String]
  
  /**
    * A string containing the name of the person associated with the contact. Nullable.
    */
  var personName: String
  
  /**
    * An array containing a `PhoneNumber` object for each phone number associated with the contact. Nullable.
    */
  var phoneNumbers: js.Array[PhoneNumber]
  
  /**
    * An array of strings containing the Internet URLs associated with the contact. Nullable.
    */
  var urls: js.Array[String]
}
object Contact {
  
  @scala.inline
  def apply(
    addresses: js.Array[String],
    businessName: String,
    emailAddresses: js.Array[String],
    personName: String,
    phoneNumbers: js.Array[PhoneNumber],
    urls: js.Array[String]
  ): Contact = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], businessName = businessName.asInstanceOf[js.Any], emailAddresses = emailAddresses.asInstanceOf[js.Any], personName = personName.asInstanceOf[js.Any], phoneNumbers = phoneNumbers.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
  
  @scala.inline
  implicit class ContactMutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressesVarargs(value: String*): Self = StObject.set(x, "emailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setPersonName(value: String): Self = StObject.set(x, "personName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbers(value: js.Array[PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
