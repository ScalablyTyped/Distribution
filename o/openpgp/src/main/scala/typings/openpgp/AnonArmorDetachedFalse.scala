package typings.openpgp

import typings.openpgp.openpgpBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArmorDetachedFalse extends js.Object {
  var armor: `false`
  var detached: js.UndefOr[`false`] = js.undefined
}

object AnonArmorDetachedFalse {
  @scala.inline
  def apply(armor: `false`, detached: `false` = null): AnonArmorDetachedFalse = {
    val __obj = js.Dynamic.literal(armor = armor.asInstanceOf[js.Any])
    if (detached != null) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArmorDetachedFalse]
  }
}

