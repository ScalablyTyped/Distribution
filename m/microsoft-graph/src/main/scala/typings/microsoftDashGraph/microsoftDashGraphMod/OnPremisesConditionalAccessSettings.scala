package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPremisesConditionalAccessSettings extends Entity {
  // Indicates if on premises conditional access is enabled for this organization
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * User groups that will be exempt by on premises conditional access. All users in these groups will be exempt from the
    * conditional access policy.
    */
  var excludedGroups: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * User groups that will be targeted by on premises conditional access. All users in these groups will be required to have
    * mobile device managed and compliant for mail access.
    */
  var includedGroups: js.UndefOr[js.Array[String]] = js.undefined
  // Override the default access rule when allowing a device to ensure access is granted.
  var overrideDefaultRule: js.UndefOr[Boolean] = js.undefined
}

object OnPremisesConditionalAccessSettings {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    excludedGroups: js.Array[String] = null,
    id: String = null,
    includedGroups: js.Array[String] = null,
    overrideDefaultRule: js.UndefOr[Boolean] = js.undefined
  ): OnPremisesConditionalAccessSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (excludedGroups != null) __obj.updateDynamic("excludedGroups")(excludedGroups.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (includedGroups != null) __obj.updateDynamic("includedGroups")(includedGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideDefaultRule)) __obj.updateDynamic("overrideDefaultRule")(overrideDefaultRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPremisesConditionalAccessSettings]
  }
}

