package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
@js.native
trait Entities extends js.Object {
  /**
    * Gets the physical addresses (street or mailing addresses) found in an email message or appointment.
    */
  var addresses: js.Array[String] = js.native
  /**
    * Gets the contacts found in an email address or appointment.
    */
  var contacts: js.Array[Contact] = js.native
  /**
    * Gets the email addresses found in an email message or appointment.
    */
  var emailAddresses: js.Array[String] = js.native
  /**
    * Gets the meeting suggestions found in an email message.
    */
  var meetingSuggestions: js.Array[MeetingSuggestion] = js.native
  /**
    * Gets the phone numbers found in an email message or appointment.
    */
  var phoneNumbers: js.Array[PhoneNumber] = js.native
  /**
    * Gets the task suggestions found in an email message or appointment.
    */
  var taskSuggestions: js.Array[String] = js.native
  /**
    * Gets the Internet URLs present in an email message or appointment.
    */
  var urls: js.Array[String] = js.native
}

object Entities {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class EntitiesOps[Self <: Entities] (val x: Self) extends AnyVal {
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
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setContactsVarargs(value: Contact*): Self = this.set("contacts", js.Array(value :_*))
    @scala.inline
    def setContacts(value: js.Array[Contact]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailAddressesVarargs(value: String*): Self = this.set("emailAddresses", js.Array(value :_*))
    @scala.inline
    def setEmailAddresses(value: js.Array[String]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeetingSuggestionsVarargs(value: MeetingSuggestion*): Self = this.set("meetingSuggestions", js.Array(value :_*))
    @scala.inline
    def setMeetingSuggestions(value: js.Array[MeetingSuggestion]): Self = this.set("meetingSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneNumbersVarargs(value: PhoneNumber*): Self = this.set("phoneNumbers", js.Array(value :_*))
    @scala.inline
    def setPhoneNumbers(value: js.Array[PhoneNumber]): Self = this.set("phoneNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskSuggestionsVarargs(value: String*): Self = this.set("taskSuggestions", js.Array(value :_*))
    @scala.inline
    def setTaskSuggestions(value: js.Array[String]): Self = this.set("taskSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
  }
  
}

