package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermsAndConditionsAcceptanceStatus extends Entity {
  // DateTime when the terms were last accepted by the user.
  var acceptedDateTime: js.UndefOr[String] = js.undefined
  // Most recent version number of the T&amp;C accepted by the user.
  var acceptedVersion: js.UndefOr[Double] = js.undefined
  // Navigation link to the terms and conditions that are assigned.
  var termsAndConditions: js.UndefOr[TermsAndConditions] = js.undefined
  // Display name of the user whose acceptance the entity represents.
  var userDisplayName: js.UndefOr[String] = js.undefined
}

object TermsAndConditionsAcceptanceStatus {
  @scala.inline
  def apply(
    acceptedDateTime: String = null,
    acceptedVersion: Int | Double = null,
    id: String = null,
    termsAndConditions: TermsAndConditions = null,
    userDisplayName: String = null
  ): TermsAndConditionsAcceptanceStatus = {
    val __obj = js.Dynamic.literal()
    if (acceptedDateTime != null) __obj.updateDynamic("acceptedDateTime")(acceptedDateTime.asInstanceOf[js.Any])
    if (acceptedVersion != null) __obj.updateDynamic("acceptedVersion")(acceptedVersion.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (termsAndConditions != null) __obj.updateDynamic("termsAndConditions")(termsAndConditions.asInstanceOf[js.Any])
    if (userDisplayName != null) __obj.updateDynamic("userDisplayName")(userDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermsAndConditionsAcceptanceStatus]
  }
}

