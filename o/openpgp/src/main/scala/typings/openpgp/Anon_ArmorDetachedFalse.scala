package typings.openpgp

import typings.openpgp.openpgpBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArmorDetachedFalse extends js.Object {
  var armor: `false`
  var detached: js.UndefOr[`false`] = js.undefined
}

object Anon_ArmorDetachedFalse {
  @scala.inline
  def apply(armor: `false`, detached: `false` = null): Anon_ArmorDetachedFalse = {
    val __obj = js.Dynamic.literal(armor = armor.asInstanceOf[js.Any])
    if (detached != null) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArmorDetachedFalse]
  }
}

