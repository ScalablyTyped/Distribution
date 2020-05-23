package typings.pnpapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsiderBuiltins extends js.Object {
  var considerBuiltins: js.UndefOr[Boolean] = js.undefined
}

object ConsiderBuiltins {
  @scala.inline
  def apply(considerBuiltins: js.UndefOr[Boolean] = js.undefined): ConsiderBuiltins = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(considerBuiltins)) __obj.updateDynamic("considerBuiltins")(considerBuiltins.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsiderBuiltins]
  }
}

