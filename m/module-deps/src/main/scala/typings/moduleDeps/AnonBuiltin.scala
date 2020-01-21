package typings.moduleDeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuiltin extends js.Object {
  var builtin: js.UndefOr[Boolean] = js.undefined
  var inNodeModules: js.UndefOr[Boolean] = js.undefined
}

object AnonBuiltin {
  @scala.inline
  def apply(builtin: js.UndefOr[Boolean] = js.undefined, inNodeModules: js.UndefOr[Boolean] = js.undefined): AnonBuiltin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(builtin)) __obj.updateDynamic("builtin")(builtin.asInstanceOf[js.Any])
    if (!js.isUndefined(inNodeModules)) __obj.updateDynamic("inNodeModules")(inNodeModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuiltin]
  }
}

