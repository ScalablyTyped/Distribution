package typings.powerDashAssert.powerDashAssertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var assertion: js.UndefOr[typings.empower.empowerMod.Options] = js.undefined
  var output: js.UndefOr[typings.powerDashAssertDashFormatter.powerAssertFormatter.Options] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    assertion: typings.empower.empowerMod.Options = null,
    output: typings.powerDashAssertDashFormatter.powerAssertFormatter.Options = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (assertion != null) __obj.updateDynamic("assertion")(assertion.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

