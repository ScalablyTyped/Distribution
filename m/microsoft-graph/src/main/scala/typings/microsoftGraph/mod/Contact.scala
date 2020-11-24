package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contact extends OutlookItem {
  
  // The name of the contact's assistant.
  var assistantName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var birthday: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's business address.
  var businessAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.native
  
  // The business home page of the contact.
  var businessHomePage: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's business phone numbers.
  var businessPhones: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // The names of the contact's children.
  var children: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // The name of the contact's company.
  var companyName: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's department.
  var department: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The contact's display name. You can specify the display name in a create or update operation. Note that later updates
    * to other properties may cause an automatically generated value to overwrite the displayName value you have specified.
    * To preserve a pre-existing value, always include it as displayName in an update operation.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's email addresses.
  var emailAddresses: js.UndefOr[NullableOption[js.Array[EmailAddress]]] = js.native
  
  // The collection of open extensions defined for the contact. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  // The name the contact is filed under.
  var fileAs: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's generation.
  var generation: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's given name.
  var givenName: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's home address.
  var homeAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.native
  
  // The contact's home phone numbers.
  var homePhones: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // The contact's instant messaging (IM) addresses.
  var imAddresses: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // The contact's initials.
  var initials: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact’s job title.
  var jobTitle: js.UndefOr[NullableOption[String]] = js.native
  
  // The name of the contact's manager.
  var manager: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's middle name.
  var middleName: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's mobile phone number.
  var mobilePhone: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.native
  
  // The contact's nickname.
  var nickName: js.UndefOr[NullableOption[String]] = js.native
  
  // The location of the contact's office.
  var officeLocation: js.UndefOr[NullableOption[String]] = js.native
  
  // Other addresses for the contact.
  var otherAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.native
  
  // The ID of the contact's parent folder.
  var parentFolderId: js.UndefOr[NullableOption[String]] = js.native
  
  // The user's notes about the contact.
  var personalNotes: js.UndefOr[NullableOption[String]] = js.native
  
  // Optional contact picture. You can get or set a photo for a contact.
  var photo: js.UndefOr[NullableOption[ProfilePhoto]] = js.native
  
  // The contact's profession.
  var profession: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of single-value extended properties defined for the contact. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.native
  
  // The name of the contact's spouse/partner.
  var spouseName: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's surname.
  var surname: js.UndefOr[NullableOption[String]] = js.native
  
  // The contact's title.
  var title: js.UndefOr[NullableOption[String]] = js.native
  
  // The phonetic Japanese company name of the contact.
  var yomiCompanyName: js.UndefOr[NullableOption[String]] = js.native
  
  // The phonetic Japanese given name (first name) of the contact.
  var yomiGivenName: js.UndefOr[NullableOption[String]] = js.native
  
  // The phonetic Japanese surname (last name) of the contact.
  var yomiSurname: js.UndefOr[NullableOption[String]] = js.native
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
    def setAssistantName(value: NullableOption[String]): Self = this.set("assistantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssistantName: Self = this.set("assistantName", js.undefined)
    
    @scala.inline
    def setAssistantNameNull: Self = this.set("assistantName", null)
    
    @scala.inline
    def setBirthday(value: NullableOption[String]): Self = this.set("birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirthday: Self = this.set("birthday", js.undefined)
    
    @scala.inline
    def setBirthdayNull: Self = this.set("birthday", null)
    
    @scala.inline
    def setBusinessAddress(value: NullableOption[PhysicalAddress]): Self = this.set("businessAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessAddress: Self = this.set("businessAddress", js.undefined)
    
    @scala.inline
    def setBusinessAddressNull: Self = this.set("businessAddress", null)
    
    @scala.inline
    def setBusinessHomePage(value: NullableOption[String]): Self = this.set("businessHomePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessHomePage: Self = this.set("businessHomePage", js.undefined)
    
    @scala.inline
    def setBusinessHomePageNull: Self = this.set("businessHomePage", null)
    
    @scala.inline
    def setBusinessPhonesVarargs(value: String*): Self = this.set("businessPhones", js.Array(value :_*))
    
    @scala.inline
    def setBusinessPhones(value: NullableOption[js.Array[String]]): Self = this.set("businessPhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessPhones: Self = this.set("businessPhones", js.undefined)
    
    @scala.inline
    def setBusinessPhonesNull: Self = this.set("businessPhones", null)
    
    @scala.inline
    def setChildrenVarargs(value: String*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: NullableOption[js.Array[String]]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
    @scala.inline
    def setCompanyName(value: NullableOption[String]): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setCompanyNameNull: Self = this.set("companyName", null)
    
    @scala.inline
    def setDepartment(value: NullableOption[String]): Self = this.set("department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    
    @scala.inline
    def setDepartmentNull: Self = this.set("department", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setEmailAddressesVarargs(value: EmailAddress*): Self = this.set("emailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddresses(value: NullableOption[js.Array[EmailAddress]]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddresses: Self = this.set("emailAddresses", js.undefined)
    
    @scala.inline
    def setEmailAddressesNull: Self = this.set("emailAddresses", null)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    
    @scala.inline
    def setFileAs(value: NullableOption[String]): Self = this.set("fileAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileAs: Self = this.set("fileAs", js.undefined)
    
    @scala.inline
    def setFileAsNull: Self = this.set("fileAs", null)
    
    @scala.inline
    def setGeneration(value: NullableOption[String]): Self = this.set("generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    
    @scala.inline
    def setGenerationNull: Self = this.set("generation", null)
    
    @scala.inline
    def setGivenName(value: NullableOption[String]): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    
    @scala.inline
    def setGivenNameNull: Self = this.set("givenName", null)
    
    @scala.inline
    def setHomeAddress(value: NullableOption[PhysicalAddress]): Self = this.set("homeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeAddress: Self = this.set("homeAddress", js.undefined)
    
    @scala.inline
    def setHomeAddressNull: Self = this.set("homeAddress", null)
    
    @scala.inline
    def setHomePhonesVarargs(value: String*): Self = this.set("homePhones", js.Array(value :_*))
    
    @scala.inline
    def setHomePhones(value: NullableOption[js.Array[String]]): Self = this.set("homePhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomePhones: Self = this.set("homePhones", js.undefined)
    
    @scala.inline
    def setHomePhonesNull: Self = this.set("homePhones", null)
    
    @scala.inline
    def setImAddressesVarargs(value: String*): Self = this.set("imAddresses", js.Array(value :_*))
    
    @scala.inline
    def setImAddresses(value: NullableOption[js.Array[String]]): Self = this.set("imAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImAddresses: Self = this.set("imAddresses", js.undefined)
    
    @scala.inline
    def setImAddressesNull: Self = this.set("imAddresses", null)
    
    @scala.inline
    def setInitials(value: NullableOption[String]): Self = this.set("initials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitials: Self = this.set("initials", js.undefined)
    
    @scala.inline
    def setInitialsNull: Self = this.set("initials", null)
    
    @scala.inline
    def setJobTitle(value: NullableOption[String]): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
    
    @scala.inline
    def setJobTitleNull: Self = this.set("jobTitle", null)
    
    @scala.inline
    def setManager(value: NullableOption[String]): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManager: Self = this.set("manager", js.undefined)
    
    @scala.inline
    def setManagerNull: Self = this.set("manager", null)
    
    @scala.inline
    def setMiddleName(value: NullableOption[String]): Self = this.set("middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    
    @scala.inline
    def setMiddleNameNull: Self = this.set("middleName", null)
    
    @scala.inline
    def setMobilePhone(value: NullableOption[String]): Self = this.set("mobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobilePhone: Self = this.set("mobilePhone", js.undefined)
    
    @scala.inline
    def setMobilePhoneNull: Self = this.set("mobilePhone", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = this.set("multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = this.set("multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueExtendedProperties: Self = this.set("multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = this.set("multiValueExtendedProperties", null)
    
    @scala.inline
    def setNickName(value: NullableOption[String]): Self = this.set("nickName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNickName: Self = this.set("nickName", js.undefined)
    
    @scala.inline
    def setNickNameNull: Self = this.set("nickName", null)
    
    @scala.inline
    def setOfficeLocation(value: NullableOption[String]): Self = this.set("officeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfficeLocation: Self = this.set("officeLocation", js.undefined)
    
    @scala.inline
    def setOfficeLocationNull: Self = this.set("officeLocation", null)
    
    @scala.inline
    def setOtherAddress(value: NullableOption[PhysicalAddress]): Self = this.set("otherAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOtherAddress: Self = this.set("otherAddress", js.undefined)
    
    @scala.inline
    def setOtherAddressNull: Self = this.set("otherAddress", null)
    
    @scala.inline
    def setParentFolderId(value: NullableOption[String]): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    
    @scala.inline
    def setParentFolderIdNull: Self = this.set("parentFolderId", null)
    
    @scala.inline
    def setPersonalNotes(value: NullableOption[String]): Self = this.set("personalNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonalNotes: Self = this.set("personalNotes", js.undefined)
    
    @scala.inline
    def setPersonalNotesNull: Self = this.set("personalNotes", null)
    
    @scala.inline
    def setPhoto(value: NullableOption[ProfilePhoto]): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setPhotoNull: Self = this.set("photo", null)
    
    @scala.inline
    def setProfession(value: NullableOption[String]): Self = this.set("profession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfession: Self = this.set("profession", js.undefined)
    
    @scala.inline
    def setProfessionNull: Self = this.set("profession", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = this.set("singleValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = this.set("singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleValueExtendedProperties: Self = this.set("singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = this.set("singleValueExtendedProperties", null)
    
    @scala.inline
    def setSpouseName(value: NullableOption[String]): Self = this.set("spouseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpouseName: Self = this.set("spouseName", js.undefined)
    
    @scala.inline
    def setSpouseNameNull: Self = this.set("spouseName", null)
    
    @scala.inline
    def setSurname(value: NullableOption[String]): Self = this.set("surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurname: Self = this.set("surname", js.undefined)
    
    @scala.inline
    def setSurnameNull: Self = this.set("surname", null)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
    
    @scala.inline
    def setYomiCompanyName(value: NullableOption[String]): Self = this.set("yomiCompanyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYomiCompanyName: Self = this.set("yomiCompanyName", js.undefined)
    
    @scala.inline
    def setYomiCompanyNameNull: Self = this.set("yomiCompanyName", null)
    
    @scala.inline
    def setYomiGivenName(value: NullableOption[String]): Self = this.set("yomiGivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYomiGivenName: Self = this.set("yomiGivenName", js.undefined)
    
    @scala.inline
    def setYomiGivenNameNull: Self = this.set("yomiGivenName", null)
    
    @scala.inline
    def setYomiSurname(value: NullableOption[String]): Self = this.set("yomiSurname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYomiSurname: Self = this.set("yomiSurname", js.undefined)
    
    @scala.inline
    def setYomiSurnameNull: Self = this.set("yomiSurname", null)
  }
}
