package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArmorDetachedFalse extends js.Object {
  var armor: openpgpLib.openpgpLibNumbers.`false`
  var detached: js.UndefOr[openpgpLib.openpgpLibNumbers.`false`] = js.undefined
}

object Anon_ArmorDetachedFalse {
  @scala.inline
  def apply(armor: openpgpLib.openpgpLibNumbers.`false`, detached: openpgpLib.openpgpLibNumbers.`false` = null): Anon_ArmorDetachedFalse = {
    val __obj = js.Dynamic.literal(armor = armor)
    if (detached != null) __obj.updateDynamic("detached")(detached)
    __obj.asInstanceOf[Anon_ArmorDetachedFalse]
  }
}

