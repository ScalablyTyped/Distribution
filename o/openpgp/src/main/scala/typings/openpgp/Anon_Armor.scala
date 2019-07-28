package typings.openpgp

import typings.openpgp.openpgpNumbers.`false`
import typings.openpgp.openpgpNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Armor extends js.Object {
  var armor: js.UndefOr[`true`] = js.undefined
  var detached: js.UndefOr[`false`] = js.undefined
}

object Anon_Armor {
  @scala.inline
  def apply(armor: `true` = null, detached: `false` = null): Anon_Armor = {
    val __obj = js.Dynamic.literal()
    if (armor != null) __obj.updateDynamic("armor")(armor)
    if (detached != null) __obj.updateDynamic("detached")(detached)
    __obj.asInstanceOf[Anon_Armor]
  }
}

