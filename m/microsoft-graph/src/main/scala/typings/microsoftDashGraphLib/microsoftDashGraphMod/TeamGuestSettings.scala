package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamGuestSettings extends js.Object {
  /** If set to true, guests can add and update channels. */
  var allowCreateUpdateChannels: js.UndefOr[scala.Boolean] = js.undefined
  /** If set to true, guests can delete channels. */
  var allowDeleteChannels: js.UndefOr[scala.Boolean] = js.undefined
}

object TeamGuestSettings {
  @scala.inline
  def apply(
    allowCreateUpdateChannels: js.UndefOr[scala.Boolean] = js.undefined,
    allowDeleteChannels: js.UndefOr[scala.Boolean] = js.undefined
  ): TeamGuestSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCreateUpdateChannels)) __obj.updateDynamic("allowCreateUpdateChannels")(allowCreateUpdateChannels)
    if (!js.isUndefined(allowDeleteChannels)) __obj.updateDynamic("allowDeleteChannels")(allowDeleteChannels)
    __obj.asInstanceOf[TeamGuestSettings]
  }
}

