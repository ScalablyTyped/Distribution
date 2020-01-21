package typings.openpgp

import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArmor extends js.Object {
  var armor: js.UndefOr[`true`] = js.undefined
  var detached: js.UndefOr[`false`] = js.undefined
}

object AnonArmor {
  @scala.inline
  def apply(armor: `true` = null, detached: `false` = null): AnonArmor = {
    val __obj = js.Dynamic.literal()
    if (armor != null) __obj.updateDynamic("armor")(armor.asInstanceOf[js.Any])
    if (detached != null) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArmor]
  }
}

