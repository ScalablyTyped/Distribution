package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSetting extends js.Object {
  // Description.
  var description: js.UndefOr[java.lang.String] = js.undefined
  // Display Name.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // OMA.
  var omaUri: js.UndefOr[java.lang.String] = js.undefined
}

object OmaSetting {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    omaUri: java.lang.String = null
  ): OmaSetting = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri)
    __obj.asInstanceOf[OmaSetting]
  }
}

