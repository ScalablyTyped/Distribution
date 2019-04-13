package typings
package powerDashAssertLib.powerDashAssertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var assertion: js.UndefOr[empowerLib.empowerMod.Options] = js.undefined
  var output: js.UndefOr[powerDashAssertDashFormatterLib.powerAssertFormatterNs.Options] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    assertion: empowerLib.empowerMod.Options = null,
    output: powerDashAssertDashFormatterLib.powerAssertFormatterNs.Options = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (assertion != null) __obj.updateDynamic("assertion")(assertion)
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[Options]
  }
}

