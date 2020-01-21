package typings.pnpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConsiderBuiltins extends js.Object {
  var considerBuiltins: js.UndefOr[Boolean] = js.undefined
}

object AnonConsiderBuiltins {
  @scala.inline
  def apply(considerBuiltins: js.UndefOr[Boolean] = js.undefined): AnonConsiderBuiltins = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(considerBuiltins)) __obj.updateDynamic("considerBuiltins")(considerBuiltins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConsiderBuiltins]
  }
}

