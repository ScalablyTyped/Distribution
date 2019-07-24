package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteAssistancePartner extends Entity {
  // Display name of the partner.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Timestamp of the last request sent to Intune by the TEM partner.
  var lastConnectionDateTime: js.UndefOr[java.lang.String] = js.undefined
  // TBD. Possible values are: notOnboarded, onboarding, onboarded.
  var onboardingStatus: js.UndefOr[RemoteAssistanceOnboardingStatus] = js.undefined
  // URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
  var onboardingUrl: js.UndefOr[java.lang.String] = js.undefined
}

object RemoteAssistancePartner {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    lastConnectionDateTime: java.lang.String = null,
    onboardingStatus: RemoteAssistanceOnboardingStatus = null,
    onboardingUrl: java.lang.String = null
  ): RemoteAssistancePartner = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastConnectionDateTime != null) __obj.updateDynamic("lastConnectionDateTime")(lastConnectionDateTime)
    if (onboardingStatus != null) __obj.updateDynamic("onboardingStatus")(onboardingStatus)
    if (onboardingUrl != null) __obj.updateDynamic("onboardingUrl")(onboardingUrl)
    __obj.asInstanceOf[RemoteAssistancePartner]
  }
}

