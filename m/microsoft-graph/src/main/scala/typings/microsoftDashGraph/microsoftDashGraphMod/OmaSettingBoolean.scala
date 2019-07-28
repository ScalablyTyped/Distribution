package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSettingBoolean extends OmaSetting {
  // Value.
  var value: js.UndefOr[Boolean] = js.undefined
}

object OmaSettingBoolean {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    omaUri: String = null,
    value: js.UndefOr[Boolean] = js.undefined
  ): OmaSettingBoolean = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OmaSettingBoolean]
  }
}

