package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSettingString extends OmaSetting {
  // Value.
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object OmaSettingString {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    omaUri: java.lang.String = null,
    value: java.lang.String = null
  ): OmaSettingString = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OmaSettingString]
  }
}

