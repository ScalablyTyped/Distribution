package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Person extends Entity {
  // The person's birthday.
  var birthday: js.UndefOr[java.lang.String] = js.undefined
  // The name of the person's company.
  var companyName: js.UndefOr[java.lang.String] = js.undefined
  // The person's department.
  var department: js.UndefOr[java.lang.String] = js.undefined
  // The person's display name.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // The person's given name.
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  // The instant message voice over IP (VOIP) session initiation protocol (SIP) address for the user. Read-only.
  var imAddress: js.UndefOr[java.lang.String] = js.undefined
  // true if the user has flagged this person as a favorite.
  var isFavorite: js.UndefOr[scala.Boolean] = js.undefined
  // The person's job title.
  var jobTitle: js.UndefOr[java.lang.String] = js.undefined
  // The location of the person's office.
  var officeLocation: js.UndefOr[java.lang.String] = js.undefined
  // Free-form notes that the user has taken about this person.
  var personNotes: js.UndefOr[java.lang.String] = js.undefined
  // The type of person.
  var personType: js.UndefOr[PersonType] = js.undefined
  // The person's phone numbers.
  var phones: js.UndefOr[js.Array[Phone]] = js.undefined
  // The person's addresses.
  var postalAddresses: js.UndefOr[js.Array[Location]] = js.undefined
  // The person's profession.
  var profession: js.UndefOr[java.lang.String] = js.undefined
  // The person's email addresses.
  var scoredEmailAddresses: js.UndefOr[js.Array[ScoredEmailAddress]] = js.undefined
  // The person's surname.
  var surname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user principal name (UPN) of the person. The UPN is an Internet-style login name for the person based on the
    * Internet standard RFC 822. By convention, this should map to the person's email name. The general format is
    * alias@domain.
    */
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
  // The person's websites.
  var websites: js.UndefOr[js.Array[Website]] = js.undefined
  // The phonetic Japanese name of the person's company.
  var yomiCompany: js.UndefOr[java.lang.String] = js.undefined
}

object Person {
  @scala.inline
  def apply(
    birthday: java.lang.String = null,
    companyName: java.lang.String = null,
    department: java.lang.String = null,
    displayName: java.lang.String = null,
    givenName: java.lang.String = null,
    id: java.lang.String = null,
    imAddress: java.lang.String = null,
    isFavorite: js.UndefOr[scala.Boolean] = js.undefined,
    jobTitle: java.lang.String = null,
    officeLocation: java.lang.String = null,
    personNotes: java.lang.String = null,
    personType: PersonType = null,
    phones: js.Array[Phone] = null,
    postalAddresses: js.Array[Location] = null,
    profession: java.lang.String = null,
    scoredEmailAddresses: js.Array[ScoredEmailAddress] = null,
    surname: java.lang.String = null,
    userPrincipalName: java.lang.String = null,
    websites: js.Array[Website] = null,
    yomiCompany: java.lang.String = null
  ): Person = {
    val __obj = js.Dynamic.literal()
    if (birthday != null) __obj.updateDynamic("birthday")(birthday)
    if (companyName != null) __obj.updateDynamic("companyName")(companyName)
    if (department != null) __obj.updateDynamic("department")(department)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imAddress != null) __obj.updateDynamic("imAddress")(imAddress)
    if (!js.isUndefined(isFavorite)) __obj.updateDynamic("isFavorite")(isFavorite)
    if (jobTitle != null) __obj.updateDynamic("jobTitle")(jobTitle)
    if (officeLocation != null) __obj.updateDynamic("officeLocation")(officeLocation)
    if (personNotes != null) __obj.updateDynamic("personNotes")(personNotes)
    if (personType != null) __obj.updateDynamic("personType")(personType)
    if (phones != null) __obj.updateDynamic("phones")(phones)
    if (postalAddresses != null) __obj.updateDynamic("postalAddresses")(postalAddresses)
    if (profession != null) __obj.updateDynamic("profession")(profession)
    if (scoredEmailAddresses != null) __obj.updateDynamic("scoredEmailAddresses")(scoredEmailAddresses)
    if (surname != null) __obj.updateDynamic("surname")(surname)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    if (websites != null) __obj.updateDynamic("websites")(websites)
    if (yomiCompany != null) __obj.updateDynamic("yomiCompany")(yomiCompany)
    __obj.asInstanceOf[Person]
  }
}

