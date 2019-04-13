package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArmorDetached extends js.Object {
  var armor: js.UndefOr[openpgpLib.openpgpLibNumbers.`true`] = js.undefined
  var detached: openpgpLib.openpgpLibNumbers.`true`
}

object Anon_ArmorDetached {
  @scala.inline
  def apply(detached: openpgpLib.openpgpLibNumbers.`true`, armor: openpgpLib.openpgpLibNumbers.`true` = null): Anon_ArmorDetached = {
    val __obj = js.Dynamic.literal(detached = detached)
    if (armor != null) __obj.updateDynamic("armor")(armor)
    __obj.asInstanceOf[Anon_ArmorDetached]
  }
}

