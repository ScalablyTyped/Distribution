package typings.nodal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var via: js.UndefOr[String] = js.undefined
}

object Anon_As {
  @scala.inline
  def apply(
    as: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    via: String = null
  ): Anon_As = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (via != null) __obj.updateDynamic("via")(via)
    __obj.asInstanceOf[Anon_As]
  }
}

