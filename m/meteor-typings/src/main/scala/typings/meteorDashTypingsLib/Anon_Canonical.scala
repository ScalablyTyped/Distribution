package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canonical extends js.Object {
  var canonical: js.UndefOr[scala.Boolean] = js.undefined
  var indent: js.UndefOr[scala.Boolean | scala.Double | java.lang.String] = js.undefined
}

object Anon_Canonical {
  @scala.inline
  def apply(
    canonical: js.UndefOr[scala.Boolean] = js.undefined,
    indent: scala.Boolean | scala.Double | java.lang.String = null
  ): Anon_Canonical = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canonical)) __obj.updateDynamic("canonical")(canonical)
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Canonical]
  }
}

