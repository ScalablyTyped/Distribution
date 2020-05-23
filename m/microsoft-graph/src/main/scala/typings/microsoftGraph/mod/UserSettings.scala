package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSettings extends Entity {
  var contributionToContentDiscoveryAsOrganizationDisabled: js.UndefOr[Boolean] = js.undefined
  var contributionToContentDiscoveryDisabled: js.UndefOr[Boolean] = js.undefined
}

object UserSettings {
  @scala.inline
  def apply(
    contributionToContentDiscoveryAsOrganizationDisabled: js.UndefOr[Boolean] = js.undefined,
    contributionToContentDiscoveryDisabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null
  ): UserSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contributionToContentDiscoveryAsOrganizationDisabled)) __obj.updateDynamic("contributionToContentDiscoveryAsOrganizationDisabled")(contributionToContentDiscoveryAsOrganizationDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contributionToContentDiscoveryDisabled)) __obj.updateDynamic("contributionToContentDiscoveryDisabled")(contributionToContentDiscoveryDisabled.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSettings]
  }
}

