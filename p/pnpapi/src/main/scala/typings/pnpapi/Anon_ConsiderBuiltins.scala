package typings.pnpapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConsiderBuiltins extends js.Object {
  var considerBuiltins: js.UndefOr[Boolean] = js.undefined
}

object Anon_ConsiderBuiltins {
  @scala.inline
  def apply(considerBuiltins: js.UndefOr[Boolean] = js.undefined): Anon_ConsiderBuiltins = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(considerBuiltins)) __obj.updateDynamic("considerBuiltins")(considerBuiltins)
    __obj.asInstanceOf[Anon_ConsiderBuiltins]
  }
}

