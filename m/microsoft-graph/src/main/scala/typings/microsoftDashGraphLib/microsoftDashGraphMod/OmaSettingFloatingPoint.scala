package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSettingFloatingPoint extends OmaSetting {
  /** Value. */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object OmaSettingFloatingPoint {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    omaUri: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): OmaSettingFloatingPoint = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmaSettingFloatingPoint]
  }
}

