package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends OutlookItem {
  // The name of the contact's assistant.
  var assistantName: js.UndefOr[String] = js.undefined
  /**
    * The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var birthday: js.UndefOr[String] = js.undefined
  // The contact's business address.
  var businessAddress: js.UndefOr[PhysicalAddress] = js.undefined
  // The business home page of the contact.
  var businessHomePage: js.UndefOr[String] = js.undefined
  // The contact's business phone numbers.
  var businessPhones: js.UndefOr[js.Array[String]] = js.undefined
  // The names of the contact's children.
  var children: js.UndefOr[js.Array[String]] = js.undefined
  // The name of the contact's company.
  var companyName: js.UndefOr[String] = js.undefined
  // The contact's department.
  var department: js.UndefOr[String] = js.undefined
  /**
    * The contact's display name. You can specify the display name in a create or update operation. Note that later updates
    * to other properties may cause an automatically generated value to overwrite the displayName value you have specified.
    * To preserve a pre-existing value, always include it as displayName in an update operation.
    */
  var displayName: js.UndefOr[String] = js.undefined
  // The contact's email addresses.
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.undefined
  // The collection of open extensions defined for the contact. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  // The name the contact is filed under.
  var fileAs: js.UndefOr[String] = js.undefined
  // The contact's generation.
  var generation: js.UndefOr[String] = js.undefined
  // The contact's given name.
  var givenName: js.UndefOr[String] = js.undefined
  // The contact's home address.
  var homeAddress: js.UndefOr[PhysicalAddress] = js.undefined
  // The contact's home phone numbers.
  var homePhones: js.UndefOr[js.Array[String]] = js.undefined
  // The contact's instant messaging (IM) addresses.
  var imAddresses: js.UndefOr[js.Array[String]] = js.undefined
  // The contact's initials.
  var initials: js.UndefOr[String] = js.undefined
  // The contact’s job title.
  var jobTitle: js.UndefOr[String] = js.undefined
  // The name of the contact's manager.
  var manager: js.UndefOr[String] = js.undefined
  // The contact's middle name.
  var middleName: js.UndefOr[String] = js.undefined
  // The contact's mobile phone number.
  var mobilePhone: js.UndefOr[String] = js.undefined
  // The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  // The contact's nickname.
  var nickName: js.UndefOr[String] = js.undefined
  // The location of the contact's office.
  var officeLocation: js.UndefOr[String] = js.undefined
  // Other addresses for the contact.
  var otherAddress: js.UndefOr[PhysicalAddress] = js.undefined
  // The ID of the contact's parent folder.
  var parentFolderId: js.UndefOr[String] = js.undefined
  // The user's notes about the contact.
  var personalNotes: js.UndefOr[String] = js.undefined
  // Optional contact picture. You can get or set a photo for a contact.
  var photo: js.UndefOr[ProfilePhoto] = js.undefined
  // The contact's profession.
  var profession: js.UndefOr[String] = js.undefined
  // The collection of single-value extended properties defined for the contact. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
  // The name of the contact's spouse/partner.
  var spouseName: js.UndefOr[String] = js.undefined
  // The contact's surname.
  var surname: js.UndefOr[String] = js.undefined
  // The contact's title.
  var title: js.UndefOr[String] = js.undefined
  // The phonetic Japanese company name of the contact.
  var yomiCompanyName: js.UndefOr[String] = js.undefined
  // The phonetic Japanese given name (first name) of the contact.
  var yomiGivenName: js.UndefOr[String] = js.undefined
  // The phonetic Japanese surname (last name) of the contact.
  var yomiSurname: js.UndefOr[String] = js.undefined
}

