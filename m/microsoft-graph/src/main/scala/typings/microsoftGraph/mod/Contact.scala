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
    * UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
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
  
  var imAddresses: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var initials: js.UndefOr[NullableOption[String]] = js.undefined
  
  var jobTitle: js.UndefOr[NullableOption[String]] = js.undefined
  
  var manager: js.UndefOr[NullableOption[String]] = js.undefined
  
  var middleName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var mobilePhone: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of multi-value extended properties defined for the contact. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.undefined
  
  var nickName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var officeLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  var otherAddress: js.UndefOr[NullableOption[PhysicalAddress]] = js.undefined
  
  var parentFolderId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var personalNotes: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Optional contact picture. You can get or set a photo for a contact.
  var photo: js.UndefOr[NullableOption[ProfilePhoto]] = js.undefined
  
  var profession: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of single-value extended properties defined for the contact. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.undefined
  
  var spouseName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var surname: js.UndefOr[NullableOption[String]] = js.undefined
  
  var title: js.UndefOr[NullableOption[String]] = js.undefined
  
  var yomiCompanyName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var yomiGivenName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var yomiSurname: js.UndefOr[NullableOption[String]] = js.undefined
}
object Contact {
  
  inline def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  
  extension [Self <: Contact](x: Self) {
    
    inline def setAssistantName(value: NullableOption[String]): Self = StObject.set(x, "assistantName", value.asInstanceOf[js.Any])
    
    inline def setAssistantNameNull: Self = StObject.set(x, "assistantName", null)
    
    inline def setAssistantNameUndefined: Self = StObject.set(x, "assistantName", js.undefined)
    
    inline def setBirthday(value: NullableOption[String]): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    inline def setBirthdayNull: Self = StObject.set(x, "birthday", null)
    
    inline def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
    inline def setBusinessAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "businessAddress", value.asInstanceOf[js.Any])
    
    inline def setBusinessAddressNull: Self = StObject.set(x, "businessAddress", null)
    
    inline def setBusinessAddressUndefined: Self = StObject.set(x, "businessAddress", js.undefined)
    
    inline def setBusinessHomePage(value: NullableOption[String]): Self = StObject.set(x, "businessHomePage", value.asInstanceOf[js.Any])
    
    inline def setBusinessHomePageNull: Self = StObject.set(x, "businessHomePage", null)
    
    inline def setBusinessHomePageUndefined: Self = StObject.set(x, "businessHomePage", js.undefined)
    
    inline def setBusinessPhones(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "businessPhones", value.asInstanceOf[js.Any])
    
    inline def setBusinessPhonesNull: Self = StObject.set(x, "businessPhones", null)
    
    inline def setBusinessPhonesUndefined: Self = StObject.set(x, "businessPhones", js.undefined)
    
    inline def setBusinessPhonesVarargs(value: String*): Self = StObject.set(x, "businessPhones", js.Array(value*))
    
