package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSettingBoolean extends OmaSetting {
  /** Value. */
  var value: js.UndefOr[scala.Boolean] = js.undefined
}

object OmaSettingBoolean {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    omaUri: java.lang.String = null,
    value: js.UndefOr[scala.Boolean] = js.undefined
  ): OmaSettingBoolean = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OmaSettingBoolean]
  }
}

