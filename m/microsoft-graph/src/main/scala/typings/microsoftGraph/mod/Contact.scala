package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contact extends OutlookItem {
  // The name of the contact's assistant.
  var assistantName: js.UndefOr[String] = js.native
  /**
    * The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var birthday: js.UndefOr[String] = js.native
  // The contact's business address.
  var businessAddress: js.UndefOr[PhysicalAddress] = js.native
  // The business home page of the contact.
  var businessHomePage: js.UndefOr[String] = js.native
  // The contact's business phone numbers.
  var businessPhones: js.UndefOr[js.Array[String]] = js.native
  // The names of the contact's children.
  var children: js.UndefOr[js.Array[String]] = js.native
  // The name of the contact's company.
  var companyName: js.UndefOr[String] = js.native
  // The contact's department.
  var department: js.UndefOr[String] = js.native
  /**
    * The contact's display name. You can specify the display name in a create or update operation. Note that later updates
    * to other properties may cause an automatically generated value to overwrite the displayName value you have specified.
    * To preserve a pre-existing value, always include it as displayName in an update operation.
    */
  var displayName: js.UndefOr[String] = js.native
  // The contact's email addresses.
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.native
  // The collection of open extensions defined for the contact. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  // The name the contact is filed under.
  var fileAs: js.UndefOr[String] = js.native
  // The contact's generation.
  var generation: js.UndefOr[String] = js.native
  // The contact's given name.
  var givenName: js.UndefOr[String] = js.native
  // The contact's home address.
  var homeAddress: js.UndefOr[PhysicalAddress] = js.native
  // The contact's home phone numbers.
  var homePhones: js.UndefOr[js.Array[String]] = js.native
  // The contact's instant messaging (IM) addresses.
  var imAddresses: js.UndefOr[js.Array[String]] = js.native
  // The contact's initials.
  var initials: js.UndefOr[String] = js.native
  // The contact’s job title.
  var jobTitle: js.UndefOr[String] = js.native
  // The name of the contact's manager.
  var manager: js.UndefOr[String] = js.native
  // The contact's middle name.
  var middleName: js.UndefOr[String] = js.native
  // The contact's mobile phone number.
  var mobilePhone: js.UndefOr[String] = js.native
  // The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  // The contact's nickname.
  var nickName: js.UndefOr[String] = js.native
  // The location of the contact's office.
  var officeLocation: js.UndefOr[String] = js.native
  // Other addresses for the contact.
  var otherAddress: js.UndefOr[PhysicalAddress] = js.native
  // The ID of the contact's parent folder.
  var parentFolderId: js.UndefOr[String] = js.native
  // The user's notes about the contact.
  var personalNotes: js.UndefOr[String] = js.native
  // Optional contact picture. You can get or set a photo for a contact.
  var photo: js.UndefOr[ProfilePhoto] = js.native
  // The contact's profession.
  var profession: js.UndefOr[String] = js.native
  // The collection of single-value extended properties defined for the contact. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
  // The name of the contact's spouse/partner.
  var spouseName: js.UndefOr[String] = js.native
  // The contact's surname.
  var surname: js.UndefOr[String] = js.native
  // The contact's title.
  var title: js.UndefOr[String] = js.native
  // The phonetic Japanese company name of the contact.
  var yomiCompanyName: js.UndefOr[String] = js.native
  // The phonetic Japanese given name (first name) of the contact.
  var yomiGivenName: js.UndefOr[String] = js.native
  // The phonetic Japanese surname (last name) of the contact.
  var yomiSurname: js.UndefOr[String] = js.native
}

