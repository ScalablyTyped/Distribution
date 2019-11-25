package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteAssistancePartner extends Entity {
  // Display name of the partner.
  var displayName: js.UndefOr[String] = js.undefined
  // Timestamp of the last request sent to Intune by the TEM partner.
  var lastConnectionDateTime: js.UndefOr[String] = js.undefined
  // TBD. Possible values are: notOnboarded, onboarding, onboarded.
  var onboardingStatus: js.UndefOr[RemoteAssistanceOnboardingStatus] = js.undefined
  // URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
  var onboardingUrl: js.UndefOr[String] = js.undefined
}

object RemoteAssistancePartner {
  @scala.inline
  def apply(
    displayName: String = null,
    id: String = null,
    lastConnectionDateTime: String = null,
    onboardingStatus: RemoteAssistanceOnboardingStatus = null,
    onboardingUrl: String = null
  ): RemoteAssistancePartner = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastConnectionDateTime != null) __obj.updateDynamic("lastConnectionDateTime")(lastConnectionDateTime.asInstanceOf[js.Any])
    if (onboardingStatus != null) __obj.updateDynamic("onboardingStatus")(onboardingStatus.asInstanceOf[js.Any])
    if (onboardingUrl != null) __obj.updateDynamic("onboardingUrl")(onboardingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteAssistancePartner]
  }
}

