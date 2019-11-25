package typings.meteorDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Unordered extends js.Object {
  var unordered: js.UndefOr[Boolean] = js.undefined
  var weak: js.UndefOr[Boolean] = js.undefined
}

object Anon_Unordered {
  @scala.inline
  def apply(unordered: js.UndefOr[Boolean] = js.undefined, weak: js.UndefOr[Boolean] = js.undefined): Anon_Unordered = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unordered)) __obj.updateDynamic("unordered")(unordered.asInstanceOf[js.Any])
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Unordered]
  }
}

