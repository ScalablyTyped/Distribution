package typings.openpgp

import typings.openpgp.openpgpNumbers.`false`
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
    val __obj = js.Dynamic.literal(armor = armor)
    if (detached != null) __obj.updateDynamic("detached")(detached)
    __obj.asInstanceOf[Anon_ArmorDetachedFalse]
  }
}

