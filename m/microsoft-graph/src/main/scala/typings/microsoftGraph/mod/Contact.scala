package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contact
  extends StObject
     with OutlookItem {
  
  // The name of the contact's assistant.
  var assistantName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The contact's birthday. The Timestamp type represents date and time information using ISO 8601 format and is always in
    * UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var birthday: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's business address.
  var businessAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
  // The business home page of the contact.
  var businessHomePage: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's business phone numbers.
  var businessPhones: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The names of the contact's children.
  var children: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The name of the contact's company.
  var companyName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's department.
  var department: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The contact's display name. You can specify the display name in a create or update operation. Note that later updates
    * to other properties may cause an automatically generated value to overwrite the displayName value you have specified.
    * To preserve a pre-existing value, always include it as displayName in an update operation.
    */
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's email addresses.
  var emailAddresses: js.UndefOr[NullableOption[js.Array[EmailAddress]]] = js.undefined
  
  // The collection of open extensions defined for the contact. Read-only. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.undefined
  
  // The name the contact is filed under.
  var fileAs: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's generation.
  var generation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's given name.
  var givenName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's home address.
  var homeAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
  // The contact's home phone numbers.
  var homePhones: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The contact's instant messaging (IM) addresses.
  var imAddresses: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The contact's initials.
  var initials: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact’s job title.
  var jobTitle: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the contact's manager.
  var manager: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's middle name.
  var middleName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's mobile phone number.
  var mobilePhone: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.undefined
  
  // The contact's nickname.
  var nickName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The location of the contact's office.
  var officeLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Other addresses for the contact.
  var otherAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
  // The ID of the contact's parent folder.
  var parentFolderId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user's notes about the contact.
  var personalNotes: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional contact picture. You can get or set a photo for a contact.
  var photo: js.UndefOr[NullableOption[ProfilePhoto]] = js.undefined
  
  // The contact's profession.
  var profession: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of single-value extended properties defined for the contact. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.undefined
  
  // The name of the contact's spouse/partner.
  var spouseName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's surname.
  var surname: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The contact's title.
  var title: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The phonetic Japanese company name of the contact.
  var yomiCompanyName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The phonetic Japanese given name (first name) of the contact.
  var yomiGivenName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The phonetic Japanese surname (last name) of the contact.
  var yomiSurname: js.UndefOr[NullableOption[String]] = js.undefined
}
object Contact {
  
