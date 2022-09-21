package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of entities found in an email message or appointment. Read mode only.
  *
  * The `Entities` object is a container for the entity arrays returned by the `getEntities` and `getEntitiesByType` methods when the item
  * (either an email message or an appointment) contains one or more entities that have been found by the server.
  * You can use these entities in your code to provide additional context information to the viewer, such as a map to an address found in the item,
  * or to open a dialer for a phone number found in the item.
  *
  * If no entities of the type specified in the property are present in the item, the property associated with that entity is null.
  * For example, if a message contains a street address and a phone number, the addresses property and phoneNumbers property would contain
  * information, and the other properties would be null.
  *
  * To be recognized as an address, the string must contain a United States postal address that has at least a subset of the elements of a street
  * number, street name, city, state, and zip code.
  *
  * To be recognized as a phone number, the string must contain a North American phone number format.
  *
  * Entity recognition relies on natural language recognition that is based on machine learning of large amounts of data.
  * The recognition of an entity is non-deterministic and success sometimes relies on the particular context in the item.
  *
  * When the property arrays are returned by the `getEntitiesByType` method, only the property for the specified entity contains data;
  * all other properties are null.
  *
  * @remarks
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
trait Entities extends StObject {
  
  /**
    * Gets the physical addresses (street or mailing addresses) found in an email message or appointment.
    */
  var addresses: js.Array[String]
  
  /**
    * Gets the contacts found in an email address or appointment.
    */
  var contacts: js.Array[Contact]
  
  /**
    * Gets the email addresses found in an email message or appointment.
    */
  var emailAddresses: js.Array[String]
  
  /**
    * Gets the meeting suggestions found in an email message.
    */
  var meetingSuggestions: js.Array[MeetingSuggestion]
  
  /**
    * Gets the phone numbers found in an email message or appointment.
    */
  var phoneNumbers: js.Array[PhoneNumber]
  
  /**
    * Gets the task suggestions found in an email message or appointment.
    */
  var taskSuggestions: js.Array[String]
  
  /**
    * Gets the Internet URLs present in an email message or appointment.
    */
  var urls: js.Array[String]
}
object Entities {
  
  inline def apply(
    addresses: js.Array[String],
    contacts: js.Array[Contact],
    emailAddresses: js.Array[String],
    meetingSuggestions: js.Array[MeetingSuggestion],
    phoneNumbers: js.Array[PhoneNumber],
    taskSuggestions: js.Array[String],
    urls: js.Array[String]
  ): Entities = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], contacts = contacts.asInstanceOf[js.Any], emailAddresses = emailAddresses.asInstanceOf[js.Any], meetingSuggestions = meetingSuggestions.asInstanceOf[js.Any], phoneNumbers = phoneNumbers.asInstanceOf[js.Any], taskSuggestions = taskSuggestions.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entities]
  }
  
  extension [Self <: Entities](x: Self) {
    
    inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setContacts(value: js.Array[Contact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsVarargs(value: Contact*): Self = StObject.set(x, "contacts", js.Array(value*))
    
    inline def setEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesVarargs(value: String*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setMeetingSuggestions(value: js.Array[MeetingSuggestion]): Self = StObject.set(x, "meetingSuggestions", value.asInstanceOf[js.Any])
    
    inline def setMeetingSuggestionsVarargs(value: MeetingSuggestion*): Self = StObject.set(x, "meetingSuggestions", js.Array(value*))
    
    inline def setPhoneNumbers(value: js.Array[PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
    
    inline def setTaskSuggestions(value: js.Array[String]): Self = StObject.set(x, "taskSuggestions", value.asInstanceOf[js.Any])
    
    inline def setTaskSuggestionsVarargs(value: String*): Self = StObject.set(x, "taskSuggestions", js.Array(value*))
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
