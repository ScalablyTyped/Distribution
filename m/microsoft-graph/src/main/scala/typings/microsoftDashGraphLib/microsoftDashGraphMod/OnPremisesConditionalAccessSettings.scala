package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPremisesConditionalAccessSettings extends Entity {
  /** Indicates if on premises conditional access is enabled for this organization */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** User groups that will be exempt by on premises conditional access. All users in these groups will be exempt from the conditional access policy. */
  var excludedGroups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** User groups that will be targeted by on premises conditional access. All users in these groups will be required to have mobile device managed and compliant for mail access. */
  var includedGroups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Override the default access rule when allowing a device to ensure access is granted. */
  var overrideDefaultRule: js.UndefOr[scala.Boolean] = js.undefined
}

object OnPremisesConditionalAccessSettings {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    excludedGroups: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    includedGroups: js.Array[java.lang.String] = null,
    overrideDefaultRule: js.UndefOr[scala.Boolean] = js.undefined
  ): OnPremisesConditionalAccessSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (excludedGroups != null) __obj.updateDynamic("excludedGroups")(excludedGroups)
    if (id != null) __obj.updateDynamic("id")(id)
    if (includedGroups != null) __obj.updateDynamic("includedGroups")(includedGroups)
    if (!js.isUndefined(overrideDefaultRule)) __obj.updateDynamic("overrideDefaultRule")(overrideDefaultRule)
    __obj.asInstanceOf[OnPremisesConditionalAccessSettings]
  }
}

