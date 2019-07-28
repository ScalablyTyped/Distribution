package typings.meteorDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canonical extends js.Object {
  var canonical: js.UndefOr[Boolean] = js.undefined
  var indent: js.UndefOr[Boolean | Double | String] = js.undefined
}

object Anon_Canonical {
  @scala.inline
  def apply(canonical: js.UndefOr[Boolean] = js.undefined, indent: Boolean | Double | String = null): Anon_Canonical = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canonical)) __obj.updateDynamic("canonical")(canonical)
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Canonical]
  }
}

