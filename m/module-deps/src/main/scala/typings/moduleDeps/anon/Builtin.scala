package typings.moduleDeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Builtin extends js.Object {
  var builtin: js.UndefOr[Boolean] = js.undefined
  var inNodeModules: js.UndefOr[Boolean] = js.undefined
}

object Builtin {
  @scala.inline
  def apply(builtin: js.UndefOr[Boolean] = js.undefined, inNodeModules: js.UndefOr[Boolean] = js.undefined): Builtin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(builtin)) __obj.updateDynamic("builtin")(builtin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inNodeModules)) __obj.updateDynamic("inNodeModules")(inNodeModules.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Builtin]
  }
}

