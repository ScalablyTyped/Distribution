package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OmaSetting extends js.Object {
  // Description.
  var description: js.UndefOr[String] = js.undefined
  // Display Name.
  var displayName: js.UndefOr[String] = js.undefined
  // OMA.
  var omaUri: js.UndefOr[String] = js.undefined
}

object OmaSetting {
  @scala.inline
  def apply(description: String = null, displayName: String = null, omaUri: String = null): OmaSetting = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (omaUri != null) __obj.updateDynamic("omaUri")(omaUri)
    __obj.asInstanceOf[OmaSetting]
  }
}

