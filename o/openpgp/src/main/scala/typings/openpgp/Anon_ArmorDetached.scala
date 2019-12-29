package typings.openpgp

import typings.openpgp.openpgpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArmorDetached extends js.Object {
  var armor: js.UndefOr[`true`] = js.undefined
  var detached: `true`
}

object Anon_ArmorDetached {
  @scala.inline
  def apply(detached: `true`, armor: `true` = null): Anon_ArmorDetached = {
    val __obj = js.Dynamic.literal(detached = detached.asInstanceOf[js.Any])
    if (armor != null) __obj.updateDynamic("armor")(armor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArmorDetached]
  }
}

