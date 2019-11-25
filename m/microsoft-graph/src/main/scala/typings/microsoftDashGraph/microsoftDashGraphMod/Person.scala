package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends Entity {
  // The person's birthday.
  var birthday: js.UndefOr[String] = js.undefined
  // The name of the person's company.
  var companyName: js.UndefOr[String] = js.undefined
  // The person's department.
  var department: js.UndefOr[String] = js.undefined
  // The person's display name.
  var displayName: js.UndefOr[String] = js.undefined
  // The person's given name.
  var givenName: js.UndefOr[String] = js.undefined
  // The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only.
  var imAddress: js.UndefOr[String] = js.undefined
  // true if the user has flagged this person as a favorite.
  var isFavorite: js.UndefOr[Boolean] = js.undefined
  // The person's job title.
  var jobTitle: js.UndefOr[String] = js.undefined
  // The location of the person's office.
  var officeLocation: js.UndefOr[String] = js.undefined
  // Free-form notes that the user has taken about this person.
  var personNotes: js.UndefOr[String] = js.undefined
  // The type of person.
  var personType: js.UndefOr[PersonType] = js.undefined
  // The person's phone numbers.
  var phones: js.UndefOr[js.Array[Phone]] = js.undefined
  // The person's addresses.
  var postalAddresses: js.UndefOr[js.Array[Location]] = js.undefined
  // The person's profession.
  var profession: js.UndefOr[String] = js.undefined
  // The person's email addresses.
  var scoredEmailAddresses: js.UndefOr[js.Array[ScoredEmailAddress]] = js.undefined
  // The person's surname.
  var surname: js.UndefOr[String] = js.undefined
  /**
    * The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the
    * Internet standard RFC 822. By convention, this should map to the person's email name. The general format is
    * alias@domain.
    */
  var userPrincipalName: js.UndefOr[String] = js.undefined
  // The person's websites.
  var websites: js.UndefOr[js.Array[Website]] = js.undefined
  // The phonetic Japanese name of the person's company.
  var yomiCompany: js.UndefOr[String] = js.undefined
}

object Person {
  @scala.inline
  def apply(
    birthday: String = null,
    companyName: String = null,
    department: String = null,
    displayName: String = null,
    givenName: String = null,
    id: String = null,
    imAddress: String = null,
    isFavorite: js.UndefOr[Boolean] = js.undefined,
    jobTitle: String = null,
    officeLocation: String = null,
    personNotes: String = null,
    personType: PersonType = null,
    phones: js.Array[Phone] = null,
    postalAddresses: js.Array[Location] = null,
    profession: String = null,
    scoredEmailAddresses: js.Array[ScoredEmailAddress] = null,
    surname: String = null,
    userPrincipalName: String = null,
    websites: js.Array[Website] = null,
    yomiCompany: String = null
  ): Person = {
    val __obj = js.Dynamic.literal()
    if (birthday != null) __obj.updateDynamic("birthday")(birthday.asInstanceOf[js.Any])
    if (companyName != null) __obj.updateDynamic("companyName")(companyName.asInstanceOf[js.Any])
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imAddress != null) __obj.updateDynamic("imAddress")(imAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isFavorite)) __obj.updateDynamic("isFavorite")(isFavorite.asInstanceOf[js.Any])
    if (jobTitle != null) __obj.updateDynamic("jobTitle")(jobTitle.asInstanceOf[js.Any])
    if (officeLocation != null) __obj.updateDynamic("officeLocation")(officeLocation.asInstanceOf[js.Any])
    if (personNotes != null) __obj.updateDynamic("personNotes")(personNotes.asInstanceOf[js.Any])
    if (personType != null) __obj.updateDynamic("personType")(personType.asInstanceOf[js.Any])
    if (phones != null) __obj.updateDynamic("phones")(phones.asInstanceOf[js.Any])
    if (postalAddresses != null) __obj.updateDynamic("postalAddresses")(postalAddresses.asInstanceOf[js.Any])
    if (profession != null) __obj.updateDynamic("profession")(profession.asInstanceOf[js.Any])
    if (scoredEmailAddresses != null) __obj.updateDynamic("scoredEmailAddresses")(scoredEmailAddresses.asInstanceOf[js.Any])
    if (surname != null) __obj.updateDynamic("surname")(surname.asInstanceOf[js.Any])
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName.asInstanceOf[js.Any])
    if (websites != null) __obj.updateDynamic("websites")(websites.asInstanceOf[js.Any])
    if (yomiCompany != null) __obj.updateDynamic("yomiCompany")(yomiCompany.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
}