    inline def setChildren(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCompanyName(value: NullableOption[String]): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameNull: Self = StObject.set(x, "companyName", null)
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    inline def setDepartment(value: NullableOption[String]): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    inline def setDepartmentNull: Self = StObject.set(x, "department", null)
    
    inline def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmailAddresses(value: NullableOption[js.Array[EmailAddress]]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesNull: Self = StObject.set(x, "emailAddresses", null)
    
    inline def setEmailAddressesUndefined: Self = StObject.set(x, "emailAddresses", js.undefined)
    
    inline def setEmailAddressesVarargs(value: EmailAddress*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setFileAs(value: NullableOption[String]): Self = StObject.set(x, "fileAs", value.asInstanceOf[js.Any])
    
    inline def setFileAsNull: Self = StObject.set(x, "fileAs", null)
    
    inline def setFileAsUndefined: Self = StObject.set(x, "fileAs", js.undefined)
    
    inline def setGeneration(value: NullableOption[String]): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationNull: Self = StObject.set(x, "generation", null)
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setGivenName(value: NullableOption[String]): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    inline def setHomeAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "homeAddress", value.asInstanceOf[js.Any])
    
    inline def setHomeAddressNull: Self = StObject.set(x, "homeAddress", null)
    
    inline def setHomeAddressUndefined: Self = StObject.set(x, "homeAddress", js.undefined)
    
    inline def setHomePhones(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "homePhones", value.asInstanceOf[js.Any])
    
    inline def setHomePhonesNull: Self = StObject.set(x, "homePhones", null)
    
    inline def setHomePhonesUndefined: Self = StObject.set(x, "homePhones", js.undefined)
    
    inline def setHomePhonesVarargs(value: String*): Self = StObject.set(x, "homePhones", js.Array(value*))
    
    inline def setImAddresses(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "imAddresses", value.asInstanceOf[js.Any])
    
    inline def setImAddressesNull: Self = StObject.set(x, "imAddresses", null)
    
    inline def setImAddressesUndefined: Self = StObject.set(x, "imAddresses", js.undefined)
    
    inline def setImAddressesVarargs(value: String*): Self = StObject.set(x, "imAddresses", js.Array(value*))
    
    inline def setInitials(value: NullableOption[String]): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
    
    inline def setInitialsNull: Self = StObject.set(x, "initials", null)
    
    inline def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
    
    inline def setJobTitle(value: NullableOption[String]): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    inline def setJobTitleNull: Self = StObject.set(x, "jobTitle", null)
    
    inline def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    inline def setManager(value: NullableOption[String]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setManagerNull: Self = StObject.set(x, "manager", null)
    
    inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    inline def setMiddleName(value: NullableOption[String]): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    inline def setMiddleNameNull: Self = StObject.set(x, "middleName", null)
    
    inline def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    
    inline def setMobilePhone(value: NullableOption[String]): Self = StObject.set(x, "mobilePhone", value.asInstanceOf[js.Any])
    
    inline def setMobilePhoneNull: Self = StObject.set(x, "mobilePhone", null)
    
    inline def setMobilePhoneUndefined: Self = StObject.set(x, "mobilePhone", js.undefined)
    
    inline def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    inline def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    inline def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value*))
    
    inline def setNickName(value: NullableOption[String]): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
    
    inline def setNickNameNull: Self = StObject.set(x, "nickName", null)
    
    inline def setNickNameUndefined: Self = StObject.set(x, "nickName", js.undefined)
    
    inline def setOfficeLocation(value: NullableOption[String]): Self = StObject.set(x, "officeLocation", value.asInstanceOf[js.Any])
    
    inline def setOfficeLocationNull: Self = StObject.set(x, "officeLocation", null)
    
    inline def setOfficeLocationUndefined: Self = StObject.set(x, "officeLocation", js.undefined)
    
    inline def setOtherAddress(value: NullableOption[PhysicalAddress]): Self = StObject.set(x, "otherAddress", value.asInstanceOf[js.Any])
    
    inline def setOtherAddressNull: Self = StObject.set(x, "otherAddress", null)
    
    inline def setOtherAddressUndefined: Self = StObject.set(x, "otherAddress", js.undefined)
    
    inline def setParentFolderId(value: NullableOption[String]): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdNull: Self = StObject.set(x, "parentFolderId", null)
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    inline def setPersonalNotes(value: NullableOption[String]): Self = StObject.set(x, "personalNotes", value.asInstanceOf[js.Any])
    
    inline def setPersonalNotesNull: Self = StObject.set(x, "personalNotes", null)
    
    inline def setPersonalNotesUndefined: Self = StObject.set(x, "personalNotes", js.undefined)
    
    inline def setPhoto(value: NullableOption[ProfilePhoto]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setProfession(value: NullableOption[String]): Self = StObject.set(x, "profession", value.asInstanceOf[js.Any])
    
    inline def setProfessionNull: Self = StObject.set(x, "profession", null)
    
    inline def setProfessionUndefined: Self = StObject.set(x, "profession", js.undefined)
    
    inline def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    inline def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    inline def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    inline def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value*))
    
    inline def setSpouseName(value: NullableOption[String]): Self = StObject.set(x, "spouseName", value.asInstanceOf[js.Any])
    
    inline def setSpouseNameNull: Self = StObject.set(x, "spouseName", null)
    
    inline def setSpouseNameUndefined: Self = StObject.set(x, "spouseName", js.undefined)
    
    inline def setSurname(value: NullableOption[String]): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
    
    inline def setSurnameNull: Self = StObject.set(x, "surname", null)
    
    inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    
    inline def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setYomiCompanyName(value: NullableOption[String]): Self = StObject.set(x, "yomiCompanyName", value.asInstanceOf[js.Any])
    
    inline def setYomiCompanyNameNull: Self = StObject.set(x, "yomiCompanyName", null)
    
    inline def setYomiCompanyNameUndefined: Self = StObject.set(x, "yomiCompanyName", js.undefined)
    
    inline def setYomiGivenName(value: NullableOption[String]): Self = StObject.set(x, "yomiGivenName", value.asInstanceOf[js.Any])
    
    inline def setYomiGivenNameNull: Self = StObject.set(x, "yomiGivenName", null)
    
    inline def setYomiGivenNameUndefined: Self = StObject.set(x, "yomiGivenName", js.undefined)
    
    inline def setYomiSurname(value: NullableOption[String]): Self = StObject.set(x, "yomiSurname", value.asInstanceOf[js.Any])
    
    inline def setYomiSurnameNull: Self = StObject.set(x, "yomiSurname", null)
    
    inline def setYomiSurnameUndefined: Self = StObject.set(x, "yomiSurname", js.undefined)
  }
}