  @scala.inline
  def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  
  @scala.inline
  implicit class ContactMutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssistantName(value: NullableOption[String]): Self = StObject.set(x, "assistantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssistantNameNull: Self = StObject.set(x, "assistantName", null)
    
    @scala.inline
    def setAssistantNameUndefined: Self = StObject.set(x, "assistantName", js.undefined)
    
    @scala.inline
    def setBirthday(value: NullableOption[String]): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthdayNull: Self = StObject.set(x, "birthday", null)
    
    @scala.inline
    def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
    @scala.inline
    def setBusinessAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "businessAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessAddressNull: Self = StObject.set(x, "businessAddress", null)
    
    @scala.inline
    def setBusinessAddressUndefined: Self = StObject.set(x, "businessAddress", js.undefined)
    
    @scala.inline
    def setBusinessHomePage(value: NullableOption[String]): Self = StObject.set(x, "businessHomePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessHomePageNull: Self = StObject.set(x, "businessHomePage", null)
    
    @scala.inline
    def setBusinessHomePageUndefined: Self = StObject.set(x, "businessHomePage", js.undefined)
    
    @scala.inline
    def setBusinessPhones(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "businessPhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessPhonesNull: Self = StObject.set(x, "businessPhones", null)
    
    @scala.inline
    def setBusinessPhonesUndefined: Self = StObject.set(x, "businessPhones", js.undefined)
    
    @scala.inline
    def setBusinessPhonesVarargs(value: String*): Self = StObject.set(x, "businessPhones", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setCompanyName(value: NullableOption[String]): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNameNull: Self = StObject.set(x, "companyName", null)
    
    @scala.inline
    def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    @scala.inline
    def setDepartment(value: NullableOption[String]): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentNull: Self = StObject.set(x, "department", null)
    
    @scala.inline
    def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmailAddresses(value: NullableOption[js.Array[EmailAddress]]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressesNull: Self = StObject.set(x, "emailAddresses", null)
    
    @scala.inline
    def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
    
    @scala.inline
    def setEmailAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "emailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setFileAs(value: NullableOption[String]): Self = StObject.set(x, "fileAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileAsNull: Self = StObject.set(x, "fileAs", null)
    
    @scala.inline
    def setFileAsUndefined: Self = StObject.set(x, "fileAs", js.undefined)
    
    @scala.inline
    def setGeneration(value: NullableOption[String]): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationNull: Self = StObject.set(x, "generation", null)
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setGivenName(value: NullableOption[String]): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    @scala.inline
    def setHomeAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "homeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressNull: Self = StObject.set(x, "homeAddress", null)
    
    @scala.inline
    def setHomeAddressUndefined: Self = StObject.set(x, "homeAddress", js.undefined)
    
    @scala.inline
    def setHomePhones(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "homePhones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePhonesNull: Self = StObject.set(x, "homePhones", null)
    
    @scala.inline
    def setHomePhonesUndefined: Self = StObject.set(x, "homePhones", js.undefined)
    
    @scala.inline
    def setHomePhonesVarargs(value: String*): Self = StObject.set(x, "homePhones", js.Array(value :_*))
    
    @scala.inline
    def setImAddresses(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "imAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImAddressesNull: Self = StObject.set(x, "imAddresses", null)
    
    @scala.inline
    def setImAddressesUndefined: Self = StObject.set(x, "imAddresses", js.undefined)
    
    @scala.inline
    def setImAddressesVarargs(value: String*): Self = StObject.set(x, "imAddresses", js.Array(value :_*))
    
    @scala.inline
    def setInitials(value: NullableOption[String]): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialsNull: Self = StObject.set(x, "initials", null)
    
    @scala.inline
    def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
    
    @scala.inline
    def setJobTitle(value: NullableOption[String]): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitleNull: Self = StObject.set(x, "jobTitle", null)
    
    @scala.inline
    def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    @scala.inline
    def setManager(value: NullableOption[String]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerNull: Self = StObject.set(x, "manager", null)
    
    @scala.inline
    def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    @scala.inline
    def setMiddleName(value: NullableOption[String]): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleNameNull: Self = StObject.set(x, "middleName", null)
    
    @scala.inline
    def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    
    @scala.inline
    def setMobilePhone(value: NullableOption[String]): Self = StObject.set(x, "mobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobilePhoneNull: Self = StObject.set(x, "mobilePhone", null)
    
    @scala.inline
    def setMobilePhoneUndefined: Self = StObject.set(x, "mobilePhone", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setNickName(value: NullableOption[String]): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickNameNull: Self = StObject.set(x, "nickName", null)
    
    @scala.inline
    def setNickNameUndefined: Self = StObject.set(x, "nickName", js.undefined)
    
    @scala.inline
    def setOfficeLocation(value: NullableOption[String]): Self = StObject.set(x, "officeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeLocationNull: Self = StObject.set(x, "officeLocation", null)
    
    @scala.inline
    def setOfficeLocationUndefined: Self = StObject.set(x, "officeLocation", js.undefined)
    
    @scala.inline
    def setOtherAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "otherAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherAddressNull: Self = StObject.set(x, "otherAddress", null)
    
    @scala.inline
    def setOtherAddressUndefined: Self = StObject.set(x, "otherAddress", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: NullableOption[String]): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderIdNull: Self = StObject.set(x, "parentFolderId", null)
    
    @scala.inline
    def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    @scala.inline
    def setPersonalNotes(value: NullableOption[String]): Self = StObject.set(x, "personalNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalNotesNull: Self = StObject.set(x, "personalNotes", null)
    
    @scala.inline
    def setPersonalNotesUndefined: Self = StObject.set(x, "personalNotes", js.undefined)
    
    @scala.inline
    def setPhoto(value: NullableOption[ProfilePhoto]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setProfession(value: NullableOption[String]): Self = StObject.set(x, "profession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfessionNull: Self = StObject.set(x, "profession", null)
    
    @scala.inline
    def setProfessionUndefined: Self = StObject.set(x, "profession", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setSpouseName(value: NullableOption[String]): Self = StObject.set(x, "spouseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpouseNameNull: Self = StObject.set(x, "spouseName", null)
    
    @scala.inline
    def setSpouseNameUndefined: Self = StObject.set(x, "spouseName", js.undefined)
    
    @scala.inline
    def setSurname(value: NullableOption[String]): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurnameNull: Self = StObject.set(x, "surname", null)
    
    @scala.inline
    def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    
    @scala.inline
    def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setYomiCompanyName(value: NullableOption[String]): Self = StObject.set(x, "yomiCompanyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYomiCompanyNameNull: Self = StObject.set(x, "yomiCompanyName", null)
    
    @scala.inline
    def setYomiCompanyNameUndefined: Self = StObject.set(x, "yomiCompanyName", js.undefined)
    
    @scala.inline
    def setYomiGivenName(value: NullableOption[String]): Self = StObject.set(x, "yomiGivenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYomiGivenNameNull: Self = StObject.set(x, "yomiGivenName", null)
    
    @scala.inline
    def setYomiGivenNameUndefined: Self = StObject.set(x, "yomiGivenName", js.undefined)
    
    @scala.inline
    def setYomiSurname(value: NullableOption[String]): Self = StObject.set(x, "yomiSurname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYomiSurnameNull: Self = StObject.set(x, "yomiSurname", null)
    
    @scala.inline
    def setYomiSurnameUndefined: Self = StObject.set(x, "yomiSurname", js.undefined)
  }
}
