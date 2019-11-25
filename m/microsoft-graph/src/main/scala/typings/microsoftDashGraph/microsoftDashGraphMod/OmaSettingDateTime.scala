package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSettingDateTime extends OmaSetting {
  // Value.
  var value: js.UndefOr[String] = js.undefined
}

object OmaSettingDateTime {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    omaUri: String = null,
    value: String = null
  ): OmaSettingDateTime = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmaSettingDateTime]
  }
}

