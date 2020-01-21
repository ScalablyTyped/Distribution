package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSettingInteger extends OmaSetting {
  // Value.
  var value: js.UndefOr[Double] = js.undefined
}

object OmaSettingInteger {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    omaUri: String = null,
    value: Int | Double = null
  ): OmaSettingInteger = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmaSettingInteger]
  }
}

