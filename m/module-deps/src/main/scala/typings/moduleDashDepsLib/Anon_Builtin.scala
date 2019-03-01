package typings
package moduleDashDepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Builtin extends js.Object {
  var builtin: js.UndefOr[scala.Boolean] = js.undefined
  var inNodeModules: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Builtin {
  @scala.inline
  def apply(
    builtin: js.UndefOr[scala.Boolean] = js.undefined,
    inNodeModules: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Builtin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(builtin)) __obj.updateDynamic("builtin")(builtin)
    if (!js.isUndefined(inNodeModules)) __obj.updateDynamic("inNodeModules")(inNodeModules)
    __obj.asInstanceOf[Anon_Builtin]
  }
}

