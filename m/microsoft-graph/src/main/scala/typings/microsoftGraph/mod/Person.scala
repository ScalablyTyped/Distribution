package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Person
  extends StObject
     with Entity {
  
  // The person's birthday.
  var birthday: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the person's company.
  var companyName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The person's department.
  var department: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The person's display name.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The person's given name.
  var givenName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only.
  var imAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // true if the user has flagged this person as a favorite.
  var isFavorite: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The person's job title.
  var jobTitle: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The location of the person's office.
  var officeLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Free-form notes that the user has taken about this person.
  var personNotes: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of person.
  var personType: js.UndefOr[NullableOption[PersonType]] = js.undefined
  
  // The person's phone numbers.
  var phones: js.UndefOr[NullableOption[js.Array[Phone]]] = js.undefined
  
  // The person's addresses.
  var postalAddresses: js.UndefOr[NullableOption[js.Array[Location]]] = js.undefined
  
  // The person's profession.
  var profession: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The person's email addresses.
  var scoredEmailAddresses: js.UndefOr[NullableOption[js.Array[ScoredEmailAddress]]] = js.undefined
  
  // The person's surname.
  var surname: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the
    * Internet standard RFC 822. By convention, this should map to the person's email name. The general format is
    * alias@domain.
    */
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The person's websites.
  var websites: js.UndefOr[NullableOption[js.Array[Website]]] = js.undefined
  
  // The phonetic Japanese name of the person's company.
  var yomiCompany: js.UndefOr[NullableOption[String]] = js.undefined
}
object Person {
  
  @scala.inline
  def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  
  @scala.inline
  implicit class PersonMutableBuilder[Self <: Person] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBirthday(value: NullableOption[String]): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthdayNull: Self = StObject.set(x, "birthday", null)
    
    @scala.inline
    def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
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
    def setGivenName(value: NullableOption[String]): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    @scala.inline
    def setImAddress(value: NullableOption[String]): Self = StObject.set(x, "imAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImAddressNull: Self = StObject.set(x, "imAddress", null)
    
    @scala.inline
    def setImAddressUndefined: Self = StObject.set(x, "imAddress", js.undefined)
    
    @scala.inline
    def setIsFavorite(value: NullableOption[Boolean]): Self = StObject.set(x, "isFavorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFavoriteNull: Self = StObject.set(x, "isFavorite", null)
    
    @scala.inline
    def setIsFavoriteUndefined: Self = StObject.set(x, "isFavorite", js.undefined)
    
    @scala.inline
    def setJobTitle(value: NullableOption[String]): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitleNull: Self = StObject.set(x, "jobTitle", null)
    
    @scala.inline
    def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    @scala.inline
    def setOfficeLocation(value: NullableOption[String]): Self = StObject.set(x, "officeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeLocationNull: Self = StObject.set(x, "officeLocation", null)
    
    @scala.inline
    def setOfficeLocationUndefined: Self = StObject.set(x, "officeLocation", js.undefined)
    
    @scala.inline
    def setPersonNotes(value: NullableOption[String]): Self = StObject.set(x, "personNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonNotesNull: Self = StObject.set(x, "personNotes", null)
    
    @scala.inline
    def setPersonNotesUndefined: Self = StObject.set(x, "personNotes", js.undefined)
    
    @scala.inline
    def setPersonType(value: NullableOption[PersonType]): Self = StObject.set(x, "personType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonTypeNull: Self = StObject.set(x, "personType", null)
    
    @scala.inline
    def setPersonTypeUndefined: Self = StObject.set(x, "personType", js.undefined)
    
    @scala.inline
    def setPhones(value: NullableOption[js.Array[Phone]]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhonesNull: Self = StObject.set(x, "phones", null)
    
    @scala.inline
    def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    @scala.inline
    def setPhonesVarargs(value: Phone*): Self = StObject.set(x, "phones", js.Array(value :_*))
    
    @scala.inline
    def setPostalAddresses(value: NullableOption[js.Array[Location]]): Self = StObject.set(x, "postalAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalAddressesNull: Self = StObject.set(x, "postalAddresses", null)
    
    @scala.inline
    def setPostalAddressesUndefined: Self = StObject.set(x, "postalAddresses", js.undefined)
    
    @scala.inline
    def setPostalAddressesVarargs(value: Location*): Self = StObject.set(x, "postalAddresses", js.Array(value :_*))
    
    @scala.inline
    def setProfession(value: NullableOption[String]): Self = StObject.set(x, "profession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfessionNull: Self = StObject.set(x, "profession", null)
    
    @scala.inline
    def setProfessionUndefined: Self = StObject.set(x, "profession", js.undefined)
    
    @scala.inline
    def setScoredEmailAddresses(value: NullableOption[js.Array[ScoredEmailAddress]]): Self = StObject.set(x, "scoredEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoredEmailAddressesNull: Self = StObject.set(x, "scoredEmailAddresses", null)
    
    @scala.inline
    def setScoredEmailAddressesUndefined: Self = StObject.set(x, "scoredEmailAddresses", js.undefined)
    
    @scala.inline
    def setScoredEmailAddressesVarargs(value: ScoredEmailAddress*): Self = StObject.set(x, "scoredEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSurname(value: NullableOption[String]): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurnameNull: Self = StObject.set(x, "surname", null)
    
    @scala.inline
    def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
    
    @scala.inline
    def setWebsites(value: NullableOption[js.Array[Website]]): Self = StObject.set(x, "websites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsitesNull: Self = StObject.set(x, "websites", null)
    
    @scala.inline
    def setWebsitesUndefined: Self = StObject.set(x, "websites", js.undefined)
    
    @scala.inline
    def setWebsitesVarargs(value: Website*): Self = StObject.set(x, "websites", js.Array(value :_*))
    
    @scala.inline
    def setYomiCompany(value: NullableOption[String]): Self = StObject.set(x, "yomiCompany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYomiCompanyNull: Self = StObject.set(x, "yomiCompany", null)
    
    @scala.inline
    def setYomiCompanyUndefined: Self = StObject.set(x, "yomiCompany", js.undefined)
  }
}