object Contact {
  @scala.inline
  def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
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
    def setAssistantName(value: String): Self = this.set("assistantName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssistantName: Self = this.set("assistantName", js.undefined)
    @scala.inline
    def setBirthday(value: String): Self = this.set("birthday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBirthday: Self = this.set("birthday", js.undefined)
    @scala.inline
    def setBusinessAddress(value: PhysicalAddress): Self = this.set("businessAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessAddress: Self = this.set("businessAddress", js.undefined)
    @scala.inline
    def setBusinessHomePage(value: String): Self = this.set("businessHomePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessHomePage: Self = this.set("businessHomePage", js.undefined)
    @scala.inline
    def setBusinessPhonesVarargs(value: String*): Self = this.set("businessPhones", js.Array(value :_*))
    @scala.inline
    def setBusinessPhones(value: js.Array[String]): Self = this.set("businessPhones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessPhones: Self = this.set("businessPhones", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: String*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[String]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    @scala.inline
    def setDepartment(value: String): Self = this.set("department", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmailAddressesVarargs(value: EmailAddress*): Self = this.set("emailAddresses", js.Array(value :_*))
    @scala.inline
    def setEmailAddresses(value: js.Array[EmailAddress]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddresses: Self = this.set("emailAddresses", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFileAs(value: String): Self = this.set("fileAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileAs: Self = this.set("fileAs", js.undefined)
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    @scala.inline
    def setHomeAddress(value: PhysicalAddress): Self = this.set("homeAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeAddress: Self = this.set("homeAddress", js.undefined)
    @scala.inline
    def setHomePhonesVarargs(value: String*): Self = this.set("homePhones", js.Array(value :_*))
    @scala.inline
    def setHomePhones(value: js.Array[String]): Self = this.set("homePhones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomePhones: Self = this.set("homePhones", js.undefined)
    @scala.inline
    def setImAddressesVarargs(value: String*): Self = this.set("imAddresses", js.Array(value :_*))
    @scala.inline
    def setImAddresses(value: js.Array[String]): Self = this.set("imAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImAddresses: Self = this.set("imAddresses", js.undefined)
    @scala.inline
    def setInitials(value: String): Self = this.set("initials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitials: Self = this.set("initials", js.undefined)
    @scala.inline
    def setJobTitle(value: String): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
    @scala.inline
    def setManager(value: String): Self = this.set("manager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    @scala.inline
    def setMobilePhone(value: String): Self = this.set("mobilePhone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobilePhone: Self = this.set("mobilePhone", js.undefined)
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = this.set("multiValueExtendedProperties", js.Array(value :_*))
    @scala.inline
    def setMultiValueExtendedProperties(value: js.Array[MultiValueLegacyExtendedProperty]): Self = this.set("multiValueExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueExtendedProperties: Self = this.set("multiValueExtendedProperties", js.undefined)
    @scala.inline
    def setNickName(value: String): Self = this.set("nickName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickName: Self = this.set("nickName", js.undefined)
    @scala.inline
    def setOfficeLocation(value: String): Self = this.set("officeLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfficeLocation: Self = this.set("officeLocation", js.undefined)
    @scala.inline
    def setOtherAddress(value: PhysicalAddress): Self = this.set("otherAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherAddress: Self = this.set("otherAddress", js.undefined)
    @scala.inline
    def setParentFolderId(value: String): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    @scala.inline
    def setPersonalNotes(value: String): Self = this.set("personalNotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersonalNotes: Self = this.set("personalNotes", js.undefined)
    @scala.inline
    def setPhoto(value: ProfilePhoto): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    @scala.inline
    def setProfession(value: String): Self = this.set("profession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfession: Self = this.set("profession", js.undefined)
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = this.set("singleValueExtendedProperties", js.Array(value :_*))
    @scala.inline
    def setSingleValueExtendedProperties(value: js.Array[SingleValueLegacyExtendedProperty]): Self = this.set("singleValueExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleValueExtendedProperties: Self = this.set("singleValueExtendedProperties", js.undefined)
    @scala.inline
    def setSpouseName(value: String): Self = this.set("spouseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpouseName: Self = this.set("spouseName", js.undefined)
    @scala.inline
    def setSurname(value: String): Self = this.set("surname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setYomiCompanyName(value: String): Self = this.set("yomiCompanyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYomiCompanyName: Self = this.set("yomiCompanyName", js.undefined)
    @scala.inline
    def setYomiGivenName(value: String): Self = this.set("yomiGivenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYomiGivenName: Self = this.set("yomiGivenName", js.undefined)
    @scala.inline
    def setYomiSurname(value: String): Self = this.set("yomiSurname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYomiSurname: Self = this.set("yomiSurname", js.undefined)
  }
  
}