object Contact {
  @scala.inline
  def apply(
    assistantName: String = null,
    birthday: String = null,
    businessAddress: PhysicalAddress = null,
    businessHomePage: String = null,
    businessPhones: js.Array[String] = null,
    categories: js.Array[String] = null,
    changeKey: String = null,
    children: js.Array[String] = null,
    companyName: String = null,
    createdDateTime: String = null,
    department: String = null,
    displayName: String = null,
    emailAddresses: js.Array[EmailAddress] = null,
    extensions: js.Array[Extension] = null,
    fileAs: String = null,
    generation: String = null,
    givenName: String = null,
    homeAddress: PhysicalAddress = null,
    homePhones: js.Array[String] = null,
    id: String = null,
    imAddresses: js.Array[String] = null,
    initials: String = null,
    jobTitle: String = null,
    lastModifiedDateTime: String = null,
    manager: String = null,
    middleName: String = null,
    mobilePhone: String = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    nickName: String = null,
    officeLocation: String = null,
    otherAddress: PhysicalAddress = null,
    parentFolderId: String = null,
    personalNotes: String = null,
    photo: ProfilePhoto = null,
    profession: String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null,
    spouseName: String = null,
    surname: String = null,
    title: String = null,
    yomiCompanyName: String = null,
    yomiGivenName: String = null,
    yomiSurname: String = null
  ): Contact = {
    val __obj = js.Dynamic.literal()
    if (assistantName != null) __obj.updateDynamic("assistantName")(assistantName.asInstanceOf[js.Any])
    if (birthday != null) __obj.updateDynamic("birthday")(birthday.asInstanceOf[js.Any])
    if (businessAddress != null) __obj.updateDynamic("businessAddress")(businessAddress.asInstanceOf[js.Any])
    if (businessHomePage != null) __obj.updateDynamic("businessHomePage")(businessHomePage.asInstanceOf[js.Any])
    if (businessPhones != null) __obj.updateDynamic("businessPhones")(businessPhones.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (companyName != null) __obj.updateDynamic("companyName")(companyName.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (emailAddresses != null) __obj.updateDynamic("emailAddresses")(emailAddresses.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fileAs != null) __obj.updateDynamic("fileAs")(fileAs.asInstanceOf[js.Any])
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (homeAddress != null) __obj.updateDynamic("homeAddress")(homeAddress.asInstanceOf[js.Any])
    if (homePhones != null) __obj.updateDynamic("homePhones")(homePhones.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imAddresses != null) __obj.updateDynamic("imAddresses")(imAddresses.asInstanceOf[js.Any])
    if (initials != null) __obj.updateDynamic("initials")(initials.asInstanceOf[js.Any])
    if (jobTitle != null) __obj.updateDynamic("jobTitle")(jobTitle.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (manager != null) __obj.updateDynamic("manager")(manager.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    if (mobilePhone != null) __obj.updateDynamic("mobilePhone")(mobilePhone.asInstanceOf[js.Any])
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties.asInstanceOf[js.Any])
    if (nickName != null) __obj.updateDynamic("nickName")(nickName.asInstanceOf[js.Any])
    if (officeLocation != null) __obj.updateDynamic("officeLocation")(officeLocation.asInstanceOf[js.Any])
    if (otherAddress != null) __obj.updateDynamic("otherAddress")(otherAddress.asInstanceOf[js.Any])
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId.asInstanceOf[js.Any])
    if (personalNotes != null) __obj.updateDynamic("personalNotes")(personalNotes.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (profession != null) __obj.updateDynamic("profession")(profession.asInstanceOf[js.Any])
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties.asInstanceOf[js.Any])
    if (spouseName != null) __obj.updateDynamic("spouseName")(spouseName.asInstanceOf[js.Any])
    if (surname != null) __obj.updateDynamic("surname")(surname.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (yomiCompanyName != null) __obj.updateDynamic("yomiCompanyName")(yomiCompanyName.asInstanceOf[js.Any])
    if (yomiGivenName != null) __obj.updateDynamic("yomiGivenName")(yomiGivenName.asInstanceOf[js.Any])
    if (yomiSurname != null) __obj.updateDynamic("yomiSurname")(yomiSurname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}

