package typings.openpgp

import typings.openpgp.openpgpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArmorDetached extends js.Object {
  var armor: js.UndefOr[`true`] = js.undefined
  var detached: `true`
}

object AnonArmorDetached {
  @scala.inline
  def apply(detached: `true`, armor: `true` = null): AnonArmorDetached = {
    val __obj = js.Dynamic.literal(detached = detached.asInstanceOf[js.Any])
    if (armor != null) __obj.updateDynamic("armor")(armor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArmorDetached]
  }
}

