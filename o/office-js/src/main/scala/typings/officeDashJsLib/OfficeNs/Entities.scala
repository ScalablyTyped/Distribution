package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a collection of entities found in an email message or appointment. Read mode only.
  *
  * The Entities object is a container for the entity arrays returned by the getEntities and getEntitiesByType methods when the item 
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
  * When the property arrays are returned by the getEntitiesByType method, only the property for the specified entity contains data; 
  * all other properties are null.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Read</td></tr>
  * </table>
  */
trait Entities extends js.Object {
  /**
    * Gets the physical addresses (street or mailing addresses) found in an email message or appointment.
    */
  var addresses: js.Array[java.lang.String]
  /**
    * Gets the contacts found in an email address or appointment.
    */
  var contacts: js.Array[Contact]
  /**
    * Gets the email addresses found in an email message or appointment.
    */
  var emailAddresses: js.Array[java.lang.String]
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
  var taskSuggestions: js.Array[java.lang.String]
  /**
    * Gets the Internet URLs present in an email message or appointment.
    */
  var urls: js.Array[java.lang.String]
}

object Entities {
  @scala.inline
  def apply(
    addresses: js.Array[java.lang.String],
    contacts: js.Array[Contact],
    emailAddresses: js.Array[java.lang.String],
    meetingSuggestions: js.Array[MeetingSuggestion],
    phoneNumbers: js.Array[PhoneNumber],
    taskSuggestions: js.Array[java.lang.String],
    urls: js.Array[java.lang.String]
  ): Entities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addresses")(addresses)
    __obj.updateDynamic("contacts")(contacts)
    __obj.updateDynamic("emailAddresses")(emailAddresses)
    __obj.updateDynamic("meetingSuggestions")(meetingSuggestions)
    __obj.updateDynamic("phoneNumbers")(phoneNumbers)
    __obj.updateDynamic("taskSuggestions")(taskSuggestions)
    __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[Entities]
  }
}

