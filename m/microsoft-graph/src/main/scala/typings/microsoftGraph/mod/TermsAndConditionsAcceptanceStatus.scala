package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermsAndConditionsAcceptanceStatus extends Entity {
  // DateTime when the terms were last accepted by the user.
  var acceptedDateTime: js.UndefOr[String] = js.native
  // Most recent version number of the T&amp;C accepted by the user.
  var acceptedVersion: js.UndefOr[Double] = js.native
  // Navigation link to the terms and conditions that are assigned.
  var termsAndConditions: js.UndefOr[TermsAndConditions] = js.native
  // Display name of the user whose acceptance the entity represents.
  var userDisplayName: js.UndefOr[String] = js.native
  // The userPrincipalName of the User that accepted the term.
  var userPrincipalName: js.UndefOr[String] = js.native
}

object TermsAndConditionsAcceptanceStatus {
  @scala.inline
  def apply(): TermsAndConditionsAcceptanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsAndConditionsAcceptanceStatus]
  }
  @scala.inline
  implicit class TermsAndConditionsAcceptanceStatusOps[Self <: TermsAndConditionsAcceptanceStatus] (val x: Self) extends AnyVal {
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
    def setAcceptedDateTime(value: String): Self = this.set("acceptedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptedDateTime: Self = this.set("acceptedDateTime", js.undefined)
    @scala.inline
    def setAcceptedVersion(value: Double): Self = this.set("acceptedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptedVersion: Self = this.set("acceptedVersion", js.undefined)
    @scala.inline
    def setTermsAndConditions(value: TermsAndConditions): Self = this.set("termsAndConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTermsAndConditions: Self = this.set("termsAndConditions", js.undefined)
    @scala.inline
    def setUserDisplayName(value: String): Self = this.set("userDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDisplayName: Self = this.set("userDisplayName", js.undefined)
    @scala.inline
    def setUserPrincipalName(value: String): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
  }
  
}

