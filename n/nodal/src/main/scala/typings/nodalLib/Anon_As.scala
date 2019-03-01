package typings
package nodalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As extends js.Object {
  var as: js.UndefOr[java.lang.String] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var via: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_As {
  @scala.inline
  def apply(
    as: java.lang.String = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    via: java.lang.String = null
  ): Anon_As = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (via != null) __obj.updateDynamic("via")(via)
    __obj.asInstanceOf[Anon_As]
  }
}

