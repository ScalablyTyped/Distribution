package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends OutlookItem {
  /** The name of the contact's assistant. */
  var assistantName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var birthday: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's business address. */
  var businessAddress: js.UndefOr[PhysicalAddress] = js.undefined
  /** The business home page of the contact. */
  var businessHomePage: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's business phone numbers. */
  var businessPhones: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The names of the contact's children. */
  var children: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The name of the contact's company. */
  var companyName: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's department. */
  var department: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The contact's display name. You can specify the display name in a create or update operation.
    * Note that later updates to other properties may cause an automatically generated value to overwrite the displayName value you have specified.
    * To preserve a pre-existing value, always include it as displayName in an update operation.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's email addresses. */
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.undefined
  /** The collection of open extensions defined for the contact. Read-only. Nullable. */
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  /** The name the contact is filed under. */
  var fileAs: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's generation. */
  var generation: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's given name. */
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's home address. */
  var homeAddress: js.UndefOr[PhysicalAddress] = js.undefined
  /** The contact's home phone numbers. */
  var homePhones: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The contact's instant messaging (IM) addresses. */
  var imAddresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The contact's initials. */
  var initials: js.UndefOr[java.lang.String] = js.undefined
  /** The contact’s job title. */
  var jobTitle: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the contact's manager. */
  var manager: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's middle name. */
  var middleName: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's mobile phone number. */
  var mobilePhone: js.UndefOr[java.lang.String] = js.undefined
  /** The collection of multi-value extended properties defined for the contact. Read-only. Nullable. */
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  /** The contact's nickname. */
  var nickName: js.UndefOr[java.lang.String] = js.undefined
  /** The location of the contact's office. */
  var officeLocation: js.UndefOr[java.lang.String] = js.undefined
  /** Other addresses for the contact. */
  var otherAddress: js.UndefOr[PhysicalAddress] = js.undefined
  /** The ID of the contact's parent folder. */
  var parentFolderId: js.UndefOr[java.lang.String] = js.undefined
  /** The user's notes about the contact. */
  var personalNotes: js.UndefOr[java.lang.String] = js.undefined
  /** Optional contact picture. You can get or set a photo for a contact. */
  var photo: js.UndefOr[ProfilePhoto] = js.undefined
  /** The contact's profession. */
  var profession: js.UndefOr[java.lang.String] = js.undefined
  /** The collection of single-value extended properties defined for the contact. Read-only. Nullable. */
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
  /** The name of the contact's spouse/partner. */
  var spouseName: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's surname. */
  var surname: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's title. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The phonetic Japanese company name of the contact. */
  var yomiCompanyName: js.UndefOr[java.lang.String] = js.undefined
  /** The phonetic Japanese given name (first name) of the contact. */
  var yomiGivenName: js.UndefOr[java.lang.String] = js.undefined
  /** The phonetic Japanese surname (last name)  of the contact. */
  var yomiSurname: js.UndefOr[java.lang.String] = js.undefined
}

object Contact {
  @scala.inline
  def apply(
    assistantName: java.lang.String = null,
    birthday: java.lang.String = null,
    businessAddress: PhysicalAddress = null,
    businessHomePage: java.lang.String = null,
    businessPhones: js.Array[java.lang.String] = null,
    categories: js.Array[java.lang.String] = null,
    changeKey: java.lang.String = null,
    children: js.Array[java.lang.String] = null,
    companyName: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    department: java.lang.String = null,
    displayName: java.lang.String = null,
    emailAddresses: js.Array[EmailAddress] = null,
    extensions: js.Array[Extension] = null,
    fileAs: java.lang.String = null,
    generation: java.lang.String = null,
    givenName: java.lang.String = null,
    homeAddress: PhysicalAddress = null,
    homePhones: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    imAddresses: js.Array[java.lang.String] = null,
    initials: java.lang.String = null,
    jobTitle: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    manager: java.lang.String = null,
    middleName: java.lang.String = null,
    mobilePhone: java.lang.String = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    nickName: java.lang.String = null,
    officeLocation: java.lang.String = null,
    otherAddress: PhysicalAddress = null,
    parentFolderId: java.lang.String = null,
    personalNotes: java.lang.String = null,
    photo: ProfilePhoto = null,
    profession: java.lang.String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null,
    spouseName: java.lang.String = null,
    surname: java.lang.String = null,
    title: java.lang.String = null,
    yomiCompanyName: java.lang.String = null,
    yomiGivenName: java.lang.String = null,
    yomiSurname: java.lang.String = null
  ): Contact = {
    val __obj = js.Dynamic.literal()
    if (assistantName != null) __obj.updateDynamic("assistantName")(assistantName)
    if (birthday != null) __obj.updateDynamic("birthday")(birthday)
    if (businessAddress != null) __obj.updateDynamic("businessAddress")(businessAddress)
    if (businessHomePage != null) __obj.updateDynamic("businessHomePage")(businessHomePage)
    if (businessPhones != null) __obj.updateDynamic("businessPhones")(businessPhones)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey)
    if (children != null) __obj.updateDynamic("children")(children)
    if (companyName != null) __obj.updateDynamic("companyName")(companyName)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (department != null) __obj.updateDynamic("department")(department)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (emailAddresses != null) __obj.updateDynamic("emailAddresses")(emailAddresses)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (fileAs != null) __obj.updateDynamic("fileAs")(fileAs)
    if (generation != null) __obj.updateDynamic("generation")(generation)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (homeAddress != null) __obj.updateDynamic("homeAddress")(homeAddress)
    if (homePhones != null) __obj.updateDynamic("homePhones")(homePhones)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imAddresses != null) __obj.updateDynamic("imAddresses")(imAddresses)
    if (initials != null) __obj.updateDynamic("initials")(initials)
    if (jobTitle != null) __obj.updateDynamic("jobTitle")(jobTitle)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (manager != null) __obj.updateDynamic("manager")(manager)
    if (middleName != null) __obj.updateDynamic("middleName")(middleName)
    if (mobilePhone != null) __obj.updateDynamic("mobilePhone")(mobilePhone)
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties)
    if (nickName != null) __obj.updateDynamic("nickName")(nickName)
    if (officeLocation != null) __obj.updateDynamic("officeLocation")(officeLocation)
    if (otherAddress != null) __obj.updateDynamic("otherAddress")(otherAddress)
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId)
    if (personalNotes != null) __obj.updateDynamic("personalNotes")(personalNotes)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (profession != null) __obj.updateDynamic("profession")(profession)
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties)
    if (spouseName != null) __obj.updateDynamic("spouseName")(spouseName)
    if (surname != null) __obj.updateDynamic("surname")(surname)
    if (title != null) __obj.updateDynamic("title")(title)
    if (yomiCompanyName != null) __obj.updateDynamic("yomiCompanyName")(yomiCompanyName)
    if (yomiGivenName != null) __obj.updateDynamic("yomiGivenName")(yomiGivenName)
    if (yomiSurname != null) __obj.updateDynamic("yomiSurname")(yomiSurname)
    __obj.asInstanceOf[Contact]
  }
}

