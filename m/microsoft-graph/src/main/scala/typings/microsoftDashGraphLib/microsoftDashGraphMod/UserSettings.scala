package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSettings extends Entity {
  var contributionToContentDiscoveryAsOrganizationDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var contributionToContentDiscoveryDisabled: js.UndefOr[scala.Boolean] = js.undefined
}

object UserSettings {
  @scala.inline
  def apply(
    contributionToContentDiscoveryAsOrganizationDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    contributionToContentDiscoveryDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null
  ): UserSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contributionToContentDiscoveryAsOrganizationDisabled)) __obj.updateDynamic("contributionToContentDiscoveryAsOrganizationDisabled")(contributionToContentDiscoveryAsOrganizationDisabled)
    if (!js.isUndefined(contributionToContentDiscoveryDisabled)) __obj.updateDynamic("contributionToContentDiscoveryDisabled")(contributionToContentDiscoveryDisabled)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[UserSettings]
  }
}

