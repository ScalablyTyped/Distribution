package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TermsAndConditionsAcceptanceStatus extends Entity {
  /** DateTime when the terms were last accepted by the user. */
  var acceptedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Most recent version number of the T&amp;C accepted by the user. */
  var acceptedVersion: js.UndefOr[scala.Double] = js.undefined
  /** Navigation link to the terms and conditions that are assigned. */
  var termsAndConditions: js.UndefOr[TermsAndConditions] = js.undefined
  /** Display name of the user whose acceptance the entity represents. */
  var userDisplayName: js.UndefOr[java.lang.String] = js.undefined
}

object TermsAndConditionsAcceptanceStatus {
  @scala.inline
  def apply(
    acceptedDateTime: java.lang.String = null,
    acceptedVersion: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    termsAndConditions: TermsAndConditions = null,
    userDisplayName: java.lang.String = null
  ): TermsAndConditionsAcceptanceStatus = {
    val __obj = js.Dynamic.literal()
    if (acceptedDateTime != null) __obj.updateDynamic("acceptedDateTime")(acceptedDateTime)
    if (acceptedVersion != null) __obj.updateDynamic("acceptedVersion")(acceptedVersion.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (termsAndConditions != null) __obj.updateDynamic("termsAndConditions")(termsAndConditions)
    if (userDisplayName != null) __obj.updateDynamic("userDisplayName")(userDisplayName)
    __obj.asInstanceOf[TermsAndConditionsAcceptanceStatus]
  }
}

